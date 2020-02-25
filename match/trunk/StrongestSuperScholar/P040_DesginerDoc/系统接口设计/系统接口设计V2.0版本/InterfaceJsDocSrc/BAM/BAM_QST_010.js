/** 
 * @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_私有题库模块
 *              <br/> //  * 创建标志：孙伟浩 2018年10月13日创建
 *              <br/> //  * 标志编号：
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：选择题部分用例接口设计
 *              <br/> //  *          （1）本文件的接口清单如下：
 *              <br/> //  *               (a) SaveRecitationQuestion : 存储背诵题目
 *              <br/> //  *               (b) DeleteRecitationQuestion : 删除背诵题目
 *              <br/> //  *               (c) UpdateRecitationQuestion : 更新背诵题目
 *              <br/> //  *               (d) SaveMultipleChoiceQuestion : 存储选择题目(单选/多选共用)
 *              <br/> //  *               (e) DeleteMultipleChoiceQuestion : 删除选择题目
 *              <br/> //  *               (f) UpdateMultipleChoiceQuestion : 更新选择题目
 *              <br/> //  *               (g) GetQuestionList : 获取试题列表 
 *              <br/> //  *               (h) ChangeStatus : 更改试题状态 
 *              <br/> //  *               (i) GetQuestionDetail : 获取试题详细信息 
 *              <br/> //  *              
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 孙伟浩
 * @copyright 暂无
 */

/**
 * @class
 * @summary 实现功能：后台管理系统试题管理模块接口设计
 * @memberOf BAM           
 */
