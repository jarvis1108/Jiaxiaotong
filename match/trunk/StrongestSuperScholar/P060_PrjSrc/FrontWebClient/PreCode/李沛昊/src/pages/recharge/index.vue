<template>
	<div id="base" :class="animation">
		<img class="bg" src="../../../dist/static/img/bg.png">
		<div class="b1"><goods  name="学点月卡" price="10元/月"></goods></div>
		<div id="memory">
			<a href="../rechargeLog/main">充值记录</a>
		</div>
	</div>
</template>

<script>
	import goods from './goods'
	export default{
		components:{
			goods	
		},
		data(){
			return{
				showed:false,
				animation:''
			}
		},
		onLoad(){
			this.animation='';
			this.showed=true;
			console.log(this.animation);
		},
		onShow(){
			if(!this.showed){
				this.animation="fromLeft";
			}
			this.showed=true;
			console.log(this.animation);
		},
		onHide(){
			this.animation="toLeft";
			this.showed=!this.showed;
			console.log(this.animation);
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


.b1{
	top: 180px;
	left: 143px;
	position: absolute;
}


#memory{
	width: 100%;
	text-align: center;
	font-size: 15px;
	color: #FFFFFF;
	margin: auto;
	bottom: 30px;
	position: absolute;
	text-decoration: underline;
}


.fromRight{
	animation: fromright 2s;
}

.fromLeft{
	animation: fromleft 0.3s linear;
}

.toLeft{
	animation:toleft 2s;
}

@keyframes fromleft{
	from{transform: translateX(-100%);}
	to{transform: translateX(0);}
}
@keyframes toleft{
	from{transform: translateX(0);}
	to{transform: translateX(-100%);}
}
</style>