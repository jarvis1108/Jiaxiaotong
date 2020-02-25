<template>
  <div class="st-battle-main-container">
    <battleLoading
      v-if="step == '0'"
      :user="userInfo">
    </battleLoading>
    
    <battleReady
      v-else-if="step == 'A'"
      :userInfo="userInfo"
      :opponentInfo="opponentInfo"
      :close="sendMessage"
      @matchTimeOut="matchTimeOut">
    </battleReady>

    <battle
      v-else-if="questionIndex < 6"
      :userInfo="userInfo"
      :userScore="userScore"
      :opponentAnswer="opponentAnswer" 
      :opponentInfo="opponentInfo"
      :question="question"
      :questionIndex="questionIndex"
      :nextQuestion="sendMessage"
      :waitUser="waitUser"
      :waitOpponent="waitOpponent"
      @userAnswered="changeUserAnswer"
      @cutdownout="cutDownOut">
    </battle>

    <battleResult
      v-else-if="questionIndex >= 6"
      :userInfo="userInfo"
      :opponentInfo="opponentInfo"
      :battleId="battleId"
      :userScore="userScore"
      :opponentScore="opponentScore"
      :userCorrectNum="userCorrectNum"
      :opponentCorrectNum="opponentCorrectNum"
      :userLearningPoit="userLearningPoit">
    </battleResult>
  </div>
</template>

