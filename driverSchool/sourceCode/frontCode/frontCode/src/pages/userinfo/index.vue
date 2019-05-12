<template>
 <div>
   <div v-if="flag === 1">
    <div>
      <div>
        <div>
          <button class="button" v-on:click="flag = 2">修改</button>
        </div>
        <div class="userinfo-avatar">
        <open-data type="userAvatarUrl"></open-data>
        </div>        
      </div>
      <div class="info">
        昵称：
        <open-data type="userNickName"></open-data>
      </div>
      <div class="info">
        驾校：
        {{school}}
      </div>
      <div class="info">
        教练：
        {{coach}}
      </div>
      <div class="info">
        考试时间：
        {{examtime}}
      </div>
    </div>
  </div>
  <div v-else-if="flag === 2" class="form">
    <div>
      <div>
        <div>
          <button v-on:click="flag = 1" class="button" @click="cancel">取消</button>
        </div>
      </div>
    </div>
    <div class="input-control" style="margin-top:120rpx">
      <input type="text" class="text" name="school" v-model="school" placeholder="驾校">
    </div>
    <div class="input-control">
      <input type="text" class="text" name="coach" v-model="coach" placeholder="教练">
    </div>
    <div class="input-control">
      <input type="text" class="text" name="examtime" v-model="examtime" placeholder="考试时间">
    </div>
    <div>
      <button name="submit" class="button-control" v-on:click="flag = 1">提交</button>
    </div>
  </div> 
  <myTabBar v-bind:in-home="false" v-bind:in-forum="false" v-bind:in-personal="true"></myTabBar>
</div>
</template>

<script>
import myTabBar from '@/components/myTabBar'

export default {
  components: {
    myTabBar
  },
  name: 'userinfo',
  data () {
    return {
      user: {}, // 保存后台传输的用户信息
      flag: 1, // 设初始界面为第一个界面
      school: '',
      coach: '',
      examtime: ''
    }
  },
  onLoad(){
     var that = this;
        wx.request({
      url: `${localUrl}/GetUserInfo`,
      method: 'GET',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)//打印到控制台
        var list = res.data;
        if (list == null) {
          var toastText = '数据获取失败';
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000
          });
        } else {
          that.forumList = list;
          // that.setData({
          //   forumList: list
          // })
        }
      }
    })
  },
  methods: {
    submit: function () {},
    cancel: function () {
      this.school = '' // 连接数据库部分（应为user.school），现无法连接先清0
      this.coach = '' // 连接数据库部分（应为user.cocach），现无法连接先清0
      this.examtime = '' // 连接数据库部分（应为user.examtime），现无法连接先清0
    }
  }
}
</script>

<style>
.userinfo-avatar {
  border-radius: 50%;
  margin: 70rpx 25%;
  width: 250rpx;
  height: 250rpx;
  overflow: hidden;
}
.button{
  border-radius: 100rpx;
  margin: 70rpx 75%;
  font-size: 30rpx;
  width: 23%;
  color:rgb(0, 0, 0);
  background-color:white;
  border-style: solid;
  border-width: 2px;
  border-color: rgba(206, 206, 206, 0.774);
}
.info{
  margin: 50rpx 50rpx;
}
.input-control{
  margin: 100rpx 50rpx;
  border-radius: 20rpx;
  border-style: solid;
  border-width: 3px;
  border-color: rgba(206, 206, 206, 0.774);
  font-size: 50rpx;
  min-height: 100rpx;
}
.text{
  margin: 20rpx 30rpx;
  min-height: 60rpx;
  color:black;
}
.input-control:active,.input-control:hover{
  border-color:rgba(73, 69, 69, 0.733);
}
.button-control{
  background-color:rgba(24, 190, 18, 0.966);
  color: ghostwhite;
  max-width: 90%;
  border-radius: 30rpx;
  margin-bottom: 0rpx;
}
</style>