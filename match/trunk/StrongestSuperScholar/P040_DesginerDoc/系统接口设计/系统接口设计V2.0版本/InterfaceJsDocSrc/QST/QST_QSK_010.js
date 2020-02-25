/** 
 * @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_私有题库模块
 *              <br/> //  * 创建标志：孙伟浩 2018年09月05日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：背诵题部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *               (a) SaveQuestionLib : 存储题库
 *              <br/> //  *               (b) DeleteQuestionLib : 删除题库
 *              <br/> //  *               
 *              <br/> //  *              
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 孙伟浩
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：私有题库模块接口设计
 * @memberOf QST                           
 */
function QST_QSL_010() {

    /**
     * @summary 实现功能：存储题库
     * @description **POST** /api/v1/qst/questionLib
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QST_RFL_010_SaveQuestionLib
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.isDefaultQuestionLib          要传入的参数.请求的业务参数.是否默认题库 1:是 0:否
     * @param {byte}   objParam.reqParam.isPublic                      要传入的参数.请求的业务参数.是否公开 1:是 0:否
     * @param {string} objParam.reqParam.questionLibDes                要传入的参数.请求的业务参数.题库描述
     * @param {string} objParam.reqParam.questionLibTitle              要传入的参数.请求的业务参数.题库标题
     * @param {byte}   objParam.reqParam.isValid                       要传入的参数.请求的业务参数.是否有效
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {string} objResult.resResult.curData.questionLibId          		     返回结果.响应返回的业务数据.当前业务结果.题库Id
     * @param {string} objResult.resResult.curData.questionLibNo         		     返回结果.响应返回的业务数据.当前业务结果.题库编号
     * @param {string} objResult.resResult.curData.questionLibCode      		     返回结果.响应返回的业务数据.当前业务结果.题库编码
     * @param {string} objResult.resResult.curData.userId              		     返回结果.响应返回的业务数据.当前业务结果.所属用户id
     * @param {string} objResult.resResult.curData.isDefaultQuestionLib         	返回结果.响应返回的业务数据.当前业务结果.是否默认题库
     * @param {string} objResult.resResult.curData.isPublic                  		返回结果.响应返回的业务数据.当前业务结果.是否公开     
     * @param {string} objResult.resResult.curData.questionLibDes                    返回结果.响应返回的业务数据.当前业务结果.题库描述
     * @param {string} objResult.resResult.curData.questionLibTitle               	返回结果.响应返回的业务数据.当前业务结果.题库名
     * @param {string} objResult.resResult.curData.createUser                		返回结果.响应返回的业务数据.当前业务结果.创建者
     * @param {string} objResult.resResult.curData.createTime                        返回结果.响应返回的业务数据.当前业务结果.创建时间
     * @param {string} objResult.resResult.curData.lastUpdUser              		 返回结果.响应返回的业务数据.当前业务结果.更新者
     * @param {string} objResult.resResult.curData.lastUpdTime                 		 返回结果.响应返回的业务数据.当前业务结果.更新用户
     * @param {string} objResult.resResult.curData.isValid                            返回结果.响应返回的业务数据.当前业务结果.是否有效
     * @param {string} objResult.resResult.curData.remark              			 返回结果.响应返回的业务数据.当前业务结果.备注 
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function SaveQuestionLib(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：删除背诵题目
     * @description **POST** /api/v1/qst/questionLib/delete
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QST_QSLL_010_DeleteQuestionLib
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.questionLibId                 要传入的参数.请求的业务参数.题库Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果(null)
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function DeleteQuestionLib(objParam) {
        var objResult = {};
        return objResult;
    }
}