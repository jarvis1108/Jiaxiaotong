/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_私有题库 得到扫码验证url
 *              <br/> //  * 创建标志：林航 2018年09月15日创建
 *              <br/> //  * 修改标志：
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：
 *              <br/> //  * 当前状态：【编码中】【编码完成√】【测试完】【可以试用】【正式使用】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 林航
 * @copyright 暂无
 */

 /**
 * @class
 * @summary 实现功能：私有题库 获得扫码验证url
 * @memberOf QFL
 * @description                
 */
function QFL_LOG_010() {

    /**
     * @summary 实现功能：私有题库 获得扫码验证url
     * @description POST /api/v1/question/questionForLibLogin/getAuthUrl

     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QFL_LOG_010_getAuthUrl
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息

     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数

     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.pageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.pageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.pageInfo.curPage                       要传入的参数.分页信息.页码
     
     * @param {object} objResult                                           返回结果
     * @param {string} objResult.resID                                     返回结果.响应ID
     * @param {string} objResult.reqId                                     返回结果.请求的ID
     * @param {string} objResult.reqType                                   返回结果.请求类型

     * @param {Object} objResult.resResult                                 返回结果.响应返回的业务数据
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.添加是否成功
     * @param {object} objResult.resResult.errorInfo                       返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)

     * @param {object} objResult.resResult.curData                           返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {string} objResult.resResult.curData.authUrl                   返回结果.响应返回的业务数据.当前业务结果.微信扫码验证Url

     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function getAuthUrl(objParam) {
        var objResult = {};
        return objResult;
    }
}