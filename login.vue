<template>
<div>
  <div class="login">
    <div class="top">
       <img src="/static/tabs/home.png" class="go-back" @click="back()"/>
       <span>初次登录</span>   
    </div>
    <div class="photo">
       <img src="/static/images/user.png" class="img-user"/>
    </div>
    <div class="choose-school">
       <span>请选择驾校:</br></span>
       <radio-group class="radio-group" @change="radioChange">
           <label class="radio" v-for="(item, index) in items" :key="item.name">
               <radio :value="item.name" :checked="item.checked"/> {{item.value}}
           </label>
       </radio-group>   
    </div>
    <div class="schoolNum">
       <span>请填写驾校验证码:</br></span>
       <input type="text" class="input" v-model="word" placeholder="例：CM77" @focus="focusinput(e)"></input>
    </div>
    <button v-on:click="click">确定</button>
  </div>
</div>
</template>



<script>
export default {
  data () {
    return {
      items: [
        {name: '1', value: '驾校一', checked: 'true'},
        {name: '2', value: '驾校二'},
        {name: '3', value: '驾校三'}
      ]
    }
  },
  methods: {
    radioChange (e) {
      console.log('radio发生change事件，携带value值为：', e.target.value)
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

  }

  .go-back{

    width: 10%;

    height: 2.2em;

  }  

  .top span {

    height: 2.2em;

    position: relative;

    left:28%;

    bottom:13%;

    font-size:25px;  

  }

  .photo {

    width: 15%;

    height: 8.4em;

    display: table-cell;

    vertical-align: middle;

    text-align: center;

  }



  .img-user {

    width: 3.4em;

    height: 3.4em;

  }

  

  .choose-school {

    width: 90%;

    margin: 0 auto;

  }



  .choose-school span {

    font-size: 19px;

    margin-bottom: 10px;

  }



  .radio-group {

    margin-left: 3px;

    text-align: center;

    font-size: 17px;

    display: inline-block;

    margin-bottom: 10px;

  }



  .schoolNum {

    width: 90%;

    margin: 0 auto;

  }



  .schoolNum span {

    font-size: 19px;

    margin-bottom: 10px;

  }

  .input {

    margin-bottom: 10px;

  }



  button {

    width:100%;

    height: 54px;

    background-color:#7CCD7C;

  }

</style>