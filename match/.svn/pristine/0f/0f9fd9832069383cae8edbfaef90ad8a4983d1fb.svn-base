<template>
	<div class="base">
		<img class="bg" src="../../../static/img/bg.png">
		<img class="escore_photo" src="../../../dist/static/img/Scorethelabel2.png">
		<img class="pscore_photo" src="../../../static/img/Scorethelabel1.png">
		
		<!--
        	时间：2018-07-18
        	描述：环形动画
       -->		
		<div class="player">
			<img class="score_hoop" src="../../../dist/static/img/Scorecircle@2x.png">
			<div class="topBox">
				<div class="topCircle"  :style="{transform: 'rotate('+pTopRotation+'deg);'}">
				</div>
			</div>
			<div class="bottomBox">
				<div class="bottomCircle" :style="{transform: 'rotate('+pBottomRotation+'deg);'}">
				</div>
			</div>
			<div class="photo">
				<img class="photo_hoop" src="../../../static/img/Pictureframe.png">
				<img class="user_photo" src="../../../static/img/Wechatavatar1.png">
			</div>
		</div>
		<div class="pName text1">{{ playerName }}</div>
		<span class="pScore text2">{{ playerScore }}</span>								
		
		<div class="enemy">
			<img class="score_hoop" src="../../../dist/static/img/Scorecircle@2x.png">
			<div class="topBox">
				<div class="topCircle"  :style="{transform: 'rotate('+eTopRotation+'deg);'}">
				</div>
			</div>
			<div class="bottomBox">
				<div class="bottomCircle" :style="{transform: 'rotate('+eBottomRotation+'deg);'}">
				</div>
			</div>
			<div class="photo">
				<img class="photo_hoop" src="../../../static/img/Pictureframe.png">
				<img class="user_photo" src="../../../dist/static/img/Wechatavatar2.png">
			</div>
		</div>
		<div class="eName text1">{{ enemyName }}</div>		
		<span class="eScore text2">{{ enemyScore }}</span>
		
		<!--
        	时间：2018-07-20
        	描述：题目的卡片
        -->
        <div class="question-card">
       		<questioncard :question="question"></questioncard>
        </div>
		
		
		<!--
        	时间：2018-07-18
        	描述：六角形的变大动画和倒计时动画
       -->
        <div class="cut-down">
			<cutdown :order="order"></cutdown>
		</div>
        
		
		
	</div>
</template>

<script>
	import cutdown from "@/components/cut_down"
	import questioncard from "@/components/questioncard"
//	const recorderManager = wx.getRecorderManager();
	export default {
		components:{
			cutdown,
			questioncard
		},
		data(){
			return{
				playerName:'st.ku',
				playerScore:0,//用于显示的分数
				pRealScore:0,//玩家真实的分数
				
				enemyName:'st.ku',
				enemyScore:360,//用于显示的分数
				eRealScore:360,//对手真实的分数
				
				order:1,
				
				question:{
					type:2,
					title:'题目标题',
					content:'题目内容',
				}
			}
		},
		computed:{
			pBottomRotation:function(){
				if(this.playerScore<250){
					return 45+this.playerScore*360/500;
				}
				else{
					return 226;
				}
			},
			pTopRotation:function(){
				if(this.playerScore<250){
					return 45;
				}
				else{
					return this.playerScore*360/500-135;
				}
			},
			eBottomRotation:function(){
				if(this.enemyScore<250){
					return 45+this.enemyScore*360/500;
				}
				else{
					return 226;
				}
			},
			eTopRotation:function(){
				if(this.enemyScore<250){
					return 45;
				}
				else{
					return this.enemyScore*360/500-135;
				}
			}
		},
		methods:{
			
			//创造分数圆环和显示分数增长的动画
			playerScoreIncrease(value){
				this.playerScore+=value
				var _this = this;
				setTimeout(()=>{
					if(this.pRealScore>this.playerScore)
					{
						_this.playerScoreIncrease(value);
					}
				},50);
			},
			
			getPlayerScore()
			{
				if(this.pRealScore>this.playerScore)
				{
					var value = (this.pRealScore-this.playerScore)/10;
					this.playerScoreIncrease(value);
				}
			},
			
			enemyScoreIncrease(value){
				this.enemyScore+=value
				var _this = this;
				setTimeout(()=>{
					if(this.eRealScore>this.enemyScore)
					{
						_this.enemyScoreIncrease(value);
					}
				},50);
			},
			
			getEnemyScore()
			{
				if(this.eRealScore>this.enemyScore)
				{
					var value = (this.eRealScore-this.enemyScore)/10;
					this.enemyScoreIncrease(value);
				}
			}
		},
		onShow(){
			var _this = this;
			setTimeout(()=>{
				_this.order += 1;
			},12000);
		}
	}
