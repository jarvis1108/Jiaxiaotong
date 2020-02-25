<template>
  <div class="st-background-base-div">
    <img class="st-background-bg-div" src="/static/images/bg.png" >
    
    <div class="st-result-detail-div">
      <img class="st-background-bg-div" src="/static/images/groupBattleResult/Performancedisplay_bg.png" />
      <p id="st-total-grade-p">{{animatedUserMark}}分</p>
      <p id="st-total-correct-p">答对{{userAnswerNum}}题</p>
      <p id="st-coin-change-p" class="st-detail-text-p">金币：&nbsp;&nbsp;&nbsp;&nbsp;+{{isUserWin?100:0}}</p>
      <p id="st-gradepoint-change-p" class="st-detail-text-p">绩点：&nbsp;&nbsp;&nbsp;&nbsp;+{{userCorrectNum}}</p>
      <p id="st-studypoint-change-p" class="st-detail-text-p">学点：&nbsp;&nbsp;&nbsp;&nbsp;-{{userLearningPoit}}</p>      
      <p id="st-expression-change-p" class="st-detail-text-p">经验：&nbsp;&nbsp;&nbsp;&nbsp;+{{isUserWin?10:5}}</p>          
    </div>
    
    <div class="st-player-range-div">
      <div class="st-player-range-container">
        <div class="st-player-detail-div" v-for="(playerId,index) in playerIdArray" :key="index">
          <div class="st-player-img-div">
            <img class="st-background-bg-div user-icon" :src='playerMap[playerId].headImage' />
          </div>
          <p>第{{index+1}}名</p>
          <p>{{scoreMap[playerId]}}分</p>
          <div class="st-player-cup-div">
            <img v-if="index === 0" class="st-background-bg-div" src="/static/images/groupBattleResult/Goldtrophy_icon.png" />
            <img v-if="index === 1" class="st-background-bg-div" src="/static/images/groupBattleResult/Silvertrophy_icon.png" />
            <img v-if="index === 2" class="st-background-bg-div" src="/static/images/groupBattleResult/Bronzetrophy_icon.png" />
          </div>
        </div>
      </div>
    </div>
    
    <div class="st-continue-game-div">
      <img @click="again" class="st-background-bg-div" src="/static/images/groupBattleResult/1.1Continue-btn.png" />
    </div>

    <button class="st-share-result-div" id="showoff" open-type="share">
      <img class="btn_img" src="/static/images/groupBattleResult/1.1Showoff-btn.png"/>
    </button>
  </div>
  
</template>
<script>
import { TweenLite } from "../assests/js/TweenMax.min";
import wxs from "../utils/wx";
export default {
  name: "result",
  props: {
    userInfo: {
      type: Object,
      required: true
    },
    playerList: {
      required: true
    },
    playerMap: {
      type: Map,
      required: true
    },
    userScore: {
      required: true
    },
    userCorrectNum: {
      required: true
    },
    userLearningPoit: {
      required: true
    },
    scoreMap: {
      type: Map,
      required: true
    },
    matchId: {
      required: true
    }
  },
  data() {
    return {
      aUserMark: 0, //用户分数--动画
      userMark: 0
    };
  },
  async onLoad() {
    this.userMark = this.userScore;
    this.opponentMark = this.opponentScore;
    //答题结束，将结果返回给后台
    let learningPoint = 0 - this.userLearningPoit;
    console.log("该用户对战是否胜利：" + this.isUserWin);
    let coin = this.isUserWin ? 50 : -50;
    let experience = this.isUserWin ? 10 : 5;
    const res = await this.$store.dispatch("saveBattleResult", {
      matchId: this.matchId,
      userId: this.userInfo.userId,
      coin: coin,
      gradePoint: this.userCorrectNum,
      learningPoint: learningPoint,
      experience: experience,
      isWin: this.isUserWin
    });
    wxs.showShareMenu(true);
  },
  computed: {
    isUserWin() {
      //平均分前50%算赢
      let sum = 0;
      let playerNum = Object.keys(this.playerMap).length;
      for (var key in this.scoreMap) {
        sum += this.scoreMap[key];
      }
      let average = sum / playerNum;
      return this.userScore >= average ? true : false;
    },
    animatedUserMark() {
      return this.aUserMark.toFixed(0);
    },
    userAnswerNum() {
      switch (this.userCorrectNum) {
        case 0:
          return "零";
        case 1:
          return "一";
        case 2:
          return "二";
        case 3:
          return "三";
        case 4:
          return "四";
        case 5:
          return "五";
      }
    },
    playerIdArray() {
      var playerIdArray = [];
      for (var key in this.scoreMap) {
        playerIdArray.push(key);
      }
      return playerIdArray;
    }
  },
  watch: {
    userMark(newVal) {
      TweenLite.to(this.$data, 1.5, { aUserMark: newVal, delay: 0.5 });
    }
  },
  methods: {
    again() {
      wxs.redirectTo(
        `../battle/main?playerList=${JSON.stringify(this.playerList)}&matchId=${
          this.matchId
        }`
      );
    }
  }
};
</script>

