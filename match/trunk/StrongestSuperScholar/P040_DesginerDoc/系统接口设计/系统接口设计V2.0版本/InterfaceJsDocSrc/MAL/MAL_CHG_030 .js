/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_兑换记录部分
 *              <br/> //  * 创建标志：梅宇 2018年07月11日创建
 *              <br/> //  * 修改标志：韩晓峰 2018年09月03日修改
 *              <br/> //  * 标志编号：01 梅宇 2018年07月11日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：兑换记录部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）GetExchangeList：获取用户兑换记录
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 梅宇
 * @copyright 暂无
 */

/**
 * @class
 * @summary 兑换记录接口定义
 * @memberOf MAL
 * @description                              
 */
function MAL_CHG_030() {

    /**
     * @summary 实现功能：获取用户兑换记录
     * @description **GET** /api/v1/mall/orderRecord/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MAL_CHG_030_GetExchangeRecordList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户ID
	 * @param {number} objParam.reqParam.purchaseWay                   要传入的参数.请求的业务参数.购买方式      0表示人民币，1表示金币
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码    从1开始
     *
     * @param {object} objResult                                                            返回结果
     * @param {string} objResult.resId                                                      返回结果.响应ID
     * @param {string} objResult.reqId                                                      返回结果.请求的ID
     * @param {string} objResult.reqType                                                    返回结果.请求类型
     * @param {Object} objResult.resResult                                                  返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                          返回结果.响应返回的业务数据.当前业务结果 default: {}
	 * @param {array} objResult.resResult.curData.orderRecordList                           返回结果.响应返回的业务数据.当前业务结果.兑换记录列表
     * @param {object} objResult.resResult.curData.orderRecordList【i】                      返回结果.响应返回的业务数据.当前业务结果.兑换记录列表.第i条记录
     * @param {string} objResult.resResult.curData.orderRecordList【i】.orderRecordId        返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.订单记录Id
     * @param {string} objResult.resResult.curData.orderRecordList【i】.orderRecordNo        返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.订单记录编号
     * @param {string} objResult.resResult.curData.orderRecordList【i】.userId               返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.用户Id
     * @param {number} objResult.resResult.curData.orderRecordList【i】.purchaseWay          返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.购买方式   0表示人民币，1表示金币
	 * @param {string} objResult.resResult.curData.orderRecordList【i】.productId            返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.商品id
	 * @param {string} objResult.resResult.curData.orderRecordList【i】.productNo            返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.商品编码
	 * @param {string} objResult.resResult.curData.orderRecordList【i】.productName          返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.商品名称
     * @param {string} objResult.resResult.curData.orderRecordList【i】.productImage         返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.商品图片
	 * @param {number} objResult.resResult.curData.orderRecordList【i】.productPrice         返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.商品单价
	 * @param {number} objResult.resResult.curData.orderRecordList【i】.sumPrice             返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.订单商品总价
	 * @param {number} objResult.resResult.curData.orderRecordList【i】.actualSumPrice       返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.订单实际支付价格
	 * @param {number} objResult.resResult.curData.arrDataList【i】.createTime               返回结果.响应返回的业务数据.当前业务结果.兑换记录列表【i】.订单创建时间
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                        返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetExchangeRecordList(objParam) {
        var objResult = {};
        return objResult;
    }
}