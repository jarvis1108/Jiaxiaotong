<template>
	<div class="bs-container-groupCompetition-div">
		<img class="bs-bg-img" src="/static/images/bg.png">
		<span v-if="!waitUser" class="bs-text-span">等待群成员完成答题</span>
    
    <!-- 题目卡片 -->
    	<div class="bs-questionCard-component">
            <img class="st-bg" src="/static/images/battle/subject-bg.png" alt="">
            <div class="st-questionTitle-div">
                <span>
                    {{question.question}}
                </span>
            </div>
            <div class="st-questionOption-div" id="choiceList">
              <div v-if="showQuestion" class="choice" v-for="label in choiceLabelList" @click="optionClick(label)" :key="label">
                  <img v-if="userWrong === label || (opponentWrong === label && !waitUser)" class="choice_img" src="/static/images/battle/Erroroption-bg.png"/>
                  <img v-else-if="question.answer === label && !waitUser" class="choice_img" src="/static/images/battle/Checktheoptionbox.png"/>
                  <img v-else class="choice_img" src="/static/images/battle/Optionbox.png"/>                 
                  <span v-if="label === 'A'" class="choice_content">{{question.choiceA}}</span>
                  <span v-if="label === 'B'" class="choice_content">{{question.choiceB}}</span>
                  <span v-if="label === 'C'" class="choice_content">{{question.choiceC}}</span>
                  <span v-if="label === 'D'" class="choice_content">{{question.choiceD}}</span>
                  <img class="errorIcon" v-if="userWrong === label" src="/static/images/battle/Errorlabel.png"/>
                  <img class="correctIcon" v-if="(cd === 0) ||question.answer === label && !waitUser" src="/static/images/battle/Correctlabel.png"/>
              </div>
            </div>
    	</div>
    
	<!-- 六边形动画 -->	
		<div class="bs-cutDown-component">
			<cutDown :order="questionIndex" showOrder="true" @cutdownd="cutdownd" @cutdownout="cutDownOut"></cutDown>
		</div>
		
	</div>
</template>

<script>
import cutDown from "@/components/cut_down";
import questionCard from "@/components/questioncard";
import wxs from "../utils/wx";
export default {
  props: {
    question: {
      type: Object,
      required: true
    },
    questionIndex: {
      required: true
    },
    nextQuestion: {
      type: Function,
      required: true
    },
    waitUser: {
      type: Boolean,
      required: true
    }
  },
  components: {
    cutDown,
    questionCard
  },
  data() {
    return {
      choiceLabelList: ["A", "B", "C", "D"], //选项标签列表
      isClickable: true, //是否可以点击
      interval: null, //定时器
      cd: 10, //倒计时
      userWrong: "", //用户答错的选项
      showQuestion: false //是否显示题目【适应动画时间、保证倒计时开始的那一刻才显示题目】
    };
  },
  watch: {
    //当前进入下一题，重置数据
    questionIndex() {
      this.showQuestion = false;
      this.isClickable = true;
      this.interval = null;
      this.cd = 10;
      this.userWrong = "";
      //倒计时开始时才显示选项
      setTimeout(() => {
        this.showQuestion = true;
      }, 2500);
    }
  },
  methods: {
    //监听倒计时数字，绑定给cd
    cutdownd(data) {
      //有1s延迟
      this.cd = data - 1;
    },
    optionClick(label) {
      if (this.isClickable) {
        this.isClickable = false;
        //若用户答错，修改userWrong值
        if (label != this.question.answer) {
          this.userWrong = label;
        }
        //将用户输入返回
        console.log("用户选择选项：" + label);
        this.$emit("userAnswered", {
          answer: label,
          timeLeft: this.cd
        });
      }
    },
    //时间到
    cutDownOut() {
      this.$emit("userAnswered", {
        answer: "",
        timeLeft: this.cd
      });
    }
  },
  onLoad() {
    this.interval = null;
    this.showQuestion = false;
    //倒计时开始时才显示选项
    setTimeout(() => {
      this.showQuestion = true;
    }, 2500);
  }
};
</script>

<style scoped>
.bs-container-groupCompetition-div {
  width: 100%;
  height: 100%;
  position: fixed;
}

.bs-bg-img {
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  position: absolute;
}

.st-bg {
  height: 100%;
  width: 100%;
  z-index: 100;
}

.st-questionTitle-div {
  position: absolute;
  top: 8%;
  width: 80%;
  height: 20%;
  left: 11%;
  font-size: 12px;
}

.st-questionOption-div {
  position: absolute;
  top: 28%;
  left: 7%;
  width: 85%;
}

.choice_img {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: 0;
}

.choice_content {
  position: absolute;
  width: 90%;
  height: 100%;
  left: 5%;
  top: 20%;
  text-align: center;
  z-index: 1;
}

.choice {
  position: relative;
  width: 100%;
  height: 45px;
  margin-top: 8%;
  font-size: 18px;
  animation: zoomOut 0.5s;
}

.errorIcon {
  width: 15px;
  height: 15px;
  position: absolute;
  left: 10%;
  top: 30%;
  animation: zoomOut 0.5s;
}

.correctIcon {
  width: 19px;
  height: 19px;
  position: absolute;
  left: 10%;
  top: 25%;
  animation: zoomOut 0.5s;
}

.bs-cutDown-component {
  height: 8.89%;
  width: 14.4%;
  top: 18.1%;
  left: 42.8%;
  position: absolute;
}

.bs-questionCard-component {
  width: 85.33%;
  height: 70.79%; /**/
  top: 22%;
  left: 7.33%;
  position: absolute;
}

.bs-text-span {
  text-align: center;
  width: 100%;
  top: 10.79%;
  height: 36rpx;
  left: 0;
  font-size: 36rpx;
  font-family: "PingFang-SC-Bold";
  position: absolute;
  color: #ffffff;
  animation: zoomOut 0.5s;
}
</style>