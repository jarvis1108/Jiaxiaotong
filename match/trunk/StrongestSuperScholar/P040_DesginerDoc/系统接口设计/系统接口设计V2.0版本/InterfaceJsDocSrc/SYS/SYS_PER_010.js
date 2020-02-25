/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_个人基本信息部分
 *              <br/> //  * 创建标志：韩晓峰   2018年07月10日创建
 *              <br/> //  * 修改标志：
 *              <br/> //  * 标志编号：013   韩晓峰    2018年07月10日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：(1)个人基本信息用例接口设计
 *              <br/> //  *         (2)本文件接口清单如下：
 *              <br/> //  *             (a)GetUserInfoById
 *              <br/> //  * 当前状态：【编码中√】【编码完成】【测试完】【可以试用】【正式使用】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 韩晓峰
 * @copyright 暂无
 */

/**
 * @class
 * @summary 个人基本信息用例中接口定义
 * @memberOf SYS
 */
function SYS_PER_010() {

    /**
     * @summary 实现功能：根据用户ID获取用户基本信息
     * @description GET /api/v1/sys/user/{userId}
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_PER_010_GetUserInfoById
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户ID
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                          返回结果
     * @param {string} objResult.resId                                    返回结果.响应ID
     * @param {string} objResult.reqId                                    返回结果.请求的ID
     * @param {string} objResult.reqType                                  返回结果.请求类型
     * @param {Object} objResult.resResult                                返回结果.响应返回的业务数据
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
     * @param {string} objResult.resResult.curData.user.upgradeExperience 返回结果.响应返回的业务数据.当前业务结果.用户信息.用户下一等级最小经验值
     * @param {string} objResult.resResult.curData.user.otherInfo         返回结果.响应返回的业务数据.当前业务结果.用户信息.其他信息
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                        返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetUserInfoById(objParam) {
        var objResult = {};
        return objResult;
    }
}