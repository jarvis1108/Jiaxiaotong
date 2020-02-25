<template>
 <!-- 设置界面 -->
 <div class="authenticateDialog">
    <div class="dialog-mask"></div>
    <img @click="closeDialog" class="st-authenticate-dialog-close-icon" src="/static/images/personalCenter/close_icon.png"/>
    <div class="st-authenticate-dialog-vertical-line"></div>

    <img class="st-authenticate-dialog-bg" src="/static/images/personalCenter/Setup_bg.png"/>
    <img class="st-authenticate-dialog-icon" src="/static/images/personalCenter/Mobilephoneauthentication_icon.png"/>
    <span class="st-authenticate-dialog-setup-text">手机认证</span>

    <div class="st-authenticate-dialog-telNum-div">
      <span class="st-authenticate-dialog-telNum-text">手机号</span>
     <div class="st-authenticate-dialog-telNum-input-div">
      <input type="text" class="st-authenticate-dialog-telNum-input" v-model="telNum"/>
     </div>
    </div>

    <div class="st-authenticate-dialog-code-div">
     <span class="st-authenticate-dialog-code-text">验证码</span>
     <div class="st-authenticate-dialog-code-input-div">
      <input type="text" class="st-authenticate-dialog-code-input" v-model="authenticateCode"/>
      <img class="st-authenticate-dialog-code-img" src="/static/images/personalCenter/Getverificationcode_bg.png" />
      <span @click="getCode" v-if="interval === null" class="st-authenticate-dialog-code-span">获取验证码</span>
      <span v-else class="st-authenticate-dialog-cutdown-span">{{cutDown}}s</span>
     </div>
    </div>

    <img @click="submitAuthenticate" class="st-authenticate-dialog-submit-icon" src="/static/images/personalCenter/Submit_icon.png" />
 </div>
</template>

<script>
export default {
  data() {
    return {
      telNum:'',  //手机号
      authenticateCode:'' , //验证码
      interval:null,  //倒计时
      cutDown:60, //倒计时时间
    };
  },
  methods: {
    //关闭设置窗口
    closeDialog() {
      //告知父组件关闭当前设置弹窗
      this.$emit("listenCloseDialog");
    },
    //获取验证码
    getCode(){
      this.interval = setInterval(()=>{
        if(this.cutDown > 0){
          this.cutDown -= 1;
        }else{
          this.interval = null;
        }
      },1000);
    },
    //提交验证嘛
    submitAuthenticate(){
      this.$emit("listenAuthenticateSuccess");
    }
  }
};
</script>

<style scoped>
.st-authenticate-dialog-bg {
  position: absolute;
  height: 50%;
  width: 70%;
  top: 30%;
  left: 15%;
}
.st-authenticate-dialog-close-icon {
  position: absolute;
  top: 24%;
  right: 20%;
  width: 6%;
  height: 3.5%;
}
.st-authenticate-dialog-vertical-line {
  position: absolute;
  top: 27.5%;
  right: 23%;
  height: 5%;
  width: 1px;
  border-right: 1px solid #fff;
}
.dialog-mask {
  position: fixed;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  background: #000;
  opacity: 0.5;
  overflow: hidden;
  z-index: 0;
}
.st-authenticate-dialog-icon {
  position: absolute;
  top: 33%;
  left: 42%;
  height: 9%;
  width: 15%;
}
.st-authenticate-dialog-setup-text {
  position: absolute;
  top: 43%;
  left: 40%;
  font-size: 18px;
  color: white;
}
.st-authenticate-dialog-telNum-div {
  position: absolute;
  top: 52%;
  left: 20%;
  width: 60%;
  display: flex;
}
.st-authenticate-dialog-code-div {
  position: absolute;
  top: 61%;
  left: 20%;
  width: 60%;
  display: flex;
}
.st-authenticate-dialog-telNum-text,
.st-authenticate-dialog-code-text {
  position: absolute;
  left: 5%;
  width: 25%;
  top: 2%;
  font-size: 18px;
  font-weight: bold;
  color: rgb(95, 55, 219);
}
.st-authenticate-dialog-telNum-input-div,
.st-authenticate-dialog-code-input-div {
  position: absolute;
  left: 33%;
  width: 65%;
  border-radius:17px;  
  height: 34px;
  background: rgb(95, 55, 219);
  border: 1px solid rgb(95, 55, 219);
}
.st-authenticate-dialog-telNum-input {
  position: absolute;
  width: 100%;
  top: 5%;
  color: white;
  font-size: 18px;
  text-align: center;
}
.st-authenticate-dialog-code-input{
  position: absolute;
  display: block;
  width: 60%;
  top: 5%;
  left: 10%;
  color: white;
  font-size: 18px;
}
.st-authenticate-dialog-code-img{
  position: absolute;
  width: 50%;
  right: 0;
  height: 100%;
}
.st-authenticate-dialog-submit-icon{
  position: absolute;
  top: 71%;
  height: 5.5%;
  width: 24%;
  left: 38%; 
}
.st-authenticate-dialog-code-span{
  position: absolute;
  width: 50%;
  right: 0;
  height: 50%;
  top: 25%;
  color: rgb(95, 55, 219);
  font-size: 12px;
  text-align: center;
}
.st-authenticate-dialog-cutdown-span{
  position: absolute;
  width: 50%;
  right: 0;
  height: 60%;
  top: 20%;
  color: rgb(95, 55, 219);
  font-size: 16px;
  text-align: center;
  animation: zoomOut .5s;
}
</style>
