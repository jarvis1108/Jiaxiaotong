<template>
<div>
  <div class="forum">
    <div class="top">
       <span>论坛发言</span>   
    </div>
    <div class="title">  
       <span class="go-cancle" @click="cancle()">取消</span>
       <span class="title-name">分享新鲜事</span>
       <button class="post" @click="share()">发送</button>
    </div>
    <div class="content">
       <div class="comment">
          <textarea type="text" class="input" id="shareContent" v-model="word" placeholder="分享驾校新鲜事"></textarea>
       </div>
       <div class="page">
         <div class="weui-uploader__bd">
           <div class="weui-uploader__files" id="uploaderFiles">
             <block v-for="item in files" :key="item">
               <div class="weui-uploader__file" @click="predivImage" :id="item">
                 <image class="weui-uploader__img" :src="item" mode="aspectFill" />
               </div>
             </block>
           </div>
           <div class="weui-uploader__input-box">
             <div class="weui-uploader__input" @click="chooseImage"></div>
           </div>
         </div>
       </div>        
    </div>
  </div>
</div>
</template>


<script>
import {localUrl} from '../../config'
export default {
  data () {
    return {
      files: [],
      word:""
    }
  },
  methods: {
    share(){
      var that = this;
      wx.request({
      url: `${localUrl}/PublishForums`,
      method: 'GET',
      data:{
         userId :'ll',
         postTime:'2019-09-04',
         forumConten: '我觉得科三很好玩',
         picture:'/static/images/user.png'
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)//打印到控制台
        var list = res.data;
        if (list=='false') {
          var toastText = '分享失败';
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000
          });
        } else {
          var toastText = '分享成功';
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000
          });
          that.word='';
          // that.setData({
          //   forumList: list
          // })
        }
      }
    })
    },
    chooseImage (e) {
      var _this = this
      wx.chooseImage({
        sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
        sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
        success: function (res) {
          // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
          _this.files = _this.files.concat(res.tempFilePaths)
        },
        fail: function () {
          console.log('fail')
        },
        complete: function () {
          console.log('commplete')
        }
      })
    },
    predivImage (e) {
      console.log(e)
      wx.previewImage({
        current: e.currentTarget.id, // 当前显示图片的http链接
        urls: this.files // 需要预览的图片http链接列表
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
    margin-bottom: 20px;
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
  .title{
    width: 100%;
    height: 2.0em;
    position: relative;
    border-bottom: 12px solid #E0E0E0;
    margin-bottom: 10px;
  }
  .title-name {
    position: relative;
    font-size:20px;
    left:25%;
  }
  .go-cancle {
    float:left;
    font-size:18px;
    margin-left:15px;
    margin-top:4px; 
  }
  .post {
    float:right;
    border: 1px solid green;
    margin-right:13px;
    padding-left:14px;
    padding-right:14px;
    font-size:18px;
    line-height:30px;
    border-radius:20px;
  }
  .content{
    position: relative;
    width:90%;
    left:8%;
  }
</style>