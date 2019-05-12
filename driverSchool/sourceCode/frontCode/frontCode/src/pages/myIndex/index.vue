<template>
  <div class="body">
     <!-- <img @click="toUserInfo" id="user_icon" :src="userInfo.headImage"/>
      <img @click="toForum" id="forum_icon" :src="userInfo.headImage"/> -->
  <div class="userInfo">
   <div class="userName">{{userInfo.name}}</div>
  <img :src="userInfo.img" class="userImg">
  </div> 
  <div class="timeTable">
     <input type="button" value="修改" @click="changeTime" class="btnStyle">
         <div>
           <div class="timeTableText">时间表</div>
      <div class="freeTimeBox">
         <div class="freeTimeBox1">
          <div
            v-for="item in timeList"
            :key="item"
            class="freeTimeDiv"
          >{{item}}</div>
        </div>
        <div class="freeTimeBox1">
         <div class="freeTimeDiv">上午</div>
          <div
            v-for="(item,index) in freeTime"
            :key="item"
            v-if="index%2==0"
            :class="{freeTimeDiv:!item.isChoosed,freeTimeDivChoosed:item.isChoosed}"
            id="freeTimeID"
          ></div>
        </div>
        <div class="freeTimeBox1">
          <div class="freeTimeDiv">下午</div>
          <div
            v-for="(item,index) in freeTime"
            :key="item"
            v-if="index%2==1"
            :class="{freeTimeDiv:!item.isChoosed,freeTimeDivChoosed:item.isChoosed}"
            id="freeTimeID"
          ></div>
        </div>
      </div>
    </div>      
  </div> 
 <myTabBar v-bind:in-home="true" v-bind:in-forum="false" v-bind:in-personal="false"></myTabBar>
  </div>
</template>
<style>
.body {
  background-color: white;
}
.userInfo{
  display: flex;
  flex-direction:row;
  width: 200rpx;
  height: 80rpx;
  position: relative;
  left: 550rpx;
  align-items: center;
  justify-content: space-around;
}
.userName{
  font-size:30rpx;
}
.userImg{
  width:80rpx;
  height: 80rpx;
  border-radius: 50%;
}
.timeTable{
  margin-top: 10rpx;
}
.timeTableText{
  position: relative;
  left: 40%;
  width: 150rpx;
}
.freeTimeDiv {
  width: 150rpx;
  height: 40rpx;
  margin: 30rpx auto;
  padding-top: 15rpx;
  text-align: center;
   border-radius: 10rpx;
}
.freeTimeDivChoosed {
  width: 150rpx;
  height: 40rpx;
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
.btnStyle {
  /* width:140rpx;
  height: 70rpx;
  border-radius: 20rpx;
  font-size:30rpx;
  position: absolute;
  right:20rpx; */
  border-radius: 100rpx;
  font-size: 30rpx;
  width: 20%;
  color:rgb(0, 0, 0);
  background-color:white;
  border-style: solid;
  border-width: 2px;
  border-color: rgba(206, 206, 206, 0.774);
  position: absolute;
  right:20rpx;
}
</style>

<script>
import myTabBar from '@/components/myTabBar'
// 创建页面时必须暴露
export default {
    components: {
    myTabBar
  },
 name: 'home',
  data() {
    return {
      userInfo:{
        name:"",
        img:""
        
      },  
      freeTime: [],   
      timeList:["","周一","周二","周三","周四","周五","周六","周日"]
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
          'userId': '123'
        },
        success: function (res) {
          var UserInfo = res.data.data.userInfo[0];
         _this.userInfo.name = UserInfo.name; 
         _this.userInfo.img = UserInfo.img;  
         _this.freeTime=UserInfo.freeTime;
         console.log(_this.userInfo.img);
        },
        fail: function (err) {
          console.log(err)
        }
      })
    },
    changeTime(){
      console.log("changeTime");
       const url  = '../changeTime/main?freeTime='+JSON.stringify(this.freeTime)
        //  const url  = '../forumHome/main'
      // if (mpvuePlatform === 'wx') {
      //   mpvue.switchTab({ url })
      // } else {
      //   mpvue.navigateTo({ url })
      // }
      wx.navigateTo({url});
    },
  },
  // 生命周期函数,mpvue除了vue本身的生命周期外还兼容了小程序的生命周期
  created() {
      this.initInfo();
  }
};
</script>

