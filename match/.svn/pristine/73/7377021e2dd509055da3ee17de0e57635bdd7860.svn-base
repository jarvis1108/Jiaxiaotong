<template>
	<div id="usr_information" >
		<img class="bg" src="../../static/img/Personalinformation-bg.png">
		<img class="bg" id="usr_pho" v-if="userInfo.avatarUrl" :src="userInfo.avatarUrl" background-size="cover" />
		<span class="text" id="usr_name">st.Ku</span>
		<div class="text" id="usr_level">{{ level }}级</div>
		<img class="bg" id="level-img1" src="../../dist/static/img/Experiencebarframe@2x.png">
		<img class="bg" id="level-img2" v-bind:style="{ width: myWidth + 'px' }" src="../../dist/static/img/Ruleofthumb@2x.png">
		<div id="mney_img">
			<img class="bg" src="../../dist/static/img/Goldcoin@2x.png">
		</div>
		<span id="usr_m_num" class="text">{{ money }}</span>
		<span id="GPA" class="text">绩点 {{ gpa }}</span>
		<span id="XPA" class="text">学点 {{ xpa }}</span>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				level: 5,
		        money: 2025,
		        gpa: 100,
		        xpa: 100,
		        userInfo: {},
		        myWidth: 75
			}
		},
		created(){
		   	wx.login({
		      	success: () => {
		        	wx.getUserInfo({
		          	success: (res) => {
		            	this.userInfo = res.userInfo
		         	}
		        	})
		      	}
		    })
		}
	}
</script>

<style scoped>
.bg{
	height: 100%;
	width: 100%;
	position: absolute;
}
.text{
	color: white;
	font-family: "PingFang-SC-Medium";
	text-align: center;
}
#usr_information{
	top: 20rpx;
	width: 678rpx;
	height: 240rpx;
	position: relative;
	border-radius: 20rpx;
	margin: auto;
}
#usr_pho{
	width: 104rpx;
	height: 104rpx;
	left: 36rpx;
	top: 48rpx;
	position: absolute;
	border-radius: 50%;
	border:6rpx solid;
	border-color: #FFFFFF;
}
#usr_name{
	left: 160rpx;
	top: 86rpx;
	position: absolute;
	font-size: 36rpx;
	
}

#usr_level{
	left: 36rpx;
	bottom: 20rpx;
	position:absolute;
	font-size: 24rpx;
}

#level-img1{
	bottom: 20rpx;
	height: 24rpx;
	width: 200rpx;
	left: 96rpx;
	position: absolute;
}

#level-img2{
	bottom: 20rpx;
	height: 24rpx;
	left: 96rpx;

	position: absolute;
}

#mney_img{
	width: 30rpx;
	height: 30rpx;
	top: 86rpx;
	right: 140rpx;
	position: absolute;
}
#usr_m_num{

	top: 86rpx;
	right: 48rpx;
	font-size: 28rpx;
	position: absolute;
}

#GPA{
	bottom: 20rpx;
	right: 180rpx;;
	position:absolute;
	font-size: 28rpx;
}

#XPA{
	bottom: 20rpx;
	right: 48rpx;
	position:absolute;
	font-size: 28rpx;
}
</style>