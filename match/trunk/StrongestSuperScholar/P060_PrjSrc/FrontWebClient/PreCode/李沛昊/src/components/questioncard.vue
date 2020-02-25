<template>
	<div class="bs-container-questioncard-div">
		<!--
        	时间：2018-07-20
        	描述：目前只封装了录音题部分
        -->

		<img class="bs-bg-img" src="../../static/img/subject-bg.png" :class="backAnimation">
		<img class="bs-divider-img" src="../../static/img/line.png" :class="backAnimation">
		
		
		<div class="bs-Question-div " v-show="typeChoose" :class="animation" >
			<div class="bs-text2 bs-title-div">
				{{ question.title }}{{ question.type }}
			</div>
			<div class="bs-content-div">
				<div class="bs-option-div" @click="change('A')">
					<img class="bs-bg-img" src="../../static/img/Optionbox@3x.png">
					<img class="bs-bg-img" src="../../static/img/Erroroption-bg@3x.png" v-show="isChooseA">
					<img id="bs-error-icon" src="../../static/img/Errorlabel@2x.png"  v-show="isChooseA"/>
					<img class="bs-bg-img" src="../../static/img/Checktheoptionbox.png" v-show="isTrueA">
					<img id="bs-true-icon" src="../../static/img/Correctlabel@2x.png" v-show="isTrueA"/>
					
					<span></span>
				</div>
				<div class="bs-option-div" @click="change('B')">
					<img class="bs-bg-img" src="../../static/img/Optionbox@3x.png">
					<img class="bs-bg-img" src="../../static/img/Erroroption-bg@3x.png" v-show="isChooseB">
					<img id="bs-error-icon" src="../../static/img/Errorlabel@2x.png"  v-show="isChooseB"/>
					<img class="bs-bg-img" src="../../static/img/Checktheoptionbox.png" v-show="isTrueB">
					<img id="bs-true-icon" src="../../static/img/Correctlabel@2x.png" v-show="isTrueB"/>

					<span></span>
				</div>
				<div class="bs-option-div" @click="change('C')">
					<img class="bs-bg-img" src="../../static/img/Optionbox@3x.png">
					<img class="bs-bg-img" src="../../static/img/Erroroption-bg@3x.png" v-show="isChooseC">
					<img id="bs-error-icon" src="../../static/img/Errorlabel@2x.png"  v-show="isChooseC"/>
					<img class="bs-bg-img" src="../../static/img/Checktheoptionbox.png" v-show="isTrueC">
					<img id="bs-true-icon" src="../../static/img/Correctlabel@2x.png" v-show="isTrueC"/>
					<span></span>
				</div>
				<div class="bs-option-div" @click="change('D')">
					<img class="bs-bg-img" src="../../static/img/Optionbox@3x.png">
					<img class="bs-bg-img" src="../../static/img/Erroroption-bg@3x.png" v-show="isChooseD">
					<img id="bs-error-icon" src="../../static/img/Errorlabel@2x.png"  v-show="isChooseD"/>
					<img class="bs-bg-img" src="../../static/img/Checktheoptionbox.png" v-show="isTrueD">
					<img id="bs-true-icon" src="../../static/img/Correctlabel@2x.png" v-show="isTrueD"/>
					

					<span></span>
				</div>
			</div>
		</div>
		
		
		
		<div class="bs-Question-div " v-show="typeRecord" :class="animation" >
			<div class="bs-text2 bs-title-div">
				{{ question.title }}{{ question.type }}
			</div>
			<div class="bs-text2 bs-content-div">
				{{ question.content }}
			</div>
			<img class="bs-recordButton-img" @click="startRecord" v-show="!recording" src="../../static/img/Startrecording.png">
			<img class="bs-recordButton-img" @click="endRecord" v-show="recording" src="../../static/img/suspend.png">
		</div>
		
	</div>
</template>

