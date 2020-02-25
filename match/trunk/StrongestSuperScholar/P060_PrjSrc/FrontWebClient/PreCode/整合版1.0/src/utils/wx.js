import store from '../store';
export const request = obj => new Promise((resolve, reject) => {
  wx.request({
    url: obj.url,
    data: obj.data,
    header: { 'content-type': 'application/x-www-form-urlencoded', ...obj.header },
    method: obj.method,
    success(res) {
      resolve(res.data)
    },
    fail(e) {
      console.log(e);
      reject(e)
    }
  })
});
//微信支付接口
export const requestPayment = obj => new Promise((resolve, reject) => {
  wx.requestPayment({
    timeStamp: obj.timeStamp,
    nonceStr: obj.nonceStr,
    package: obj.package,
    signType: obj.signType,
    paySign: obj.paySign,
    success(res) {
      console.log('suc');
      resolve(res);
      wx.navigateBack({
        delta: 1, // 回退前 delta(默认为1) 页面
        success: function (res) {
          wx.showToast({
            title: '支付成功',
            icon: 'success',
            duration: 2000
          })
        },
      })
    },
    fail(e) {
      console.log('fail');
      console.log(e);
      reject(e);
      console.log("支付失败");
          showToast({
            title: '支付失败',
            icon: 'none',
            duration: 2000,
          })
    },
    complete: function () {
      console.log("支付完成")
      store.dispatch("getUserIn");
      console.log(store.state.userInfo)
      console.log("再次获取了用户信息");
    }
  })
});

//创建微信音频控制组件
export const createInnerAudioContext = () => {
  return wx.createInnerAudioContext();
}

//获取全局唯一的背景音频管理器
export const getBackgroundAudioManager = () => {
  return wx.getBackgroundAudioManager();
}

export const getUserInfo = obj => new Promise((resolve, reject) => {
  wx.getUserInfo({
    ...obj,
    success(res) {
      resolve(res);
    },
    fail(e) {
      console.log(e);
      reject(e);
    }
  })
});

export const login = () => new Promise((resolve, reject) => {
  wx.login({
    success(res) {
      resolve(res);
    },
    fail(e) {
      console.log(e);
      reject(e);
    }
  })
});

export const getStorage = theKey => new Promise((resolve, reject) => {
  wx.getStorage({
    key: theKey,
    success(res) {
      resolve(res.data);
    },
    fail(e) {
      reject(e);
    }
  })
});

export const setStorage = (theKey, theValue) => new Promise((resolve, reject) => {
  wx.setStorage({
    key: theKey,
    data: theValue,
    success(res) {
      resolve(res.data);
    },
    fail(e) {
      reject(e);
    }
  })
});

export const removeStorage = theKey => new Promise((resolve, reject) => {
  wx.removeStorage({
    key: theKey,
    success(res) {
      resolve(res.data);
    },
    fail(e) {
      reject(e);
    }
  })
});

export const showModal = obj => new Promise((resolve, reject) => {
  wx.showModal({
    title: obj.title,
    content: obj.content,
    duration: obj.duration,
    success(res) {
      resolve(res);
    },
    fail(e) {
      reject(e);
    }
  })
});

export const showToast = obj => new Promise((resolve, reject) => {
  wx.showToast({
    title: obj.title,
    icon: obj.icon,
    duration: obj.duration,
    success(res) {
      resolve(res);
    },
    fail(e) {
      reject(e);
    }
  })
});

export const navigateTo = url => {
  const InnerAudioContext = wx.createInnerAudioContext();
  InnerAudioContext.src = "/static/musics/button_music.wav";
  InnerAudioContext.volume = 1.0;
  InnerAudioContext.autoplay = store.state.soundEffect;
  wx.navigateTo({
    url
  })
};

export const redirectTo = url => {
  wx.redirectTo({
    url
  })
};

export const switchTab = url => {
  wx.switchTab({
    url
  })
};

export const showShareMenu = bool => {
  wx.showShareMenu({
    withShareTicket: bool
  })
};

export const navigateBack = obj => {
  wx.navigateBack(
    ...obj
  )
};

export const showTip = (msg) => {
  wx.showToast({
    title: msg,
    icon: 'none',
    duration: 2000
  })
};

export const showSuccess = (msg) => {
  wx.showToast({
    title: msg,
    icon: 'success'
  })
};

export const showLoading = (title, duration = 1000) => {
  wx.showToast({
    title: title,
    mask: true,
    icon: 'loading',
    duration: duration
  })
}

export const hideToast = () => {
  wx.hideToast();
}

export const getStorageSync = theKey => {
  return wx.getStorageSync(theKey);
};

export default {
  request,
  getUserInfo,
  getStorage,
  setStorage,
  createInnerAudioContext,
  getBackgroundAudioManager,
  requestPayment,
  removeStorage,
  login,
  navigateTo,
  redirectTo,
  showShareMenu,
  navigateBack,
  showSuccess,
  showLoading,
  hideToast,
  showTip,
  showModal,
  showToast
}

