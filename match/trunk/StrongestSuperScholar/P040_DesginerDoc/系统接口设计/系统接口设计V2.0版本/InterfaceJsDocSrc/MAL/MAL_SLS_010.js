/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：发放奖学金
 *              <br/> //  * 创建标志：孙伟浩 2018年09月18日创建
 *              <br/> //  * 修改标志：韩晓峰 2018年09月28修改
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：兑换学点部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *              （a）GetScholarshipList：获取奖学金列表
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 孙伟浩
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：奖学金列表用例接口定义
 * @memberOf MAL
 * @description                      
 */
function MAL_SLS_010() {

    /**
     * @summary 实现功能：获取奖学金列表
     * @description **GET** /api/v1/mall/scholarship/list

     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应Id
     * @param {string} objResult.reqId                                               返回结果.请求的Id
     * @param {string} objResult.reqType                                             返回结果.请求类型，固定为 MAL_SLS_010_GetScholarshioList
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {array} objResult.resResult.curData.scholarshipList                    返回结果.响应返回的业务数据.当前业务结果.奖学金列表
     * @param {object} objResult.resResult.curData.scholarshipList【i】                  返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据
     * @param {string} objResult.resResult.curData.scholarshipList【i】.scholarshipId    返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金Id
     * @param {string} objResult.resResult.curData.scholarshipList【i】.scholarshipNo    返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金编号
     * @param {string} objResult.resResult.curData.scholarshipList【i】.scholarshipCode  返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金编码
     * @param {string} objResult.resResult.curData.scholarshipList【i】.scholarshipName  返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金名称
     * @param {string} objResult.resResult.curData.scholarshipList【i】.scholarshipImage 返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金图片地址
     * @param {number} objResult.resResult.curData.scholarshipList【i】.amount           返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金金额
     * @param {number} objResult.resResult.curData.scholarshipList【i】.acquiredGP       返回结果.响应返回的业务数据.当前业务结果.奖学金列表.第i条数据.奖学金所需绩点
     * 
     * @param {boolean} objResult.resResult.isSuccess    返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message       返回结果.响应返回的业务数据.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData              返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetScholarshioList() {
        var objResult = {};
        return objResult;
    }
}