<template>
  <div class="st-background-base-div">
    <img class="st-background-bg-div" src="/static/images/bg.png" >
    
    
    <div id="st-status-text-div" v-show="isCreator">等待成员加入...</div>
    <div id="st-status-text-div" v-show="!isCreator">等待房主开局...</div>
    <!--
    	时间：2018-07-26
    	描述：成员头像
    -->

    <div class="st-players-div">
      <div class="st-players-flex-div" @touchstart="touchStart" @touchmove="touchMove" @touchend="touchEnd">
        <!-- 前十名玩家头像 -->
        <div v-if="selectPage === 1" class="st-player-image-box" v-for="(player,index) in firstTenPlayerList" :key="index">
          <img v-if="creator.userId === player.userId" src="/static/images/groupBattleWaiting/Owner_icon.png" class="st-owner-icon">
          <img v-if="playerList.length <= 3" class="st-bigger-headImage-bg" :src="player.headImage">          
          <img v-else class="st-headImage-bg" :src="player.headImage">
        </div>
        <!-- 后十名玩家头像 -->
        <div v-if="selectPage === 2" class="st-player-image-box" v-for="(player,index) in lastTenPlayerList" :key="index">
          <img class="st-headImage-bg" :src="player.headImage">
        </div>
      </div>
      <div v-if="playerList.length > 10" class="st-page-point-div">
        <!-- 超过10人时，用于标记的小点 -->
        <div v-if="selectPage === 1" class="st-page-select-point"></div>
        <div v-if="selectPage === 2" class="st-page-point"></div>
        <div v-if="selectPage === 1" class="st-page-point"></div>
        <div v-if="selectPage === 2" class="st-page-select-point"></div>
      </div>
    </div>
    
    <!-- 开始比赛按钮 -->
    <div id="st-game-start-div" v-show="isCreator" v-if="playerNumber > 1">
      <img @click="on_startBattle" src="/static/images/groupBattleWaiting/Startthecompetition_btn.png" class="st-background-bg-div"/>
    </div>
    
    <div id="icons">
      <div id="giveup-div">
        <img @click="on_giveUp" class="giveUp" src="/static/images/groupBattleWaiting/Giveup_icon.png"/>
        <span id="giveup-text">放弃</span>
      </div>
      <div id="invite-div">
        <button :open-type="isShareable" class="invite">
          <img src="/static/images/groupBattleWaiting/Invitation_icon.png" class="invite_img"/>
        </button>
        <span id="invite-text">邀请</span>
      </div>
    </div>
  </div>
</template>

<script>
import wxs from "../utils/wx";
export default {
  props: {
    creator: {
      type: Object,
      required: true
    },
    playerList: {
      type: Array,
      required: true
    },
    playerNumber: {
      type: Number,
      required: true
    },
    matchId: {
      required: true
    },
    isCreator: {
      type: Boolean,
      required: true
    }
  },
  data() {
    return {
      selectPage: 1, //选中的页码
      touchDot: 0, //触摸起点
      touchDirection: 0 //滑屏方向，-1左滑，1右滑
    };
  },
  computed: {
    //玩家列表的前十位玩家[考虑到页面显示，切分为两个列表]
    firstTenPlayerList() {
      console.log("玩家列表为：" + this.playerList);
      return this.playerList.slice(0, 10);
    },
    //玩家列表的后十位玩家
    lastTenPlayerList() {
      console.log("玩家列表为：" + this.playerList);
      if (this.playerList.length >= 10)
        return this.playerList.slice(10, this.playerNumber.length);
      else return [];
    },
    isShareable() {
      return this.playerNumber < 10 ? "share" : "";
    }
  },
  onLoad() {
    //初始化数据
    this.selectPage = 1;
    this.touchDot = 0;
    this.touchDirection = 0;
  },
  methods: {
    on_startBattle() {
      this.$emit("beginBattle");
      // this.$emit("playerList", this.playerNumber);
    },
    on_giveUp() {
      if (this.isCreator) clearInterval(this.interval);
      this.$emit("giveUpBattle");
    },
    //手指触摸滑动开始
    touchStart(e) {
      this.touchDot = e.touches[0].pageX;
    },
    touchMove(e) {
      var touchMove = e.touches[0].pageX;
      if (touchMove - this.touchDot <= -40) {
        this.touchDirection = 1;
      } else if (touchMove - this.touchDot >= 40) {
        this.touchDirection = -1;
      }
    },
    touchEnd() {
      if (this.playerList.length > 10) {
        if (this.touchDirection === -1 && this.selectPage === 2) {
          this.selectPage = 1;
        } else if (this.touchDirection === 1 && this.selectPage === 1) {
          this.selectPage = 2;
        }
      }
    }
  }
};
</script>

