<template>
  <div id="background">
    <!-- user_info block -->
    <div>
      <img id="bg" src="/static/images/bg.png"/>
      <img id="person_info" src="/static/images/index/Personalinformation-bg.png"/>

      <img @click="to_personalCenter" id="user_icon" :src="userInfo.headImage"/>
      <p>
        <span id="user_name">{{userInfo.wechatName}}</span>
      </p>

      <div class="user_coin">
        <img id="coin_icon" src="/static/images/home/Goldcoin.png"/>
        <span class="text_28">&nbsp;&nbsp;{{userInfo.coin}}</span>
      </div>

      <p>
        <span id="grade" style="left: 7.5%">{{userInfo.externalLevel}}级</span>
      </p>

      <div class="st-personal-center-level-outer">
        <div :style="'width:'+progress+'%'" class="st-personal-center-level-inner"></div>
      </div>

      <p>
        <span class="text_28" style="right: 33%">绩点&nbsp;{{userInfo.gradePoint}}</span>
      </p>
      <p>
        <span class="text_28" style="right: 8%">学点&nbsp;{{userInfo.learningPoint}}</span>
      </p>
    </div>

    <!-- function block -->
    <div>
      <img id="dualmeet" @click="to_dualmeet" src="/static/images/index/dualmeet-bg.png"/>
      <p>
        <span class="text_34" style="left: 9%;top: 50%">对抗赛</span>
      </p>

      <img id="exercise" @click="to_exercise" src="/static/images/index/paradeground-bg.png"/>
      <p>
        <span class="text_34" style="left: 9%;top: 74%">知识练兵场</span>
      </p>

      <img id="goldMall" @click="to_goldMall" src="/static/images/index/Gold_icon.png"/>
      <p>
        <span class="text_34" style="left: 9%;top: 90%">金币商城</span>
      </p>

      <img id="pk" @click="to_pk" src="/static/images/index/pk-bg.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 42%">好友对战</span>
      </p>

      <img id="rank" @click="to_rank" src="/static/images/index/Rankinglist-bg.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 58%">排行榜</span>
      </p>

      <img id="topup" @click="to_topup" src="/static/images/index/top-ups-bg.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 74%">充值</span>
      </p>

      <button @click="to_groupBattle" class="battle_btn">
         <img id="groupBattle" src="/static/images/index/Groupgame_icon.png"/>
      </button>   
      <p>
        <span class="text_34" style="left: 55%;top: 90%">群比赛</span>
      </p>

    </div>
  </div>
</template>

<script>
import wxs from "../../utils/wx";
import { getuuid } from "../../utils/RequestObj";

