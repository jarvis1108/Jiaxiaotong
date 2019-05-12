<template>
    <div class="box">
         <div class="homeBox" @click="toHome()">
             <img v-if="inHome" src="../../static/images/inHome.png" class="homeImg" >
               <img  v-else src="../../static/images/home.png" class="homeImg"> 
             <span>主页</span>
         </div>
         <div class="forumBox" @click="toForume()">
             <img  v-if="inForum" src="../../static/images/inForum.png" class="forumImg">
             <img  v-else src="../../static/images/forum.png" class="forumImg">
             <span>论坛</span>
         </div>
        <div class="personalBox"  @click="toPersonal()" >
             <img v-if="inPersonal" src="../../static/images/inPersonal.png" class="personalImg">
              <img v-else src="../../static/images/personal.png" class="personalImg">
             <span>我的</span>
         </div>
    </div>
</template>
<script>
export default {
    //组建不能拥有自己的数据，为什么
//       data() {
//     return {
//       inHome='true', //从home界面获取信息，只将为true的传过来
//       inForum='false',
//       inPersonal='false'
//     };
//   },
   props: [
        'inHome',
       'inForum',
        'inPersonal'
   ],
    methods:{
        toHome(){
              console.log(this.toHome);
        //    this.inHome='false';
            wx.navigateTo({url:'../myIndex/main'});
        },
         toForume(){
             wx.navigateTo({url:'../myForumHome/main'});
        },
         toPersonal(){
            wx.navigateTo({url:'../userinfo/main'});
        }
    }
}
</script>
<style>
.box{
    display:flex;
    flex-direction: row;
    justify-content: space-around;
    width: 750rpx;
    height: 120rpx; 
    position:fixed;
    bottom: 100rpx;
    background-color:white;
    border-top: 2rpx solid silver;
    padding-top:30rpx;
}
.homeImg,.forumImg, .personalImg{
    width: 70rpx;
    height: 70rpx;
}
.homeBox, .forumBox, .personalBox{
    display: flex;
    flex-direction: column;
    width: 100rpx;
    height: 120rpx;
}
</style>


