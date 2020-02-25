<template>
	<div class="bs-container-topup-div">
		<img class="bs-bg-img" src="/static/images/bg.png">
		
		<div class="bs-productList-div">
			<div class="bs-flex-div">
				<div class="box" v-for="(item,index)  in productList" :key="item">
					<div class="bs-goodname-div">
						{{ item.productName}}
					</div>
					<!-- <a :href=" url + '?name=' + item.ProductName + '&price=' + item.Price " > -->
						<!-- <img class="bs-goodPhoto-img" :src="item.Photo" @click='pay(item.productId)'/> -->
            <!-- <img class="bs-goodPhoto-img" :src="item.productImage" @click="showPayF(item)"/> -->
					<!-- </a> -->
					
          <div v-if="index%3 === 0" class="st-goodPhoto-blue-div">
            <img class="st-goodPhoto-img" :src="item.productImage" @click='showPayF(item,index)' />
          </div>
          <div v-else-if="index%3 === 1" class="st-goodPhoto-green-div">
            <img class="st-goodPhoto-img" :src="item.productImage" @click='showPayF(item,index)' />
          </div>
          <div v-else class="st-goodPhoto-cyan-div">
            <img class="st-goodPhoto-img" :src="item.productImage" @click='showPayF(item,index)' />
          </div>   


					<div class="bs-goodprice-div">
						{{ item.productPrice}}元
					</div>
				</div>
			</div>
			
		</div>
		<div class="bs-memory-div">
			<a style="position:absolute;width:20%;left:40%" href="../topup-record/main">充值记录</a>
		</div>
    <!-- <payTip v-if="showPay" @listenCloseDialog="showPay = false"></payTip> -->
    <payTip v-if="showPay" @listenCloseDialog="showPay = false" :product= "productObj" :index = 'index'></payTip>
	</div>
</template>

<script>
import payTip from "../../components/payTip";
import wxs from "../../utils/wx";
export default {
  components: { payTip },
  data() {
    return {
      productObj: {},
      showPay: false,
      index: 0,
      showSetting: false, //是否显示设置弹窗
      productList: [],
      url: "/pages/payment/main"
    };
  },
  methods: {
    showPayF(item, index) {
      this.productObj = item;
      this.index = index;
      console.log(this.productObj);
      this.showPay = true;
    }
  },
  async onShow() {
    this.showPay = false;
  },
  async onLoad() {
    this.productList = await this.$store.dispatch("getProductList", 0);
    console.log("拿到的商品列表是：" + JSON.stringify(this.productList));
  }
};
</script>

<style scoped>
.bs-bg-img {
  height: 100%;
  width: 100%;
  position: absolute;
}

.bs-container-topup-div {
  width: 100%;
  height: 100%;
  position: fixed;
}
.st-goodPhoto-blue-div {
  flex: 0 0 auto;
  width: 54px;
  height: 14.4vw;
  background: rgb(61, 138, 218);
  border-radius: 50%;
  position: relative;
}
.st-goodPhoto-green-div {
  flex: 0 0 auto;
  width: 54px;
  height: 14.4vw;
  background: rgb(121, 181, 61);
  border-radius: 50%;
  position: relative;
}
.st-goodPhoto-cyan-div {
  flex: 0 0 auto;
  width: 54px;
  height: 14.4vw;
  background: rgb(32, 196, 163);
  border-radius: 50%;
  position: relative;
}
.bs-productList-div {
  top: 3vh;
  width: 90.66vw;
  height: 73.01vh;
  left: 4.67vw;
  position: absolute;
  background-color: #ffffff;
  border-radius: 20rpx;
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  align-content: flex-start;
}
.st-goodPhoto-img {
  width: 30px;
  height: 30px;
  position: absolute;
  top: 25%;
  left: 25%;
}
.bs-flex-div {
  width: 88%;
  left: 6%;
  top: 6.52%;
  position: absolute;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  align-content: flex-start;
}

.box {
  flex: 0 0 auto;
  height: 14.29vh;
  width: 21vw;
  margin-bottom: 3.5vh;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.bs-goodname-div {
  flex: 0 0 auto;
  width: 20.26vw;
  height: 2.22vh;
  border-radius: 14rpx;
  background-color: rgb(79, 111, 198);
  color: #ffffff;
  text-align: center;
  font-size: 20rpx;
  font-family: "PingFang-SC-Bold";
  margin-bottom: 0.63vh;
}

.bs-goodPhoto-img {
  flex: 0 0 auto;
  width: 14.4vw;
  height: 14.4vw;
}

.bs-goodprice-div {
  flex: 0 0 auto;
  width: 20.26vw;
  height: 1.9vh;
  color: rgb(70, 82, 159);
  text-align: center;
  font-size: 1.9vh;
  font-family: "PingFang-SC-Bold";
}

.bs-memory-div {
  width: 100%;
  text-align: center;
  font-size: 32rpx;
  color: rgb(158, 200, 252);
  margin: auto;
  top: 77vh;
  position: relative;
  text-decoration: underline;
  font-family: "PingFang-SC-Bold";
}
</style>