<template>
	<div id="base" :class="animation">
		<img class="bg" src="../../../dist/static/img/bg.png">
		<div class="name">
			{{ name }}
		</div>
		<div class="price">
			<span class="left">商品总价</span>
			<span class="right">{{ price }}</span>
		</div>
		<div class="pay">
			<span class="left">支付方式</span>
			<span class="right">微信支付</span>
		</div>
		<button @click="confirmPayment" class="confirm">去支付</button>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				name:'',
				price:'',
				animation:''
			}
		},
		onLoad(option){
			this.name=option.name;
			this.price=option.price;
		},
		onunload(){
			this.animation='toRight';
		},
		methods:{
			confirmPayment(){
				console.log("click");
				wx.requestPayment({
					'timeStamp': '',
					'nonceStr': '',
					'package': '',
					'signType': 'MD5',
					'paySign': '',
					'success':function(res){
						console.log("success");
					},
					'fail':function(res){
						console.log(res);
					},
					'complete':function(res){}
				})
			}
		}
	}
</script>

<style scoped>
.bg{
	height: 100%;
	width: 100%;
	position: absolute;
}



#base{
	width: 100%;
	height: 100%;
	position:fixed;
}

	.name{
		width: 100%;
		height: 68px;
		background: #FFFFFF;
		top: 35px;
		display: table-cell;
		position: absolute;
		text-align: center;
		vertical-align: middle;
	}
	
.price{
	top: 171px;
	width: 100%;
	height: 40px;
	position: absolute;
	background-color: #FFFFFF;
}
.left{
	left: 10px;
	position: absolute;
}
.right{
	right: 10px;
	position: absolute;
}
.pay{
	top: 221px;
	width: 100%;
	height: 40px;
	position: absolute;
	background-color: #FFFFFF;
}

.confirm{
	background-color: royalblue;
	border-radius: 5px;
	width: 110px;
	margin: auto;
	height: 35px;
	top: 305px;
	color: #FFFFFF;
	font-size: 15px;
	position: relative;
	text-align: center;
}

.fromRight{
	animation: fromright 0.5s;
}

.toRight{
	animation: toright 0.5s;
}
@keyframes fromright{
	from{transform: translateX(100%);}
	to{transform: translateX(0);}
}
@keyframes toright{
	from{transform: translateX(-100%);}
	to{transform: translateX(0);}
}
</style>