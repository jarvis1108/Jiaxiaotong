<template>
 <!-- 设置界面 -->
 <div class="settingDialog">
    <div class="dialog-mask"></div>
    <img @click="closeDialog" class="st-setting-dialog-close-icon" src="/static/images/settingDialog/close_icon.png"/>
    <div class="st-setting-dialog-vertical-line"></div>

    <img class="st-setting-dialog-bg" src="/static/images/settingDialog/Setup_bg.png"/>
    <img class="st-setting-dialog-icon" src="/static/images/settingDialog/Setup_icon.png"/>
    <span class="st-setting-dialog-setup-text">设置</span>

    <div class="st-setting-dialog-sound-effect-div">
      <span class="st-setting-dialog-sound-effect-text">音效</span>
      <switch :checked="soundEffect" @change="soundEffect = !soundEffect" color="#5F37DB" class="st-setting-dialog-sound-effect-switch"></switch>
    </div>

    <div class="st-setting-dialog-music-div">
     <span class="st-setting-dialog-music-text">音乐</span>
     <switch :checked="music" @change="music = !music" color="#5F37DB" class="st-setting-dialog-music-switch"></switch>
    </div>
 </div>
</template>

<script>
export default {
  data() {
    return {
      soundEffect: this.$store.state.soundEffect, //音效
      music: this.$store.state.music //音乐
    };
  },
  watch: {
     soundEffect() {
      console.log("音效：" + (this.soundEffect?"开":"关"));
      if(this.soundEffect){
        this.$store.dispatch('startInnerAudioContext');
      }else{
        this.$store.dispatch('stopInnerAudioContext');
      }
      this.$store.state.soundEffect = this.soundEffect;
    },
    music() {
      console.log("音乐：" + (this.music?"开":"关"));
      if(this.music){
        this.$store.dispatch('startBackgroundMusic','http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46');
      }else{
        //this.$store.dispatch('startBackgroundMusic','https://www.xiami.com/play?ids=/song/playlist/id/1804559177/object_name/default/object_id/0#loaded');
        this.$store.dispatch('pauseBackgroundMusic');
      }
      this.$store.state.music = this.music;
      
    }
  },
  methods: {
    //关闭设置窗口
    closeDialog() {
      console.log('关闭按钮以点击');
      //告知父组件关闭当前设置弹窗
      this.$emit("listenCloseDialog");
    }
  }
};
</script>

<style scoped>
.st-setting-dialog-bg {
  position: absolute;
  height: 50%;
  width: 70%;
  top: 30%;
  left: 15%;
  animation: zoomOut 1s;
}
.st-setting-dialog-close-icon {
  position: absolute;
  top: 24%;
  right: 20%;
  width: 6%;
  height: 3.5%;
  animation: zoomOutDelay 1s;
}
.st-setting-dialog-vertical-line {
  position: absolute;
  top: 27.5%;
  right: 23%;
  height: 5%;
  width: 1px;
  border-right: 1px solid #fff;
  animation: zoomOutDelay 1s;
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
.st-setting-dialog-icon {
  position: absolute;
  top: 33%;
  left: 42%;
  height: 9%;
  width: 16%;
  animation: zoomOutDelay 1s;

}
.st-setting-dialog-setup-text {
  position: absolute;
  top: 43%;
  left: 45%;
  font-size: 18px;
  color: white;
  animation: zoomOutDelay 1s;
}
.st-setting-dialog-sound-effect-div {
  position: absolute;
  top: 55%;
  left: 20%;
  width: 60%;
  display: flex;
  animation: zoomOutDelay 1s;
  
}
.st-setting-dialog-music-div {
  position: absolute;
  top: 65%;
  left: 20%;
  width: 60%;
  display: flex;
  animation: zoomOutDelay 1s;

}
.st-setting-dialog-sound-effect-text,
.st-setting-dialog-music-text {
  position: absolute;
  left: 20%;
  width: 25%;
  top: 2%;
  font-size: 18px;
  font-weight: bold;
  color: rgb(95, 55, 219);
}
.st-setting-dialog-sound-effect-switch,
.st-setting-dialog-music-switch {
  position: absolute;
  left: 45%;
  width: 69px !important;
  height: 34px !important;
}
.st-setting-dialog-sound-effect-switch::before {
  width: 69px !important;
  height: 34px !important;
}
.st-setting-dialog-sound-effect-switch::after {
  width: 69px !important;
  height: 34px !important;
}
</style>
