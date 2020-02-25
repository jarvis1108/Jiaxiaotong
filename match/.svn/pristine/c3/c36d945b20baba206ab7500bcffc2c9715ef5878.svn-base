<template>
	<div class="st-wrong-topic-container">
		<img class="st-wrong-topic-bg" src="/static/images/bg.png"/>
		<div class="st-wrong-topic-container" v-if="isEmpty">
			<span class="st-alarm a1">暂时还没有错题</span>
			<span class="st-alarm a2">先去答题吧</span>
		</div>
		<div class="st-wrong-topic-container" v-if="!isEmpty">
	    
	
	    <!-- 题号 -->
	    <div class="st-wrong-topic-questionIndex">
	      <img class="st-wrong-topic-questionIndex-bg" src="/static/images/wrongTopic/Hexagon.png" />
	      <span class="st-wrong-topic-questionIndex-span">
	        第
	        <span>{{questionIndex}}</span>
	        题
	        </span>
	    </div>
	
	    <!-- 题目内容 -->
	    <div class="st-wrong-topic-question" :class="contentAni">
	      <span class="st-wrong-topic-questionTitle">
	        {{questionList[questionIndex-1].question}}
	      </span>
	      <ul class="st-wrong-topic-choiceList">
	        <li :class="item.style" v-for="item in choiceList" :key="item.questionIndex">
	          {{item.label}}.{{item.content}}
	          <img class="st-wrong-topic-errorIcon" v-if="item.isRight === -1" src="/static/images/wrongTopic/Errorlabel.png"/>
	          <img class="st-wrong-topic-correctIcon" v-if="item.isRight === 1" src="/static/images/wrongTopic/Correctlabel.png"/>
	        </li>
	      </ul>
	    </div>
	
	    <!-- 上、下一题按钮 -->
	    <div class="st-wrong-topic-arrow">
	      <img v-if="questionIndex > 1" @click="lastQuestion" class="st-wrong-topic-arrow-left" src="/static/images/wrongTopic/Leftarrow_icon.png">
	      <img v-if="questionIndex < questionList.length" @click="nextQuestion" class="st-wrong-topic-arrow-right" src="/static/images/wrongTopic/Rightarrow_icon.png">    
	    </div>
	
	    <!-- 按钮选项 -->
	    <div class="st-wrong-topic-iconList">
	      <div class="st-wrong-topic-iconList-collect" @click="on_collect">
	        <img class="st-wrong-topic-icon" src="/static/images/wrongTopic/Collection-icon.png"/>
	        <span class="st-wrong-topic-text12">收藏</span>
	      </div>
	      <div class="st-wrong-topic-iconList-correct" @click="on_correct">
	        <img class="st-wrong-topic-icon" src="/static/images/wrongTopic/Errorcorrection-icon.png"/>
	        <span class="st-wrong-topic-text12">纠错</span>
	      </div>
	      <div>
	        <button class="st-wrong-topic-iconList-share" open-type="share">
	          <div>
	            <img class="st-wrong-topic-icon" src="/static/images/wrongTopic/Share-icon.png"/>
	            <span class="st-wrong-topic-text12" style="top: 50%">分享</span>
	          </div>
	        </button>
	      </div>
	    </div>
	
	    <!-- 解析 -->
	    <img class="st-wrong-topic-halo" src="/static/images/wrongTopic/Halo.png"/>
	    <div class="st-wrong-topic-details" :class="contentAni">
	      <div class="st-wrong-topic-analysis">
	        <span>解析:{{questionList[questionIndex-1].questionAnalyze}}</span></div>
	      <div class="st-wrong-topic-source"><span>出处：{{questionList[questionIndex-1].reference}}</span></div>
	      <div class="st-wrong-topic-knowledge"><span>考点:{{questionList[questionIndex-1].content}}</span></div>
	    </div>
	  </div>
	</div>
  
</template>

<script>
import wxs from "../../utils/wx";
export default {
  data() {
    return {
      questionIndex: 1, //题号
      questionList: [
        {
          questionIndex: 0,
          questionCode: "", //题干
          answer: "",
          userAnswer: "",
          choiceA: "",
          choiceB: "",
          choiceC: "",
          choiceD: "",
          questionAnalyze: "",
          reference: "",
          content: ""
        }
      ], //问题列表
      choiceList: [
        { label: "A", content: "" },
        { label: "B" },
        { label: "C" },
        { label: "D" }
      ], //因为接口中没有choiceList，所以增加一个变量
      userAnswer: "", //当前题目用户的选择
      rightAnswer: "", //正确选项
      contentAni: "", //题目卡片动画效果
      isEmpty: true
    };
  },
  async onLoad() {
    this.questionIndex = 1;
    this.questionList = await this.$store.dispatch("getQuestionList", {
      count: 10,
      page: 1
    });
    if (this.questionList.length != 0) {
      this.isEmpty = false;
    }
    this.userAnswer = this.questionList[this.questionIndex - 1].userAnswer;
    this.rightAnswer = this.questionList[this.questionIndex - 1].answer;
    this.getChoiceList();
    this.setChoiceStyle();
    console.log(this.questionList);
  },
  methods: {
    getChoiceList() {
      this.choiceList[0].content = this.questionList[
        this.questionIndex - 1
      ].choiceA;
      this.choiceList[1].content = this.questionList[
        this.questionIndex - 1
      ].choiceB;
      this.choiceList[2].content = this.questionList[
        this.questionIndex - 1
      ].choiceC;
      this.choiceList[3].content = this.questionList[
        this.questionIndex - 1
      ].choiceD;
    },
    setChoiceStyle() {
      console.log("changeStyle");
      this.choiceList.forEach(item => {
        if (
          item.label === this.userAnswer &&
          this.userAnswer !== this.rightAnswer
        ) {
          item.isRight = -1;
          item.style = "fault";
        } else if (item.label === this.rightAnswer) {
          item.isRight = 1;
          item.style = "correct";
        } else {
          item.isRight = 0;
          item.style = "primary";
        }
      });
    },
    nextQuestion() {
      this.questionIndex += 1;
      this.contentAni = "rotate";
      setTimeout(() => {
        this.userAnswer = this.questionList[this.questionIndex - 1].userAnswer;
        this.rightAnswer = this.questionList[this.questionIndex - 1].answer;
        this.getChoiceList();
        this.setChoiceStyle();
      }, 500);
      setTimeout(() => {
        this.contentAni = "";
      }, 1000);
    },
    lastQuestion() {
      this.questionIndex -= 1;
      this.contentAni = "rotate";
      setTimeout(() => {
        this.userAnswer = this.questionList[this.questionIndex - 1].userAnswer;
        this.rightAnswer = this.questionList[this.questionIndex - 1].answer;
        this.getChoiceList();
        this.setChoiceStyle();
      }, 1000);
      setTimeout(() => {
        this.contentAni = "";
      }, 1000);
    },
    async on_collect() {
      var isSuccess = await this.$store.dispatch(
        "collectQuestion",
        this.questionList[this.questionIndex - 1].questionId
      );
      if (isSuccess != null) {
        console.log(isSuccess);
        wxs.showSuccess("收藏成功");
      }
    }
  }
};
</script>

