<template>
	<div class="bs-hexagon-div" v-show="cd">
		<!--
        	时间：2018-07-20
        	描述：六边形动画，包括两部分：
				1、六边形和题号放大缩小
				2、开始10s倒计时
        -->
		<div class="bs-hexagon-div bs-big-animation" v-show="big">
			<img class="bs-bg-img" src="../../static/img/Hexagon@2x.png">
			<div class="bs-text1 timu">第&nbsp&nbsp&nbsp题</div>
			<span class="bs-text1 timuxuhao">{{ order }}</span>
		</div>
		<div class="bs-hexagon-div" v-show="!big">
			<img class="bs-bg-img" src="../../static/img/Hexagon@2x.png">
			<div class="bs-cdtext-animation">{{ cd }}</div>
		</div>
	</div>
</template>

<script>
	export default {
		props: ['order'],
		data() {
			return {
				cd: 10,
				big: true,
				timeValID:null
			}
		},
		watch:{
			order:function()
			{
				this.big=true;
				clearInterval(this.timeValID);
				this.cd = 10;
				this.startCutDown();
			},
			cd:function(val){
				if(val == 0){
					clearInterval(this.timeValID);
				}
			}
		},
		methods: {
			startCutDown() {
				var _this = this
				setTimeout(() => {
					_this.big = false;
					_this.timeValID = setInterval(() => {
						_this.cd -=1;
					}, 1000);
				}, 2500);
				
				
			}
		},
		created(){
			this.startCutDown();
		}
	}
</script>

<style scoped>
	.bs-bg-img {
		width: 100%;
		height: 100%;
		position: absolute;
	}
	
	.bs-text1 {
		text-align: center;
		font-family: "PingFang-SC-Medium";
		color: #ffffff;
	}
	
	.bs-text2 {
		text-align: center;
		font-family: "PingFang-SC-Bold";
	}
	
	.bs-hexagon-div {
		height: 100%;/*112rpx*/
		width: 100%;/*108rpx*/
		left: 0;
		top: 0;
		position: absolute;
	}
	
	.bs-big-animation {
		animation: big 1s linear 0.5s forwards;
	}
	
	.timu {
		top: 39.29%;
		width: 100%;
		text-align: center;
		position: absolute;
		font-size: 24rpx;
	}
	
	.timuxuhao {
		top: 29.46%;
		width: 100%;
		text-align: center;
		position: absolute;
		font-size: 36rpx;
	}
	
	.bs-cdtext-animation {
		font-size: 50rpx;
		top: 19.64%;
		width: 100%;
		left: 0;
		position: absolute;
		color: #FFFFFF;
		font-family: "PingFang-SC-Bold";
		text-align: center;
		animation: cutDown 1s 11 forwards;
	}
	
	@keyframes big {
		0% {
			transform: scale(0) translateY(0);
			opacity: 1;
		}
		35% 65% {
			transform: scale(5) translateY(30px);
			opacity: 1;
		}
		100% {
			transform: scale(0) translateY(0);
			opacity: 0;
		}
	}
	
	@keyframes cutDown {
		0% {
			transform: translateY(-20px);
			opacity: 0;
		}
		50% 85% {
			transform: translateY(0);
			opacity: 1;
		}
		100% {
			transform: translateY(0);
			opacity: 0;
		}
	}
</style>