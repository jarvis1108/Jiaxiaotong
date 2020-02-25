<template>
  <div id="background">
    <!-- user_info block -->
    <div>
      <img id="bg" src="/static/images/bg.png"/>
      <img id="person_info" src="/static/images/home/Personalinformation-bg.png"/>

      <img @click="to_personalCenter" id="user_icon" :src="userInfo.headImage"/>
      <p>
        <span id="user_name">{{userInfo.wechatName}}</span>
      </p>

      <div class="user_coin">
        <img id="coin_icon" src="/static/images/home/Goldcoin.png"/>
        <span class="text_28">&nbsp;&nbsp;{{userInfo.coin}}</span>
      </div>

      <p>
        <span id="grade" style="left: 7.5%">{{userInfo.externalLevel}}级</span>
      </p>

      <div class="st-personal-center-level-outer">
        <div :style="'width:'+progress+'%'" class="st-personal-center-level-inner"></div>
      </div>

      <p>
        <span class="text_28" style="right: 33%">绩点&nbsp;{{userInfo.gradePoint}}</span>
      </p>
      <p>
        <span class="text_28" style="right: 8%">学点&nbsp;{{userInfo.learningPoint}}</span>
      </p>
    </div>

    <!-- function block -->
    <div>
      <button open-type="share" class="share_btn">
        <img id="share" src="/static/images/home/share_icon.png"/>
      </button>
      <p>
        <span class="text_34" style="left: 9%;top: 50%">分享小程序</span>
      </p>

      <img id="exercise" @click="to_questionCollection" src="/static/images/home/Collection_icon.png"/>
      <p>
        <span class="text_34" style="left: 9%;top: 74%">题目收藏</span>
      </p>

      <img id="goldMall" @click="showSetting = true" src="/static/images/home/Setup_icon.png"/>
      <p>
        <span class="text_34" style="left: 9%;top: 90%">设置</span>
      </p>

      <img id="pk" @click="to_wrongTopic" src="/static/images/home/Wrongtopic_icon.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 42%">我的错题</span>
      </p>

      <img id="rank" @click="to_adviceFeedback" src="/static/images/home/Opinion_icon.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 58%">意见反馈</span>
      </p>

      <img id="topup" @click="to_myItems" src="/static/images/home/Articles_icon.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 74%">我的物品</span>
      </p>

      <img id="groupBattle" @click="to_scholarship" src="/static/images/home/Scholarship_icon.png"/>
      <p>
        <span class="text_34" style="left: 55%;top: 90%">奖学金</span>
      </p>

    </div>

    <settingDialog v-if="showSetting" @listenCloseDialog="showSetting = false"></settingDialog>

  </div>
</template>

<script>
import wxs from "../../utils/wx";
import { socketUrl } from "../../config";
import settingDialog from "../../components/setting-dialog";
export default {
  components: { settingDialog },
  name: "home.vue",
  data() {
    return {
      userInfo: {},
      showSetting: false //是否显示设置弹窗
    };
  },
  onLoad() {
    this.userInfo = this.$store.state.userInfo;
    wxs.showShareMenu(true);
  },
  onShareAppMessage(res) {
    if (res.from === "button") {
    }
    return {
      title: this.userInfo.wechatName + "邀你开启智商挑战之旅，快来玩吧！",
      path: "pages/index/main",
      success: res => {
        console.log("分享成功");
      },
      fail: e => {
        console.log("分享失败！" + e);
      }
    };
  },
  computed: {
    progress() {
      let progress =
        this.userInfo.experience / this.userInfo.upgradeExperience * 100;
      return progress;
    }
  },
  methods: {
    to_myItems: function() {
      wxs.navigateTo("../my-items/main");
    },
    to_scholarship: function() {
      wxs.navigateTo("../scholarship/main");
    },
    to_wrongTopic: function() {
      wxs.navigateTo("../wrong-topic/main");
    },
    to_personalCenter() {
      wxs.navigateTo("../personal-center/main");
    },
    to_questionCollection() {
      wxs.navigateTo("../my-question/main");
    },
    to_adviceFeedback() {
      wxs.navigateTo("../advice-feedback/main");
    }
  }
};
</script>

<style scoped>
#topup {
  position: absolute;
  right: 5%;
  top: 65%;
  height: 14%;
  width: 44%;
}

#rank {
  position: absolute;
  right: 5%;
  top: 49%;
  height: 14%;
  width: 44%;
}

#pk {
  position: absolute;
  right: 5%;
  top: 24%;
  height: 23%;
  width: 44%;
}

#exercise {
  position: absolute;
  left: 5%;
  top: 57%;
  width: 44%;
  height: 22%;
}

.text_34 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 17px;
  color: rgb(255, 255, 255);
}

.share_btn {
  position: absolute;
  left: 5%;
  top: 24%;
  height: 31%;
  width: 44%;
}
#share {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
}
#goldMall {
  position: absolute;
  left: 5%;
  top: 81%;
  height: 14%;
  width: 44%;
}
#groupBattle {
  position: absolute;
  right: 5%;
  top: 81%;
  height: 14%;
  width: 44%;
}
#progress {
  position: absolute;
  left: 17%;
  top: 17.5%;
  height: 12px;
}
.st-personal-center-level-outer {
  position: absolute;
  left: 17%;
  top: 17.5%;
  height: 12px;
  width: 100px;
  border: 1px solid #d2691e;
  background: white;
  border-radius: 10px;
}
.st-personal-center-level-inner {
  position: absolute;
  height: 100%;
  background: #d2691e;
  border-radius: 10px;
}

.user_coin {
  position: absolute;
  right: 25%;
  top: 9%;
}

#coin_icon {
  height: 13px;
  width: 13px;
}

.text_28 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 14px;
  color: rgb(255, 255, 255);
  top: 17%;
}

#grade,
.text_24 {
  position: absolute;
  font-family: "PingFang-SC-Medium";
  font-size: 14px;
  color: rgb(255, 255, 255);
  top: 17%;
}

#user_name {
  font-family: "PingFang-SC-Medium";
  font-size: 18px;
  color: rgb(255, 255, 255);
  position: absolute;
  left: 28%;
  top: 8%;
}

#bg,
#background {
  border: none;
  position: fixed;
  height: 100%;
  width: 100%;
}

#person_info {
  position: absolute;
  top: 2%;
  left: 5%;
  height: 20%;
  width: 90%;
}

#user_icon {
  position: absolute;
  top: 5%;
  left: 10%;
  width: 52px;
  height: 52px;
  border-radius: 50%;
  -moz-border-radius: 50%;
  -webkit-border-radius: 50%;
  background-color: darkgrey;
  border: 4px solid white;
}
</style>
