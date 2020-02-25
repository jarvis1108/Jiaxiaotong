/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_商品后台管理
 *              <br/> //  * 创建标志：杨欢 2018年10月10日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：商品管理部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）ProductUpOrDown：商品上下架
 *              <br/> //  *              （b）savePro;  新增商品
 *              <br/> //  *              （c）ProductQuery：商品信息查询
 *              <br/> //  *              （d）ProdcutModify：修改商品商品信息 
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 杨欢
 * @copyright 暂无
 */

/**
 * @class
 * @summary 商品后台管理接口定义
 * @memberOf BAM
 * @description                              
 */
function BAM_PRO_010() {

    /**
     * @summary 实现功能：根据商品Id实现商品上下架
     * @description **PUT** /api/v1/bam/productManage/upOrDown/{productInfoId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_PRO_010_ProductUpOrDown
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {number} objParam.reqParam.productId                     要传入的参数.请求的业务参数.商品Id
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
	 * @param {number} objResult.resResult.curData.productList【i】.isValid              返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.是否有效 1.上架 0.下架
     * 
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                         返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function ProductUpOrDown(objParam) {
        var objResult = {};
        return objResult;
    }
	
	/**
     * @summary 实现功能：新增商品
     * @description **POST** /api/v1/bam/productManage
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_PRO_010_ProductQuery
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {string} objParam.reqParam.productNo              	   要传入的参数.请求的业务参数.商品编号
	 * @param {string} objParam.reqParam.productName              	   要传入的参数.请求的业务参数.商品名字
	 * @param {string} objParam.reqParam.productDesc                   要传入的参数.请求的业务参数.商品描述
	 * @param {number} objParam.reqParam.productPrice                  要传入的参数.请求的业务参数.商品单价
	 * @param {string} objParam.reqParam.unitOfNumerator               要传入的参数.请求的业务参数.计量单位的分子部分（即总价单位）
     * @param {string} objParam.reqParam.unitOfDenominator             要传入的参数.请求的业务参数.计量单位的分子部分（即总价单位）
	 * @param {string} objParam.reqParam.productType                   要传入的参数.请求的业务参数.商品类型
	 * @param {number} objParam.reqParam.paymentType                   要传入的参数.请求的业务参数.商品支付类型
	 * @param {object} objParam.reqParam.beginTime                     要传入的参数.请求的业务参数.开始时间
	 * @param {object} objParam.reqParam.endTime                       要传入的参数.请求的业务参数.结束时间
	 * @param {number} objParam.reqParam.isValid                       要传入的参数.请求的业务参数.商品是否有效 1.有效 0.无效
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
     * @param {string} objResult.resResult.curData.product.productImage         返回结果.响应返回的业务数据.当前业务结果.商品信息.商品图片
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
    function savePro(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：根据查询条件获取商品列表  listType=0时获取所有商品列表  listType=1根据搜索条件获取商品列表
     * @description **GET** /api/v1/bam/productManage/list/{listType} 
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_PRO_010_ProductQuery
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
	 * @param {string} objParam.reqParam.productType                   要传入的参数.请求的业务参数.商品类型
	 * @param {number} objParam.reqParam.paymentType                   要传入的参数.请求的业务参数.商品支付类型
	 * @param {number} objParam.reqParam.isValid                       要传入的参数.请求的业务参数.商品是否有效 1.有效 0.无效
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
    function ProductQuery(objParam) {
        var objResult = {};
        return objResult;
    }
	
	/**
     * @summary 实现功能：更改商品信息
     * @description **POST** /api/v1/bam/productManage/update/{productId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_PRO_010_ProductModify
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数

     * @param {string} objParam.reqParam.productType                   要传入的参数.请求的业务参数.商品类型   A1:现金买金币,A2:现金买学点-普通学点,A3:现金买学点-日卡,A4:现金买学点-月卡,A5:现金买学点-年卡,B1:金币兑学点,B2:金币兑实物（礼品）,B3:金币兑虚拟物品（指道具，如双倍金币卡）
     * @param {number} objParam.reqParam.productPrice                  要传入的参数.请求的业务参数.商品单价
     * @param {string} objParam.reqParam.unitOfNumerator               要传入的参数.请求的业务参数.计量单位的分子部分（即总价单位）
     * @param {string} objParam.reqParam.unitOfDenominator             要传入的参数.请求的业务参数.计量单位的分子部分（即总价单位）
     * @param {number} objParam.reqParam.paymentType                   要传入的参数.请求的业务参数.购买方式   0：人民币；1：金币；2：都支持
	 * @param {object} objParam.reqParam.beginTime                     要传入的参数.请求的业务参数.开始时间
	 * @param {object} objParam.reqParam.endTime                       要传入的参数.请求的业务参数.结束时间
     * 
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
    function ProdcutModify(objParam) {
        var objResult = {};
        return objResult;
    }
}