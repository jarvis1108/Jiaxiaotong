/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_获取世界排名
 *              <br/> //  * 创建标志：林航 2018年09月11日创建
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
* @summary 实现功能：获取世界排名
* @memberOf STA
* @description 得到排名前20名的用户信息              
*/
function SYS_RAN_010() {

    /**
     * @summary 实现功能：获取世界排名
     * @description GET /api/v1/sys/rank/getWorldRank

     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: RNK_SCR_010_deleteChoice
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     
     * @param {object} objResult                                           返回结果
     * @param {string} objResult.resId                                     返回结果.响应ID
     * @param {string} objResult.reqId                                     返回结果.请求的ID
     * @param {string} objResult.reqType                                   返回结果.请求类型
     * @param {Object} objResult.resResult                                 返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                              返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {number} objResult.resResult.curData.userRank                     返回结果.响应返回的业务数据.当前业务结果.用户排名
     * @param {array} objResult.resResult.curData.users                         返回结果.响应返回的业务数据.当前业务结果.用户列表
     * @param {string} objResult.resResult.curData.users【i】.userId             返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户ID
     * @param {string} objResult.resResult.curData.users【i】.userNo             返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户编号
     * @param {string} objResult.resResult.curData.users【i】.city               返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户城市
     * @param {string} objResult.resResult.curData.users【i】.sex                返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户性别 1表示男，2表示女，0表示未知
     * @param {string} objResult.resResult.curData.users【i】.wechatName         返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.微信昵称
     * @param {string} objResult.resResult.curData.users【i】.headImage          返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.头像地址
     * @param {string} objResult.resResult.curData.users【i】.telephone          返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户手机号
     * @param {number} objResult.resResult.curData.users【i】.coin               返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.金币数目
     * @param {number} objResult.resResult.curData.users【i】.learningPoint      返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.学点
     * @param {number} objResult.resResult.curData.users【i】.gradePoint         返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.绩点
     * @param {number} objResult.resResult.curData.users【i】.experience         返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户经验值
     * @param {number} objResult.resResult.curData.users【i】.externalLevel      返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.用户等级
     * @param {number} objResult.resResult.curData.users【i】.matchSumCount      返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.匹配总场次
     * @param {number} objResult.resResult.curData.users【i】.matchWinCount      返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.匹配胜场
     * @param {number} objResult.resResult.curData.users【i】.matchLoseCount     返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.匹配输场
     * @param {number} objResult.resResult.curData.users【i】.matchDogFallCount  返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.匹配平局场次
     * @param {string} objResult.resResult.curData.users【i】.otherInfo          返回结果.响应返回的业务数据.当前业务结果.用户列表【i】.其他信息
     * 
     * @param {boolean} objResult.resResult.isSuccess        返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.messgae           返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                  返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function getWorldRank(objParam) {
        var objResult = {};
        return objResult;
    }
}