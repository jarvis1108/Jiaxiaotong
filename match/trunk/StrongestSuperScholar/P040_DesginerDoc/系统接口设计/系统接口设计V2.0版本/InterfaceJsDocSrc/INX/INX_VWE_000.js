/** 
 * @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_主页部分
 *              <br/> //  * 创建标志：张洪波 2018年01月11日创建
 *              <br/> //  * 修改标志：
 *              <br/> //  *         (1) 标志编号：001   张洪波  2018年01月11日 标志描述：
 *              <br/> //  *         (2) 标志编号：002   韩晓峰  2018年09月03日 标志描述：修改接口设计及实现
 *              <br/> //  * 附注说明: （1）主页用例接口以及整个接口统一的命名空间的划分
 *              <br/> //  *          （2）本文件的接口清单如下：
 *              <br/> //  *              （a）GetGradePhaseType：得到年级类别信息列表
 *              <br/> //  *              （b）GetGradeByGradeType：根据年级类型得到年级列表
 *              <br/> //  *              （c）CreateNewUser：创建新用户
 *              <br/> //  *              （d）SaveUserOpenid: 保存用户openid到数据库
 *              <br/> //  *              （e）GetUserInfoByCode：根据code获取用户信息
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 张洪波
 * @copyright 暂无
 **/

/**
 * @summary  主页模块
 * @namespace  INX
 * @description 暂无
 */

/**
 * @summary  商城模块
 * @namespace MAL
 * @description 暂无
 */

/**
 * @summary  对战模块
 * @namespace  MTH
 * @description 暂无
 */

/**
 * @summary  统计模块
 * @namespace  STA
 * @description 暂无
 */

/**
 * @summary  系统管理
 * @namespace  SYS
 * @description 暂无
 */

 /**
 * @summary  后台管理
 * @namespace  BAM
 * @description 暂无
 */

/**
 * @class
 * @summary 实现功能:主页用例中接口定义
 * @memberOf INX
 */
