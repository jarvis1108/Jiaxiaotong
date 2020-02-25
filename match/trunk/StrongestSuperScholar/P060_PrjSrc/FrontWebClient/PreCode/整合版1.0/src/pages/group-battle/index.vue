<template>
	<div class="st-battle-main-container">
		<groupBattleWaiting 
      v-if="step == 'A' || step == 'A-1' || step == 'A-2'" 
		  :playerList="playerList" 
		  :playerNumber="playerNumber"
		  :creator="creator" 
		  :matchId="matchId"
      :isCreator="isCreator"
		  @playerList="changePlayer"
		  @giveUpBattle="giveUpBattle"
      @beginBattle="startBattle">
		</groupBattleWaiting>

		<groupBattle 
		  v-else-if="step == 'A-0' || step == 'B' || step == 'C' || step == 'D'" 
		  :question="question" 
		  :questionIndex="questionIndex" 
		  :nextQuestion="sendMessage" 
		  :waitUser="waitUser" 
		  @userAnswered="changeUserAnswer">
		</groupBattle>

		<groupBattleResult
      v-else-if="step === 'E'" 
		  :userInfo="userInfo" 
      :playerList="playerList"
		  :playerMap="playerMap" 
		  :userScore="userScore" 
		  :userCorrectNum="userCorrectNum" 
		  :userLearningPoit="userLearningPoit" 
		  :scoreMap="scoreMap" 
		  :matchId="matchId">
		</groupBattleResult>
	</div>
</template>