<style scoped>
.st-players-div {
  position: absolute;
  width: 95%;
  left: 2.5%;
  top: 5%;
  height: 23%;
  background: rgba(0, 0, 0, 0.3);
  border-radius: 20px;
}
.st-players-flex-div {
  position: absolute;
  width: 100%;
  height: 90%;
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
}
.st-player-image-box {
  position: relative;
  margin: 10px;
  width: 50px;
  height: 50px;
  animation: zoomOut 1s;
}
.st-headImage-bg {
  position: absolute;
  width: 100%;
  height: 100%;
  border-radius: 50%;
}
.st-bigger-headImage-bg {
  position: absolute;
  width: 120%;
  height: 120%;
  border-radius: 50%;
}
.st-owner-icon {
  position: absolute;
  height: 20px;
  width: 20px;
  left: 0;
  top: 0;
  z-index: 2;
}
.st-page-point-div {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 5%;
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
}
.st-page-select-point {
  position: relative;
  margin: 2px;
  width: 5px;
  height: 5px;
  background: #fff;
  border-radius: 50%;
  overflow: hidden;
}
.st-page-point {
  position: relative;
  margin: 2px;
  width: 5px;
  height: 5px;
  background: rgba(255, 255, 255, 0.3);
  border-radius: 50%;
  overflow: hidden;
}
.st-background-base-div {
  width: 100%;
  height: 100%;
  position: fixed;
}
.st-background-bg-div {
  width: 100%;
  height: 100%;
  position: absolute;
}
#st-status-text-div {
  position: absolute;
  width: 100%;
  top: 32%;
  text-align: center;
  font-size: 36rpx;
  font-family: "PingFang-SC-Bold";
  color: rgb(255, 255, 255);
}
#st-game-start-div {
  position: absolute;
  bottom: 20%;
  left: 20.67%;
  right: 20.67%;
  height: 9.45%;
}
#icons {
  position: absolute;
  top: 47%;
  height: 15%;
  width: 60%;
  left: 20%;
}
#giveup-div {
  position: relative;
  float: left;
  width: 75px;
  height: 75px;
  border-radius: 50%;
  background: rgb(254, 110, 116);
}
.giveUp,
.invite_img {
  width: 30px;
  height: 30px;
  border: none;
}

.giveUp {
  position: absolute;
  top: 20%;
  left: 25%;
}

.invite {
  position: absolute;
  top: 20%;
  left: 15%;
}
#invite-div {
  position: relative;
  float: right;
  width: 75px;
  height: 75px;
  border-radius: 50%;
  background: rgb(29, 218, 251);
  animation: shake 1.5s infinite;
}
.invite {
  border: 0 solid #000;
  background: transparent;
}

.invite::after {
  border: 0;
}
#giveup-text,
#invite-text {
  font-size: 13px;
  font-weight: bold;
  color: white;
  position: absolute;
  left: 30%;
  top: 65%;
}
@keyframes shake {
  0%,
  100% {
    transform: rotate(0);
  }
  25%,
  75% {
    transform: translateX(0);
  }
  35%,
  45%,
  55%,
  65% {
    transform: translateX(-5px);
  }
  40%,
  50%,
  60%,
  70% {
    transform: translateX(5px);
  }
}
</style>