function INX_VWE_000()
{
    /**
     * @summary 实现功能: 获取年级类别信息列表
     * @description **GET** /api/v1/base/gradePhaseInfo/list
     * @function
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID    Example: 565656565656
     * @param {string} objParam.reqType                                要传入的参数.请求类型，INX_VWE_000_GetGradePhaseList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务数据
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)
     
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID    Example: 565656565656
     * @param {string} objResult.reqType                               返回结果.请求类型，为：INX_VWE_000_GetGradePhaseList
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据

     * @param {object} objResult.resResult.curData                                            返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array} objResult.resResult.curData.gradePhaseInfoList                          返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表
     * @param {object} objResult.resResult.curData.gradePhaseInfoList【i】                     返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表.第i条记录
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.gradePhaseId        返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型ID
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.gradePhaseNo        返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型编码
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.gradePhaseCode      返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型编号
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.description         返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型描述
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.gradePhaseName      返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型名称
     * @param {string} objResult.resResult.curData.gradePhaseInfoList【i】.gradePhaseShortName 返回结果.响应返回的业务数据.当前业务结果.返回的年级阶段信息列表列表【i】.年级类型简称
     * @param {boolean} objResult.resResult.isSuccess                  返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                     返回结果.响应返回的业务数据.当前业务结果.响应消息
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息 (预留扩展，一般情况下不用),default: {}
     * @example  暂无
     * @version 1.0
     **/
    function GetGradePhaseList(objParam)
    {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能: 根据年级类型Id得到年级列表
     * @description **GET** /api/v1/base/gradeInfo/list/{gradePhaseId}
     * @function
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID    Example: 565656565656
     * @param {string} objParam.reqType                                要传入的参数.请求类型，为：INX_VWE_000_GetGradeByGradePhaseId
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务数据
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)
     
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID    Example: 565656565656
     * @param {string} objResult.reqType                               返回结果.请求类型，为：INX_VWE_000_GetGradeByGradePhaseId
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据

     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array} objResult.resResult.curData.gradeInfoList                      返回结果.响应返回的业务数据.当前业务结果.年级列表
     * @param {object} objResult.resResult.curData.gradeInfoList【i】                 返回结果.响应返回的业务数据.当前业务结果.年级列表.第i条记录
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeId         返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级ID
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeNo         返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级编码
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeCode       返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级编号
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeName       返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级名称
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeShortName  返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级名称缩写
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.showText        返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级展示文本
     * @param {boolean} objResult.resResult.isSuccess                                返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                                   返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息 (预留扩展，一般情况下不用),default: {}
     * @example  暂无
     * @version 1.0
     **/
    function GetGradeByGradePhaseId(objParam)
    {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能: 创建新用户
     * @description **POST** /api/v1/sys/user
     * @function
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID    Example: 565656565656
     * @param {string} objParam.reqType                                要传入的参数.请求类型，为：INX_VWE_000_CreateNewUser
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务数据
     * @param {string} objParam.reqParam.nickName                      要传入的参数.请求的业务数据.用户昵称
     * @param {string} objParam.reqParam.avatarUrl                     要传入的参数.请求的业务数据.用户头像地址
     * @param {string} objParam.reqParam.gender                        要传入的参数.请求的业务数据.用户性别
     * @param {string} objParam.reqParam.city                          要传入的参数.请求的业务数据.用户所在城市
     * @param {string} objParam.reqParam.gradePhaseId                  要传入的参数.请求的业务数据.用户所选年级阶段Id
     * @param {string} objParam.reqParam.gradeId                       要传入的参数.请求的业务数据.年级Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)
     
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID    Example: 565656565656
     * @param {string} objResult.reqType                               返回结果.请求类型，为：INX_VWE_000_CreateNewUser
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据

     * @param {object} objResult.resResult.curData                        返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.user                   返回结果.响应返回的业务数据.当前业务结果.用户信息
     * @param {string} objResult.resResult.curData.user.userId            返回结果.响应返回的业务数据.当前业务结果.用户信息.用户ID
     * @param {string} objResult.resResult.curData.user.userNo            返回结果.响应返回的业务数据.当前业务结果.用户信息.用户编号
     * @param {string} objResult.resResult.curData.user.city              返回结果.响应返回的业务数据.当前业务结果.用户信息.用户城市
     * @param {string} objResult.resResult.curData.user.sex               返回结果.响应返回的业务数据.当前业务结果.用户信息.用户性别 1表示男，2表示女，0表示未知
     * @param {string} objResult.resResult.curData.user.wechatName        返回结果.响应返回的业务数据.当前业务结果.用户信息.微信昵称
     * @param {string} objResult.resResult.curData.user.headImage         返回结果.响应返回的业务数据.当前业务结果.用户信息.头像地址
     * @param {string} objResult.resResult.curData.user.telephone         返回结果.响应返回的业务数据.当前业务结果.用户信息.用户手机号
     * @param {number} objResult.resResult.curData.user.coin              返回结果.响应返回的业务数据.当前业务结果.用户信息.金币数目
     * @param {number} objResult.resResult.curData.user.learningPoint     返回结果.响应返回的业务数据.当前业务结果.用户信息.学点
     * @param {number} objResult.resResult.curData.user.gradePoint        返回结果.响应返回的业务数据.当前业务结果.用户信息.绩点
     * @param {number} objResult.resResult.curData.user.experience        返回结果.响应返回的业务数据.当前业务结果.用户信息.用户经验值
     * @param {number} objResult.resResult.curData.user.externalLevel     返回结果.响应返回的业务数据.当前业务结果.用户信息.用户等级
     * @param {number} objResult.resResult.curData.user.matchSumCount     返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配总场次
     * @param {number} objResult.resResult.curData.user.matchWinCount     返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配胜场
     * @param {number} objResult.resResult.curData.user.matchLoseCount    返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配输场
     * @param {number} objResult.resResult.curData.user.matchDogFallCount 返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配平局场次
     * @param {number} objResult.resResult.curData.user.upgradeExperience 返回结果.响应返回的业务数据.当前业务结果.用户信息.升级所需经验
     * @param {string} objResult.resResult.curData.user.otherInfo         返回结果.响应返回的业务数据.当前业务结果.用户信息.其他信息
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                        返回结果.响应返回的业务数据.当前业务结果.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息 (预留扩展，一般情况下不用),default: {}
     * @example  暂无
     * @version 1.0
     **/
    function CreateNewUser(objParam)
    {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能: 保存用户openid到数据库
     * @description **POST** /api/v1/sys/user/code
     * @function
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID    Example: 565656565656
     * @param {string} objParam.reqType                                要传入的参数.请求类型，为：INX_VWE_000_SaveUserOpenid
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务数据
     * @param {string} objParam.reqParam.code                          要传入的参数.请求的业务数据.code
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务数据.用户Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)
     
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID    Example: 565656565656
     * @param {string} objResult.reqType                               返回结果.请求类型，为：INX_VWE_000_SaveUserOpenid
     * @param {object} objResult.resResult                             返回结果.响应返回的业务数据
     * @param {boolean} objResult.resResult.isSuccess                  返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                     返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息 (预留扩展，一般情况下不用),default: {}
     * @example  暂无
     * @version 1.0
     **/
    function SaveUserOpenid(objParam) 
    {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能: 根据code获取用户信息
     * @description **GET** /api/v1/sys/user/code
     * @function
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID    Example: 565656565656
     * @param {string} objParam.reqType                                要传入的参数.请求类型，为：INX_VWE_000_GetUserInfoByCode
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务数据
     * @param {string} objParam.reqParam.code                          要传入的参数.请求的业务数据.code
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务数据.用户Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)
     
     * @param {object} objResult                                          返回结果
     * @param {string} objResult.resId                                    返回结果.响应ID
     * @param {string} objResult.reqId                                    返回结果.请求的ID    Example: 565656565656
     * @param {string} objResult.reqType                                  返回结果.请求类型，为：INX_VWE_000_GetUserInfoByCode
     * @param {object} objResult.resResult                                返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData.user                   返回结果.响应返回的业务数据.当前业务结果.用户信息
     * @param {string} objResult.resResult.curData.user.userId            返回结果.响应返回的业务数据.当前业务结果.用户信息.用户ID
     * @param {string} objResult.resResult.curData.user.userNo            返回结果.响应返回的业务数据.当前业务结果.用户信息.用户编号
     * @param {string} objResult.resResult.curData.user.city              返回结果.响应返回的业务数据.当前业务结果.用户信息.用户城市
     * @param {string} objResult.resResult.curData.user.sex               返回结果.响应返回的业务数据.当前业务结果.用户信息.用户性别 1表示男，2表示女，0表示未知
     * @param {string} objResult.resResult.curData.user.wechatName        返回结果.响应返回的业务数据.当前业务结果.用户信息.微信昵称
     * @param {string} objResult.resResult.curData.user.headImage         返回结果.响应返回的业务数据.当前业务结果.用户信息.头像地址
     * @param {string} objResult.resResult.curData.user.telephone         返回结果.响应返回的业务数据.当前业务结果.用户信息.用户手机号
     * @param {number} objResult.resResult.curData.user.coin              返回结果.响应返回的业务数据.当前业务结果.用户信息.金币数目
     * @param {number} objResult.resResult.curData.user.learningPoint     返回结果.响应返回的业务数据.当前业务结果.用户信息.学点
     * @param {number} objResult.resResult.curData.user.gradePoint        返回结果.响应返回的业务数据.当前业务结果.用户信息.绩点
     * @param {number} objResult.resResult.curData.user.experience        返回结果.响应返回的业务数据.当前业务结果.用户信息.用户经验值
     * @param {number} objResult.resResult.curData.user.externalLevel     返回结果.响应返回的业务数据.当前业务结果.用户信息.用户等级
     * @param {number} objResult.resResult.curData.user.matchSumCount     返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配总场次
     * @param {number} objResult.resResult.curData.user.matchWinCount     返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配胜场
     * @param {number} objResult.resResult.curData.user.matchLoseCount    返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配输场
     * @param {number} objResult.resResult.curData.user.matchDogFallCount 返回结果.响应返回的业务数据.当前业务结果.用户信息.匹配平局场次
     * @param {number} objResult.resResult.curData.user.upgradeExperience 返回结果.响应返回的业务数据.当前业务结果.用户信息.升级所需经验
     * @param {string} objResult.resResult.curData.user.otherInfo         返回结果.响应返回的业务数据.当前业务结果.用户信息.其他信息
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                        返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息 (预留扩展，一般情况下不用),default: {}
     * @example  暂无
     * @version 1.0
     **/
    function GetUserInfoByCode(objParam)
    {
        var objResult = {};
        return objResult;
    }
}

