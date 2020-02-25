<template>
	<div class="box">
		<div class="recharge">
			<span>{{ name }}</span>
		</div>
		<div class="price">
			<a :href=" url + '?name=' + name + '&price=' + price " >{{ price }}</a>
		</div>
	</div>
</template>

<script>
	export default{
		props:['name','price'],
		data(){
			return{
				url:'/pages/recharge_con/main'
			}
		}
	}
</script>

<style scoped>
.box{
	height: 157px;
	width: 90px;
	top: 0px;
	left: 0px;
	position: absolute;
}


.recharge{
	width: 90px;
	height: 120px;
	top: 0px;
	left: 0px;
	position: absolute;
	background-color: #CCCCCC;
	color: #FFFFFF;
}

.price{
	width: 90px;
	height: 27px;
	top: 130px;
	left: 0px;
	position: absolute;
	background-color: #CCCCCC;
	color: #FFFFFF;
}

</style>