<script>
import groupBattleWaiting from "../../components/group-battle-waiting.vue";
import groupBattle from "../../components/group-battle.vue";
import groupBattleResult from "../../components/group-battle-result.vue";
import wxs from "../../utils/wx";
import { socketUrl } from "../../config";
import { getuuid } from "../../utils/RequestObj";
export default {
  components: {
    groupBattleWaiting, //加载页
    groupBattle, //对战页
    groupBattleResult //结果页
  },
  data() {
    return {
      creator: null, //战局创建者id
      userInfo: {}, //用户信息
      playerList: [], //所有用户信息，包括用户自己
      playerMap: {},
      scoreMap: [], //所有成绩
      matchId: "", //战局id
      step: "A", //标明战局状态，与返回消息类型匹配
      questionIndex: 0, //题目序号
      question: {}, //试题
      userScore: 0, //用户分数
      userCorrectNum: 0, //用户答对题数
      userLearningPoit: 0, //用户消耗学点数
      userAnswer: {
        //用户单题的答案信息
        answer: "",
        timeLeft: ""
      },
      waitUser: true, //等待用户答题
      waitOtherPlayer: true, //等待其他用户
      socket: false //网络是否连接
    };
  },
  computed: {
    playerNumber() {
      return this.playerList ? this.playerList.length : 0;
    },
    isCreator() {
      return this.creator
        ? this.creator.userId === this.userInfo.userId
        : false;
    }
  },
  async onLoad(option) {
    this.init();
    //进入该页面则创建一个战局，又客户端生成战局Id
    this.userInfo = this.$store.state.userInfo;
    console.log("参数传递的战局id是：" + option.matchId);
    if (option.matchId) {
      //当前用户不是创建者
      this.matchId = option.matchId;
      console.log("拿到参数传递的战局id是：" + this.matchId);
    } else {
      //当前用户是创建者，请求后台创建战局
      this.matchId = await this.$store.dispatch("createBattle", {
        battleType: 2
      });
      this.creator = this.userInfo;
      this.playerList.push(this.creator);
      console.log("创建的战局id是：" + this.matchId);
    }
    console.log("战局Id是：" + this.matchId);
    //建立webSocket
    this.startMatch();
  },
  onUnload() {
    if (this.socket) wx.closeSocket();
  },
  watch: {
    questionIndex() {
      this.opponentAnswer = {
        score: 0,
        answer: ""
      };
    },
    waitUser() {
      setTimeout(() => {
        // 所有用户都答完题目，则将状态重置
        if (!this.waitUser && !this.waitOtherPlayer) {
          console.log("等待用户改变，重置数据，发送请求");
          this.waitUser = true;
          this.waitOtherPlayer = true;
          this.sendMessage();
        }
      }, 1000);
    },
    waitOtherPlayer() {
      setTimeout(() => {
        //所有用户都答完题目，则将状态重置
        if (!this.waitUser && !this.waitOtherPlayer) {
          console.log("等待其他玩家改变，重置数据，发送请求");
          this.waitUser = true;
          this.waitOtherPlayer = true;
          this.sendMessage();
        }
      }, 1000);
    }
  },
  methods: {
    //初始化数据
    init() {
      this.step = "A";
      this.playerList = [];
      this.questionIndex = 0;
      this.creator = {};
      this.userInfo = {};
      this.matchId = "";
      this.userScore = 0;
      this.userCorrectNum = 0;
      this.userLearningPoit = 0;
      this.waitUser = true;
      this.waitOtherPlayer = true;
      this.socket = false;
    },
    startBattle() {
      console.log("房主点击开始");
      this.sendMessage();
    },
    giveUpBattle() {
      wx.closeSocket();
      wxs.navigateBack(0);
    },
    // changePlayer(data) {
    //   //修改数组长度
    //   this.playerList.splice(data);
    // },
    changeUserAnswer(data) {
      this.userAnswer = data;
      console.log("当前剩余时间是：" + data.timeLeft);
      this.userLearningPoit += 10 - data.timeLeft;
      console.log("该局消耗学点：" + (10 - data.timeLeft));
      this.waitUser = false;
      this.sendMessage();
    },
    startMatch() {
      let that = this;
      wx.connectSocket({
        url: `${socketUrl}/group?userId=${this.userInfo.userId}&matchId=${
          this.matchId
        }`
      });

      wx.onSocketOpen(res => {
        that.socket = true;
        console.log("连接已建立");
      });

      wx.onSocketMessage(res => {
        this.receiveMessage(res);
      });

      wx.onSocketClose(function(res) {
        that.socket = false;
        console.log("Websocket关闭");
      });
    },
    receiveMessage(res) {
      var result = JSON.parse(res.data);
      console.log("接受到消息：" + res.data);
      this.step = result.msgType;
      console.log("当前战局状态是：" + this.step);
      if (result.msgType === "A-1") {
        //新用户加入战局，其他用户拿到新用户信息
        this.playerList.push(result.msgData.curData.user);
      } else if (result.msgType === "A-2") {
        //新用户加入战局，新用户拿到战局中其他用户的列表
        this.playerList = result.msgData.curData.userList;
        this.creator = result.msgData.curData.creator;
        //将自己添加到列表中
        this.playerList.push(this.userInfo);
      } else if (result.msgType === "A-0") {
        console.log("开始对战");
        //发送消息，请求出题
        this.sendMessage();
      } else if (result.msgType === "B") {
        console.log("拿到题目");
        this.question = result.msgData.curData.question;
        console.log("题目是：" + this.question);
      } else if (result.msgType === "C") {
        //拿到自己答题的结果,此处不需累加用户分数在最后取出即可
        if (result.msgData.curData.score > 0) {
          //用户答对
          this.userCorrectNum += 1;
          console.log("用户累计答对" + this.userCorrectNum + "题");
        }
      } else if (result.msgType === "D") {
        //表示所有用户都答完题目
        this.waitOtherPlayer = false;
        // this.sendMessage();
        //用户答对
      } else if (result.msgType === "E") {
        //返回对战结果
        this.playerMap = result.msgData.curData.matchUserMap;
        this.scoreMap = result.msgData.curData.matchScoreMap;
        for (var key in this.scoreMap) {
          if (key === this.userInfo.userId) {
            this.userScore = this.scoreMap[key];
          }
        }
      } else if (result.msgData === "Z-1") {
        //当前战局人数达到最大值
        wxs.showTip("当前战局人数已满");
        wxs.navigateBack(0);
      }
    },
    sendMessage() {
      if (this.step == "A" || this.step == "A-1" || this.step == "A-2") {
        //当前战局处于等待开始状态，且房主点击开始对战
        wx.sendSocketMessage({
          data: JSON.stringify({
            msgID: getuuid(),
            msgType: "A-0",
            msgData: {
              matchId: this.matchId
            },
            msgDesc: "请求开始对战"
          })
        });
      } else if (
        this.questionIndex < 5 &&
        this.waitUser &&
        this.waitOtherPlayer
      ) {
        this.questionIndex += 1;
        wx.sendSocketMessage({
          data: JSON.stringify({
            msgID: getuuid(),
            msgType: "A",
            msgData: {
              matchId: this.matchId,
              no: this.questionIndex
            },
            msgDesc: "请求出题"
          })
        });
      } else if (!this.waitUser) {
        //用户答题完毕，计算分数
        wx.sendSocketMessage({
          data: JSON.stringify({
            msgID: getuuid(),
            msgType: "B",
            msgData: {
              matchId: this.matchId,
              correctAnswer: this.question.answer,
              userAnswer: this.userAnswer.answer,
              timeLeft: this.userAnswer.timeLeft,
              no: this.questionIndex
            },
            msgDesc: "请求计算当前分数和返回结果"
          })
        });
      } else {
        wx.sendSocketMessage({
          data: JSON.stringify({
            msgID: getuuid(),
            msgType: "C",
            msgData: {
              matchId: this.matchId
            },
            msgDesc: "请求对战结果"
          })
        });
      }
    }
  },
  onShareAppMessage(res) {
    console.log("分享的战局id是：" + this.matchId);
    let that = this;
    if (res.from === "button") {
      console.log(res.target);
    }
    return {
      title: "最强学霸分享",
      desc: this.userInfo.wechatName + "向你发出了智商pk，点击应战！",
      path: `/pages/index/main?matchId=${this.matchId}&isGroup=true`,
      imageUrl: "/static/images/friendPk/share-bg.png"
    };
  }
};
</script>

<style scoped>
</style>