<style scoped>
.st-background-base-div {
  width: 100%;
  height: 100%;
  position: fixed;
}
.st-background-bg-div {
  width: 100%;
  height: 100%;
  left: 0;
  position: absolute;
}
.st-result-detail-div {
  position: absolute;
  top: 3.8%;
  left: 3.8%;
  right: 3.8%;
  width: 92.4%;
  height: 22.41%;
}
#st-total-grade-p {
  position: relative;
  top: 10.5%;
  width: 100%;
  margin: 0;
  text-align: center;
  font-size: 13.3vw;
  color: rgb(255, 255, 255);
  font-family: "PingFang-SC-Bold";
}
#st-total-correct-p {
  position: relative;
  top: 7%;
  width: 100%;
  margin: 0;
  text-align: center;
  font-size: 4.5vw;
  color: rgb(255, 255, 255);
  font-family: "PingFang-SC-Medium";
}
.st-detail-text-p {
  font-size: 3.7vw;
  font-family: "PingFang-SC-Medium";
  color: rgb(255, 255, 255);
}
#st-coin-change-p {
  position: absolute;
  top: 65.34%;
  left: 16.45%;
  width: 30%;
  margin: 0;
  text-align: left;
}
#st-gradepoint-change-p {
  position: absolute;
  top: 77.34%;
  left: 16.45%;
  width: 30%;
  margin: 0;
  text-align: left;
}
#st-studypoint-change-p {
  position: absolute;
  top: 65.34%;
  left: 60%;
  width: 30%;
  margin: 0;
  text-align: left;
}
#st-expression-change-p {
  position: absolute;
  top: 77.34%;
  left: 60%;
  width: 30%;
  margin: 0;
  text-align: left;
}
::-webkit-scrollbar {
  width: 0px;
}
.st-player-range-div {
  position: absolute;
  height: 50.97%;
  left: 6.67%;
  right: 6.67%;
  width: 86.66%;
  top: 25%;
  overflow: auto;
}
.st-player-range-container {
  position: absolute;
  height: 100%;
  width: 100%;
  left: 0;
  animation: slideFromTop 1.5s;
}
.st-player-detail-div {
  position: relative;
  top: 0;
  height: 25%;
  width: 100%;
  border-radius: 22rpx;
  margin-bottom: 10rpx;
  background-color: rgb(45, 201, 252);
  color: white;
  text-align: center;
}
.st-player-img-div {
  position: absolute;
  left: 3.69%;
  top: 17.22%;
  width: 18.15%;
  height: 65.56%;
  border-radius: 50%;
  border: 4rpx solid white;
  background-color: rgb(132, 132, 132);
  overflow: hidden;
}
.st-player-cup-div {
  position: absolute;
  right: 3.69%;
  top: 17.22%;
  width: 18.15%;
  height: 65.56%;
  overflow: hidden;
}
.st-continue-game-div {
  position: absolute;
  bottom: 12.5%;
  left: 20.67%;
  width: 58.67%;
  height: 8.92%;
}
.st-share-result-div {
  position: absolute;
  bottom: 3%;
  left: 20.67%;
  width: 58.67%;
  height: 8.92%;
}
.btn_img {
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
}
.user-icon {
  left: 0;
  border-radius: 50%;
}
#showoff {
  border: none;
  background: transparent;
}
#showoff::after {
  border: none;
}
</style>