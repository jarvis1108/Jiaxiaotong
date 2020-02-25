<template>
  <div class="st-exchange-record-container">

    <div v-if="recordList.length === 0" class="st-exchange-record-noRecord-span">暂时还没有兑换记录</div>

    <ul class="st-exchange-record-ul">
      <li class="st-exchange-record-li" v-for="(item,index) in recordList" :key="index">
        <!-- 记录条目背景 -->
        <img class="st-exchange-record-li-bg" v-if="(index%3) === 0" src="/static/images/topupRecord/Blue_bg.png"/>
        <img class="st-exchange-record-li-bg" v-else-if="(index%3) === 1" src="/static/images/topupRecord/Green_bg.png"/>
        <img class="st-exchange-record-li-bg" v-else src="/static/images/topupRecord/Cyan_bg.png"/>

        <!-- 记录条目的图标和名称-->
        <img class="st-exchange-record-li-icon" :src="item.productImage" />
        <div class="st-exchange-record-li-name-div">
          <span v-if="(index%3) === 0" class="st-exchange-record-li-blue-name">{{item.productName}}</span>
          <span v-else-if="(index%3) === 1" class="st-exchange-record-li-green-name">{{item.productName}}</span>
          <span v-else class="st-exchange-record-li-cyan-name">{{item.productName}}</span>
        </div>

        <!-- 记录条目的价格 -->
        <span class="st-exchange-record-li-price">{{item.productPrice}}</span>
        <img class="st-exchange-record-li-coin-img" src="/static/images/exchangeRecord/Goldcoin_icon.png"/>

        <!-- 记录条目的交易时间 -->
        <div class="st-exchange-record-li-datatime">
          <span v-if="(index%3) === 0" class="st-exchange-record-li-blue-datatime">{{item.createTime}}</span>
          <span v-else-if="(index%3) === 1" class="st-exchange-record-li-green-datatime">{{item.createTime}}</span>
          <span v-else class="st-exchange-record-li-cyan-datatime">{{item.createTime}}</span>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      recordList: [] //充值记录列表
    };
  },
  async onLoad() {
    this.recordList = await this.$store.dispatch("getExchangeRecordList");
  }
};
</script>

<style scoped>
.st-exchange-record-noRecord-span {
  position: absolute;
  width: 60%;
  height: 20%;
  top: 25%;
  left: 20%;
  text-align: center;
  z-index: 10;
  color: #000;
  font-size: 19px;
}
.st-exchange-record-container {
  position: fixed;
  width: 100%;
  height: 100%;
  background: rgb(207, 235, 255);
}
.st-exchange-record-ul {
  position: absolute;
  height: 80%;
  top: 5%;
  width: 90%;
  left: 5%;
  overflow: auto;
}
.st-exchange-record-li {
  position: relative;
  height: 100px;
  width: 100%;
  margin-bottom: 2%;
}
.st-exchange-record-li-bg {
  position: absolute;
  top: 0;
  width: 100%;
  height: 100%;
  left: 0%;
  z-index: 0;
}
.st-exchange-record-li-icon {
  position: absolute;
  width: 56.5px;
  height: 56.5px;
  top: 10%;
  left: 5%;
}
.st-exchange-record-li-name-div {
  position: absolute;
  width: 76px;
  height: 14px;
  top: 70%;
  left: 5%;
  background: #fff;
  border-radius: 7px;
  text-align: center;
  font-size: 10px;
}
.st-exchange-record-li-blue-name {
  color: rgb(61, 138, 218);
}
.st-exchange-record-li-green-name {
  color: rgb(121, 181, 61);
}
.st-exchange-record-li-cyan-name {
  color: rgb(32, 196, 163);
}
.st-exchange-record-li-blue-datatime {
  color: rgb(254, 254, 255);
}
.st-exchange-record-li-green-datatime {
  color: rgb(182, 223, 142);
}
.st-exchange-record-li-cyan-datatime {
  color: rgb(146, 232, 215);
}
.st-exchange-record-li-price {
  position: absolute;
  top: 25%;
  right: 15%;
  font-size: 18px;
  color: #fff;
}
.st-exchange-record-li-coin-img {
  position: absolute;
  top: 29%;
  right: 8%;
  width: 17px;
  height: 17px;
}
.st-exchange-record-li-datatime {
  position: absolute;
  bottom: 20%;
  right: 10%;
  font-size: 10px;
  color: #fff;
}
</style>