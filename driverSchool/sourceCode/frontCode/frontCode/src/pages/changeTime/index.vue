<template>
  <div class="body">
    <div><span style="color:red">*</span>请选择请假时间
      <div class="freeTimeBox">
        <div class="freeTimeBox1">
          <div
            v-for="(item,index) in freeTime"
            :key="item"
            v-if="index%3==0"
            :class="{freeTimeDiv:!item.isChoosed,freeTimeDivChoosed:item.isChoosed}"
            id="freeTimeID"
            @click="chooseTime(item)"
          >{{item.time}}</div>
        </div>
        <div class="freeTimeBox1">
          <div
            v-for="(item,index) in freeTime"
            :key="item"
            v-if="index%3==1"
            :class="{freeTimeDiv:!item.isChoosed,freeTimeDivChoosed:item.isChoosed}"
            id="freeTimeID"
            @click="chooseTime(item)"
          >{{item.time}}</div>
        </div>
        <div class="freeTimeBox1">
          <div
            v-for="(item,index) in freeTime"
            :key="item"
            v-if="index%3==2"
            :class="{freeTimeDiv:!item.isChoosed,freeTimeDivChoosed:item.isChoosed}"
            id="freeTimeID"
            @click="chooseTime(item)"
          >{{item.time}}</div>
        </div>
      </div>
    </div>
    <div>
     <span style="color:red"> *</span>请说明请假理由 
    <input type="text" id="testTime" class="testDiv" placeholder="请填写请假理由"> 
    </div>
    <button class="btnStyle" @click="submitIfo">提交</button>
  </div>
</template>
<style>
.body {
  background-color: white;
}
.title {
  text-align: center;
  margin-bottom: 20rpx;
}

.teacherDiv {
  margin-top: 20rpx;
  margin-bottom: 20rpx;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}
.freeTimeDiv {
  width: 200rpx;
  height: 60rpx;
  background-color:gainsboro;
  margin: 30rpx auto;
  padding-top: 15rpx;
  text-align: center;
   border-radius: 10rpx;
}
.freeTimeDivChoosed {
  width: 200rpx;
  height: 60rpx;
  background-color: rgb(30, 190, 24);
  margin: 30rpx auto;
  padding-top: 15rpx;
  text-align: center;
  border-radius: 10rpx;
}
.freeTimeBox {
  margin-top: 20rpx;
  display: flex;
  flex-direction: row;
}
.freeTimeBox1 {
  margin-left: 40rpx;
}
.testDiv{
  background-color: aliceblue;
  padding-left:20rpx;
  height:70rpx;
  margin-top:10rpx;
}
.btnStyle {
  /* margin-top: 25rpx;
  background-color:  rgb(30, 190, 24); */
  border-radius: 80rpx;
  margin: 50rpx 50rpx;
  font-size: 35rpx;
  color:ghostwhite;
  background-color:rgba(24, 190, 18, 0.966);
}
</style>

<script>
// 创建页面时必须暴露
export default {
  data() {
    return {
      freeTime: []//从home界面获取信息，只将为true的传过来
    };
  },
  methods: {
    initInfo() {
      var _this=this;
      wx.request({
          url: 'http://localhost:8080/api/info',
        methods: 'GET',
        header: { 'content-type': 'application/json' },
        data: {
          'schoolId': '123'
        },
        success: function (res) {
          console.log(res);
          var schoolInfo = res.data.data.school;
          console.log(schoolInfo.schoolName);
          _this.msg=schoolInfo.schoolName;
          _this.teachers=schoolInfo.teacher;
          _this.freeTime=schoolInfo.freeTime;
        },
        fail: function (err) {
          console.log(err)
        }
      })
    },
    chooseTime(item) {
      item.isChoosed = !item.isChoosed;
      console.log(item.isChoosed);
    },
    submitIfo(){
      var _this=this;
      wx.request({
          url: 'http://localhost:8080/api/info',
        methods: 'GET',
        header: { 'content-type': 'application/json' },
        data: {
          'teacherId': '123',
          'freeTime':_this.freeTime,
          'testTime':document.getElementById("testTime").value
        },
        success: function (res) {
          console.log(提交成功);
        },
        fail: function (err) {
          console.log(err)
        }
      })

    }
  },
  // 生命周期函数,mpvue除了vue本身的生命周期外还兼容了小程序的生命周期
  onLoad(options) {
      // this.initInfo();
     this.freeTime = JSON.parse(options.freeTime);
    console.log("freeTime");
  }
};
</script>

