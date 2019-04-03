<template>
<div>
  <div class="forum">
    <div class="top">
       <img src="/static/tabs/home.png" class="go-back" @click="back()"/>
       <span>论坛主页</span>   
    </div>
    <div class="search">
       <input type="text" class="input" v-model="word" placeholder="请输入关键词" @focus="focusinput(e)"></input>    
    </div>
    <div class="menu">
       <div class="post">
          <img src="/static/images/user.png" class="go-post" @click="post()"/>
          <span><br/>我发出的</span>
       </div>
       <div class="comment">
          <img src="/static/images/user.png" class="go-comment" @click="comment()"/>
          <span><br/>我评论的</span>
       </div>
       <div class="my-like">
          <img src="/static/images/user.png" class="go-like" @click="like()"/>
          <span><br/>我点赞的</span>
       </div>
       <div class="share">
          <img src="/static/images/user.png" class="go-share" @click="share()"/>
          <span><br/>分享</span>
       </div>
    </div>
    <div class="news">
       <div class="title">
          <img src="/static/images/user.png" class="go-mine" @click="mine()"/>
          <span>木子22222</span>
       </div>
       <div class="content">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;黑盒测试. 近日接到用户反馈，垃圾邮件增多。怀疑学校网站出现邮件地址泄露。此处，邮件地址泄露定义为，在网页内容中出现非图片形式的电子邮件地址。<br/>
          <img src="/static/tabs/home-active.png"/> 
       </div>
    </div>
  </div>
</div>
</template>

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
    width: 76%;
    height: 3em;
  }
  .news{
    margin-left: 2%; 
    margin-right: 2%;
    border:1px solid silver;
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