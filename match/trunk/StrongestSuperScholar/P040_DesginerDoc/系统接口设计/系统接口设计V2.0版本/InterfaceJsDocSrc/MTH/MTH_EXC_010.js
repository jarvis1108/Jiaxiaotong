/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_知识练兵场模块
 *              <br/> //  * 创建标志：韩晓峰 2018年09月03日创建
 *              <br/> //  * 标志编号：13 韩晓峰 2018年09月03日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：兑换学点部分用例接口设计
 *              <br/> //  *          (1) 本文件的接口清单如下:
 *              <br/> //  *              (a)GetGradeList : 获取年级列表
 *              <br/> //  *              (b)GetSubjectList : 根据年级阶段Id和年级Id获取科目列表
 *              <br/> //  *              (c)Exercise : 生成知识练兵场战局信息
 *              <br/> //  *              (4)SaveLpConsumeRecord : 识练兵场每答完一道题发起请求，存储用户学点消耗记录
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 韩晓峰
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：知识练兵场模块接口设计
 * @memberOf MTH
 * @description                           
 */
function MTH_EXC_010() {

    /**
     * @summary 实现功能：获取所有年级信息列表
     * @description **GET** /api/v1/base/gradeInfo/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MTH_EXC_010_GetGradeList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array} objResult.resResult.curData.gradeInfoList                      返回结果.响应返回的业务数据.当前业务结果.年级列表
     * @param {object} objResult.resResult.curData.gradeInfoList【i】                  返回结果.响应返回的业务数据.当前业务结果.年级列表.第i条记录
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseRelId  返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段相关Id
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseId     返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段Id
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseNo     返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段编号
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseName        返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段名称
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseShortName   返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段简称
     * @param {object} objResult.resResult.curData.gradeInfoList【i】.gradePhaseCode        返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级阶段编码
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeId               返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级ID
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeNo          返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级编码
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeCode        返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级编号
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeName        返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级名称
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.gradeShortName   返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级名称缩写
     * @param {string} objResult.resResult.curData.gradeInfoList【i】.showText         返回结果.响应返回的业务数据.当前业务结果.年级列表【i】.年级展示文本  
     * @param {boolean} objResult.resResult.isSuccess                                返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                                   返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetGradeList(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：根据年级阶段Id和年级Id获取其所对应的所有科目信息
     * @description **GET** /api/v1/base/subject/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MTH_EXC_010_GetSubjectList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.gradePhaseId                  要传入的参数.请求的业务参数.年级阶段Id
     * @param {string} objParam.reqParam.gradeId                       要传入的参数.请求的业务参数.年级Id       如果为null，则传入"" 
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array} objResult.resResult.curData.subjectList                        返回结果.响应返回的业务数据.当前业务结果.科目列表
     * @param {object} objResult.resResult.curData.subjectList【i】                   返回结果.响应返回的业务数据.当前业务结果.科目列表.第i条记录
     * @param {object} objResult.resResult.curData.subjectList【i】.subjectId         返回结果.响应返回的业务数据.当前业务结果.科目列表【i】.科目Id
     * @param {object} objResult.resResult.curData.subjectList【i】.subjectNo         返回结果.响应返回的业务数据.当前业务结果.科目列表【i】.科目编码
     * @param {object} objResult.resResult.curData.subjectList【i】.subjectName       返回结果.响应返回的业务数据.当前业务结果.科目列表【i】.科目名称
     * @param {object} objResult.resResult.curData.subjectList【i】.subjectShortName  返回结果.响应返回的业务数据.当前业务结果.科目列表【i】.科目简称
     * @param {string} objResult.resResult.curData.subjectList【i】.showText          返回结果.响应返回的业务数据.当前业务结果.科目列表【i】.科目展示文本  
     * @param {boolean} objResult.resResult.isSuccess                                返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                                   返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetSubjectList(objParam) {
        var objeResult = {};
        return objResult;
    }



    /**
     * @summary 实现功能：生成知识练兵场战局信息
     * @description **POST** /api/v1/match/exercise
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MTH_EXC_010_Exercise
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {string} objParam.reqParam.subjectId                     要传入的参数.请求的业务参数.科目Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resId                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {string} objResult.resResult.curData.matchId                                    返回结果.响应返回的业务数据.当前业务结果.战局Id
     * @param {array}  objResult.resResult.curData.questionList                               返回结果.响应返回的业务数据.当前业务结果.题目列表
     * @param {object}  objResult.resResult.curData.questionList【i】                          返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录
     * @param {string} objResult.resResult.curData.questionList【i】.questionId                返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.试题Id
     * @param {string} objResult.resResult.curData.questionList【i】.questionNo                返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.试题编号
     * @param {string} objResult.resResult.curData.questionList【i】.questionCode              返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.试题编码
     * @param {string} objResult.resResult.curData.questionList【i】.question                  返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.题干
     * @param {string} objResult.resResult.curData.questionList【i】.choiceA                   返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.选项A
     * @param {string} objResult.resResult.curData.questionList【i】.choiceB                   返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.选项B
     * @param {string} objResult.resResult.curData.questionList【i】.choiceC                   返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.选项C
     * @param {string} objResult.resResult.curData.questionList【i】.choiceD                   返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.选项D
     * @param {string} objResult.resResult.curData.questionList【i】.answer                    返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.正确答案
     * @param {string} objResult.resResult.curData.questionList【i】.reference                 返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.引用出处
     * @param {string} objResult.resResult.curData.questionList【i】.questionLevel             返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.试题等级
     * @param {string} objResult.resResult.curData.questionList【i】.difficulty                返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.难度系数
     * @param {number} objResult.resResult.curData.questionList【i】.coinWeight                返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.金币权值
     * @param {number} objResult.resResult.curData.questionList【i】.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.绩点权值
     * @param {string} objResult.resResult.curData.questionList【i】.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.试题解析
     * @param {string} objResult.resResult.curData.questionList【i】.knowledgeId               返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.知识点Id
     * @param {string} objResult.resResult.curData.questionList【i】.content                   返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.知识点内容
     * @param {string} objResult.resResult.curData.questionList【i】.subjectId                 返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.科目Id
     * @param {string} objResult.resResult.curData.questionList【i】.subjectName               返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.科目名称
     * @param {string} objResult.resResult.curData.questionList【i】.subjectShortName          返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.科目简称
     * @param {string} objResult.resResult.curData.questionList【i】.courseId                  返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.课程Id
     * @param {string} objResult.resResult.curData.questionList【i】.courseName                返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.课程名称
     * @param {string} objResult.resResult.curData.questionList【i】.courseShortName           返回结果.响应返回的业务数据.当前业务结果.题目列表.第i条记录.课程简称
     * @param {boolean} objResult.resResult.isSuccess                                返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                                   返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function Exercise(objParam) {
        var objeResult = {};
        return objResult;
    }

     /**
     * @summary 实现功能：知识练兵场每答完一道题发起请求，存储用户学点消耗记录
     * @description **POST** /api/v1/match/exercise/save
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: MTH_EXC_010_SaveLpConsumeRecord
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.matchId                       要传入的参数.请求的业务参数.战局Id
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {number} objParam.reqParam.questionIndex                 要传入的参数.请求的业务参数.试题序号
     * @param {string} objParam.reqParam.userAnswer                    要传入的参数.请求的业务参数.用户答案
     * @param {number} objParam.reqParam.amount                        要传入的参数.请求的业务参数.学点消耗数量
     * @param {number} objParam.reqParam.isTrue                        要传入的参数.请求的业务参数.是否正确   1表示正确，0表示不正确
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID
     * @param {string} objResult.reqType                               返回结果.请求类型
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                     返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {boolean} objResult.resResult.isSuccess                  返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                     返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function SaveLpConsumeRecord(objParam) {
        var objeResult = {};
        return objResult;
    }
}