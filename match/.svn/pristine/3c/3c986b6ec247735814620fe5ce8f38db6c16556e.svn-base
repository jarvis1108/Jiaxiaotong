<template>
	<div class="bs-container-questioncard-div">
		<!--
        	时间：2018-07-20
        	描述：目前只封装了录音题部分
        -->
		<!--
	        答题卡规格    892*640
        -->
		<img class="bs-bg-img" src="/static/images/battle/subject-bg.png" :class="backAnimation">
		<img class="bs-divider-img" src="/static/images/battle/line.png" :class="backAnimation">
		
		
		<div class="bs-Question-div " v-if="questionType && showQuestion" :class="animation" >
			<div class="bs-text2 bs-chooseTitle-div">
				{{ question.title }}{{ question.type }}
			</div>
			<div class="bs-content-div">
				<div v-for="item in labelList" class="bs-option-div" @click="change(item)" :key="item">
					<img class="bs-bg-img" src="/static/images/battle/Optionbox.png">
					<img class="bs-bg-img" src="/static/images/battle/Erroroption-bg.png" :v-show="'isChoose'+item">
					<img id="bs-error-icon" src="/static/images/battle/Errorlabel.png"  :v-show="'isChoose'+item"/>
					<img class="bs-bg-img" src="/static/images/battle/Checktheoptionbox.png" :v-show="'isTrueA'+item">
					<img id="bs-true-icon" src="/static/images/battle/Correctlabel.png" :v-show="'isTrueA'+item"/>
					
					<span></span>
				</div>
			</div>
		</div>
		
		
		<div class="bs-Question-div " v-if="!questionType && showQuestion" :class="animation" >
			<div class="bs-text2 bs-recordTitle-div">
				{{ question.title }}{{ question.type }}
			</div>
			<div class="bs-text2 bs-content-div">
				{{ question.content }}
			</div>
			<img class="bs-recordButton-img" @click="startRecord" v-show="!recording" src="/static/images/battle/Startrecording.png">
			<img class="bs-recordButton-img" @click="endRecord" v-show="recording" src="/static/images/battle/suspend.png">
		</div>
		
	</div>
</template>

