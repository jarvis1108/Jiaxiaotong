<template>
<div>
  <div class="forum">
    <div class="top">
       <span>论坛主页</span>   
    </div>
    <div class="search">
       <input type="text" class="input" v-model="word" placeholder="请输入关键词" @focus="focusinput(e)">   
    </div>
    <div class="menu">
       <div class="post">
          <img v-if="inFlight" src="/static/images/inFlight.png" class="go-comment" @click="myShare()"/>      
           <img v-else src="/static/images/flight.png" class="go-comment" @click="myShare()"/>     
          <span><br/>我发出的</span>
       </div>
       <div class="comment">
          <img v-if="inComment" src="/static/images/inComment.png" class="go-comment" @click="comment()"/>
            <img v-else src="/static/images/comment.png" class="go-comment" @click="comment()"/>
          <span><br/>我评论的</span>
       </div>
       <div class="my-like">
          <img v-if="inThumb" src="/static/images/inThumb.png" class="go-like" @click="like()"/>
           <img v-else src="/static/images/thumb.png" class="go-like" @click="like()"/>
          <span><br/>我点赞的</span>
       </div>
       <div class="share">
          <img v-if="inShare" src="/static/images/inShare.png" class="go-share" @click="toShare()"/>
           <img v-else src="/static/images/share.png" class="go-share" @click="toShare()"/>
          <span><br/>分享</span>
       </div>
    </div>
    <div v-for="item in forumList" :key="item" class="news">
       <div class="title">
          <img src="/static/images/user.png" class="go-mine" @click="mine()"/>
          <span>木子22222</span>
       </div>
       <div class="content">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{item.forumConten}}<br/>
          <img :src="item.picture"/> 
            <div class="btnGroup">
           <button v-bind:style="color" name="like"  class="likeBtn"  @click="changecolor(item.forumID)">点赞</button>
           <button name="comment" class="commentBtn" v-on:click="flag = 2">评论</button>
           <button name="share" class="shareBtn" open-type="share">转发</button>
          </div>
       </div>
    </div>
  </div>
  <myTabBar v-bind:in-home="false" v-bind:in-forum="true" v-bind:in-personal="false"></myTabBar>
</div>
</template>
<script>
import {localUrl} from '../../config'
import myTabBar from '@/components/myTabBar'
export default {
   components: {
    myTabBar
  },
  data () {
    return {
      inFlight:false,
      inShare:false,
      inThumb:false,
      inComment:false,
      forumList:[],
      like:false,
      color: 'background-color: white',
    }
  },
      onLoad(){
      // 获取帖子
      console.log("执行 了onload函数")
      var that = this;
        wx.request({
      url: `${localUrl}/GetForum`,
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
    focusinput(e){
      
    },
        changecolor: function (fId) {
      var that = this;
      wx.request({
      url: `${localUrl}/isNotlike`,
      method: 'GET',
      data:{
        userId:'ll',
        forumId:fId
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)//打印到控制台
        that.like= res.data;
      }
    });  
      if (!this.like) {
        this.color = 'background-color: springgreen'
        this.like = true
       var that = this;
      wx.request({
      url: `${localUrl}/GiveLike`,
      method: 'GET',
      data:{
        userId:'ll',
        forumId:fId
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)//打印到控制台
      }
    });  
      } else {
        this.color = 'background-color: white'
        this.like = false
      var that = this;
      wx.request({
      url: `${localUrl}/CancelLike`,
      method: 'GET',
      data:{
        userId:'ll',
        forumId:fId
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)//打印到控制台
      }
      });
      }
    },
    toblack(){
      this.inFlight = false;
      this.inShare = false;
      this.inThumb = false;
      this.inComment = false;
    },
    toShare(){
      this.toblack();
      this.inShare = true;
      const url = "../share/main"
      wx.navigateTo({url})
    },
    like(){
      this.toblack();
      this.inThumb = true;
            var that = this;
      wx.request({
      url: `${localUrl}/MyLike`,
      method: 'GET',
      data:{
         userId :'1'
      },
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
    //  const url = "../like/main"
    //   wx.navigateTo({url})
    },
    myShare(){
      this.toblack();
      this.inFlight = true;
      var that = this;
      wx.request({
      url: `${localUrl}/MyForums`,
      method: 'GET',
      data:{
         userId :'1'
      },
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
    comment(){
      this.toblack();
      this.inComment = true;
            var that = this;
      wx.request({
      url: `${localUrl}/MyForums`,
      method: 'GET',
      data:{
         userId :'1'
      },
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
    
    }

    

  }
}
</script>

<style>
  .top {
    width: 100%;
    height: 2.2em;
    position: relative;
    border-bottom: 1px solid silver;
    margin-bottom: 10px;
  }
  .go-back{
    width: 10%;
    height: 2.2em;
  }  
  .top span {
    height: 2.2em;
    position: relative;
    left:28%;
    bottom:15%;
    font-size:25px;  
  }
  .search{
    width: 90%;
    height:1.5em;
    border-radius:20px 20px 20px 20px;
    border:1px solid #E0E0E0;
    margin-bottom: 30px;
    margin-left: auto; 
    margin-right: auto;
    background-color:#E0E0E0;
  }
  .menu {
    height: 4.2em;
    width:90%;
    position: relative;
    text-align:center;
    margin-bottom: 40px;
    margin-left: auto; 
    margin-right: auto;
  }
  .post {
    width:25%;
    float:left;
  }
  .comment {
    width:25%;
    float:left;
  }
.likeBtn, .commentBtn,.shareBtn{
 
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  width: 33%;
  background-color: white;
}
.btnGroup{
  display:flex;
  flex-direction: row;

}
  .my-like{
    width:25%;
    float:left; 
  }
  .share{
    width:25%;
    float:left;
  }
  .menu span{
    text-align:center;
    font-size:15px;
    color:blue;
  }
  .menu img{
    width: 50rpx;
    height: 50rpx;
  }
  .news{
    margin-left: 2%; 
    margin-right: 2%;
    border:1px solid silver;
    margin-top:4%;
  }
  .title{
    height:80px;
  }
  .news img{
    width: 20%;
    height: 3.2em;

  }
  .news span{
    position: relative;
    left:3%;
    bottom:25%;
  }
  .content{
    position: relative;
    margin-left: 5%; 
    margin-right: 5%;
  }
</style>