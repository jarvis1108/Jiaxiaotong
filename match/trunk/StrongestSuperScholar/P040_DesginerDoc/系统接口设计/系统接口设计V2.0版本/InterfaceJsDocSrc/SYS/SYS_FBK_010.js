/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_意见反馈部分
 *              <br/> //  * 创建标志：韩晓峰   2018年09月25日创建
 *              <br/> //  * 修改标志：
 *              <br/> //  * 标志编号：013   韩晓峰   2018年09月25日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：(1)意见反馈用例接口设计
 *              <br/> //  *         (2)本文件接口清单如下：
 *              <br/> //  *             (a)CreateFeedback：创建意见反馈记录
 *              <br/> //  * 当前状态：【编码中√】【编码完成】【测试完】【可以试用】【正式使用】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 韩晓峰
 * @copyright 暂无
 */

/**
 * @class
 * @summary 意见反馈用例中接口定义
 * @memberOf SYS
 */
function SYS_FBK_010() {

    /**
     * @summary 实现功能：创建意见反馈记录
     * @description **POST** /api/v1/sys/feedback
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_FBK_010_SYS_FBK_010
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {string} objParam.reqParam.content                       要传入的参数.请求的业务参数.意见反馈内容
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
     * @param {object} objResult.resResult.curData.feedback               返回结果.响应返回的业务数据.当前业务结果.用户信息
     * @param {string} objResult.resResult.curData.feedback.feedbackId    返回结果.响应返回的业务数据.当前业务结果.用户信息.用户ID
     * @param {string} objResult.resResult.curData.feedback.feedbackNo    返回结果.响应返回的业务数据.当前业务结果.用户信息.用户编号
     * @param {string} objResult.resResult.curData.feedback.userId        返回结果.响应返回的业务数据.当前业务结果.用户信息.用户城市
     * @param {string} objResult.resResult.curData.feedback.content       返回结果.响应返回的业务数据.当前业务结果.用户信息.用户性别 1表示男，2表示女，0表示未知
	 * @param {object} objResult.resResult.curData.feedback.createTime    返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.创建时间
	 * @param {string} objResult.resResult.curData.feedback.createUser    返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.创建用户
	 * @param {object} objResult.resResult.curData.feedback.lastUpdTime   返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.最近修改时间
	 * @param {string} objResult.resResult.curData.feedback.lastUpdUser   返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.最近修改用户
	 * @param {number} objResult.resResult.curData.feedback.isValid       返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.是否有效
     * @param {string} objResult.resResult.curData.feedback.remark        返回结果.响应返回的业务数据.当前业务结果.商品列表【i】.备注
     * 
     * @param {boolean} objResult.resResult.isSuccess                     返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                        返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                               返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function CreateFeedback(objParam) {
        var objResult = {};
        return objResult;
    }
}