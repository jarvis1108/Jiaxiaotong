/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_私有题库删除选择题
 *              <br/> //  * 创建标志：林航 2018年09月07日创建
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
 * @summary 实现功能：私有题库删除选择题用例中接口定义
 * @memberOf QFL
 * @description   
   问题：
   1. 数据库表QuestionForLib缺失年级id、学科id、答题时间字段
   2. ui原型没有体现一个用户可以有多个题库的设计                        
 */
function QFL_CHO_020() {

    /**
     * @summary 实现功能：用户删除私有题库选择题
     * @description DELETE /api/v1/question/questionForLib/deleteChoice/{questionForLibId}      //questionForLibId为题目id

     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QFL_CHO_020_deleteChoice
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id

     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数

     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     
     * @param {object} objResult                                           返回结果
     * @param {string} objResult.resId                                     返回结果.响应ID
     * @param {string} objResult.reqId                                     返回结果.请求的ID
     * @param {string} objResult.reqType                                   返回结果.请求类型

     * @param {Object} objResult.resResult                                 返回结果.响应返回的业务数据
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.添加是否成功
     * @param {object} objResult.resResult.errorInfo                       返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resResult.curData                         返回结果.响应返回的业务数据.当前业务结果 default: {}

     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function deleteChoice(objParam) {
        var objResult = {};
        return objResult;
    }
}