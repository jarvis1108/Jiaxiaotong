<template>
  <div class="st-battle-object-select-container">
    <img class="st-battle-object-select-bg" src="/static/images/bg.png">
    <!-- header -->
    <div class="st-battle-object-select-header">
      <img class="st-battle-object-select-header-bg" src="/static/images/battleObjectSelect/Selectdiscipline_bg.png"/>
      <span class="st-battle-object-select-header-span">选择对战学科</span>
      <img @click="to_loading" class="st-battle-object-select-header-btn" src="/static/images/battleObjectSelect/Selectall_btn.png"/>
    </div>

    <!-- content -->
    <div class="st-battle-object-select-content">
      <div class="st-battle-object-select-flex-div">
        <!-- objectList -->
        <div class="st-battle-object-select-box" v-for="item in objectList" :key="item">
          <div class="st-battle-object-select-photo-img-div">
            <img class="st-battle-object-select-photo-img" :src="item.photo"/>
          </div>
          <div class="st-battle-object-select-objectname-div">
            {{ item.name }} 
          </div>
        </div>
        <!-- addButton -->
        <div class="st-battle-object-select-box">
          <div @click="to_modify" class="st-battle-object-select-addphoto-img-div">
            <img class="st-battle-object-select-photo-img" src="/static/images/battleObjectSelect/Plussign_icon.png"/>
          </div>
          <div class="st-battle-object-select-objectname-div" style="color:rgb(214,214,214);">
            添加
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import wxs from '../../utils/wx'
export default {
  data() {
    return {
      objectList: [
        {
          name: "语文",
          photo: "/static/images/battleObjectSelect/Chinese_icon.png"
        },
        {
          name: "数学",
          photo: "/static/images/battleObjectSelect/Mathematics_icon.png"
        },
        {
          name: "英语",
          photo: "/static/images/battleObjectSelect/English_icon.png"
        },
        {
          name: "物理",
          photo: "/static/images/battleObjectSelect/Physics_icon.png"
        },
        {
          name: "化学",
          photo: "/static/images/battleObjectSelect/Chemistry_icon.png"
        },
        {
          name: "生物",
          photo: "/static/images/battleObjectSelect/Biology_icon.png"
        },
                {
          name: "政治",
          photo: "/static/images/battleObjectSelect/politics_icon.png"
        },
        {
          name: "历史",
          photo: "/static/images/battleObjectSelect/History_icon.png"
        },
        {
          name: "地理",
          photo: "/static/images/battleObjectSelect/Geography_icon.png"
        },
        {
          name: "四级",
          photo: "/static/images/battleObjectSelect/Cet4_icon.png"
        },
        {
          name: "六级",
          photo: "/static/images/battleObjectSelect/Cet6_icon.png"
        }
      ]
    };
  },
  methods:{
    to_modify(){
      wxs.navigateTo("../battle-object-modify/main");
    },
    to_loading(){
      wxs.navigateTo("../battle-loading/main");
    }
  }
};
</script>

<style scoped>
.st-battle-object-select-bg {
  position: fixed;
  width: 100%;
  height: 100%;
}
.st-battle-object-select-header {
  position: absolute;
  top: 3%;
  left: 5%;
  width: 90%;
  height: 20%;
}
.st-battle-object-select-header-bg {
  position: absolute;
  height: 100%;
  width: 100%;
}
.st-battle-object-select-header-span {
  position: absolute;
  top: 15%;
  left: 5%;
  font-size: 19px;
  color: #fff;
  font-weight: bold;
}
.st-battle-object-select-header-btn {
  position: absolute;
  bottom: 30%;
  right: 15%;
  height: 40px;
  width: 25%;
}
.st-battle-object-select-content {
  position: absolute;
  left: 5%;
  width: 90%;
  top: 25%;
  height: 70%;
  background: #fff;
  border-radius: 10px;
}
.st-battle-object-select-flex-div {
  width: 88%;
  left: 6%;
  top: 6.52%;
  position: absolute;
  display: flex;
  flex-wrap: wrap;
  align-content: flex-start;
  overflow: auto;
  height: 90%;
}

.st-battle-object-select-box {
  flex: 0 0 auto;
  height: 15.29vh;
  width: 26vw;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.st-battle-object-select-objectname-div {
  font-size: 14px;
  color: rgb(83, 181, 247);
  font-weight: bold;
  line-height: 8vw;
}

.st-battle-object-select-photo-img-div ,
.st-battle-object-select-addphoto-img-div {
  flex: 0 0 auto;
  width: 50px;
  height: 50px;
  border-radius: 50%;
}
.st-battle-object-select-photo-img-div{
  background: rgb(22, 202, 217);
}
.st-battle-object-select-addphoto-img-div {
  background: rgb(214, 214, 214);
}
.st-battle-object-select-photo-img {
  position: relative;
  width: 23px;
  height: 23px;
  top: 28%;
  left: 28%;
}
</style>