<script>
import battleLoading from "../../components/battle-loading.vue";
import battleReady from "../../components/battle-ready.vue";
import battle from "../../components/battle.vue";
import battleResult from "../../components/battle-result.vue";
import wxs from "../../utils/wx";
import { socketUrl } from "../../config";
import { getuuid } from "../../utils/RequestObj";
export default {
  components: {
    battleLoading, //加载页
    battleReady, //准备页
    battle, //对战页
    battleResult //结果页
  },
  data() {
    return {
      userInfo: {}, //用户信息
      opponentInfo: {}, //对手信息
      battleId: "", //战局id
      step: "0", //标明战局状态，与返回消息类型匹配
      questionIndex: 0, //题目序号
      question: {}, //试题
      userScore: 0, //用户分数
      opponentScore: 0, //对手分数
      userCorrectNum: 0, //用户答对题数
      opponentCorrectNum: 0, //对手答对题数
      userLearningPoit: 0, //用户消耗学点数
      userAnswer: {
        //用户单题的答案信息
        answer: "",
        timeLeft: ""
      },
      opponentAnswer: {
        score: 0,
        answer: ""
      }, //对手单题的答案信息
      waitUser: true, //等待用户答题
      waitOpponent: true, //等待对手答题
      socket: false //网络是否连接
    };
  },
  onLoad() {
    //判断当前用户学点和金币是否足够【只要大于零就允许参与游戏】
    let user = this.$store.state.userInfo;
    console.log('用户信息是：'+JSON.stringify(user));
    if(user.coin < 50 || user.learningPoint <= 0){
      wxs.showTip('您的金币和学点不足，\n快去充值吧');
      setTimeout(()=>{
        wxs.redirectTo('/pages/topup/main');
      },2000)
    }
    //初始化数据
    this.init();
    this.startMatch();
  },
  onUnload() {
    if (this.socket) wx.closeSocket();
  },
  watch: {
    //进入下一题，重置对手答题结果
    questionIndex() {
      this.opponentAnswer = {
        score: 0,
        answer: ""
      };
    },
    waitUser() {
      setTimeout(() => {
        //若用户对手都答题完成，重置答题情况，重置完毕后请求下一题
        if (!this.waitUser && !this.waitOpponent) {
          this.waitUser = true;
          this.waitOpponent = true;
          this.sendMessage();
        }
      }, 1000);
    },
    waitOpponent() {
      setTimeout(() => {
        //若用户对手都答题完成，重置答题情况，重置完毕后请求下一题
        if (!this.waitUser && !this.waitOpponent) {
          this.waitUser = true;
          this.waitOpponent = true;
          this.sendMessage();
        }
      }, 1000);
    }
  },
  methods: {
    //初始化数据
    init() {
      this.userInfo = this.$store.state.userInfo;
      this.opponentInfo = {};
      this.battleId = "";
      this.step = "0";
      this.questionIndex = 0;
      this.userScore = 0;
      this.opponentScore = 0;
      this.userCorrectNum = 0;
      this.opponentCorrectNum = 0;
      this.userLearningPoit = 0;
      this.waitUser = true;
      this.waitOpponent = true;
      this.socket = false;
    },
    /**
     * 监听battle组件触发的用户答题完毕事件
     * data -- 用户的答题信息
     */
    changeUserAnswer(data) {
      this.userAnswer = data;
      this.userLearningPoit += 10 - data.timeLeft;
      //将等待用户答题字段标为false
      this.waitUser = false;
      //向服务器发送用户答完题目的消息
      this.sendMessage();
    },
    //监听匹配超时事件，返回到首页
    matchTimeOut() {
      console.log("超时时对手信息是：" + this.opponentInfo);
      if (!this.opponentInfo) {
        console.log("匹配超时");
        wxs.navigateBack(0);
      }
    },
    //开始匹配，建立websocket并保持监听
    startMatch() {
      let that = this;
      //连接webSocket
      wx.connectSocket({
        url: `${socketUrl}/match?userId=${this.userInfo.userId}`
      });

      //监听服务器打开
      wx.onSocketOpen(res => {
        that.socket = true;
        console.log("连接已建立");
      });

      //接收到服务器端的消息执行receiveMessage方法
      wx.onSocketMessage(res => {
        this.receiveMessage(res);
      });

      //webSocket关闭
      wx.onSocketClose(function(res) {
        that.socket = false;
        console.log("Websocket已关闭");
      });
    },
    //接收服务器端的消息
    receiveMessage(res) {
      var result = JSON.parse(res.data);
      //拿到消息类型来对应当前战局状态
      this.step = result.msgType;
      if (result.msgType === "A") {
        // 服务器返回消息类型为A，表示服务器已经匹配到对手，此时可以进行页面跳转，并请求服务器发送题目
        console.log("匹配成功");
        this.opponentInfo = result.msgData.curData.opponent;
        this.battleId = result.msgData.curData.matchId;
      } else if (result.msgType === "B") {
        //服务器消息类型为B，表示拿到服务器返回的题目
        this.question = result.msgData.curData.question;
      } else if (result.msgType === "C-1") {
        //服务器消息类型为C-1,表示拿到用户的答题计算结果
        this.userScore += result.msgData.curData.score;
        if (result.msgData.curData.score > 0) {
          //用户答对
          this.userCorrectNum += 1;
        }
      } else if (result.msgType === "C-2") {
        //服务器消息类型为C-2,表示拿到对手的答题结果
        this.opponentAnswer = {
          score: result.msgData.curData.score,
          answer: result.msgData.curData.answer
        };
        this.opponentScore += this.opponentAnswer.score;
        if (this.opponentAnswer.score > 0) this.opponentCorrectNum += 1;
        //将等待对手答题字段标为false
        this.waitOpponent = false;
      } else if (result.msgType === "Z") {
        //服务器消息类型为Z,表示对手退出，直接跳至结果页
        if (this.questionIndex < 6) {
          wxs.showTip("对手退出");
          setTimeout(() => {
            if (this.socket) wx.closeSocket();
            this.questionIndex = 9;
          }, 2000);
        }
      }
    },
    //向服务器端发送消息
    sendMessage() {
      //用户和对手都未答题时发送信息为请求题目
      if (this.waitUser && this.waitOpponent) {
        this.questionIndex += 1;
        wx.sendSocketMessage({
          data: JSON.stringify({
            msgID: getuuid(),
            msgType: "A",
            msgData: {
              matchId: this.battleId,
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
              matchId: this.battleId,
              correctAnswer: this.question.answer,
              userAnswer: this.userAnswer.answer,
              timeLeft: this.userAnswer.timeLeft,
              no: this.questionIndex
            },
            msgDesc: "请求计算当前分数和返回结果"
          })
        });
      }
    }
  }
};
</script>

<style scoped>
</style>