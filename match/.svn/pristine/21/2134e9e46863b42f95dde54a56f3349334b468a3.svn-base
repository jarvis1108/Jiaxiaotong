/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_订单后台管理
 *              <br/> //  * 创建标志：杨欢 2018年10月20日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：订单管理部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
  *              <br/> //  *             （a）BackOrderRecordVOUpOrDown：快捷按钮实现订单是否有效
 *              <br/> //  *              （b）BackOrderRecordVOSearch：订单查询
 *              <br/> //  *              （c）BackOrderRecordVOModify：订单信息 修改
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 杨欢
 * @copyright 暂无
 */

/**
 * @class
 * @summary 订单后台管理接口定义
 * @memberOf BAM
 * @description                              
 */
function BAM_ORD_010() {

    /**
     * @summary 实现功能：快捷按钮实现订单是否有效
     * @description **POST** /api/v1/bam/order/isValid/{BackOrderRecordVOId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_ORD_010_BackOrderRecordVOUpOrDown
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {number} objParam.reqParam.BackOrderRecordVOId                 要传入的参数.请求的业务参数.订单Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息 default: {}
	 * @param {object} objParam.reqPageInfo.pageSize                   要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                    要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                        返回结果
     * @param {string} objResult.resId                                                  返回结果.响应ID
     * @param {string} objResult.reqId                                                  返回结果.请求的ID
     * @param {string} objResult.reqType                                                返回结果.请求类型
     * @param {Object} objResult.resResult                                              返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                      返回结果.响应返回的业务数据.当前业务结果 default: {}
	 * @param {array} objResult.resResult.curData.BackOrderRecordVOList                       返回结果.响应返回的业务数据.当前业务结果.订单列表
     * @param {object} objResult.resResult.curData.BackOrderRecordVOList【i】                 返回结果.响应返回的业务数据.当前业务结果.订单列表.第i条记录
	 * @param {number} objResult.resResult.curData.BackOrderRecordVOList【i】.isValid         返回结果.响应返回的业务数据.当前业务结果.订单列表【i】.是否有效 1.有效 0.无效
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function BackOrderRecordVOUpOrDown(objParam) {
        var objResult = {};
        return objResult;
    }
	
    /**
     * @summary 实现功能：根据查询条件获取订单列表  
     * @description **GET** /api/v1/bam/order/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_ORD_010_BackOrderRecordVOSearch
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {string} objParam.reqParam.BackOrderRecordVOID                 要传入的参数.请求的业务参数.订单号
	 * @param {number} objParam.reqParam.wechatName                    要传入的参数.请求的业务参数.微信昵称
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                   要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                    要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                          返回结果
     * @param {string} objResult.resId                                                    返回结果.响应ID
     * @param {string} objResult.reqId                                                    返回结果.请求的ID
     * @param {string} objResult.reqType                                                  返回结果.请求类型
     * @param {Object} objResult.resResult                                                返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                        返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.BackOrderRecordVO                      返回结果.响应返回的业务数据.当前业务结果.订单信息
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.orderRecordID        返回结果.响应返回的业务数据.当前业务结果.订单信息.订单Id
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.productName          返回结果.响应返回的业务数据.当前业务结果.订单信息.商品名称
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.productAmount        返回结果.响应返回的业务数据.当前业务结果.订单信息.商品数量
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.productPrice         返回结果.响应返回的业务数据.当前业务结果.订单信息.商品价格
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.sumPrice             返回结果.响应返回的业务数据.当前业务结果.订单信息.商品总价
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.actualSumPrice       返回结果.响应返回的业务数据.当前业务结果.订单信息.商品实际总价
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.purchaseWay          返回结果.响应返回的业务数据.当前业务结果.订单信息.支付类型   0：人民币；1：金币
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.wechatName           返回结果.响应返回的业务数据.当前业务结果.订单信息.微信昵称
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.userId               返回结果.响应返回的业务数据.当前业务结果.订单信息.用户ID
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.createTime           返回结果.响应返回的业务数据.当前业务结果.订单信息.订单创建时间
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.isValid              返回结果.响应返回的业务数据.当前业务结果.订单信息.订单是否有效   0：无效；1：有效
	 * @param {object} objResult.resResult.curData.BackOrderRecordVO.status               返回结果.响应返回的业务数据.当前业务结果.订单信息.订单状态
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function OrderRecordSearch(objParam) {
        var objResult = {};
        return objResult;
    }
	
	/**
     * @summary 实现功能：更改订单信息
     * @description **POST** /api/v1/bam/order/update/{orderRecordId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_PRO_010_BackOrderRecordVOModify
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数

     * @param {string} objParam.reqParam.productAmount                 要传入的参数.请求的业务参数.商品数量 
     * @param {number} objParam.reqParam.purchaseWay                   要传入的参数.请求的业务参数.支付类型    0：人民币；1：金币
     * @param {string} objParam.reqParam.orderStatus                   要传入的参数.请求的业务参数.订单状态
     * @param {string} objParam.reqParam.paymentStatus                 要传入的参数.请求的业务参数.支付状态
     * 
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                   要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                    要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                          返回结果
     * @param {string} objResult.resId                                                    返回结果.响应ID
     * @param {string} objResult.reqId                                                    返回结果.请求的ID
     * @param {string} objResult.reqType                                                  返回结果.请求类型
     * @param {Object} objResult.resResult                                                返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                        返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.BackOrderRecordVO                      返回结果.响应返回的业务数据.当前业务结果.订单信息
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.orderRecordID        返回结果.响应返回的业务数据.当前业务结果.订单信息.订单Id
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.productName          返回结果.响应返回的业务数据.当前业务结果.订单信息.商品名称
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.productAmount        返回结果.响应返回的业务数据.当前业务结果.订单信息.商品数量
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.productPrice         返回结果.响应返回的业务数据.当前业务结果.订单信息.商品价格
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.sumPrice             返回结果.响应返回的业务数据.当前业务结果.订单信息.商品总价
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.actualSumPrice       返回结果.响应返回的业务数据.当前业务结果.订单信息.商品实际总价
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.purchaseWay          返回结果.响应返回的业务数据.当前业务结果.订单信息.支付类型   0：人民币；1：金币
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.wechatName           返回结果.响应返回的业务数据.当前业务结果.订单信息.微信昵称
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.userId               返回结果.响应返回的业务数据.当前业务结果.订单信息.用户ID
     * @param {string} objResult.resResult.curData.BackOrderRecordVO.createTime           返回结果.响应返回的业务数据.当前业务结果.订单信息.订单创建时间
     * @param {number} objResult.resResult.curData.BackOrderRecordVO.isValid              返回结果.响应返回的业务数据.当前业务结果.订单信息.订单是否有效   0：无效；1：有效
	 * @param {object} objResult.resResult.curData.BackOrderRecordVO.status               返回结果.响应返回的业务数据.当前业务结果.订单信息.订单状态
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function OrderRecordModify(objParam) {
        var objResult = {};
        return objResult;
    }
}