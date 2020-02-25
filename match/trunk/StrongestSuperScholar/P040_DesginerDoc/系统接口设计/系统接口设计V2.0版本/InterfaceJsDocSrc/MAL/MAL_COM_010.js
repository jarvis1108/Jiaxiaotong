/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_商品列表
 *              <br/> //  * 创建标志：韩晓峰 2018年09月25日修改
 *              <br/> //  * 标志编号：13 韩晓峰 2018年09月25日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：本部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）GetProductList：获取商品列表
 *              <br/> //  *              （b）GetProdcutInfo：根据商品Id获取商品信息 
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 韩晓峰
 * @copyright 暂无
 */

/**
 * @class
 * @summary 商品列表接口定义
 * @memberOf MAL
 * @description                              
 */
function MAL_COM_010() {

    /**
     * @summary 实现功能：获取商品列表
     * @description **GET** /api/v1/mall/productInfo/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MAL_COM_010_GetProductList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {number} objParam.reqParam.paymentType                   要传入的参数.请求的业务参数.支付方式      0表示人民币，代表充值商品， 1表示金币，代表兑换商品
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                        返回结果
     * @param {string} objResult.resId                                                  返回结果.响应ID
     * @param {string} objResult.reqId                                                  返回结果.请求的ID
     * @param {string} objResult.reqType                                                返回结果.请求类型
     * @param {Object} objResult.resResult                                              返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                      返回结果.响应返回的业务数据.当前业务结果 default: {}
	 * @param {array} objResult.resResult.curData.productList                           返回结果.响应返回的业务数据.当前业务结果.商品列表
     * @param {object} objResult.resResult.curData.productList【i】                      返回结果.响应返回的业务数据.当前业务结果.商品列表.第i条记录
     * @param {string} objResult.resResult.curData.productList【i】.productId            返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品Id
     * @param {string} objResult.resResult.curData.productList【i】.productNo            返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品编码
     * @param {string} objResult.resResult.curData.productList【i】.productName          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品名称
     * @param {number} objResult.resResult.curData.productList【i】.productValue         返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品价值
     * @param {string} objResult.resResult.curData.productList【i】.productImage         返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品名称
     * @param {string} objResult.resResult.curData.productList【i】.productDesc          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品描述
     * @param {string} objResult.resResult.curData.productList【i】.productType          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品类型   A1:现金买金币,A2:现金买学点-普通学点,A3:现金买学点-日卡,A4:现金买学点-月卡,A5:现金买学点-年卡,B1:金币兑学点,B2:金币兑实物（礼品）,B3:金币兑虚拟物品（指道具，如双倍金币卡）
     * @param {number} objResult.resResult.curData.productList【i】.productPrice         返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.商品单价
     * @param {string} objResult.resResult.curData.productList【i】.unitOfNumerator      返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.计量单位的分子部分（即总价单位）
     * @param {string} objResult.resResult.curData.productList【i】.unitOfDenominator    返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.计量单位的分子部分（即总价单位）
     * @param {number} objResult.resResult.curData.productList【i】.paymentType          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.购买方式   0：人民币；1：金币；2：都支持
	 * @param {object} objResult.resResult.curData.productList【i】.beginTime            返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.开始时间
	 * @param {object} objResult.resResult.curData.productList【i】.endTime              返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.结束时间
	 * @param {object} objResult.resResult.curData.productList【i】.createTime           返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.创建时间
	 * @param {string} objResult.resResult.curData.productList【i】.createUser           返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.创建用户
	 * @param {object} objResult.resResult.curData.productList【i】.lastUpdTime          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.最近修改时间
	 * @param {string} objResult.resResult.curData.productList【i】.lastUpdUser          返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.最近修改用户
	 * @param {number} objResult.resResult.curData.productList【i】.isValid              返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.是否有效
     * @param {string} objResult.resResult.curData.productList【i】.remark               返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.备注
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetProductList(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：根据商品Id获取商品信息
     * @description **GET** /api/v1/mall/productInfo/{productInfoId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MAL_COM_010_GetProdcutInfo
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                返回结果
     * @param {string} objResult.resId                                          返回结果.响应ID
     * @param {string} objResult.reqId                                          返回结果.请求的ID
     * @param {string} objResult.reqType                                        返回结果.请求类型
     * @param {Object} objResult.resResult                                      返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                              返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.product                      返回结果.响应返回的业务数据.当前业务结果.商品信息
     * @param {string} objResult.resResult.curData.product.productId            返回结果.响应返回的业务数据.当前业务结果.商品信息.商品Id
     * @param {string} objResult.resResult.curData.product.productNo            返回结果.响应返回的业务数据.当前业务结果.商品信息.商品编码
     * @param {string} objResult.resResult.curData.product.productName          返回结果.响应返回的业务数据.当前业务结果.商品信息.商品名称
     * @param {number} objResult.resResult.curData.product.productValue         返回结果.响应返回的业务数据.当前业务结果.商品信息.商品价值
     * @param {string} objResult.resResult.curData.product.productImage         返回结果.响应返回的业务数据.当前业务结果.商品信息.商品名称
     * @param {string} objResult.resResult.curData.product.productDesc          返回结果.响应返回的业务数据.当前业务结果.商品信息.商品描述
     * @param {string} objResult.resResult.curData.product.productType          返回结果.响应返回的业务数据.当前业务结果.商品信息.商品类型   A1:现金买金币,A2:现金买学点-普通学点,A3:现金买学点-日卡,A4:现金买学点-月卡,A5:现金买学点-年卡,B1:金币兑学点,B2:金币兑实物（礼品）,B3:金币兑虚拟物品（指道具，如双倍金币卡）
     * @param {number} objResult.resResult.curData.product.productPrice         返回结果.响应返回的业务数据.当前业务结果.商品信息.商品单价
     * @param {string} objResult.resResult.curData.product.unitOfNumerator      返回结果.响应返回的业务数据.当前业务结果.商品信息.计量单位的分子部分（即总价单位）
     * @param {string} objResult.resResult.curData.product.unitOfDenominator    返回结果.响应返回的业务数据.当前业务结果.商品信息.计量单位的分子部分（即总价单位）
     * @param {number} objResult.resResult.curData.product.paymentType          返回结果.响应返回的业务数据.当前业务结果.商品信息.购买方式   0：人民币；1：金币；2：都支持
	 * @param {object} objResult.resResult.curData.product.beginTime            返回结果.响应返回的业务数据.当前业务结果.商品信息.开始时间
	 * @param {object} objResult.resResult.curData.product.endTime              返回结果.响应返回的业务数据.当前业务结果.商品信息.结束时间
	 * @param {object} objResult.resResult.curData.product.createTime           返回结果.响应返回的业务数据.当前业务结果.商品信息.创建时间
	 * @param {string} objResult.resResult.curData.product.createUser           返回结果.响应返回的业务数据.当前业务结果.商品信息.创建用户
	 * @param {object} objResult.resResult.curData.product.lastUpdTime          返回结果.响应返回的业务数据.当前业务结果.商品信息.最近修改时间
	 * @param {string} objResult.resResult.curData.product.lastUpdUser          返回结果.响应返回的业务数据.当前业务结果.商品信息.最近修改用户
	 * @param {number} objResult.resResult.curData.product.isValid              返回结果.响应返回的业务数据.当前业务结果.商品信息.是否有效
     * @param {string} objResult.resResult.curData.product.remark               返回结果.响应返回的业务数据.当前业务结果.商品信息.备注
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetProdcutInfo(objParam) {
        var objResult = {};
        return objResult;
    }
}