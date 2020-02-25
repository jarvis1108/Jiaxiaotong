<template>
	<ul>
		<li v-for="item in list" :key="item.time">
			<div class="name">
				{{ item.name }}
			</div>
			<div class="price">
				{{ item.price }}
			</div>
			<div class="time">
				{{ item.time }}
			</div>
			<div class="state">
				{{ item.state }}
			</div>
		</li>
	</ul>
</template>

<script>
export default{
	data(){
		return{
			list:[
				{
					name:"兑换100学点",
					price:"1000金币",
					time:"2018.08.06",
					state:""
				},
				{
					name:"乐高积木",
					price:"1000000金币",
					time:"2018.08.07",
					state:"待发货"
				}]
		}
	}
}
</script>

<style>
li{
	height: 150rpx;	
	width: 600rpx;
	left: 75rpx;
	background: burlywood;
	margin-top: 30rpx;
	margin-bottom: 30rpx;
	position: relative;
}

.price{
	top: 0;
	right: 0;
	position: absolute;
}
.time{
	bottom: 0;
	left: 0;
	position: absolute;
}
.state{
	bottom: 0;
	right: 0;
	position: absolute;
}
</style>