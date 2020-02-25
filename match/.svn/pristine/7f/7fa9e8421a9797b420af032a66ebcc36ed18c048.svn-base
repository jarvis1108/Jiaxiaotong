<template>
  <div class="st-battle-object-modify-container">
    <img class="st-battle-object-modify-bg" src="/static/images/bg.png">
    <!-- 已选列表 -->
    <div :style="'height:'+selectedHeight" class="st-battle-object-modify-selectedlist-div">
      <div class="st-battle-object-modify-title">我的科目</div>
      <div class="st-battle-object-modify-flex-div">
        <!-- selectedObjectList -->
        <div class="st-battle-object-modify-box" v-for="(item,index) in selectedObjectList" :key="index">
          <div @click="deleteObject(index)" class="st-battle-object-modify-photo-img-div">
            <img class="st-battle-object-modify-photo-img" :src="item.photo"/>
            <img class="st-battle-object-modify-icon" src="/static/images/battleObjectModify/Delete_icon.png"/>
          </div>
          <div class="st-battle-object-modify-objectname-div">
            {{ item.name }} 
          </div>
        </div>
      </div>
    </div>

    <!-- 未选列表 -->
    <div :style="'height:'+unselectedHeight" class="st-battle-object-modify-selectedlist-div">
      <div class="st-battle-object-modify-title">更多科目</div>
      <div class="st-battle-object-modify-flex-div">
        <!-- selectedObjectList -->
        <div class="st-battle-object-modify-box" v-for="(item,index) in unselectedObjectList" :key="index">
          <div @click="addObject(index)" class="st-battle-object-modify-photo-img-div">
            <img class="st-battle-object-modify-photo-img" :src="item.photo"/>
            <img class="st-battle-object-modify-icon" src="/static/images/battleObjectModify/Increase_icon.png"/>
          </div>
          <div class="st-battle-object-modify-objectname-div">
            {{ item.name }} 
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      selectedObjectList: [
        {
          name: "语文",
          photo: "/static/images/battleObjectModify/Chinese_1_icon.png"
        },
        {
          name: "数学",
          photo: "/static/images/battleObjectModify/Mathematics_1_icon.png"
        },
        {
          name: "英语",
          photo: "/static/images/battleObjectModify/English_1_icon.png"
        },
        {
          name: "物理",
          photo: "/static/images/battleObjectModify/Physics_1_icon.png"
        },
        {
          name: "化学",
          photo: "/static/images/battleObjectModify/Chemistry_1_icon.png"
        },
        {
          name: "生物",
          photo: "/static/images/battleObjectModify/Biology_1_icon.png"
        },
        {
          name: "政治",
          photo: "/static/images/battleObjectModify/politics_1_icon.png"
        },
        {
          name: "历史",
          photo: "/static/images/battleObjectModify/History_1_icon.png"
        },
        {
          name: "地理",
          photo: "/static/images/battleObjectModify/Geography_1_icon.png"
        },
        {
          name: "四级",
          photo: "/static/images/battleObjectModify/Cet4_1_icon.png"
        },
        {
          name: "六级",
          photo: "/static/images/battleObjectModify/Cet6_1_icon.png"
        }
      ],
      unselectedObjectList: [
        {
          name: "科学",
          photo: "/static/images/battleObjectModify/Science_1_icon.png"
        },
        {
          name: "高数",
          photo:
            "/static/images/battleObjectModify/Advancedmathematics_1_icon.png"
        },
        {
          name: "电力",
          photo: "/static/images/battleObjectModify/Electricpower_1_icon.png"
        }
      ]
    };
  },
  computed: {
    selectedHeight() {
      if (this.selectedObjectList.length <= 0) {
        return "5%";
      } else if (Math.ceil(this.selectedObjectList.length / 3) >= 5) {
        return "75%";
      } else {
        let height = Math.ceil(this.selectedObjectList.length / 3) * 15;
        return height + "%";
      }
    },
    unselectedHeight() {
      if (this.unselectedObjectList.length <= 0) {
        return "5%";
      } else if (Math.ceil(this.unselectedObjectList.length / 3) >= 5) {
        return "75%";
      } else {
        let height = Math.ceil(this.unselectedObjectList.length / 3) * 15;
        return height + "%";
      }
    }
  },
  methods: {
    deleteObject(index) {
      let item = this.selectedObjectList[index];
      this.selectedObjectList.splice(index, 1);
      this.unselectedObjectList.push(item);
      
    },
    addObject(index) {
      let item = this.unselectedObjectList[index];
      this.unselectedObjectList.splice(index, 1);
      this.selectedObjectList.push(item);
    }
  }
};
</script>

<style scoped>
.st-battle-object-modify-container {
  position: absolute;
  width: 100%;
  height: 100%;
}
.st-battle-object-modify-bg {
  position: fixed;
  width: 100%;
  height: 100%;
}
.st-battle-object-modify-selectedlist-div {
  position: relative;
  margin-top: 8%;
  left: 5%;
  width: 90%;
  background: #fff;
  border-radius: 10px;
}
.st-battle-object-modify-flex-div {
  width: 88%;
  left: 6%;
  top: 5%;
  position: absolute;
  display: flex;
  flex-wrap: wrap;
  align-content: flex-start;
  overflow: auto;
  height: 90%;
}

.st-battle-object-modify-box {
  flex: 0 0 auto;
  height: 13.29vh;
  width: 26vw;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.st-battle-object-modify-objectname-div {
  font-size: 14px;
  color: rgb(83, 181, 247);
  font-weight: bold;
  line-height: 8vw;
}

.st-battle-object-modify-photo-img-div {
  flex: 0 0 auto;
  width: 40px;
  height: 40px;
  border-radius: 50%;
  background: rgb(22, 202, 217);
  margin-top: 15%;
}
.st-battle-object-modify-photo-img {
  position: relative;
  width: 20px;
  height: 20px;
  top: 25%;
  left: 25%;
}
.st-battle-object-modify-title {
  position: absolute;
  top: -12px;
  height: 25px;
  width: 20%;
  left: 10%;
  background: rgb(83, 181, 247);
  color: #fff;
  font-size: 14px;
  text-align: center;
  z-index: 10;
  line-height: 25px;
  border-radius: 10px;
}
.st-battle-object-modify-icon {
  position: relative;
  width: 10px;
  height: 10px;
  top: 45%;
  right: -25%;
}
</style>