export default {
  name: "index.vue",
  data() {
    return {
      userInfo: {},
      matchId: "", //战局Id，用于数据传递
      isCreator: "", //是否是创建者，用于数据传递
      isGroup: false //是否是群内pk
    };
  },
  async onShow() {
    // if(state.userId != null){
    //   console.log("再次获得用户信息！");
    //   await this.$store.dispatch("getUserIn");
    // }
    
  },
  async onLoad(option) {
    //若有战局信息，取出并跳转至对战页
    if (option.matchId && option.matchId.length > 0) {
      //option.isGroup是字符串类型
      console.log("是否是群pk：" + option.isGroup);
      console.log("战局id是：" + option.matchId);
      console.log("是否是创建者: " + option.isCreator);
      this.isGroup = option.isGroup === "true" ? true : false;
      console.log("是否是群pk：" + this.isGroup);

      this.matchId = option.matchId;
      this.isCreator = option.isCreator;
    }
    console.log("是否是群pk：" + this.isGroup);
    //若有年级信息说明为首次登陆且已选择年级
    if (
      this.$store.state.userGradePhaseId &&
      this.$store.state.userGradePhaseId.length > 0
    ) {
      await this.getGradeInfoFromChild({
        gradePhaseId: this.$store.state.userGradePhaseId,
        gradeId: this.$store.state.userGradeId
      });
    } else {
      //未选择年级信息，判断是否是首次登陆
      let isSuccess = await this.$store.dispatch("login");
      if (isSuccess) {
        console.log("不是首次登陆");
        this.userInfo = this.$store.state.userInfo;
        if (this.matchId.length > 0) {
          if (this.isGroup) {
            //群pk页面不需要isCreator字段
            wxs.navigateTo(`/pages/group-battle/main?matchId=${this.matchId}`);
          } else {
            wxs.navigateTo(
              `/pages/friend-pk/main?matchId=${this.matchId}&isCreator=${
                this.isCreator
              }`
            );
          }
        }
      } else {
        console.log("首次登陆");
        wxs.redirectTo("../grade-select/main");
      }
    }
    wxs.showShareMenu(true);
  },
  created() {
    this.userInfo = this.$store.state.userInfo;
  },
  computed: {
    progress() {
      let progress =
        this.userInfo.experience / this.userInfo.upgradeExperience * 100;
      return progress;
    }
  },
  methods: {
    //监听年级选择是否结束
    //若结束将年级信息返回给后台同时获取到用户的登陆信息
    async getGradeInfoFromChild(data) {
      console.log("年级阶段：" + data.gradePhaseId + " 年级：" + data.gradeId);
      //data-就是用户选择的年级信息
      await this.$store.dispatch("firstLogin", { data: data });
      this.userInfo = this.$store.state.userInfo;
      if (this.matchId.length > 0) {
        wxs.navigateTo(
          `/pages/friend-pk/main?matchId=${this.matchId}&isCreator=${
            this.isCreator
          }`
        );
      }
    },
    //获取战局id
    async getMatchId() {
      if (this.isGroup) {
        return await this.$store.dispatch("createBattle", {
          battleType: 2
        });
      } else {
        return await this.$store.dispatch("createBattle", {
          battleType: 1
        });
      }
    },
    to_dualmeet: function() {
      wxs.navigateTo("../battle/main");
    },
    to_exercise: function() {
      wxs.navigateTo("../exercise-object-select/main");
    },
    to_pk: function() {
      wxs.navigateTo("../friend-pk/main?isCreator=1");
    },
    to_rank: function() {
      wxs.navigateTo("../rank/main");
    },
    to_topup: function() {
      wxs.navigateTo("../topup/main");
    },
    to_goldMall: function() {
      wxs.navigateTo("../gold-mall/main");
    },
    to_groupBattle: function() {
      wxs.navigateTo("../group-battle/main?isCreator=1");
    },
    to_personalCenter() {
      wxs.navigateTo("../personal-center/main");
    }
  }
};
</script>

<style scoped>
#topup {
  position: absolute;
  right: 5%;
  top: 65%;
  height: 14%;
  width: 44%;
}

#rank {
  position: absolute;
  right: 5%;
  top: 49%;
  height: 14%;
  width: 44%;
}

#pk {
  position: absolute;
  right: 5%;
  top: 24%;
  height: 23%;
  width: 44%;
}

#exercise {
  position: absolute;
  left: 5%;
  top: 57%;
  width: 44%;
  height: 22%;
}

.text_34 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 17px;
  color: rgb(255, 255, 255);
}

#dualmeet {
  position: absolute;
  left: 5%;
  top: 24%;
  height: 31%;
  width: 44%;
}
#goldMall {
  position: absolute;
  left: 5%;
  top: 81%;
  height: 14%;
  width: 44%;
}
.battle_btn {
  position: absolute;
  right: 5%;
  top: 81%;
  height: 14%;
  width: 44%;
}
#groupBattle {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}
.st-personal-center-level-outer {
  position: absolute;
  left: 17%;
  top: 17.5%;
  height: 12px;
  width: 100px;
  border: 1px solid #d2691e;
  background: white;
  border-radius: 10px;
}
.st-personal-center-level-inner {
  position: absolute;
  height: 100%;
  background: #d2691e;
  border-radius: 10px;
}

.user_coin {
  position: absolute;
  right: 25%;
  top: 9%;
}

#coin_icon {
  height: 13px;
  width: 13px;
}

.text_28 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 14px;
  color: rgb(255, 255, 255);
  top: 17%;
}

#grade,
.text_24 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 14px;
  color: rgb(255, 255, 255);
  top: 17%;
}

#user_name {
  font-family: "PingFang-SC-Medium";
  font-size: 18px;
  color: rgb(255, 255, 255);
  position: absolute;
  left: 28%;
  top: 8%;
}

#bg,
#background {
  border: none;
  position: fixed;
  height: 100%;
  width: 100%;
}

#person_info {
  position: absolute;
  top: 2%;
  left: 5%;
  height: 20%;
  width: 90%;
}

#user_icon {
  position: absolute;
  top: 5%;
  left: 10%;
  width: 52px;
  height: 52px;
  border-radius: 50%;
  -moz-border-radius: 50%;
  -webkit-border-radius: 50%;
  background-color: darkgrey;
  border: 4px solid white;
}
</style>
