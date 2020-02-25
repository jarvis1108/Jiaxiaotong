/** 
 * @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_后台管理系统_管理员模块
 *              <br/> //  * 创建标志：程志强 2018年11月6日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：后台管理系统管理员的相关接口
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *               (a) AdminLogin : 后台管理系统登录界面的登录检验(账号密码登录)                                     
 *              <br/> //  *              
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 程志强
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：管理员模块接口设计
 * @memberOf BAM                           
 */
function BAM_ADM_010() {

    /**
     * @summary 实现功能：后台管理系统登录界面的登录检验
     * @description **POST** /api/v1/bam/admin/login
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_ADM_010_AdminLogin
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.account                       要传入的参数.请求的业务参数.管理员账户
     * @param {string} objParam.reqParam.adminPsw                      要传入的参数.请求的业务参数.管理员密码
     *
     * @param {object} objResult                                                               返回结果
     * @param {string} objResult.resID                                                         返回结果.响应ID
     * @param {string} objResult.reqId                                                         返回结果.请求的ID
     * @param {string} objResult.reqType                                                       返回结果.请求类型
     * @param {Object} objResult.resResult                                                     返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                             返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object}  objResult.resResult.curData.admin                                      返回结果.响应返回的业务数据.当前业务结果.当前管理员信息
     * @param {string} objResult.resResult.curData.admin.adminId                               返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.管理员Id
     * @param {string} objResult.resResult.curData.admin.adminNo                               返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.管理员编码
     * @param {string} objResult.resResult.curData.admin.adminName                             返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.管理员名
     * @param {string} objResult.resResult.curData.admin.account                               返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.用户
     * @param {string} objResult.resResult.curData.admin.adminPsw                              返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.密码
     * @param {byte} objResult.resResult.curData.admin.userLevel                               返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.用户级别：0：超级管理员，1：一般管理员，2：业务员，3：题库贡献者
     * @param {timestamp} objResult.resResult.curData.admin.createTime                         返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.创建时间
     * @param {string} objResult.resResult.curData.admin.createUser                            返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.创建者
     * @param {timestamp} objResult.resResult.curData.admin.lastUpdTime                        返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.更新时间
     * @param {string} objResult.resResult.curData.admin.lastUpdUser                           返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.更新者
     * @param {byte} objResult.resResult.curData.admin.isValid                                 返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.是否有效
     * @param {string} objResult.resResult.curData.admin.remark                                返回结果.响应返回的业务数据.当前业务结果.当前管理员信息.备注信息
     * @version 1.0
     * @example 暂无
     */
    function AdminLogin(objParam) {
        var objResult = {};
        return objResult;
    }

}