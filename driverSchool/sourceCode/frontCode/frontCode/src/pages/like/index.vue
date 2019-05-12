<template>
 <div>
   <div v-if="flag === 1">
     <div class="userinfo">
        <div class="userinfo-avatar">
        <open-data type="userAvatarUrl"></open-data>
        </div> 
        <div class="info">
        <open-data type="userNickName"></open-data>
       </div>
       </div>
       <div class="message">
       <p>{{message}}</p>
       </div>
       <div class="photo">
       <img v-bind:src="photo" mode="aspectFit">
       </div>
       <div>
         <div class="button">
           <button v-bind:style="color" name="like" class="like"  @click="changecolor()">{{likeMessage}}</button>
           <button name="comment" class="comment" v-on:click="flag = 2">评论</button>
           <button name="share" class="share" open-type="share">转发</button>
         </div>
       </div>
   </div>
   <div v-else-if="flag === 2">
     <div>
     <button name="back" class="back" v-on:click="flag = 1">返回</button>
     <div class="commentText">
       <div v-if="comment.length != 0"><div v-for="(text,index) in comment" :key='index'>
     {{text}}
     </div>
     </div>
       <div v-else>暂未有人发表过评论哦!</div>
     </div>
     <div>
      <textarea contenteditable="true" auto-height="true" class="text" name="content" v-model="content" placeholder="请在这里输入你想评论的内容"></textarea>
     </div>
     <div class="button">
      <button name="clear" class="clear" @click="clear()">清空</button>
      <button name="submmit" class="submmit" @click="pushComment()">发表</button>
    </div>
      </div>
   </div>  
</div>
</template>
<script>
export default {
  name: 'like',
  data () {
    return {
      user: { nickname: 'a' }, // 保存后台传输的用户信息
      message: '测1试用。。。测试用。。测试用。测试用。测试用测试用测试用测试用测试用', // 后台传输的发表文字信息
      photo: 'http://upload-images.jianshu.io/upload_images/2822163-70ac87aa2d2199d1.jpg', // 后台传输的图片信息
      comment: [], // 后台传输的评论信息
      like: 1, // 查看是否已经点赞
      color: 'background-color: springgreen',
      flag: 1,
      likeMessage: '已点赞',
      content: ''
    }
  },
  methods: {
    changecolor: function () {
      if (this.like === 0) {
        this.color = 'background-color: springgreen'
        this.like = 1
        this.likeMessage = '已点赞'
      } else {
        this.color = 'background-color: white'
        this.like = 0
        this.likeMessage = '点赞'
      }
    },
    clear: function () {
      this.content = ''
    },
    pushComment: function () {
      if (this.content !== '') {
        this.comment.push(this.user.nickname + ' :' + this.content) // user.nickname由后台传入，现用a代替
        this.content = ''
      }
    }
  }
}
</script>

<style>
.userinfo{
  display: block;
}
.userinfo-avatar {
  border-radius: 50%;
  margin: 70rpx 50rpx;
  width: 150rpx;
  height: 150rpx;
  overflow: hidden;
  float: left;
}

.info{
  margin: 110rpx 20rpx;
  float: left;
  font-size: 50rpx;
  text-align: center;
  
}
.message{
  margin: 10rpx 50rpx;
  font-size: 40rpx;
  float: left;
  display: block;
  width: 600rpx;
  word-break: break-all;
  word-wrap: break-word;
}
.photo{
  width: 100%;
  float: left;
  display: block;
}
.photo img{
  margin: 10rpx 30%;
  width: 300rpx;
  
}
.button{
  display: block;
}
.like{
  float: left;
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  width: 33%;
  background-color: springgreen;
}
.comment{
  float: left;
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  width: 33%;
  background-color: white;
}
.share{
  float: left;
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  width: 33%;
  background-color: white;
}
.back{
 border-radius: 100rpx;
  margin: 70rpx 75%;
  font-size: 40rpx;
  width: 23%;
  color:rgb(0, 0, 0);
  background-color:white;
  border-style: solid;
  border-width: 2px;
  border-color: springgreen;
}
.commentText{
margin: 5% 5%;
padding: 5% 5%;
border-style: solid;
border-radius: 50rpx;
border-width: 1px;
border-color: black;
width: 80%;
word-break: break-all;
word-wrap: break-word;
}
.text{
margin: 5% 5%;
padding: 5% 5%;
border-style: solid;
border-radius: 50rpx;
border-width: 1px;
border-color: black;
width: 80%;
word-break: break-all;
height: 1.3em;
}
.clear{
  float: left;
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  background-color: white;
  width: 32%;
  margin: 50rpx 9%;
}
.submmit{
  float: left;
  border-radius: 100rpx;
  border-style: solid;
  border-width: 2px;
  border-color:springgreen;
  background-color: white;
  width: 32%;
  margin: 50rpx 9%;
}
</style>