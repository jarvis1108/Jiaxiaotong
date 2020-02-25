<template>
  <!-- 我的物品界面 -->
	<div class="st-container-myItems-div">
		<img class="st-bg-img" src="/static/images/bg.png">
		
    <div v-if="productList.length === 0" class="st-myItems-noProduct-span">暂时还没有物品</div>

		<div class="st-productList-div">
			<div class="st-flex-div">
				<div class="box" v-for="(item,index) in productList" :key="item">
					<div class="st-goodname-div">
						{{ item.ProductName }}
					</div>

          <div v-if="index%3 === 0" class="st-goodPhoto-blue-div">
            <img class="st-goodPhoto-img" :src="item.Photo" />
          </div>
          <div v-else-if="index%3 === 1" class="st-goodPhoto-green-div">
            <img class="st-goodPhoto-img" :src="item.Photo" />
          </div>
          <div v-else class="st-goodPhoto-cyan-div">
            <img class="st-goodPhoto-img" :src="item.Photo" />
          </div>                    
					
					<div class="st-goodNum-div">
						X{{ item.Number }}
					</div>
				</div>
			</div>
			
		</div>
		<!-- <div class="st-memory-div">
			<a style="position:absolute;width:20%;left:40%" href="../exchange-record/main">兑换记录</a>
		</div> -->
	</div>
</template>

<script>
export default {
  data() {
    return {
      productList: [],
      url: "/pages/payment/main"
    };
  },
  async onLoad() {
    //第一版暂不开发"我的物品"功能
    // this.productList = await this.$store.dispatch("getProductListOfMine");
  }
};
</script>

<style scoped>
.st-myItems-noProduct-span {
  position: absolute;
  width: 60%;
  height: 20%;
  top: 25%;
  left: 20%;
  text-align:center;
  z-index: 10;
  color: gray;
  font-size: 17px;
}
.st-bg-img {
  height: 100%;
  width: 100%;
  position: absolute;
}

.st-container-myItems-div {
  width: 100%;
  height: 100%;
  position: fixed;
}

.st-productList-div {
  top: 3vh;
  width: 90.66vw;
  height: 73.01vh;
  left: 4.67vw;
  position: absolute;
  background-color: #ffffff;
  border-radius: 20rpx;
}

.st-flex-div {
  width: 100%;
  left: 6%;
  top: 6.52%;
  position: absolute;
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
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
  margin-right: 10%;
}

.st-goodname-div {
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
.st-goodPhoto-img {
  width: 40px;
  height: 32px;
  position: absolute;
  top: 20%;
  left: 15%;
}
.st-goodNum-div {
  flex: 0 0 auto;
  width: 20.26vw;
  height: 1.9vh;
  color: rgb(70, 82, 159);
  text-align: center;
  font-size: 1.9vh;
  font-family: "PingFang-SC-Bold";
}

.st-memory-div {
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