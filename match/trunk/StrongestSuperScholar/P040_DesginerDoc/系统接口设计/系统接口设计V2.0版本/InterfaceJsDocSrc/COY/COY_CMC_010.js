﻿/** 
 * @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_社区模块部分
 *              <br/> //  * 创建标志：程志强 2018年09月11日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：训练营界面展示相关接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *               (a) getSpecialTrainingMembers : 返回训练营所有成员信息
 *              <br/> //  *               (b) addNewMember : 点击按钮，邀请新成员
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 程志强
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：社区模块接口设计
 * @memberOf COY
 * @description
 */
function COY_CMC_010()
{

    /**
     * @summary 实现功能：返回训练营所有成员信息
     * @description **POST** /api/v1/community/getMembers
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: COY_CMC_010_getSpecialTrainingMembers
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {object} objParam.pageInfo                               要传入的参数.分页信息
     * @param {Integer} objParam.pageInfo.pageSize                     要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.pageInfo.curPage                      要传入的参数.分页信息.页码

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {array} objResult.resResult.membersVOList                              返回结果.响应返回的业务数据.训练营成员VO视图列表
     * @param {array} objResult.resResult.membersVOList[i]                           返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员
     * @param {string} objResult.resResult.membersVOList[i].userID                   返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户Id
     * @param {string} objResult.resResult.membersVOList[i].wechatName               返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户微信名
     * @param {string} objResult.resResult.membersVOList[i].lastUserId               返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户父节点Id
     * @param {string} objResult.resResult.membersVOList[i].communityRoleId          返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区中的角色Id
     * @param {string} objResult.resResult.membersVOList[i].treeNodeCode             返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户的树形结点Id
     * @param {number} objResult.resResult.membersVOList[i].isLeafNode                 返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户是否是叶子节点
     * @param {string} objResult.resResult.membersVOList[i].communityRoleName        返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区中的角色名
     * @param {string} objResult.resResult.membersVOList[i].level                    返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区的等级
     * @version 1.0
     * @example 暂无
     */
    function getSpecialTrainingMembers(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能： 为训练营添加新的用户
     * @description  POST  /api/v1/community/addMember/{newMember}   (newMember为要添加的新用户的id)
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: COY_CMC_010_addNewMember
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.当前自己用户Id(即使用者的id)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {array} objResult.resResult.membersVOList                              返回结果.响应返回的业务数据.训练营成员VO视图列表
     * @param {array} objResult.resResult.membersVOList[i]                           返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员
     * @param {string} objResult.resResult.membersVOList[i].userID                   返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户Id
     * @param {string} objResult.resResult.membersVOList[i].wechatName               返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户微信名
     * @param {string} objResult.resResult.membersVOList[i].lastUserId               返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户父节点Id
     * @param {string} objResult.resResult.membersVOList[i].communityRoleId          返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区中的角色Id
     * @param {string} objResult.resResult.membersVOList[i].treeNodeCode             返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户的树形结点Id
     * @param {Byte} objResult.resResult.membersVOList[i].isLeafNode                 返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户是否是叶子节点
     * @param {string} objResult.resResult.membersVOList[i].communityRoleName        返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区中的角色名
     * @param {string} objResult.resResult.membersVOList[i].level                    返回结果.响应返回的业务数据.训练营成员VO视图列表第i个成员.用户在社区的等级
     * @version 1.0
     * @example 暂无
     */
    function addNewMember(objParam) {
        var objResult = {};
        return objResult;
    }

}