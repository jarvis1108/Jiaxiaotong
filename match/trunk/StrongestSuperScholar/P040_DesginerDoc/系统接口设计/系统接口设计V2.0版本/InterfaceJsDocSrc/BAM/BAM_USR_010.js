/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_后台管理系统_用户管理模块
 *              <br/> //  * 创建标志：程志强 2018年10月15日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：用户基础信息数据管理部分
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *               (a) GetUserBaseInfoList : 获取所有用户的基础信息列表
 *              <br/> //  *               (b) UpdateUserBaseInfo : 更新某用户的基础信息
 *              <br/> //  *               (c) LockOrUnlockUser : 冻结某用户
 *              <br/> //  *               (d) GetOrderRecordInfoList : 获取所有用户的订单信息列表
 *              <br/> //  *               (e) UpdateOrderRecordInfo : 更新某条订单信息
 *              <br/> //  *               (f) GetUserCoinDetails : 获取用户金币明细信息
 *              <br/> //  *               (g) GetUserGPDetails : 获取用户绩点明细信息
 *              <br/> //  *               (h) GetUserLPDetails : 获取用户学点明细信息
 *              <br/> //  *              
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 程志强
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：用户管理模块接口设计
 * @memberOf BAM
 * @description                           
 */
function BAM_USR_010() {

    /**
     * @summary 实现功能：获取所有用户的基础信息列表
     * @description **GET** /api/v1/bam/user/userBaseInfo/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_GetUserBaseInfoList
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数（用户复杂条件查询，如果条件为空则不用reqParam）
     * @param {string} objParam.reqParam.wechatName                    要传入的参数.请求的业务参数.微信昵称
     * @param {Integer} objParam.reqParam.minLearningPoint             要传入的参数.请求的业务参数.最小学点数
     * @param {Integer} objParam.reqParam.maxLearningPoint             要传入的参数.请求的业务参数.最大学点数
     * @param {Integer} objParam.reqParam.minGradePoint                要传入的参数.请求的业务参数.最小绩点数
     * @param {Integer} objParam.reqParam.maxGradePoint                要传入的参数.请求的业务参数.最大绩点数
     * @param {Integer} objParam.reqParam.minCoin                      要传入的参数.请求的业务参数.最小金币数
     * @param {Integer} objParam.reqParam.maxCoin                      要传入的参数.请求的业务参数.最大金币数
     *
     * @param {object} objResult                                                                              返回结果
     * @param {string} objResult.resID                                                                        返回结果.响应ID
     * @param {string} objResult.reqId                                                                        返回结果.请求的ID
     * @param {string} objResult.reqType                                                                      返回结果.请求类型
     * @param {Object} objResult.resResult                                                                    返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                            返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array}  objResult.resResult.curData.backUserBaseInfoList                                       返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表
     * @param {object} objResult.resResult.curData.backUserBaseInfoList【i】                                    返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表.第i条记录
     * @param {string} objResult.resResult.curData.backUserBaseInfoList【i】.userId                             返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户Id
     * @param {string} objResult.resResult.curData.backUserBaseInfoList【i】.wechatName                         返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户微信名
     * @param {string} objResult.resResult.curData.backUserBaseInfoList【i】.telephone                          返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户电话号码
     * @param {timestamp} objResult.resResult.curData.backUserBaseInfoList【i】.createTime                      返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户创建时间
     * @param {timestamp} objResult.resResult.curData.backUserBaseInfoList【i】.loginTime                       返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户上次登录时间
     * @param {byte} objResult.resResult.curData.backUserBaseInfoList【i】.isValid                              返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户是否被冻结
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.coin                              返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.金币
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.gradePoint                        返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.绩点
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.learningPoint                     返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.学点
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.matchSumCount                     返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.比赛总次数
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.matchWinCount                     返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.比赛胜场次数
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.matchLoseCount                    返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.比赛输场次数
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.matchDogFallCount                 返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.比赛平局次数
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.experience                        返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.经验值
     * @param {Integer} objResult.resResult.curData.backUserBaseInfoList【i】.externalLevel                     返回结果.响应返回的业务数据.当前业务结果.用户基础信息列表【i】.用户外部等级，展示给客户端
     * @param {object} objResult.resResult.curData.pageable                                                   返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                                              返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                                      返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                                    返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                                           返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                                       返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                                         返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                                            返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                                          返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                                      返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                                             返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                                                返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                                    返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                                      返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                                       返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                                               返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                                          返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                                     返回结果.响应返回的业务数据.当前业务结果.是否第一页
     
     * @version 1.0
     * @example 暂无
     */
    function GetUserBaseInfoList(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：更新某用户的基础信息
     * @description **POST** /api/v1/bam/user/userBaseInfo/update/{userId}     (userId为要修改的当前用户的id)
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_UpdateUserBaseInfo
     * @param {string} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {Integer} objParam.reqParam.coin                         要传入的参数.请求的业务参数.金币
     * @param {Integer} objParam.reqParam.gradePoint                   要传入的参数.请求的业务参数.绩点
     * @param {Integer} objParam.reqParam.learningPoint                要传入的参数.请求的业务参数.学点
     * @param {Integer} objParam.reqParam.matchSumCount                要传入的参数.请求的业务参数.比赛总次数
     * @param {Integer} objParam.reqParam.matchWinCount                要传入的参数.请求的业务参数.比赛胜场次数
     * @param {Integer} objParam.reqParam.matchWinCount                要传入的参数.请求的业务参数.比赛输场次数
     * @param {Integer} objParam.reqParam.matchDogFallCount            要传入的参数.请求的业务参数.比赛平局次数
     * @param {Integer} objParam.reqParam.experience                   要传入的参数.请求的业务参数.经验值
     * @param {Integer} objParam.reqParam.externalLevel                要传入的参数.请求的业务参数.用户外部等级，展示给客户端
     * 
     * @param {object} objResult                                                             返回结果
     * @param {string} objResult.resID                                                       返回结果.响应ID
     * @param {string} objResult.reqId                                                       返回结果.请求的ID
     * @param {string} objResult.reqType                                                     返回结果.请求类型
     * @param {Object} objResult.resResult                                                   返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                           返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object}  objResult.resResult.curData.content                                  返回结果.响应返回的业务数据.当前业务结果.内容
     * @param {string} objResult.resResult.curData.content.userId                            返回结果.响应返回的业务数据.当前业务结果.内容.用户Id
     * @param {string} objResult.resResult.curData.content.wechatName                        返回结果.响应返回的业务数据.当前业务结果.内容.用户微信名
     * @param {string} objResult.resResult.curData.content.telephone                         返回结果.响应返回的业务数据.当前业务结果.内容.用户电话号码
     * @param {timestamp} objResult.resResult.curData.content.createTime                     返回结果.响应返回的业务数据.当前业务结果.内容.用户创建时间
     * @param {timestamp} objResult.resResult.curData.content.loginTime                      返回结果.响应返回的业务数据.当前业务结果.内容.用户上次登录时间
     * @param {byte} objResult.resResult.curData.content.isValid                             返回结果.响应返回的业务数据.当前业务结果.内容.用户是否被冻结
     * @param {Integer} objResult.resResult.curData.content.coin                             返回结果.响应返回的业务数据.当前业务结果.内容.金币
     * @param {Integer} objResult.resResult.curData.content.gradePoint                       返回结果.响应返回的业务数据.当前业务结果.内容.绩点
     * @param {Integer} objResult.resResult.curData.content.learningPoint                    返回结果.响应返回的业务数据.当前业务结果.内容.学点
     * @param {Integer} objResult.resResult.curData.content.matchSumCount                    返回结果.响应返回的业务数据.当前业务结果.内容.比赛总次数
     * @param {Integer} objResult.resResult.curData.content.matchWinCount                    返回结果.响应返回的业务数据.当前业务结果.内容.比赛胜场次数
     * @param {Integer} objResult.resResult.curData.content.matchLoseCount                   返回结果.响应返回的业务数据.当前业务结果.内容.比赛输场次数
     * @param {Integer} objResult.resResult.curData.content.matchDogFallCount                返回结果.响应返回的业务数据.当前业务结果.内容.比赛平局次数
     * @param {Integer} objResult.resResult.curData.content.experience                       返回结果.响应返回的业务数据.当前业务结果.内容.经验值
     * @param {Integer} objResult.resResult.curData.content.externalLevel                    返回结果.响应返回的业务数据.当前业务结果.内容.用户外部等级，展示给客户端
     * @version 1.0
     * @example 暂无
     */
    function UpdateUserBaseInfo(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：冻结某用户
     * @description **POST** /api/v1/bam/user/userBaseInfo/lock/{userId}     (userId为要冻结/解冻的当前用户的id)
     * @param {object} objParam                                             要传入的参数
     * @param {string} objParam.reqId                                       要传入的参数.请求的Id
     * @param {string} objParam.reqType                                     要传入的参数.请求类型 固定值为: BAM_USR_010_LockOrUnlockUser
     * @param {string} objParam.reqParam                                    要传入的参数.请求的业务参数
     * @param {Byte}   objParam.reqParam.isValid                            要传入的参数.请求的业务参数.用户是否被冻结
     * 
     * @param {object} objResult                                                             返回结果
     * @param {string} objResult.resID                                                       返回结果.响应ID
     * @param {string} objResult.reqId                                                       返回结果.请求的ID
     * @param {string} objResult.reqType                                                     返回结果.请求类型
     * @param {Object} objResult.resResult                                                   返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                           返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.content                                   返回结果.响应返回的业务数据.当前业务结果.内容
     * @param {byte} objResult.resResult.curData.content.isValid                             返回结果.响应返回的业务数据.当前业务结果.内容.用户是否被冻结
     * @version 1.0
     * @example 暂无
     */
    function LockOrUnlockUser(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：获取所有用户的订单信息列表
     * @description **GET** /api/v1/bam/user/orderRecord/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_GetOrderRecordInfoList
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数（订单复杂条件查询，如果条件为空则不用reqParam）
     * @param {object} objParam.reqParam.orderRecordID                 要传入的参数.请求的业务参数.订单号id
     * @param {object} objParam.reqParam.wechatName                    要传入的参数.请求的业务参数.微信昵称
     * 
     * @param {object} objResult                                                                          返回结果
     * @param {string} objResult.resID                                                                    返回结果.响应ID
     * @param {string} objResult.reqId                                                                    返回结果.请求的ID
     * @param {string} objResult.reqType                                                                  返回结果.请求类型
     * @param {object} objResult.resResult                                                                返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                        返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.backOrderRecordVOList                                  返回结果.响应返回的业务数据.当前业务结果.订单记录
     * @param {object} objResult.resResult.curData.backOrderRecordVOList[i]                               返回结果.响应返回的业务数据.当前业务结果.订单记录[i]
     * @param {string} objResult.resResult.curData.backOrderRecordVOList[i].orderRecordID                 返回结果.响应返回的业务数据.当前业务结果.订单记录[i].订单记录ID
     * @param {string} objResult.resResult.curData.backOrderRecordVOList[i].userId                        返回结果.响应返回的业务数据.当前业务结果.订单记录[i].用户ID
     * @param {byte}   objResult.resResult.curData.backOrderRecordVOList[i].purchaseWay                   返回结果.响应返回的业务数据.当前业务结果.订单记录[i].购买方式
     * @param {string} objResult.resResult.curData.backOrderRecordVOList[i].productName                   返回结果.响应返回的业务数据.当前业务结果.订单记录[i].产品名字
     * @param {string} objResult.resResult.curData.backOrderRecordVOList[i].wechatName                    返回结果.响应返回的业务数据.当前业务结果.订单记录[i].微信昵称
     * @param {Integer} objResult.resResult.curData.backOrderRecordVOList[i].productAmount                返回结果.响应返回的业务数据.当前业务结果.订单记录[i].产品数量
     * @param {double} objResult.resResult.curData.backOrderRecordVOList[i].productPrice                  返回结果.响应返回的业务数据.当前业务结果.订单记录[i].产品价格
     * @param {double} objResult.resResult.curData.backOrderRecordVOList[i].sumPrice                      返回结果.响应返回的业务数据.当前业务结果.订单记录[i].价格的总价格
     * @param {double} objResult.resResult.curData.backOrderRecordVOList[i].actualSumPrice                返回结果.响应返回的业务数据.当前业务结果.订单记录[i].实际支付的价格
     * @param {timestamp} objResult.resResult.curData.backOrderRecordVOList[i].createTime                 返回结果.响应返回的业务数据.当前业务结果.订单记录[i].订单创建时间
     * @param {Byte} objResult.resResult.curData.backOrderRecordVOList[i].isValid                         返回结果.响应返回的业务数据.当前业务结果.订单记录[i].是否有效
     * @param {string} objResult.resResult.curData.backOrderRecordVOList[i].status                        返回结果.响应返回的业务数据.当前业务结果.订单记录[i].订单状态
     * @param {object} objResult.resResult.curData.pageable                                               返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                                          返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                                  返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                                返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                                       返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                                   返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                                     返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                                        返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                                      返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                                  返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                                         返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                                            返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                                返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                                  返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                                   返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                                           返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                                      返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                                 返回结果.响应返回的业务数据.当前业务结果.是否第一页
     
     * @version 1.0
     * @example 暂无
     */
    function GetOrderRecordInfoList(objParam) {
        var objeResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：更新某条订单信息
     * @description **POST** /api/v1/bam/user/orderRecord/update/{orderRecordID}      (orderRecordID为要更新的该订单的id号)
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_UpdateOrderRecordInfo
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {Integer} objParam.reqParam.productAmount                要传入的参数.请求的业务参数.订单号id
     * @param {Double} objParam.reqParam.sumPrice                      要传入的参数.请求的业务参数.订单总金额
     * @param {Double} objParam.reqParam.actualSumPrice                要传入的参数.请求的业务参数.实际总金额
     * @param {Byte} objParam.reqParam.purchaseWay                     要传入的参数.请求的业务参数.购买方试
     * @param {string} objParam.reqParam.status                        要传入的参数.请求的业务参数.订单状态
     * @param {Byte} objParam.reqParam.isValid                         要传入的参数.请求的业务参数.订单是否有效
     * @param {string} objParam.reqParam.productName                   要传入的参数.请求的业务参数.产品名称
     * @param {Double} objParam.reqParam.productPrice                  要传入的参数.请求的业务参数.产品价格
     * 
     * @param {object} objResult                                                                   返回结果
     * @param {string} objResult.resID                                                             返回结果.响应ID
     * @param {string} objResult.reqId                                                             返回结果.请求的ID
     * @param {string} objResult.reqType                                                           返回结果.请求类型
     * @param {object} objResult.resResult                                                         返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                 返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.backOrderRecordVO                               返回结果.响应返回的业务数据.当前业务结果.订单记录
     * @param {string} objResult.resResult.curData.backOrderRecordVO.orderRecordID                 返回结果.响应返回的业务数据.当前业务结果.订单记录.订单记录ID
     * @param {string} objResult.resResult.curData.backOrderRecordVO.userId                        返回结果.响应返回的业务数据.当前业务结果.订单记录.用户ID
     * @param {byte}   objResult.resResult.curData.backOrderRecordVO.purchaseWay                   返回结果.响应返回的业务数据.当前业务结果.订单记录.购买方式
     * @param {string} objResult.resResult.curData.backOrderRecordVO.productName                   返回结果.响应返回的业务数据.当前业务结果.订单记录.产品名字
     * @param {string} objResult.resResult.curData.backOrderRecordVO.wechatName                    返回结果.响应返回的业务数据.当前业务结果.订单记录.微信昵称
     * @param {Integer} objResult.resResult.curData.backOrderRecordVO.productAmount                返回结果.响应返回的业务数据.当前业务结果.订单记录.产品数量
     * @param {double} objResult.resResult.curData.backOrderRecordVO.productPrice                  返回结果.响应返回的业务数据.当前业务结果.订单记录.产品价格
     * @param {double} objResult.resResult.curData.backOrderRecordVO.sumPrice                      返回结果.响应返回的业务数据.当前业务结果.订单记录.价格的总价格
     * @param {double} objResult.resResult.curData.backOrderRecordVO.actualSumPrice                返回结果.响应返回的业务数据.当前业务结果.订单记录.实际支付的价格
     * @param {timestamp} objResult.resResult.curData.backOrderRecordVO.createTime                 返回结果.响应返回的业务数据.当前业务结果.订单记录.订单创建时间
     * @param {Byte} objResult.resResult.curData.backOrderRecordVO.isValid                         返回结果.响应返回的业务数据.当前业务结果.订单记录.是否有效
     * @param {string} objResult.resResult.curData.backOrderRecordVO.status                        返回结果.响应返回的业务数据.当前业务结果.订单记录.订单状态
* @version 1.0
     * @example 暂无
     */
    function UpdateOrderRecordInfo(objParam) {
        var objeResult = {};
        return objResult;
    }

     /**
     * @summary 实现功能：获取用户金币明细信息
     * @description **GET** /api/v1/bam/user/userDetail/userCoinDetails
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_GetUserCoinDetails
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户id
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                                     返回结果
     * @param {string} objResult.resID                                                               返回结果.响应ID
     * @param {string} objResult.reqId                                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                                             返回结果.请求类型
     * @param {object} objResult.resResult                                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                   返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.coinDetails                                       返回结果.响应返回的业务数据.当前业务结果.用户金币明细
     * @param {object} objResult.resResult.curData.coinDetails[i]                                    返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i]
     * @param {string} objResult.resResult.curData.coinDetails[i].userCoinDetailId                   返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].金币明细ID
     * @param {string} objResult.resResult.curData.coinDetails[i].userCoinDetailNo                   返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].金币明细编码
     * @param {string} objResult.resResult.curData.coinDetails[i].userId                             返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].用户ID
     * @param {string} objResult.resResult.curData.coinDetails[i].userNo                             返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].用户编码
     * @param {timestamp} objResult.resResult.curData.coinDetails[i].occurTime                       返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].业务发生时间
     * @param {Integer} objResult.resResult.curData.coinDetails[i].originalAmount                    返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].初始金币数量
     * @param {Integer} objResult.resResult.curData.coinDetails[i].acquiredAmount                    返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].获取金币数量
     * @param {Integer} objResult.resResult.curData.coinDetails[i].lossAmount                        返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].损失金币数量
     * @param {Integer} objResult.resResult.curData.coinDetails[i].currentAmount                     返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].当前金币数量
     * @param {string} objResult.resResult.curData.coinDetails[i].reasonType                         返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].原因类型
     * @param {string} objResult.resResult.curData.coinDetails[i].matchRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].战局ID
     * @param {string} objResult.resResult.curData.coinDetails[i].matchRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].战局编码
     * @param {string} objResult.resResult.curData.coinDetails[i].orderRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].订单ID
     * @param {string} objResult.resResult.curData.coinDetails[i].orderRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].订单编码
     * @param {timestamp} objResult.resResult.curData.coinDetails[i].createTime                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].创建时间
     * @param {string} objResult.resResult.curData.coinDetails[i].createUser                         返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].创建者
     * @param {timestamp} objResult.resResult.curData.coinDetails[i].lastUpTime                      返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].更新时间
     * @param {string} objResult.resResult.curData.coinDetails[i].lastUpUser                         返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].跟新者
     * @param {string} objResult.resResult.curData.coinDetails[i].remark                             返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].备注
     * @param {Byte} objResult.resResult.curData.coinDetails[i].isValid                              返回结果.响应返回的业务数据.当前业务结果.用户金币明细[i].是否有效
     * @param {object} objResult.resResult.curData.pageable                                          返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                                     返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                             返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                           返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                                  返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                              返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                                返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                                   返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                                 返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                             返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                                    返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                                       返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                           返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                             返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                              返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                                      返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                                 返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                            返回结果.响应返回的业务数据.当前业务结果.是否第一页
     
     * @version 1.0
     * @example 暂无
     */
    function GetUserCoinDetails(objParam) {
        var objeResult = {};
        return objResult;
    }

     /**
     * @summary 实现功能：获取用户绩点明细信息
     * @description **GET** /api/v1/bam/user/userDetail/userGPDetails
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_GetUserGPDetails
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户id
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                                   返回结果
     * @param {string} objResult.resID                                                             返回结果.响应ID
     * @param {string} objResult.reqId                                                             返回结果.请求的ID
     * @param {string} objResult.reqType                                                           返回结果.请求类型
     * @param {object} objResult.resResult                                                         返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                 返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.GPDetails                                       返回结果.响应返回的业务数据.当前业务结果.用户绩点明细
     * @param {object} objResult.resResult.curData.GPDetails[i]                                    返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i]
     * @param {string} objResult.resResult.curData.GPDetails[i].userGPDetailId                     返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].绩点明细ID
     * @param {string} objResult.resResult.curData.GPDetails[i].userGPDetailNo                     返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].绩点明细编码
     * @param {string} objResult.resResult.curData.GPDetails[i].userId                             返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].用户ID
     * @param {string} objResult.resResult.curData.GPDetails[i].userNo                             返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].用户编码
     * @param {timestamp} objResult.resResult.curData.GPDetails[i].occurTime                       返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].业务发生时间
     * @param {Integer} objResult.resResult.curData.GPDetails[i].originalAmount                    返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].初始金币数量
     * @param {Integer} objResult.resResult.curData.GPDetails[i].acquiredAmount                    返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].获取金币数量
     * @param {Integer} objResult.resResult.curData.GPDetails[i].lossAmount                        返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].损失金币数量
     * @param {Integer} objResult.resResult.curData.GPDetails[i].currentAmount                     返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].当前金币数量
     * @param {string} objResult.resResult.curData.GPDetails[i].reasonType                         返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].原因类型
     * @param {string} objResult.resResult.curData.GPDetails[i].matchRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].战局ID
     * @param {string} objResult.resResult.curData.GPDetails[i].matchRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].战局编码
     * @param {string} objResult.resResult.curData.GPDetails[i].orderRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].订单ID
     * @param {string} objResult.resResult.curData.GPDetails[i].orderRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].订单编码
     * @param {timestamp} objResult.resResult.curData.GPDetails[i].createTime                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].创建时间
     * @param {string} objResult.resResult.curData.GPDetails[i].createUser                         返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].创建者
     * @param {timestamp} objResult.resResult.curData.GPDetails[i].lastUpTime                      返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].更新时间
     * @param {string} objResult.resResult.curData.GPDetails[i].lastUpUser                         返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].跟新者
     * @param {string} objResult.resResult.curData.GPDetails[i].remark                             返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].备注
     * @param {Byte} objResult.resResult.curData.GPDetails[i].isValid                              返回结果.响应返回的业务数据.当前业务结果.用户绩点明细[i].是否有效
     * @param {object} objResult.resResult.curData.pageable                                        返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                                   返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                           返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                         返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                                返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                            返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                              返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                                 返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                               返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                           返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                                  返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                                     返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                         返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                           返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                            返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                                    返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                               返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                          返回结果.响应返回的业务数据.当前业务结果.是否第一页
     
     * @version 1.0
     * @example 暂无
     */
    function GetUserGPDetails(objParam) {
        var objeResult = {};
        return objResult;
    }
    /**
     * @summary 实现功能：获取用户学点明细信息
     * @description **GET** /api/v1/bam/user/userDetail/userLPDetails
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_USR_010_GetUserLPDetails
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户id
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                                   返回结果
     * @param {string} objResult.resID                                                             返回结果.响应ID
     * @param {string} objResult.reqId                                                             返回结果.请求的ID
     * @param {string} objResult.reqType                                                           返回结果.请求类型
     * @param {object} objResult.resResult                                                         返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                 返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {object} objResult.resResult.curData.LPDetails                                       返回结果.响应返回的业务数据.当前业务结果.用户学点明细
     * @param {object} objResult.resResult.curData.LPDetails[i]                                    返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i]
     * @param {string} objResult.resResult.curData.LPDetails[i].userLPDetailId                     返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].学点明细ID
     * @param {string} objResult.resResult.curData.LPDetails[i].userLPDetailNo                     返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].学点明细编码
     * @param {string} objResult.resResult.curData.LPDetails[i].userId                             返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].用户ID
     * @param {string} objResult.resResult.curData.LPDetails[i].userNo                             返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].用户编码
     * @param {timestamp} objResult.resResult.curData.LPDetails[i].occurTime                       返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].业务发生时间
     * @param {Integer} objResult.resResult.curData.LPDetails[i].originalAmount                    返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].初始金币数量
     * @param {Integer} objResult.resResult.curData.LPDetails[i].acquiredAmount                    返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].获取金币数量
     * @param {Integer} objResult.resResult.curData.LPDetails[i].lossAmount                        返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].损失金币数量
     * @param {Integer} objResult.resResult.curData.LPDetails[i].currentAmount                     返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].当前金币数量
     * @param {string} objResult.resResult.curData.LPDetails[i].reasonType                         返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].原因类型
     * @param {string} objResult.resResult.curData.LPDetails[i].matchRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].战局ID
     * @param {string} objResult.resResult.curData.LPDetails[i].matchRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].战局编码
     * @param {string} objResult.resResult.curData.LPDetails[i].orderRecordId                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].订单ID
     * @param {string} objResult.resResult.curData.LPDetails[i].orderRecordNo                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].订单编码
     * @param {timestamp} objResult.resResult.curData.LPDetails[i].createTime                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].创建时间
     * @param {string} objResult.resResult.curData.LPDetails[i].createUser                         返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].创建者
     * @param {timestamp} objResult.resResult.curData.LPDetails[i].lastUpTime                      返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].更新时间
     * @param {string} objResult.resResult.curData.LPDetails[i].lastUpUser                         返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].跟新者
     * @param {string} objResult.resResult.curData.LPDetails[i].remark                             返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].备注
     * @param {Byte} objResult.resResult.curData.LPDetails[i].isValid                              返回结果.响应返回的业务数据.当前业务结果.用户学点明细[i].是否有效
     * @param {object} objResult.resResult.curData.pageable                                        返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                                   返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                           返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                         返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                                返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                            返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                              返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                                 返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                               返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                           返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                                  返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                                     返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                         返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                           返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                            返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                                    返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                               返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                          返回结果.响应返回的业务数据.当前业务结果.是否第一页
     
     * @version 1.0
     * @example 暂无
     */
    function GetUserLPDetails(objParam) {
        var objeResult = {};
        return objResult;
    }

}