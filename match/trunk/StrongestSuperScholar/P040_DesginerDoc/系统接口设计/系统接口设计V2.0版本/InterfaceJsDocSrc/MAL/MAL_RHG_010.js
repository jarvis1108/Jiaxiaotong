/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_金币充值部分
 *              <br/> //  * 创建标志：梅宇 2018年07月11日创建
 *              <br/> //  * 修改标志：韩晓峰 2018年09月02日修改
 *              <br/> //  * 标志编号：01 梅宇 2018年07月11日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：金币充值部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）RechargeCoin：充值金币
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 梅宇
 * @copyright 暂无
 */

/**
 * @class
 * @summary 金币充值用例中接口定义
 * @memberOf MAL   
 * @description              
 */
function MAL_RNG_010() {

    /**
     * @summary 实现功能：用户充值金币，金币数额不同价格不同，1000金币1元，3000金币3元，5000金币5元
     * @description **POST** /api/v1/mall/productInfo/recharge
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MAL_RNG_010_RechargeCoin
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户ID
	 * @param {string} objParam.reqParam.productId                     要传入的参数.请求的业务参数.商品信息id
	 * @param {number} objParam.reqParam.amount                        要传入的参数.请求的业务参数.数量
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {number} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {number} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                          返回结果
     * @param {string} objResult.resId                                    返回结果.响应ID
     * @param {string} objResult.reqId                                    返回结果.请求的ID
     * @param {string} objResult.reqType                                  返回结果.请求类型
     * @param {Object} objResult.resResult                                返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                        返回结果.响应返回的业务数据.当前业务结果 default:{}
     * @param {string} objResult.resResult.curData.timeStamp              返回结果.响应返回的业务数据.当前业务结果.时间戳    从1970年1月1日00:00:00至今的秒数,即当前的时间
     * @param {string} objResult.resResult.curData.nonceStr               返回结果.响应返回的业务数据.当前业务结果.随机字符串
     * @param {string} objResult.resResult.curData.package                返回结果.响应返回的业务数据.当前业务结果.统一下单接口返回的 prepay_id 参数值       格式为：prepay_id=***
     * @param {string} objResult.resResult.curData.paySign                返回结果.响应返回的业务数据.当前业务结果.签名
     * @param {string} objResult.resResult.curData.signType               返回结果.响应返回的业务数据.当前业务结果.签名算法  总是为MD5
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.messgae                        返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function RechargeCoin(objParam) {
        var objResult = {};
        return objResult;
    }
}