<style scoped>
.st-wrong-topic-bg {
  position: fixed;
  width: 100%;
  height: 100%;
}
.st-wrong-topic-questionIndex {
  position: absolute;
  top: 2%;
  width: 54px;
  height: 56px;
  left: 45%;
}
.st-wrong-topic-questionIndex-bg {
  position: absolute;
  width: 100%;
  height: 100%;
}
.st-wrong-topic-questionIndex-span {
  position: absolute;
  font-size: 12px;
  color: #fff;
  width: 100%;
  text-align: center;
  height: 40%;
  top: 30%;
}
.st-wrong-topic-questionIndex-span span {
  font-size: 17px;
}
.st-wrong-topic-question {
  position: absolute;
  top: 15%;
  left: 10%;
  width: 80%;
  height: 60%;
  overflow: hidden;
}
.st-wrong-topic-questionTitle {
  position: relative;
  width: 100%;
  height: 10%;
  font-size: 15px;
  color: #fff;
  font-weight: bold;
  line-height: 12.5px;
  overflow: auto;
}
.st-wrong-topic-choiceList {
  position: relative;
  margin-top: 10%;
  height: 70%;
  width: 100%;
}
.st-wrong-topic-choiceList li {
  position: relative;
  margin-bottom: 8%;
  height: 11%;
  width: 90%;
  left: 5%;
  border: 2px solid #fff;
  border-radius: 10px;
  color: #fff;
  font-size: 15px;
  text-align: center;
  font-weight: bold;
  padding-top: 4%;
}
.primary {
  background: rgb(106, 140, 216);
}
.fault {
  background: rgb(255, 112, 99);
}
.correct {
  background: rgb(59, 202, 255);
}
.st-wrong-topic-iconList {
  position: absolute;
  top: 75%;
  height: 6%;
  width: 70%;
  left: 15%;
}
.st-wrong-topic-iconList-collect,
.st-wrong-topic-iconList-share,
.st-wrong-topic-iconList-correct {
  position: relative;
  float: left;
  width: 33.3%;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}
.st-wrong-topic-iconList-share,
.st-wrong-topic-iconList-share,
::after {
  border: none;
  background: transparent;
  overflow: auto;
  padding: 0;
  margin-top: -2%;
  height: 120%;
}
.st-wrong-topic-icon {
  width: 25px;
  height: 25px;
}
.st-wrong-topic-text12 {
  font-size: 12px;
  color: white;
  position: absolute;
  top: 100%;
  left: 36%;
}
.st-wrong-topic-halo {
  position: absolute;
  height: 0.5%;
  top: 84%;
  width: 70%;
  left: 15%;
}
.st-wrong-topic-details {
  position: absolute;
  text-align: center;
  top: 85%;
  width: 70%;
  left: 15%;
  height: 10%;
  font-size: 12px;
  color: white;
}
.st-wrong-topic-analysis,
.st-wrong-topic-source,
.st-wrong-topic-knowledge {
  position: relative;
  margin-top: 2%;
  width: 100%;
}
.st-wrong-topic-correctIcon {
  width: 19px;
  height: 19px;
  position: absolute;
  right: 10%;
  top: 25%;
}

.st-wrong-topic-errorIcon {
  width: 15px;
  height: 15px;
  position: absolute;
  right: 10%;
  top: 30%;
}
.st-wrong-topic-arrow {
  position: absolute;
  top: 42%;
  width: 98%;
  left: 1%;
  height: 6%;
}
.st-wrong-topic-arrow-left {
  position: absolute;
  height: 100%;
  width: 7%;
  left: 0;
}
.st-wrong-topic-arrow-right {
  position: absolute;
  height: 100%;
  width: 7%;
  right: 0;
}

.st-alarm {
  position: absolute;
  text-align: center;
  color: #ffffff;
  width: 100%;
}

.a1 {
  top: 40%;
  left: 0;
  font-size: 60rpx;
}

.a2 {
  top: 47%;
  left: 0;
  font-size: 30rpx;
}

.rotate {
  animation: rotate 1s;
}
</style>