<script>
	export default{
		props:['question','order'],//question是一个对象，里面有题目类型type，题目title，和题干content，正确选项等rightAnswer;order变化时触发组件渲染和刷新
		data(){
			return{
				//控制录音组件的变化
//				typeRecord:false,
//				typeChoose:false,
				tempRecordFilePath:'',//录音文件临时存放地址
				recording:false,
				


				chooseWhich:'',//储存选择的题号
				allowClick:true,//当用户做出选择后，所有按钮不可按
				
				animation:'',//div的class，用于控制动画
				backAnimation:''
			}
		},
		watch:{
			order:function(){
				this.animation = 'bs-rotation-animation';
				this.backAnimation = 'bs-backRotation-animation';
				this.chooseWhich ='';
				this.allowClick = true;
				setTimeout(()=>{
					this.animation ='';
					this.backAnimation = '';
				},2000)
			}
//			'question.type':function(){
//				console.log("change");
//				this.judgeType();
////			},
//			'question.rightAnswer':function(val){
//				this.RightAnswer = val;
//			}
		},
		computed:{
			
//				控制用户点击选择题后的变化
			RightAnswer:function(){
				return this.question.rightAnswer;
			},
			isChooseA:function(){
				if(this.chooseWhich == 'A' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isTrueA:function(){
				if(this.RightAnswer == 'A' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isChooseB:function(){
				if(this.chooseWhich == 'B' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isTrueB:function(){
				if(this.RightAnswer == 'B' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isChooseC:function(){
				if(this.chooseWhich == 'C' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isTrueC:function(){
				if(this.RightAnswer == 'C' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isChooseD:function(){
				if(this.chooseWhich == 'D' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			isTrueD:function(){
				if(this.RightAnswer == 'D' && !this.allowClick)
				{
					return true;
				}else{
					return false;
				}
			},
			
			
			typeChoose:function(){
				if(this.question.type == 1)
				{
					return true;
				}
				else{
					return false;
				}
			},
			typeRecord:function(){
				if(this.question.type == 2)
				{
					return true;
				}
				else{
					return false;
				}
			}

		},
		methods:{
			
			//录音接口
			startRecord(){
				this.recording = true;
				wx.startRecord({
				  success:(res)=>{
				    this.tempRecordFilePath = res.tempFilePath;
				  },
				  fail:(res)=>{
				     //录音失败
				     console.log("faith");
				  }
				})
			},
			endRecord(){
				this.recording = false;
				wx.stopRecord();
			},
//			judgeType(){
//				switch(this.question.type){
//					case 1:
//					this.typeChoose = true;
//					this.typeRecord = false;
//					break;
//					case 2:
//					this.typeRecord = true;
//					this.typeChoose = false;
//					break;
//				}
//			},
			change(option){
				if(!this.allowClick)
				{
					return;
				}
				this.allowClick = false;
				this.chooseWhich = option;
				switch(this.RightAnswer){
						case 'A':
						this.isTrueA = true;
						break;
						case 'B':
						this.isTrueB = true;
						break;
						case 'C':
						this.isTrueC = true;
						break;
						case 'D':
						this.isTrueD = true;
						break;
				}
				switch(option){
				case 'A':
					this.isChooseA = true;
					break;
				case 'B':
					this.isChooseB = true;
					break;
				case 'C':
					this.isChooseC = true;
					break;
				case 'D':
					this.isChooseD = true;
					break;
				}
			}
		},
		mounted(){
			//判断题目类型
//			this.judgeType();
		}
	}
</script>

<style>
	
.bs-bg-img{
	width: 100%;
	height: 100%;
	position: absolute;
}

.bs-text1{
	text-align: center;
	font-family: "PingFang-SC-Medium";
	color: #ffffff;
}

.bs-text2{
	text-align: left;
	font-family: "PingFang-SC-Bold";
}

.bs-container-questioncard-div{
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	position: absolute;
}

.bs-Question-div{
	top: 0;
	left: 0;
	height: 100%;
	width: 100%;
	position: absolute;
}
.bs-divider-img{
	top: 220rpx;
	width: 574rpx;
	height: 2rpx;
	left: 34rpx;
	position: absolute;
}


.bs-title-div{
	top: 116rpx;
	width: 568rpx;
	left: 36rpx;
	height: 36rpx;
	font-size: 36rpx;
	color: #495567;
	position: absolute;
}

.bs-content-div{
	width: 568rpx;
	top: 260rpx;
	left: 36rpx;
	position: absolute;
	height: auto;
	font-size: 30rpx;
	color: #495567;
}

.bs-recordButton-img{
	height: 80rpx;
	width: 80rpx;
	bottom: 80rpx;
	left: 280rpx;
	position: absolute;
	border-radius: 50%;
	background-color: #F6F6F6;
}

.bs-option-div{
	margin-bottom: 44rpx;
	height: 93.5rpx;
	width: 100%;
	position: relative;
}

#bs-error-icon{
	right: 54rpx;
	top: 32rpx;
	height: 30rpx;
	width: 30rpx;
	position: absolute;
}

#bs-true-icon{
	right: 52rpx;
	top: 28rpx;
	height: 38rpx;
	width: 38rpx;
	position: absolute;
}

.bs-rotation-animation{
	animation: rotation 2s linear infinite; 
}

.bs-backRotation-animation{
	animation:Rotation 2s linear infinite;	
}

@keyframes rotation{
	0% {transform: rotateY(0);opacity: 1;}
	12.5% {transform: rotateY(90deg);opacity: 0;}
	25% 75%{transform: rotateY(180deg);opacity: 0;}
	87.5% {transform: rotateY(270deg);opacity: 0;}
	100% {transform: rotateY(360deg);opacity: 1;}
}

@keyframes Rotation{
	0% {transform: rotateY(0);opacity: 1;}
	12.5% {transform: rotateY(90deg);opacity: 1;}
	25% 75%{transform: rotateY(180deg);opacity: 1;}
	87.5% {transform: rotateY(270deg);opacity: 1;}
	100% {transform: rotateY(360deg);opacity: 1;}
}
</style>-->