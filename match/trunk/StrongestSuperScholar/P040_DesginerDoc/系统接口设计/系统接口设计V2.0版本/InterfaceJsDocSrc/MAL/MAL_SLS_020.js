/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：兑换奖学金
 *              <br/> //  * 创建标志：孙伟浩 2018年09月18日创建
 *              <br/> //  * 修改标志：韩晓峰 2018年09月28修改
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：兑换学点部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）ExchangeScholarship：用户兑换奖学金
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 孙伟浩
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：兑换奖学金用例接口定义
 * @memberOf MAL
 * @description                      
 */
function MAL_SLS_020() {

    /**
     * @summary 实现功能：用户兑换奖学金
     * @description **POST** /api/v1/mall/scholarship/exchange
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MAL_SLS_020_ExchangeScholarship
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
	 * @param {number} objParam.reqParam.scholarshipId                 要传入的参数.请求的业务参数.奖学金Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {number} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {number} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID
     * @param {string} objResult.reqType                               返回结果.请求类型
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                     返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {boolean} objResult.resResult.isSuccess                  返回结果.响应返回的业务数据.是否成功
     * @param {object} objResult.resResult.message                     返回结果.响应返回的业务数据.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function ExchangeScholarship(objParam) {
        var objResult = {};
        return objResult;
    }

}