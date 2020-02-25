<template>
<div class="loading">
  <!-- 动画 -->
  <div class="st-battle-loading-bg">
    <img class="st-battle-loading-bg-img" src="/static/images/battleLoading/Earth_bg.png"/>
    <div class="st-battle-loading-astronaut">
      <img class="st-battle-loading-astronaut-bg" src="/static/images/battleLoading/Astronaut.png" />
      <img class="st-battle-loading-astronaut-head" src="/static/images/battleLoading/Highlight.png" />
      <img class="st-battle-loading-astronaut-headimage" :src="user.headImage"/>
    </div>
    <img class="st-battle-loading-planet1" src="/static/images/battleLoading/Planet1.png"/>
    <img class="st-battle-loading-planet2" src="/static/images/battleLoading/Planet2.png"/>
    <img class="st-battle-loading-planet3" src="/static/images/battleLoading/Planet3.png"/>
    <img class="st-battle-loading-planet4" src="/static/images/battleLoading/Planet4.png"/>
    <img class="st-battle-loading-planet5" src="/static/images/battleLoading/Planet5.png"/>
  </div>

  <span class="st-battle-loading-username">{{user.wechatName}}同学</span>
  <span class="st-battle-loading-level">{{level}}</span>
  <span class="st-battle-loading-timing-tip" v-if="timing%3 === 0">匹配中.</span>
  <span class="st-battle-loading-timing-tip" v-if="timing%3 === 1">匹配中..</span>
  <span class="st-battle-loading-timing-tip" v-if="timing%3 === 2">匹配中...</span>
  <span class="st-battle-loading-timing" v-if="timing >= 3">{{timing}}秒</span>
</div>
</template>

<script>
import wxs from "../utils/wx.js";
export default {
  props: {
    user: {
      type: Object,
      required: true
    }
  },
  data() {
    return {
      opponentInfo: {
        headImage: "/static/images/nick.jpg",
        wechatName: "皮皮虾",
        city: "西安",
        externalLevel: 15
      },
      interval: null,
      timing: 0 //匹配时间计时
    };
  },
  onLoad() {
    this.timing = 0;
    this.interval = setInterval(() => {
      if (this.timing < 30) {
        this.timing += 1;
      } else {
        clearInterval(this.interval);
        this.$emit("matchTimeOut");
      }
    }, 1000);
  },
  onUnload(){
    clearInterval(this.interval);
  },
  computed: {
    level() {
      let level = parseInt(this.user.externalLevel / 5);
      switch (level) {
        case 0:
          return "新手";
          break;
        case 1:
          return "熟手";
          break;
        case 2:
          return "优秀";
          break;
        case 3:
          return "课代表";
          break;
        case 4:
          return "学霸";
          break;
      }
    }
  }
};
</script>

<style scoped>
.loading {
  position: fixed;
  width: 100%;
  height: 100%;
  background: #5f37db;
}
.st-battle-loading-bg {
  position: absolute;
  top: 15%;
  left: 10%;
  width: 80%;
  height: 42%;
}
.st-battle-loading-bg-img {
  position: absolute;
  width: 300px;
  height: 288px;
}
.st-battle-loading-astronaut {
  position: absolute;
  top: 16%;
  left: 30%;
  width: 40%;
  height: 60%;
  animation: float 3s infinite forwards;
  z-index: 5;
}
.st-battle-loading-astronaut-bg {
  position: absolute;
  width: 100%;
  height: 100%;
}
.st-battle-loading-astronaut-head {
  position: absolute;
  top: 16%;
  height: 26%;
  left: 32%;
  width: 36%;
  z-index: 9;
}
.st-battle-loading-astronaut-headimage {
  position: absolute;
  top: 12.5%;
  height: 29%;
  left: 30%;
  width: 38%;
  border-radius: 50%;
}
.st-battle-loading-username {
  position: absolute;
  top: 62%;
  width: 80%;
  left: 10%;
  font-size: 22px;
  text-align: center;
  font-weight: bold;
  color: #fff;
}
.st-battle-loading-level {
  position: absolute;
  top: 70%;
  width: 40%;
  left: 30%;
  font-size: 15px;
  text-align: center;
  color: #fff;
}
.st-battle-loading-timing,
.st-battle-loading-timing-tip {
  position: absolute;
  width: 40%;
  left: 30%;
  font-size: 15px;
  text-align: center;
  color: rgb(97, 248, 255);
}
.st-battle-loading-timing-tip {
  top: 75%;
}
.st-battle-loading-timing {
  top: 80%;
  animation: rotateIn 0.5s;
}
.st-battle-loading-planet1 {
  position: absolute;
  width: 90px;
  height: 90px;
  bottom: 5%;
  right: 20%;
  animation: spinReverse 10s linear infinite;
  transform-origin: -25px -25px;
  z-index: 2;
}
.st-battle-loading-planet2 {
  position: absolute;
  width: 35px;
  height: 35px;
  top: 5%;
  left: 10%;
  animation: spin 8s linear infinite;
  transform-origin: 100px 125px;
}
.st-battle-loading-planet3 {
  position: absolute;
  width: 22px;
  height: 22px;
  bottom: 28%;
  right: 12%;
  animation: spinReverse 8s linear infinite;
  transform-origin: -100px -25px;
}
.st-battle-loading-planet4 {
  position: absolute;
  width: 70px;
  height: 70px;
  bottom: 10%;
  left: 5%;
  animation: spin 8s linear infinite;
  transform-origin: 125px -40px;
}
.st-battle-loading-planet5 {
  position: absolute;
  width: 40px;
  height: 40px;
  top: 10%;
  right: 10%;
  animation: spinReverse 8s linear infinite;
  transform-origin: -100px 100px;
}
</style>
