import Vue from 'vue'
import App from './App'
import '../static/weui/weui.css'

Vue.config.productionTip = false
App.mpType = 'app'

const app = new Vue(App)
app.$mount()

export default{
    config:{
      "pages":[  
      "pages/home/main",
      "pages/forumHome/main",
      "pages/validate/main",
      "pages/schoolValidate/main",
      "pages/userinfo/main",    
      "pages/chooseTime/main",
      "pages/changeTime/main",
      "pages/index/main",
      "pages/logs/main",
      "pages/counter/main",
      "pages/share/main"
    ],
    "window": {
      "backgroundTextStyle": "light",
      "navigationBarBackgroundColor": "#fff",
      "navigationBarTitleText": "驾校通",
      "navigationBarTextStyle": "black"
    }
    }
}