<script>
export default {
  props: 
  ["question", //question是一个对象，里面有题目类型type，题目title，和题干content，正确选项等rightAnswer;
  "order",	//order变化时触发组件渲染和刷新
  "showQuestion"	//showQuestion用于控制题目内容显示【true-显示，false-不显示】
  ], 
  data() {
    return {
      //控制录音组件的变化
      tempRecordFilePath: "", //录音文件临时存放地址
      recording: false,
      labelList: ["A", "B", "C", "D"], //选项列表，用于渲染选择按钮
      chooseWhich: "", //储存选择的题号
      allowClick: true, //当用户做出选择后，所有按钮不可按

      animation: "", //div的class，用于控制动画
      backAnimation: ""
    };
  },
  watch: {
    order: function() {
      this.animation = "bs-rotation-animation";
      this.backAnimation = "bs-backRotation-animation";
      this.chooseWhich = "";
      this.allowClick = true;
      setTimeout(() => {
        this.animation = "";
        this.backAnimation = "";
      }, 2000);
    }
    //			'question.type':function(){
    //				console.log("change");
    //				this.judgeType();
    ////			},
    //			'question.rightAnswer':function(val){
    //				this.RightAnswer = val;
    //			}
  },
  computed: {
    //				控制用户点击选择题后的变化
    RightAnswer: function() {
      return this.question.rightAnswer;
    },
    isChooseA: function() {
      if (this.chooseWhich == "A" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isTrueA: function() {
      if (this.RightAnswer == "A" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isChooseB: function() {
      if (this.chooseWhich == "B" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isTrueB: function() {
      if (this.RightAnswer == "B" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isChooseC: function() {
      if (this.chooseWhich == "C" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isTrueC: function() {
      if (this.RightAnswer == "C" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isChooseD: function() {
      if (this.chooseWhich == "D" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    isTrueD: function() {
      if (this.RightAnswer == "D" && !this.allowClick) {
        return true;
      } else {
        return false;
      }
    },
    questionType: function() {
		return this.question.type === 1?true:false;
    },
  },
  methods: {
    //录音接口
    startRecord() {
      this.recording = true;
      wx.startRecord({
        success: res => {
          this.tempRecordFilePath = res.tempFilePath;
        },
        fail: res => {
          //录音失败
          console.log("faith");
        }
      });
    },
    endRecord() {
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
    change(option) {
      if (!this.allowClick) {
        return;
      }
      this.allowClick = false;
      this.chooseWhich = option;
      this.$emit('userChosed',option);
      switch (this.RightAnswer) {
        case "A":
          this.isTrueA = true;
          break;
        case "B":
          this.isTrueB = true;
          break;
        case "C":
          this.isTrueC = true;
          break;
        case "D":
          this.isTrueD = true;
          break;
      }
      switch (option) {
        case "A":
          this.isChooseA = true;
          break;
        case "B":
          this.isChooseB = true;
          break;
        case "C":
          this.isChooseC = true;
          break;
        case "D":
          this.isChooseD = true;
          break;
      }
    }
  },
  mounted() {
    //判断题目类型
    //			this.judgeType();
  }
};
</script>

<style>
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
  text-align: left;
  font-family: "PingFang-SC-Bold";
}

.bs-container-questioncard-div {
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  position: absolute;
}

.bs-Question-div {
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  position: absolute;
}
.bs-divider-img {
  top: 24.66%;
  width: 89.69%;
  height: 2rpx;
  left: 5.31%;
  position: absolute;
}

.bs-recordTitle-div {
  top: 13%;
  width: 82.5%;
  left: 8.75%;
  height: 36rpx;
  font-size: 36rpx;
  text-align: center;
  color: #495567;
  position: absolute;
}

.bs-chooseTitle-div {
  top: 9.64%;
  width: 82.5%;
  left: 8.75%;
  font-size: 24rpx;
  color: #495567;
  position: absolute;
}

.bs-content-div {
  width: 88.75%;
  top: 29.15%;
  left: 5.63%;
  position: absolute;
  height: auto;
  font-size: 30rpx;
  color: #495567;
}

.bs-recordButton-img {
  height: 8.97%;
  width: 12.5%;
  bottom: 8.91%;
  left: 43.75%;
  position: absolute;
  border-radius: 50%;
  background-color: #f6f6f6;
}

.bs-option-div {
  margin-bottom: 44rpx;
  height: 93.5rpx;
  width: 100%;
  position: relative;
  animation: zoomOut .5s;
}

#bs-error-icon {
  right: 9.51%;
  top: 32rpx;
  height: 30rpx;
  width: 30rpx;
  position: absolute;
}

#bs-true-icon {
  right: 9.15%;
  top: 28rpx;
  height: 38rpx;
  width: 38rpx;
  position: absolute;
}

.bs-rotation-animation {
  animation: rotation 2s linear infinite;
}

.bs-backRotation-animation {
  animation: Rotation 2s linear infinite;
}

@keyframes rotation {
  0% {
    transform: rotateY(0);
    opacity: 1;
  }
  12.5% {
    transform: rotateY(90deg);
    opacity: 0;
  }
  25%,
  75% {
    transform: rotateY(180deg);
    opacity: 0;
  }
  87.5% {
    transform: rotateY(270deg);
    opacity: 0;
  }
  100% {
    transform: rotateY(360deg);
    opacity: 1;
  }
}

@keyframes Rotation {
  0% {
    transform: rotateY(0);
    opacity: 1;
  }
  12.5% {
    transform: rotateY(90deg);
    opacity: 1;
  }
  25%,
  75% {
    transform: rotateY(180deg);
    opacity: 1;
  }
  87.5% {
    transform: rotateY(270deg);
    opacity: 1;
  }
  100% {
    transform: rotateY(360deg);
    opacity: 1;
  }
}
</style>-->