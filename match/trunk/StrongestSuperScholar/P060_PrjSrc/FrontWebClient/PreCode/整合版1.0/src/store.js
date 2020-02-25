import Vue from 'vue'
import Vuex from 'vuex'
import { api, testApi } from './config'
import { request, getUserInfo, login, createInnerAudioContext, getBackgroundAudioManager, navigateBack, showTip, requestPayment } from "./utils/wx";
import { RequestObj } from "./utils/RequestObj"


Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    userInfo: {},     //用户信息
    userId: "",       //用户ID，主要用于鉴权
    token: "",        //用户token，主要用于鉴权
    userGradeId: "",        //用户所选年级，[保存在全局是考虑到页面间参数传递需要]
    userGradePhaseId: "",   //用户所选年级，[保存在全局是考虑到页面间参数传递需要]
    soundEffect: false,  //音效
    music: false,        //音乐
  },
  actions: {
    /**
         * 支付请求，包括统一下单和支付请求
         * @param commit 
         * @param productId
         * @returns {Promise<void>}
         */
    async pay({ commit, state }, productId) {
      console.log("进入支付接口")
      //拿到后台统一支付结果
      const PreRes = await request({
        //url: `${api}/recharge `,
        url: `${testApi}/mall/productInfo/recharge`,
        //header: {'content-type': 'application/x-www-form-urlencoded', ...obj.header},
        header: { 'content-type': 'application/JSON' },
        method: 'POST',
        data: new RequestObj({
          reqType: 'MAL_RNG_020_RechargeLearingPoint',
          reqParam: {
            //openid: state.userInfo.openid,
            userId: state.userId,
            productId: productId,
            amount: 1
          }
        })
      });
      console.log(PreRes);
      if (!PreRes.resResult.isSuccess) {
        await showToast({
          title: '支付请求失败',
          icon: 'success',
          duration: 2000
        });
        return;
      }
      console.log("后台支付完毕");
      //进行微信支付请求
      const PayRequestObj = await requestPayment({
        timeStamp: PreRes.resResult.curData.timeStamp,
        nonceStr: PreRes.resResult.curData.nonceStr,
        package: PreRes.resResult.curData.package,
        signType: PreRes.resResult.curData.signType,
        paySign: PreRes.resResult.curData.paySign,
      });
      
    },
    
  

    /**
     * 金币购买学点请求
     * @param commit 
     * @param productId
     * @returns {Promise<void>}
     */
    async exchangeGold({ commit, state }, { productId, amount }) {
      console.log("拿到的数据是：" + productId + amount);
      const res = await request({
        url: `${testApi}/mall/productInfo/exchange`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'MAL_CHG_010_ChangeLearningPoint',
          reqParam: {
            userId: state.userId,
            productId: productId,
            amount: amount
          }
        })
      });
      if (res.resResult.isSuccess) {
        state.userInfo.coin = res.resResult.curData.user.coin;
        state.userInfo.learningPoint = res.resResult.curData.user.learningPoint;
      }
      return res.resResult.isSuccess;
    },

    /** 
     * 开启背景音乐
     * @param commit
     * @param src
     * @returns {errorCode}
     */
    async startBackgroundMusic({ commit }, src) {
      console.log('111');
      const backgroundAudioManager = getBackgroundAudioManager();
      backgroundAudioManager.title = 'mus_001.wav';//必填
      backgroundAudioManager.src = src;
      //src='http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
    },

    /** 
     * 暂停背景音乐
     * @param commit
     * @param src
     * @returns {errorCode}
     */
    async pauseBackgroundMusic({ commit }) {
      console.log('222');
      const backgroundAudioManager = getBackgroundAudioManager();
      backgroundAudioManager.pause();
    },

    /** 
     * 停止背景音乐
     * @param commit
     * @param src
     * @returns {errorCode}
     */
    async stopBackgroundMusic({ commit }) {
      const backgroundAudioManager = getBackgroundAudioManager();
      backgroundAudioManager.stop();
    },

    /** 
     * 调用按钮声音
     * @param commit
     * @param src
     */
    async startInnerAudioContext({ commit }) {
      console.log('1111');
      const InnerAudioContext = createInnerAudioContext();
      console.log(InnerAudioContext);
      InnerAudioContext.src = "/static/musics/button_music.wav";
      //InnerAudioContext.src  = "/static/musics/BackgroundMusic_001.mp3";
      InnerAudioContext.volume = 1.0;
      console.log(InnerAudioContext.src);
      //InnerAudioContext.loop = true ;
      console.log(InnerAudioContext.duration);
      InnerAudioContext.play();
    },

    /** 
     * 关闭按钮声音
     * @param commit
     * @param src
     */
    async stopInnerAudioContext({ commit }) {
      const InnerAudioContext = createInnerAudioContext();
      InnerAudioContext.volume = 0;
    },

    /**
     * 获取年级类型列表
     * @param {*} param0 
     */
    async gradePhaseInfoList({ commit }) {
      let gradePhaseInfoList = [];
      //拿到类型列表
      const gradePhaseRes = await request({
        url: `${testApi}/base/gradePhaseInfo/list`,
        data: new RequestObj({
          reqType: 'INX_VWE_000_GetGradePhaseList',
          reqParam: {}
        })
      });
      //扩充类型列表，遍历并获取到每个类型对应的年级列表
      gradePhaseInfoList = gradePhaseRes.resResult.curData.gradePhaseInfoList;
      for (let i = 0; i < gradePhaseInfoList.length; ++i) {
        gradePhaseInfoList[i]['select'] = false;
        const gradeRes = await request({
          url: `${testApi}/base/gradeInfo/list/${gradePhaseInfoList[i].gradePhaseId}`,
          reqType: 'INX_VWE_000_GetGradeByGradePhaseId',
          reqParam: {}
        });
        gradePhaseInfoList[i]['gradeList'] = gradeRes.resResult.curData.gradeInfoList;
      }
      return gradePhaseInfoList;
    },

    /**
     * 获取登陆信息并保存在store中[首次登录,需提交用户信息至后台]
     * @param {*} param0 
     */
    async firstLogin({ commit, state }, { data }) {
      //拿到用户微信信息传递给后台创建用户
      const logResult = await login();
      const infoResult = await getUserInfo({
        withCredentials: true
      });
      console.log("iv:"+infoResult.iv);
      const res = await request({
        url: `${testApi}/sys/user`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'INX_VWE_000_CreateNewUser',
          reqParam: {
            code: logResult.code,
            nickName: infoResult.userInfo.nickName,
            avatarUrl: infoResult.userInfo.avatarUrl,
            gender: infoResult.userInfo.gender,
            city: infoResult.userInfo.city,
            gradePhaseId: data.gradePhaseId,
            gradeId: data.gradeId,
            encryptedData: infoResult.encryptedData,
            iv: infoResult.iv
          }
        })
      });
      // 将用户信息保存在全局
      state.userId = res.resResult.curData.user.userId;
      state.token = res.resResult.curData.token;
      console.log('拿到的token是：' + state.token);
      state.userInfo = res.resResult.curData.user;
    },

    /**
     * 返回主页时重新获取用户信息
     * 
     * @param {*} param0 
     */
    async getUserIn({ commit, state }) {
      const res = await request({
        url: `${testApi}/sys/user/`+ state.userId,
        method: 'GET',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_PER_010_GetUserInfoById',
          reqParam: {}
        })
      });
      // 将用户信息保存在全局
      state.userId = res.resResult.curData.user.userId;
      state.token = res.resResult.curData.token;
      console.log('拿到的token是：' + state.token);
      state.userInfo = res.resResult.curData.user;
    },

    /**
     * 获取登陆信息并保存在store中[非首次登陆，直接请求用户信息]
     * @param commit
     * @returns {Promise<void>}
     */
    async login({ commit, state }) {
      const logResult = await login();
      console.log(logResult.code);
      const res = await request({
        url: `${testApi}/sys/user/code`,
        data: new RequestObj({
          reqType: 'SYS_PRE_000_login',
          reqParam: { code: logResult.code }
        })
      });
      if (res.resResult.isSuccess) {
        state.userId = res.resResult.curData.user.userId;
        state.token = res.resResult.curData.token;
        console.log('拿到的token是：' + state.token);
        state.userInfo = res.resResult.curData.user;
      }
      console.log('拿到的token是：' + state.token);
      return res.resResult.isSuccess;
    },

    /**
     * 获取好友对战/群pk战局信息
     * @param {*} param0 
     * @param {*} param1 
     */
    async createBattle({ commit, state }, { battleType }) {
      const res = await request({
        url: `${testApi}/match/pk`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_MAT_001_createBattle',
          reqParam: {
            userId: state.userId,
            matchType: battleType
          }
        })
      });
      console.log("创建的战局信息是:" + JSON.stringify(res.resResult.curData.match));
      return res.resResult.curData.match.matchRecordId;
    },

    /**
     * 获取知识练兵场页面课程年级列表
     * @param {*} param0 
     */
    async getExerciseGradetList({ commit }) {
      const res = await request({
        url: `${testApi}/base/gradeInfo/list`,
        data: new RequestObj({
          reqType: 'MTH_EXC_010_GetGradeList',
          reqParam: {}
        })
      });
      return res.resResult.curData.gradeInfoList;
    },

    /**
     * 获取知识练兵场学科列表
     * @param {*} gradePhaseId 年级阶段id
     * * @param {*} gradeId 年级id
     */
    async getExercisesubjecttList({ commit }, { gradePhaseId, gradeId }) {
      const res = await request({
        url: `${testApi}/base/subject/list`,
        data: new RequestObj({
          reqType: 'MTH_EXC_010_GetGradeList',
          reqParam: {
            gradePhaseId: gradePhaseId,
            gradeId: gradeId
          }
        })
      });
      return res.resResult.curData.subjectList;
    },

    /**
     * 获取知识练兵场问题列表
     * @param commit
     * @param subjectId 学科id
     * @returns {Promise<*>}
     */
    async getExerciseMatchInfo({ commit }, { userId, subjectId }) {
      console.log('store' + userId + " " + subjectId);
      const res = await request({
        url: `${testApi}/match/exercise`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'MTH_EXC_010_Exercise',
          reqParam: {
            userId: userId,
            subjectId: subjectId
          }
        }),
      });
      console.log(JSON.stringify(res));
      return res.resResult.curData;
    },

    /**
    *  知识练兵场每答完一道题发起请求，存储用户学点消耗记录
    * @param commit
    * @param amount 消耗学点数
    * @param isTrue 是否答对，答对1，答错0
    * @returns {Promise<*>}
    */
    async SaveLpConsumeRecord({ commit }, { matchId, userId, questionIndex, userAnswer, amount, isTrue }) {

      const res = await request({
        url: `${testApi}/match/exercise/save`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'MTH_EXC_010_Exercise',
          reqParam: {
            matchId: matchId,
            userId: userId,
            questionIndex: questionIndex,
            userAnswer: userAnswer,
            amount: amount,
            isTrue: isTrue
          }
        }),
      });
    },

    // /**
    // *  【与saveBattleResult接口重复-已弃用】每一次练习结束后把学点等信息返回，更改用户信息
    // * @param commit
    // * @param coin 金币数，没有传0
    // * @param gradePoint 消耗学点，传负值
    // * @param isWin 知识练兵场统一传-1
    // * @returns {Promise<*>}
    // */
    // async SaveExerciseResult({ commit, state }, { matchId, userId, coin, gradePoint, learningPoint, experience, isWin }) {
    //   const res = await request({
    //     url: `${testApi}/match/save`,
    //     method: 'POST',
    //     header: { 'content-type': 'application/json' },
    //     data: new RequestObj({
    //       reqType: 'COM_MTH_RSL_FinishMatch',
    //       reqParam: {
    //         matchId: matchId,
    //         userId: userId,
    //         coin: coin,
    //         learningPoint: learningPoint,
    //         gradePoint: gradePoint,
    //         experience: experience,
    //         isWin: isWin
    //       }
    //     }),
    //   });
    //   state.userInfo = res.resResult.curData.user;
    // },

    /**
     * 获取兑换页面的商品列表
     */
    async getProductList({ commit }, paymentType) {
      const res = await request({
        url: `${testApi}/mall/productInfo/list`,
        data: new RequestObj({
          reqType: 'SYS_PRE_000_GetProductList',
          reqParam: { paymentType: paymentType }
        })
      });
      return res.resResult.curData.productList;
    },

    /**
     * 【测试-未弃用】获取我的物品页面的物品列表
     * @param {*} param0 
     */
    async getProductListOfMine({ commit }) {
      const res = await request({
        url: `${api}/myItems`,
        data: new RequestObj({
          reqType: 'MAL_000_getProductListOfMine'
        })
      });
      return res.productList.resResult.curData.data;
    },

    /**
    * 用户兑换奖学金
    * @param {*} param0 
    */
    async exchangeScholarship({ commit }, scholarshipID) {
      const res = await request({
        url: `${testApi}/mall/scholarship/exchange`,
        method: 'POST',
        header: { 'content-type': 'application/JSON' },
        data: new RequestObj({
          reqType: 'MAL_SLS_020_ExchangeScholarship',
          reqParam: {
            scholarshipId: scholarshipID,
          }
        })
      });
      if (res.resResult.isSuccess) {
        showTip('兑换成功');
      } else showTip('兑换失败');

    },

    /**
     * 获取奖学金页面的物品列表
     * @param {*} param0 
     */
    async getProductListOfScholarship({ commit }) {
      const res = await request({
        url: `${testApi}/mall/scholarship/list`,
        data: new RequestObj({
          reqType: 'MAL_SLS_010_GetScholarshioList'
        })
      });
      return res.resResult.curData.scholarshipList;
    },

    /**
     * 获取排行榜界面排行列表
     * @param {*} param0 
     */
    async getRankList({ commit, state }) {
      const res = await request({
        url: `${testApi}/sys/rank/getWorldRank`,
        data: new RequestObj({
          reqType: 'SYS_RAN_010_getRankList',
          reqParam: { userId: state.userId }
        })
      });
      return res.resResult.curData;
    },

    /**
     * 获取用户的充值记录
     * @param {*} param0 
     */
    async getTopupRecords({ commit, state }) {
      const res = await request({
        url: `${testApi}/mall/orderRecord/list`,
        method: 'GET',
        data: new RequestObj({
          reqType: 'MAL_CHG_030_GetRechangeRecordList',
          reqParam: { userId: state.userId, purchaseWay: 0 }
        })
      });
      return res.resResult.curData.orderRecordList;
    },

    /**
     * 获取用户的兑换记录
     * @param {*} param0 
     */
    async getExchangeRecordList({ commit, state }) {
      const res = await request({
        url: `${testApi}/mall/orderRecord/list`,
        data: new RequestObj({
          reqType: 'MAL_CHG_030_GetExchangeRecordList',
          reqParam: {
            userId: state.userId,
            purchaseWay: 1
          },
          reqPageInfo: {
            pageSize: 1,
            curPage: 1
          }
        })
      });
      console.log('拿到的兑换记录是：' + JSON.stringify(res.resResult.curData.orderRecordList));
      return res.resResult.curData.orderRecordList;
    },

    /**
     * 【测试-未弃用】获取用户训练营信息
     * @param {*} param0 
     */
    async getMyCampInfo({ commit }) {
      const res = await request({
        url: `${api}/myCamp`,
        data: new RequestObj({
          reqType: 'SYS_PRE_000_getMyCampInfo',
          reqParam: {}
        })
      });
      return res.campInfo.resResult.curData.data;
    },

    /**
     * 保存对战结果信息
     * @param {*} param0 
     * @param {*} param1 
     */
    async saveBattleResult({ commit, state }, { matchId, userId, coin, gradePoint, learningPoint, experience, isWin }) {
      const res = await request({
        url: `${testApi}/match/save`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_PRE_000_saveBattleResult',
          reqParam: {
            matchId: matchId,
            userId: userId,
            coin: coin,
            learningPoint: learningPoint,
            gradePoint: gradePoint,
            experience: experience,
            isWin: isWin
          }
        })
      });
      console.log('更新后的用户信息是：' + JSON, stringify(res));
      state.userInfo = res.resResult.curData.user;
    },

		/**
		 * 获取错题列表
		 * @param {*} param0
		 * @param {*} count 页面大小
		 * @param {*} page  页码
		 * 该接口已测试完成  --李沛昊
		 */
    async getQuestionList({ commit, state }, { count, page }) {
      console.log('页码信息是：大小-' + count + ',当前页-' + page);
      const res = await request({
        url: `${testApi}/qst/errorQuestion/list`,
        data: new RequestObj({
          reqType: 'SYS_PER_080_GetErrorQuestionList',
          reqParam: {
            userId: state.userId
          },
          pageInfo: {
            pageSize: count,
            curPage: page
          }
        })
      });
      return res.resResult.curData.errorMultipleQuestionList;
    },

		/**
		 * 收藏题目到题目收藏
		 * @param {*} param0
		 * @param {*} questionID 想添加到收藏的题目的id
		 * 该接口已测试完成  --李沛昊
		 */
    async collectQuestion({ commit, state }, questionID) {
      const res = await request({
        url: `${testApi}/qst/questionCollection`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_PER_080_CollectQuestion',
          reqParam: {
            userId: state.userId,
            questionId: questionID
          }
        })
      });
      return res;
    },

    /**
     * 获取题目收藏
     * @param {*} param0
     * @param {*} count 页面大小
		 * @param {*} page  页码
		 * 该接口已测试完成  --李沛昊
     */
    async getCollectList({ commit, state }, { count, page }) {
      console.log('页码信息是：大小-' + count + ',当前页-' + page);
      const res = await request({
        url: `${testApi}/qst/questionCollection/list`,
        data: new RequestObj({
          reqType: 'SYS_PER_080_GetCollectionsList',
          reqParam: {
            userId: state.userId//'2893bc2d-74f6-4e5f-9f20-6c01e7e54aad'
          },
          pageInfo: {
            pageSize: count,
            curPage: page
          }
        })
      });
      return res.resResult.curData.questionList;
    },

    /**
     *  取消收藏
     * @param {*} param0
     * @param {*} questionCollectionID 取消收藏的题目的id
     * 该接口已测试完成  --李沛昊
     */
    async cancelCollection({ commit, state }, questionCollectionID) {
      const res = await request({
        url: `${testApi}/qst/questionCollection/cancel`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_PER_080_CancelCollection',
          reqParam: {
            questionCollectionId: questionCollectionID
          }
        })
      });
      return res;
    },

    /**
     * 提交用户意见反馈
     * @param {*} param0 
     * @param {*} param1 
     */
    async CreateFeedback({ commit }, { userId, content }) {
      const res = await request({
        url: `${testApi}/sys/feedback`,
        method: 'POST',
        header: { 'content-type': 'application/json' },
        data: new RequestObj({
          reqType: 'SYS_FBK_010_SYS_FBK_010',
          reqParam: {
            userId: userId,
            content: content
          }
        })
      });
      if (res.resResult.isSuccess) showTip('提交成功');
    },
  }
})