function BAM_QST_010() {

    /**
     * @summary 实现功能：存储背诵题目
     * @description **POST** /api/v1/bam/qst/questionRecitation
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_SaveRecitationQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.knowledgeId                   要传入的参数.请求的业务参数.知识点Id
     * @param {string} objParam.reqParam.courseShortName               要传入的参数.请求的业务参数.课程简称
     * @param {string} objParam.reqParam.gradeShortName                要传入的参数.请求的业务参数.年级简称
     * @param {string} objParam.reqParam.question                      要传入的参数.请求的业务参数.问题内容
     * @param {string} objParam.reqParam.provider                      要传入的参数.请求的业务参数.提供者Id
     * @param {string} objParam.reqParam.personInCharge                要传入的参数.请求的业务参数.负责人Id
     * @param {string} objParam.reqParam.reference                     要传入的参数.请求的业务参数.引用出处
     * @param {int}    objParam.reqParam.questionLevel                 要传入的参数.请求的业务参数.级别
     * @param {double} objParam.reqParam.difficulty                    要传入的参数.请求的业务参数.难度系数
     * @param {double} objParam.reqParam.coinWeight                    要传入的参数.请求的业务参数.金币权值
     * @param {double} objParam.reqParam.gpWeight                      要传入的参数.请求的业务参数.绩点权值
     * @param {string} objParam.reqParam.answer                        要传入的参数.请求的业务参数.答案
     * @param {string} objParam.reqParam.questionAnalyze               要传入的参数.请求的业务参数.解析
     * @param {int}    objParam.reqParam.recommendTime                 要传入的参数.请求的业务参数.推荐答题时间, 以秒为单位
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {string} objParam.reqParam.part                          要传入的参数.请求的业务参数.节选内容
     * @param {byte}   objParam.reqParam.isPartial                     要传入的参数.请求的业务参数.是否节选
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {string} objResult.resResult.curData.questionId                        返回结果.响应返回的业务数据.当前业务结果.背诵题Id
     * @param {string} objResult.resResult.curData.gradeShortName                    返回结果.响应返回的业务数据.当前业务结果.年级简称
     * @param {string} objResult.resResult.curData.courseShortName                   返回结果.响应返回的业务数据.当前业务结果.课程简称
     * @param {object} objResult.resResult.curData.question                           返回结果.响应返回的业务数据.当前业务结果.问题内容
     * @param {string} objResult.resResult.curData.answer                             返回结果.响应返回的业务数据.当前业务结果.答案
     * @param {string} objResult.resResult.curData.part                               返回结果.响应返回的业务数据.当前业务结果.节选内容
     * @param {byte}   objResult.resResult.curData.isPartial                          返回结果.响应返回的业务数据.当前业务结果.是否节选
     * @param {object} objResult.resResult.curData.questionAnalyze                    返回结果.响应返回的业务数据.当前业务结果.解析
     * @param {object} objResult.resResult.curData.questionLevel                      返回结果.响应返回的业务数据.当前业务结果.问题级别
     * @param {string} objResult.resResult.curData.difficulty                         返回结果.响应返回的业务数据.当前业务结果.难度系数
     * @param {object} objResult.resResult.curData.coinWeight                         返回结果.响应返回的业务数据.当前业务结果.金币权值
     * @param {string} objResult.resResult.curData.gpWeight                           返回结果.响应返回的业务数据.当前业务结果.绩点权值
     * @param {string} objResult.resResult.curData.recommendTime                      返回结果.响应返回的业务数据.当前业务结果.推荐答题时间
     * @param {byte}   objResult.resResult.curData.isValid                            返回结果.响应返回的业务数据.当前业务结果.是否有效
     * @param {String} objResult.resResult.curData.questionTypeName                   返回结果.响应返回的业务数据.当前业务结果.题目类型     
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function SaveRecitationQuestion(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：删除背诵题目
     * @description **POST** /api/v1/bam/qst/questionRecitation/delete
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_DeleteRecitationQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数(无)
     * @param {string} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果(null)
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function DeleteRecitationQuestion(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：更新背诵题目
     * @description **POST** /api/v1/bam/qst/questionRecitation/update
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_UpdateRecitationQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
     * @param {string} objParam.reqParam.knowledgeId                   要传入的参数.请求的业务参数.知识点Id
     * @param {string} objParam.reqParam.courseShortName               要传入的参数.请求的业务参数.课程简称
     * @param {string} objParam.reqParam.gradeShortName                要传入的参数.请求的业务参数.年级简称
     * @param {string} objParam.reqParam.question                      要传入的参数.请求的业务参数.问题内容
     * @param {string} objParam.reqParam.provider                      要传入的参数.请求的业务参数.提供者Id
     * @param {string} objParam.reqParam.personInCharge                要传入的参数.请求的业务参数.负责人Id
     * @param {string} objParam.reqParam.reference                     要传入的参数.请求的业务参数.引用出处
     * @param {int}    objParam.reqParam.questionLevel                 要传入的参数.请求的业务参数.级别
     * @param {double} objParam.reqParam.difficulty                    要传入的参数.请求的业务参数.难度系数
     * @param {double} objParam.reqParam.coinWeight                    要传入的参数.请求的业务参数.金币权值
     * @param {double} objParam.reqParam.gpWeight                      要传入的参数.请求的业务参数.绩点权值
     * @param {string} objParam.reqParam.answer                        要传入的参数.请求的业务参数.答案
     * @param {string} objParam.reqParam.questionAnalyze               要传入的参数.请求的业务参数.解析
     * @param {int}    objParam.reqParam.recommendTime                 要传入的参数.请求的业务参数.推荐答题时间, 以秒为单位
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {string} objParam.reqParam.part                          要传入的参数.请求的业务参数.节选内容
     * @param {byte}   objParam.reqParam.isPartial                     要传入的参数.请求的业务参数.是否节选
     * @param {byte}   objParam.reqParam.isValid                       要传入的参数.请求的业务参数.是否有效
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {string} objResult.resResult.curData.questionId                        返回结果.响应返回的业务数据.当前业务结果.背诵题Id
     * @param {string} objResult.resResult.curData.gradeShortName                    返回结果.响应返回的业务数据.当前业务结果.年级简称
     * @param {string} objResult.resResult.curData.courseShortName                   返回结果.响应返回的业务数据.当前业务结果.课程简称
     * @param {object} objResult.resResult.curData.question                           返回结果.响应返回的业务数据.当前业务结果.问题内容
     * @param {string} objResult.resResult.curData.answer                             返回结果.响应返回的业务数据.当前业务结果.答案
     * @param {string} objResult.resResult.curData.part                               返回结果.响应返回的业务数据.当前业务结果.节选内容
     * @param {byte}   objResult.resResult.curData.isPartial                          返回结果.响应返回的业务数据.当前业务结果.是否节选
     * @param {object} objResult.resResult.curData.questionAnalyze                    返回结果.响应返回的业务数据.当前业务结果.解析
     * @param {object} objResult.resResult.curData.questionLevel                      返回结果.响应返回的业务数据.当前业务结果.问题级别
     * @param {string} objResult.resResult.curData.difficulty                         返回结果.响应返回的业务数据.当前业务结果.难度系数
     * @param {object} objResult.resResult.curData.coinWeight                         返回结果.响应返回的业务数据.当前业务结果.金币权值
     * @param {string} objResult.resResult.curData.gpWeight                           返回结果.响应返回的业务数据.当前业务结果.绩点权值
     * @param {string} objResult.resResult.curData.recommendTime                      返回结果.响应返回的业务数据.当前业务结果.推荐答题时间
     * @param {byte}   objResult.resResult.curData.isValid                            返回结果.响应返回的业务数据.当前业务结果.是否有效
     * @param {String} objResult.resResult.curData.questionTypeName                   返回结果.响应返回的业务数据.当前业务结果.题目类型          
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function UpdateRecitationQuestion(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：存储选择题目
     * @description **POST** /api/v1/bam/qst/questionMultipleChoice
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_SaveMultipleChoiceQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.knowledgeId                   要传入的参数.请求的业务参数.知识点Id
     * @param {string} objParam.reqParam.courseShortName               要传入的参数.请求的业务参数.课程简称
     * @param {string} objParam.reqParam.gradeShortName                要传入的参数.请求的业务参数.年级简称
     * @param {string} objParam.reqParam.question                      要传入的参数.请求的业务参数.问题内容(多选请用逗号分隔每个选项)
     * @param {string} objParam.reqParam.provider                      要传入的参数.请求的业务参数.提供者Id
     * @param {string} objParam.reqParam.personInCharge                要传入的参数.请求的业务参数.负责人Id
     * @param {string} objParam.reqParam.reference                     要传入的参数.请求的业务参数.引用出处
     * @param {int}    objParam.reqParam.questionLevel                 要传入的参数.请求的业务参数.级别
     * @param {double} objParam.reqParam.difficulty                    要传入的参数.请求的业务参数.难度系数
     * @param {double} objParam.reqParam.coinWeight                    要传入的参数.请求的业务参数.金币权值
     * @param {double} objParam.reqParam.gpWeight                      要传入的参数.请求的业务参数.绩点权值
     * @param {string} objParam.reqParam.answer                        要传入的参数.请求的业务参数.答案
     * @param {string} objParam.reqParam.questionAnalyze               要传入的参数.请求的业务参数.解析
     * @param {int}    objParam.reqParam.recommendTime                 要传入的参数.请求的业务参数.推荐答题时间, 以秒为单位
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {string} objParam.reqParam.choiceA                       要传入的参数.请求的业务参数.A选项内容
     * @param {string} objParam.reqParam.choiceB                       要传入的参数.请求的业务参数.B选项内容
     * @param {string} objParam.reqParam.choiceC                       要传入的参数.请求的业务参数.C选项内容
     * @param {string} objParam.reqParam.choiceD                       要传入的参数.请求的业务参数.D选项内容
     * @param {String} objParam.reqParam.questionTypeName              要传入的参数.请求的业务参数.题目类型(选择题/背诵题)
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {string} objResult.resResult.curData.questionId                        返回结果.响应返回的业务数据.当前业务结果.背诵题Id
     * @param {string} objResult.resResult.curData.gradeShortName                    返回结果.响应返回的业务数据.当前业务结果.年级简称
     * @param {string} objResult.resResult.curData.courseShortName                   返回结果.响应返回的业务数据.当前业务结果.课程简称
     * @param {object} objResult.resResult.curData.question                           返回结果.响应返回的业务数据.当前业务结果.问题内容
     * @param {string} objResult.resResult.curData.answer                             返回结果.响应返回的业务数据.当前业务结果.答案
     * @param {string} objResult.resResult.curData.choiceA                            返回结果.响应返回的业务数据.当前业务结果.A选项内容
     * @param {string} objResult.resResult.curData.choiceB                            返回结果.响应返回的业务数据.当前业务结果.B选项内容
     * @param {string} objResult.resResult.curData.choiceC                            返回结果.响应返回的业务数据.当前业务结果.C选项内容
     * @param {string} objResult.resResult.curData.choiceD                            返回结果.响应返回的业务数据.当前业务结果.D选项内容
     * @param {object} objResult.resResult.curData.questionAnalyze                    返回结果.响应返回的业务数据.当前业务结果.解析
     * @param {object} objResult.resResult.curData.questionLevel                      返回结果.响应返回的业务数据.当前业务结果.问题级别
     * @param {string} objResult.resResult.curData.difficulty                         返回结果.响应返回的业务数据.当前业务结果.难度系数
     * @param {object} objResult.resResult.curData.coinWeight                         返回结果.响应返回的业务数据.当前业务结果.金币权值
     * @param {string} objResult.resResult.curData.gpWeight                           返回结果.响应返回的业务数据.当前业务结果.绩点权值
     * @param {string} objResult.resResult.curData.recommendTime                      返回结果.响应返回的业务数据.当前业务结果.推荐答题时间
     * @param {byte}   objResult.resResult.curData.isValid                            返回结果.响应返回的业务数据.当前业务结果.是否有效
     * @param {String} objResult.resResult.curData.questionTypeName                   返回结果.响应返回的业务数据.当前业务结果.题目类型               
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function SaveMultipleChoiceQuestion(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：删除选择题目
     * @description **POST** /api/v1/bam/qst/questionMultipleChoice/delete
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_DeleteMultipleChoiceQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果(null)
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function DeleteMultipleChoiceQuestion(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：更新选择题目
     * @description **POST** /api/v1/bam/qst/questionMultipleChoice/update
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_UpdateMultipleChoiceQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
     * @param {string} objParam.reqParam.knowledgeId                   要传入的参数.请求的业务参数.知识点Id
     * @param {string} objParam.reqParam.courseShortName               要传入的参数.请求的业务参数.课程简称
     * @param {string} objParam.reqParam.gradeShortName                要传入的参数.请求的业务参数.年级简称
     * @param {string} objParam.reqParam.question                      要传入的参数.请求的业务参数.问题内容
     * @param {string} objParam.reqParam.provider                      要传入的参数.请求的业务参数.提供者Id
     * @param {string} objParam.reqParam.personInCharge                要传入的参数.请求的业务参数.负责人Id
     * @param {string} objParam.reqParam.reference                     要传入的参数.请求的业务参数.引用出处
     * @param {int}    objParam.reqParam.questionLevel                 要传入的参数.请求的业务参数.级别
     * @param {double} objParam.reqParam.difficulty                    要传入的参数.请求的业务参数.难度系数
     * @param {double} objParam.reqParam.coinWeight                    要传入的参数.请求的业务参数.金币权值
     * @param {double} objParam.reqParam.gpWeight                      要传入的参数.请求的业务参数.绩点权值
     * @param {string} objParam.reqParam.answer                        要传入的参数.请求的业务参数.答案
     * @param {string} objParam.reqParam.questionAnalyze               要传入的参数.请求的业务参数.解析
     * @param {int}    objParam.reqParam.recommendTime                 要传入的参数.请求的业务参数.推荐答题时间, 以秒为单位
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {string} objParam.reqParam.choiceA                       要传入的参数.请求的业务参数.A选项内容
     * @param {string} objParam.reqParam.choiceB                       要传入的参数.请求的业务参数.B选项内容
     * @param {string} objParam.reqParam.choiceC                       要传入的参数.请求的业务参数.C选项内容
     * @param {string} objParam.reqParam.choiceD                       要传入的参数.请求的业务参数.D选项内容
     * @param {byte}   objParam.reqParam.isValid                       要传入的参数.请求的业务参数.是否有效
     * @param {String} objParam.reqParam.questionTypeName              要传入的参数.请求的业务参数.题目类型(选择题/背诵题)
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {string} objResult.resResult.curData.questionId                        返回结果.响应返回的业务数据.当前业务结果.背诵题Id
     * @param {string} objResult.resResult.curData.questionNo                        返回结果.响应返回的业务数据.当前业务结果.背诵题编号
     * @param {string} objResult.resResult.curData.questionCode                      返回结果.响应返回的业务数据.当前业务结果.背诵题编码
     * @param {string} objResult.resResult.curData.knowledgeId                       返回结果.响应返回的业务数据.当前业务结果.知识点Id
     * @param {string} objResult.resResult.curData.knowledgeContent                  返回结果.响应返回的业务数据.当前业务结果.知识点内容
     * @param {string} objResult.resResult.curData.gradeId                           返回结果.响应返回的业务数据.当前业务结果.年级Id
     * @param {string} objResult.resResult.curData.gradeShortName                    返回结果.响应返回的业务数据.当前业务结果.年级简称
     * @param {string} objResult.resResult.curData.gradeName                         返回结果.响应返回的业务数据.当前业务结果.年级名
     * @param {string} objResult.resResult.curData.subjectId                         返回结果.响应返回的业务数据.当前业务结果.学科Id
     * @param {string} objResult.resResult.curData.subjectShortName                  返回结果.响应返回的业务数据.当前业务结果.学科简称
     * @param {string} objResult.resResult.curData.subjectName                       返回结果.响应返回的业务数据.当前业务结果.学科名
     * @param {string} objResult.resResult.curData.courseId                          返回结果.响应返回的业务数据.当前业务结果.课程Id
     * @param {string} objResult.resResult.curData.courseShortName                   返回结果.响应返回的业务数据.当前业务结果.课程简称
     * @param {string} objResult.resResult.curData.courseName                         返回结果.响应返回的业务数据.当前业务结果.课程名 
     * @param {object} objResult.resResult.curData.question                           返回结果.响应返回的业务数据.当前业务结果.问题内容
     * @param {string} objResult.resResult.curData.answer                             返回结果.响应返回的业务数据.当前业务结果.答案
     * @param {string} objResult.resResult.curData.choiceA                            返回结果.响应返回的业务数据.当前业务结果.A选项内容
     * @param {string} objResult.resResult.curData.choiceB                            返回结果.响应返回的业务数据.当前业务结果.B选项内容
     * @param {string} objResult.resResult.curData.choiceC                            返回结果.响应返回的业务数据.当前业务结果.C选项内容
     * @param {string} objResult.resResult.curData.choiceD                            返回结果.响应返回的业务数据.当前业务结果.D选项内容
     * @param {object} objResult.resResult.curData.questionAnalyze                    返回结果.响应返回的业务数据.当前业务结果.解析
     * @param {string} objResult.resResult.curData.reference                          返回结果.响应返回的业务数据.当前业务结果.引用出处
     * @param {object} objResult.resResult.curData.questionLevel                      返回结果.响应返回的业务数据.当前业务结果.问题级别
     * @param {string} objResult.resResult.curData.difficulty                         返回结果.响应返回的业务数据.当前业务结果.难度系数
     * @param {object} objResult.resResult.curData.coinWeight                         返回结果.响应返回的业务数据.当前业务结果.金币权值
     * @param {string} objResult.resResult.curData.gpWeight                           返回结果.响应返回的业务数据.当前业务结果.绩点权值
     * @param {string} objResult.resResult.curData.recommendTime                      返回结果.响应返回的业务数据.当前业务结果.推荐答题时间
     * @param {byte}   objResult.resResult.curData.isValid                            返回结果.响应返回的业务数据.当前业务结果.是否有效
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function UpdateMultipleChoiceQuestion(objParam) {
        var objResult = {};
        return objResult;
    }


    /**
     * @summary 实现功能：获取所有符合条件的试题
     * @description **GET** /api/v1/bam/qst/list
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_GetQuestionList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数(检索条件)
     * @param {string} objParam.reqParam.questionTypeName              要传入的参数.请求的业务参数.试题类型(多选题/单选题/背诵题)
     * @param {string} objParam.reqParam.isValid                       要传入的参数.请求的业务参数.是否有效
     * @param {string} objParam.reqParam.gradeShortName                要传入的参数.请求的业务参数.年级简称
     * @param {string} objParam.reqParam.courseShortName               要传入的参数.请求的业务参数.课程简称
     * @param {int}    objParam.reqParam.question                      要传入的参数.请求的业务参数.试题题干(模糊搜索)
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                            要传入的参数.分页信息
     * @param {Integer} objParam.reqPageInfo.pageSize                  要传入的参数.分页信息.页面大小
     * @param {Integer} objParam.reqPageInfo.curPage                   要传入的参数.分页信息.页码
     * 
     * @param {object} objResult                                                                             返回结果
     * @param {string} objResult.resID                                                                       返回结果.响应ID
     * @param {string} objResult.reqId                                                                       返回结果.请求的ID
     * @param {string} objResult.reqType                                                                     返回结果.请求类型
     * @param {Object} objResult.resResult                                                                   返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                                           返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {array}  objResult.resResult.curData.content                                返回结果.响应返回的业务数据.当前业务结果.内容列表
     * @param {object} objResult.resResult.curData.content【i】                           返回结果.响应返回的业务数据.当前业务结果.内容列表.第i条记录
     * @param {string} objResult.resResult.curData.content【i】.questionId                返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.选择题Id
     * @param {string} objResult.resResult.curData.content【i】.gradeShortName            返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.年级简称
     * @param {string} objResult.resResult.curData.content【i】.courseShortName           返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.课程简称
     * @param {object} objResult.resResult.curData.content【i】.question                  返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.问题内容
     * @param {string} objResult.resResult.curData.content【i】.isValid                   返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.是否有效
     * @param {string} objResult.resResult.curData.content【i】.questionTypeName          返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.试题类型
     * @param {string} objResult.resResult.curData.content【i】.adminName                 返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.管理员名称
     * @param {string} objResult.resResult.curData.content【i】.createTime                返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.创建时间
     * @param {object} objResult.resResult.curData.content【i】.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.解析
     * @param {object} objResult.resResult.curData.content【i】.questionLevel             返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.问题级别
     * @param {string} objResult.resResult.curData.content【i】.difficulty                返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.难度系数
     * @param {object} objResult.resResult.curData.content【i】.coinWeight                返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.金币权值
     * @param {string} objResult.resResult.curData.content【i】.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.内容列表【i】.绩点权值
     * @param {object} objResult.resResult.curData.pageable                               返回结果.响应返回的业务数据.当前业务结果.分页信息
     * @param {object} objResult.resResult.curData.pageable.sort                          返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息
     * @param {boolean} objResult.resResult.curData.pageable.sort.sorted                  返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.排序
     * @param {boolean} objResult.resResult.curData.pageable.sort.unsorted                返回结果.响应返回的业务数据.当前业务结果.分页信息.排序信息.未排序
     * @param {Integer} objResult.resResult.curData.pageable.offset                       返回结果.响应返回的业务数据.当前业务结果.分页信息.偏移量
     * @param {Integer} objResult.resResult.curData.pageable.pageNumber                   返回结果.响应返回的业务数据.当前业务结果.分页信息.页码
     * @param {Integer} objResult.resResult.curData.pageable.pageSize                     返回结果.响应返回的业务数据.当前业务结果.分页信息.页面大小
     * @param {boolean} objResult.resResult.curData.pageable.paged                        返回结果.响应返回的业务数据.当前业务结果.分页信息.分页
     * @param {boolean} objResult.resResult.curData.pageable.unpaged                      返回结果.响应返回的业务数据.当前业务结果.分页信息.未分页
     * @param {boolean} objResult.resResult.curData.last                                  返回结果.响应返回的业务数据.当前业务结果.是否最后一页
     * @param {Integer} objResult.resResult.curData.totalElements                         返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {Integer} objResult.resResult.curData.totalPages                            返回结果.响应返回的业务数据.当前业务结果.页面数目
     * @param {Integer} objResult.resResult.curData.number                                返回结果.响应返回的业务数据.当前业务结果.页面索引
     * @param {Integer} objResult.resResult.curData.size                                  返回结果.响应返回的业务数据.当前业务结果.页面大小
     * @param {object} objResult.resResult.curData.sort                                   返回结果.响应返回的业务数据.当前业务结果.排序信息
     * @param {boolean} objResult.resResult.curData.sort.sorted                           返回结果.响应返回的业务数据.当前业务结果.排序信息.排序
     * @param {Integer} objResult.resResult.curData.numberOfElements                      返回结果.响应返回的业务数据.当前业务结果.元素数目
     * @param {boolean} objResult.resResult.curData.first                                 返回结果.响应返回的业务数据.当前业务结果.是否第一页
     * @param {object} objResult.resResult.errorInfo                                                         返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                                                  返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetQuestionList(objParam) {
        var objeResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：更改试题状态
     * @description **POST** /api/v1/bam/qst/status
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_ChangeStatus
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数.试题Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {object} objResult.resResult.curData.newStatus                         返回结果.响应返回的业务数据.当前业务结果.新状态
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function ChangeStatus(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：获取试题详细信息, 用于点击修改后跳转到的页面的数据初始填充
     * @description **GET** /api/v1/bam/qst
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: BAM_QST_010_GetQuestionDetail
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
     * @param {object} objParam.reqParam.questionTypeName              要传入的参数.请求的业务参数.试题类型
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数.试题Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息(无)

     *
     * 对于选择题返回值同函数d, 对于背诵题返回值同函数a
     * @param {object} objResult                                                     返回结果
     * @param {string} objResult.resID                                               返回结果.响应ID
     * @param {string} objResult.reqId                                               返回结果.请求的ID
     * @param {string} objResult.reqType                                             返回结果.请求类型
     * @param {Object} objResult.resResult                                           返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                                   返回结果.响应返回的业务数据.当前业务结果
     * @param {object} objResult.resResult.errorInfo                                 返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)
     * @param {object} objResult.resRefData                                          返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetQuestionDetail(objParam) {
        var objResult = {};
        return objResult;
    }


}