</script>

<style scoped>
.base{
	width: 100%;
	height: 100%;
	position: fixed;
}
.bg{
	width: 100%;
	height: 100%;
	position: absolute;
}

.text1{
	text-align: center;
	font-family: "PingFang-SC-Medium";
	color: #ffffff;
}

.text2{
	text-align: center;
	font-family: "PingFang-SC-Bold";
}
.player{
	height: 164rpx;
	width: 164rpx;
	left: 40rpx;
	top: 36rpx;
	position: absolute;
	border-radius: 50%;
}

.enemy{
	height: 164rpx;
	width: 164rpx;
	right: 40rpx;
	top: 36rpx;
	position: absolute;
	border-radius: 50%;
}

.score_hoop{
	width: 164rpx;
	height: 164rpx;
	left: 0rpx;
	top: 0rpx;
	position: absolute;
}

.photo{
	width: 130rpx;
	height: 130rpx;
	border-radius: 50%;
	left: 17rpx;
	top: 17rpx;
	position: absolute;
	
}

.user_photo{
	height: 120rpx;
	width: 120rpx;
	top: 5rpx;
	left: 5rpx;
	position: absolute;
	border-radius: 50%;
}

.photo_hoop{
	height: 100%;
	width: 100%;
	top: 0;
	left: 0;
	position: absolute;
}

.pName{
	top: 214rpx;
	left: 40rpx;
	width: 164rpx;
	height: 36rpx;	
	font-size: 36rpx;	
	position: absolute;
}

.eName{
	top: 214rpx;
	right: 40rpx;
	width: 164rpx;
	height: 36rpx;	
	font-size: 36rpx;	
	position: absolute;
}
.pscore_photo{
	height: 45rpx;
	width: 214rpx;
	top: 156rpx;
	left: 173rpx;
	position: absolute;
}

.escore_photo{
	height: 38rpx;
	width: 214rpx;
	top: 158rpx;
	right: 173rpx;
	position: absolute;
}
.pScore{
	top: 90rpx;
	left: 236rpx;
	position: absolute;
	font-size: 24px;
	color: #FFFFFF;
}

.eScore{
	top: 90rpx;
	right: 236rpx;
	position: absolute;
	font-size: 24px;
	color: #FFFFFF;
}



.question-card{
	width: 640rpx;
	height: 832rpx;
	top: 288rpx;
	left: 55rpx;
	position: absolute;
}



/*
 * 分数环的效果
 */
.topBox{
	height: 82rpx;
	width: 100%;
	top: 2rpx;
	right: 0;
	position: absolute;
	overflow: hidden;
	margin: 0;
	padding: 0;
}
.topCircle{
	margin: 0;
	padding: 0;
	height: 150rpx;
	width: 150rpx;
	right: 0;
	top: 0;
	position: absolute;
	border-radius: 50%;
	border: 7rpx solid transparent;
	border-top: 7rpx solid #FFFFFF;
	border-left: 7rpx solid #FFFFFF;
}
.bottomBox{
	margin: 0;
	padding: 0;
	height: 82rpx;
	width: 100%;
	bottom: 0;
	right: 0;
	position: absolute;
	overflow: hidden;
}
.bottomCircle{
	margin: 0;
	padding: 0;
	height: 150rpx;
	width: 150rpx;
	right: 0;
	bottom: 0;
	position: absolute;
	border-radius: 50%;
	border: 7rpx solid transparent;	
	border-bottom: 7rpx solid #FFFFFF;
	border-right: 7rpx solid #FFFFFF;
}

.cut-down{
	height: 112rpx;
	width: 108rpx;
	left: 321rpx;
	top: 238rpx;
	position: absolute;
}






</style>