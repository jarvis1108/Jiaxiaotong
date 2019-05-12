<template>
  <div class="head">
    <img src="../../../static/images/1.jpg" alt="">
    <div class="content">
      <div>申请获取以下权限</div>
      <text>获得你的公开信息(昵称，头像等)</text>
    </div>

    <button class="bottom" open-type="getUserInfo" @getuserinfo="bindGetUserInfo" @click="getUserInfo">获取权限</button>
  </div>
</template>

<script>
export default {
  data () {
    return {
      userInfo: {}
    }
  },
  mounted () {
    this.getSetting()
  },
  methods: {
    getSetting () {
      wx.getSetting({
        success: function (res) {
          if (res.authSetting['scope.userInfo']) {
            wx.getUserInfo({
              success: function (res) {
                console.log(res.userInfo)
                console.log('用户已经授权过')
                // wx.navigateTo({ url: '' })若已经授权则直接跳转下一界面
              }
            })
          } else {
            console.log('用户还未授权过')
          }
        }
      })
    },
    getUserInfo () {
      console.log('click事件首先触发')
      if (wx.canIUse('button.open-type.getUserInfo')) {
        wx.navigateTo({ url: '../schoolValidate/main' }) // 授权成功，直接跳转下一界面
      } else {
        console.log('请升级微信版本')
      }
    },
    bindGetUserInfo (e) {
      if (e.mp.detail.rawData) {
        console.log('用户按了允许授权按钮')
      } else {
        console.log('用户按了拒绝按钮')
      }
    }
  }
}
</script>

<style>
.head img{
  border-radius: 50%;
  margin: 70rpx 25%;
  width: 350rpx;
  height: 350rpx;
}

.content {
  margin-left: 50rpx;
  margin-bottom: 90rpx;
}

.content text {
  display: block;
  color: #9d9d9d;
  margin-top: 40rpx;
}

.bottom {
  border-radius: 80rpx;
  margin: 70rpx 50rpx;
  font-size: 35rpx;
  color:ghostwhite;
  background-color:rgba(24, 190, 18, 0.966);
}
</style>

 

