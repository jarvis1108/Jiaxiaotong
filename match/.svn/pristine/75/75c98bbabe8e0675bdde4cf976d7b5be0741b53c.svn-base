/**
 * 请求对象
 * @param data
 * @constructor
 */
import store from '../store';

export function RequestObj(data) {
  this.reqId = getuuid();
  this.reqType = data.reqType;
  this.reqUserInfo = {
    userId: store.state.userId,
    token: store.state.token
  };
  console.log('鉴权信息是：' + this.reqUserInfo.token + "," + this.reqUserInfo.userId);
  this.reqParam = data.reqParam;
  this.reqRefData = data.reqRefData;
  this.reqPageInfo = {
    pageSize: data.pageSize,
    curPage: data.curPage
  };
}

/**
 * 用于生成uuid
 */
function randomNum4() {
  return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
}
export function getuuid() {
  return (randomNum4() + randomNum4() + '-' + randomNum4() + '-' + randomNum4() + '-' + randomNum4() + '-' + randomNum4() + randomNum4() + randomNum4())
}

export default { RequestObj, getuuid }
