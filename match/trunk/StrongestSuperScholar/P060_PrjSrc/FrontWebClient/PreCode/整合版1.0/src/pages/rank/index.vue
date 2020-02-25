<template>
<div>
  <img class="st-rank-bg" src="/static/images/bg.png"/>
  <img class="st-rank-ul-bg" src="/static/images/rank/Head_bg.png" />
  
  <!-- rankList -->
  <div class="rank-list-div">
    <ul class="rank-list">
      <li v-for="(item,index) in rankList" :key="index">
        <img v-if="index === 0" class="st-rank-board-bg" src="/static/images/rank/Leaderboard_bg(green).png" />
        <img v-else class="st-rank-board-bg" src="/static/images/rank/Leaderboard_bg(blue).png" />
        <span class="st-rank-num">{{index+1}}</span>
        <img class="st-rank-user-icon" :src="item.headImage" />
        <span class="st-rank-user-name">{{item.wechatName}}</span>
        <span class="st-rank-from">来自：{{item.city}}</span>
        <hr class="st-rank-hr"/>
        <img class="st-rank-level-bg" src="/static/images/rank/Grade_icon.png" />
        <span class="st-rank-level">{{item.externalLevel}}</span>
      </li>
    </ul>
  </div>

<p class="st-rank-tip">当前我的世界排行 {{userRank}}</p>
</div>
</template>
<script>
export default {
  data() {
    // 选项 数据
    return {
      userRank: 0, //用户排名
      rankList: [] //排行列表
    };
  },
  async onLoad() {
    //初始化数据
    let result = await this.$store.dispatch("getRankList");
    this.userRank = result.userRank;
    this.rankList = result.users;
  },
  created() {
    // 生命周期函数
  },
  mounted() {}
};
</script>
<style scoped>
.st-rank-bg {
  position: fixed;
  width: 100%;
  height: 100%;
  z-index: -99;
}
.st-rank-ul-bg {
  position: absolute;
  top: 0;
  width: 100%;
  height: 10%;
  z-index: -1;
}
.st-rank_opinion-ul {
  width: 70%;
  position: absolute;
  top: 3.5%;
  left: 15%;
  display: flex;
}
.st-rank_opinion-ul li {
  float: left;
  color: #fff;
  width: 100%;
  height: 100%;
  padding: 5px 15px;
  font-size: 20px;
  text-align: center;
}
.rank-list-div {
  position: absolute;
  top: 6%;
  width: 88%;
  left: 6%;
  height: 85%;
  overflow: auto;
}
.rank-list {
  position: absolute;
  width: 100%;
  height: 100%;
  animation: slideFromTop 3s;
}
.rank-list li {
  position: relative;
  margin-bottom: 3%;
  width: 100%;
  height: 15%;
}
.st-rank-num {
  position: absolute;
  top: 5%;
  left: 3%;
  font-size: 22px;
  color: #fff;
}
.st-rank-user-icon {
  position: absolute;
  top: 15%;
  left: 15%;
  width: 56px;
  height: 56px;
  border-radius: 50%;
  border: 3px solid #fff;
}
.st-rank-user-name {
  position: absolute;
  top: 20%;
  left: 40%;
  font-size: 17px;
  color: #fff;
}
.st-rank-from {
  position: absolute;
  top: 25%;
  right: 5%;
  font-size: 12px;
  color: #fff;
}
.st-rank-hr {
  position: absolute;
  top: 55%;
  left: 35%;
  width: 65%;
  height: 2px;
  background: #fff;
}
.st-rank-level-bg {
  position: absolute;
  right: 5%;
  bottom: 8%;
  width: 60px;
  height: 20px;
  text-align: center;
  font-size: 12px;
  color: #fff;
}
.st-rank-level {
  position: absolute;
  right: 5%;
  bottom: 7%;
  width: 50px;
  height: 20px;
  text-align: center;
  font-size: 12px;
  color: #fff;
}
.st-rank-board-bg {
  position: absolute;
  width: 100%;
  height: 100%;
}
.st-rank-tip {
  position: absolute;
  bottom: 5%;
  width: 70%;
  left: 15%;
  color: #fff;
  font-size: 12px;
  text-align: center;
}
</style>