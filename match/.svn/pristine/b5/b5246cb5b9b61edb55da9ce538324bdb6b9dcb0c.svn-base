<template>
  <div class="st-advice-feedback-container">

   <div class="st-advice-feedback-box">
       <textarea class="st-adbvice-feedback-input" :value="value" v-model='content' placeholder-class="place-holder" placeholder="留下您宝贵的意见，让我们做得更好" style="height: 10em" />
   </div>
       <button @click="sureSubmit" class="st-advice-feedback-btn">提交意见</button>  
  </div>
   </template>

<script>
import wxs from "../../utils/wx";

export default {
  data() {
    return {
      content: "" // 用户输入的意见
    };
  },
  async onLoad() {
    content = "";
  },
  methods: {
    async sureSubmit() {
      console.log(this.advice + "advice");
      await this.$store.dispatch("CreateFeedback", {
        userId: this.$store.state.userId,
        content: this.content
      });
      var that = this;
      wx.showModal({
        title: "提交成功",
        content: "非常感谢您的宝贵意见,我们将尽快处理",
        showCancel: false,
        success: function(res) {
          if (res.confirm) {
            console.log("用户点击确定");
            that.content = "";
          }
        }
      });
    }
  }
};
</script>

<style>
.st-advice-feedback-container {
  position: fixed;
  width: 100%;
  height: 100%;
  background: rgb(207, 235, 255);
}
.st-advice-feedback-box {
  position: absolute;
  top: 5%;
  left: 5%;
  width: 90%;
  height: 35%;
  border-radius: 25px;
  background: rgb(255, 255, 255);
}
.st-adbvice-feedback-input {
  position: absolute;
  top: 5%;
  left: 5%;
  width: 90%;
  height: 35%;
}
.place-holder {
  position: absolute;
  left: 10px;
  top: 5%;
  font-size: 16px;
  /* text-align: center; */
  color: rgb(138, 138, 138);
}
.st-advice-feedback-btn {
  position: absolute;
  top: 45%;
  width: 90%;
  left: 5%;
  height: 8%;
  border-radius: 16px;
  color: rgb(255, 255, 255);
  background: rgb(32, 196, 163);
}
</style>
