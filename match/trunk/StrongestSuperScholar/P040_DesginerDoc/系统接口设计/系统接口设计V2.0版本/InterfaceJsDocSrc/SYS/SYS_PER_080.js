/** @file
 * @description <br/>  //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_我的错题本及收藏题目部分
 *              <br/> //  * 创建标志：韩晓峰 2018年07月10日创建
 *              <br/> //  * 修改标志：
 *              <br/> //  * 标志编号：013 韩晓峰 2018年07月10日
 *              <br/> //  * 标志描述：
 *              <br/> //  * 附注说明：(1)我的错题本用例接口设计
 *              <br/> //  *         (2)本文件接口清单如下：
 *              <br/> //  *             (a)GetCollectionsList : 获取用户收藏的题目列表
 *              <br/> //  *             (b)CollectQuestion : 用户收藏某一题目
 *              <br/> //  *             (c)CancelCollection : 用户取消收藏某一题目
 *              <br/> //  *             (d)GetErrorQuestionList : 获取用户错题列表
 *              <br/> //  * 当前状态：【编码中】【编码完成】【测试完】【可以试用】【正式使用√】【作废停用】
 *              <br/> //  ******************************************************************
 * @author 韩晓峰
 * @copyright 暂无
 */

/**
 * @class
 * @summary 我的错题本及收藏题目部分接口定义
 * @memberOf SYS
 * @description
 */
function SYS_PER_080() {
    /**
     * @summary 实现功能：根据用户Id获取其所收藏的题目列表
     * @description **GET** /api/v1/qst/questionCollection/list
     * 
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_PER_080_GetCollectionsList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
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
     * @param {array}  objResult.resResult.curData.questionList                              返回结果.响应返回的业务数据.当前业务结果.收藏题目列表
     * @param {object} objResult.resResult.curData.questionList【i】                           返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录
     * @param {string} objResult.resResult.curData.questionList【i】.questionCollectionId      返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题收藏ID
     * @param {string} objResult.resResult.curData.questionList【i】.questionCollectionNo      返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题收藏编码
     * @param {string} objResult.resResult.curData.questionList【i】.userId                    返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.用户Id
     * @param {string} objResult.resResult.curData.questionList【i】.questionId                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题Id
     * @param {string} objResult.resResult.curData.questionList【i】.questionNo                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题编码
     * @param {string} objResult.resResult.curData.questionList【i】.questionCode              返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.题干
     * @param {string} objResult.resResult.curData.questionList【i】.question                  返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项A
     * @param {string} objResult.resResult.curData.questionList【i】.choiceA                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项B
     * @param {string} objResult.resResult.curData.questionList【i】.choiceB
     * @param {string} objResult.resResult.curData.questionList【i】.choiceC                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项C
     * @param {string} objResult.resResult.curData.questionList【i】.choiceD                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项D
     * @param {string} objResult.resResult.curData.questionList【i】.answer                    返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.正确答案
     * @param {string} objResult.resResult.curData.questionList【i】.reference                 返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.引用出处
     * @param {string} objResult.resResult.curData.questionList【i】.questionLevel             返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题等级
     * @param {string} objResult.resResult.curData.questionList【i】.difficulty                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.难度系数
     * @param {number} objResult.resResult.curData.questionList【i】.coinWeight                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.金币权值
     * @param {number} objResult.resResult.curData.questionList【i】.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.绩点权值
     * @param {string} objResult.resResult.curData.questionList【i】.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题解析
     * @param {string} objResult.resResult.curData.questionList【i】.knowledgeId               返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.知识点Id
     * @param {string} objResult.resResult.curData.questionList【i】.content                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.知识点内容
     * @param {string} objResult.resResult.curData.questionList【i】.subjectId                 返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目Id
     * @param {string} objResult.resResult.curData.questionList【i】.subjectName               返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目名称
     * @param {string} objResult.resResult.curData.questionList【i】.subjectShortName          返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目简称
     * @param {string} objResult.resResult.curData.questionList【i】.courseId                  返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程Id
     * @param {string} objResult.resResult.curData.questionList【i】.courseName                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程名称
     * @param {string} objResult.resResult.curData.questionList【i】.courseShortName           返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程简称
     * 
     * @param {boolean} objResult.resResult.isSuccess                   返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                      返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                             返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetCollectionsList(objParam) {
        var objResult = {};
        return objResult;
    }

    /**
     * @summary 实现功能：用户收藏某一题目
     * @description **POST** /api/v1/qst/questionCollection
     * 
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_PER_080_CollectQuestion
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {string} objParam.reqParam.questionId                    要传入的参数.请求的业务参数.试题Id
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
     * @param {object}  objResult.resResult.curData.question                          返回结果.响应返回的业务数据.当前业务结果.收藏题目
     * @param {string} objResult.resResult.curData.question.questionCollectionId      返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题收藏ID
     * @param {string} objResult.resResult.curData.question.questionCollectionNo      返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题收藏编码
     * @param {string} objResult.resResult.curData.question.userId                    返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.用户Id
     * @param {string} objResult.resResult.curData.question.questionId                返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题Id
     * @param {string} objResult.resResult.curData.question.questionNo                返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题编码
     * @param {string} objResult.resResult.curData.question.questionCode              返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.题干
     * @param {string} objResult.resResult.curData.question.question                  返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.选项A
     * @param {string} objResult.resResult.curData.question.choiceA                   返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.选项B
     * @param {string} objResult.resResult.curData.question.choiceB
     * @param {string} objResult.resResult.curData.question.choiceC                   返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.选项C
     * @param {string} objResult.resResult.curData.question.choiceD                   返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.选项D
     * @param {string} objResult.resResult.curData.question.answer                    返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.正确答案
     * @param {string} objResult.resResult.curData.question.reference                 返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.引用出处
     * @param {string} objResult.resResult.curData.question.questionLevel             返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题等级
     * @param {string} objResult.resResult.curData.question.difficulty                返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.难度系数
     * @param {number} objResult.resResult.curData.question.coinWeight                返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.金币权值
     * @param {number} objResult.resResult.curData.question.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.绩点权值
     * @param {string} objResult.resResult.curData.question.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.试题解析
     * @param {string} objResult.resResult.curData.question.knowledgeId               返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.知识点Id
     * @param {string} objResult.resResult.curData.question.content                   返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.知识点内容
     * @param {string} objResult.resResult.curData.question.subjectId                 返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.科目Id
     * @param {string} objResult.resResult.curData.question.subjectName               返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.科目名称
     * @param {string} objResult.resResult.curData.question.subjectShortName          返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.科目简称
     * @param {string} objResult.resResult.curData.question.courseId                  返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.课程Id
     * @param {string} objResult.resResult.curData.question.courseName                返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.课程名称
     * @param {string} objResult.resResult.curData.question.courseShortName           返回结果.响应返回的业务数据.当前业务结果.收藏题目.第i条记录.课程简称
     * 
     * @param {object} objResult.resResult.isSuccess                   返回结果.响应返回的业务数据.是否成功
     * @param {string} objResult.resResult.message                      返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function CollectQuestion(objParam) {
              return objResult;
    }
  var objResult = {};
    

    /**
     * @summary 实现功能：用户取消收藏某一题目
     * @description **POST** /api/v1/qst/questionCollection/cancel
     * 
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_PER_080_CancelCollection
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.questionCollectionId          要传入的参数.请求的业务参数.试题收藏Id
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
     * @param {boolean} objResult.resResult.isSuccess                  返回结果.响应返回的业务数据.是否成功  true表示取消收藏成功，false表示失败
     * @param {string} objResult.resResult.message                     返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                            返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function CancelCollection(objParam) {
        var objResult = {};
        return objResult;
    }
	
	  var objResult = {};
    

    /**
     * @summary 实现功能：用户查询错题本
     * @description **GET** /api/v1/qst/errorQuestion/list
     * 
     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的ID
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: SYS_PER_080_GetErrorQuestionList
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id
     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
	 
     * @param {object} objResult                                       返回结果
     * @param {string} objResult.resId                                 返回结果.响应ID
     * @param {string} objResult.reqId                                 返回结果.请求的ID
     * @param {string} objResult.reqType                               返回结果.请求类型
     * @param {Object} objResult.resResult                             返回结果.响应返回的业务数据
     * @param {object} objResult.resResult.curData                     返回结果.响应返回的业务数据.当前业务结果 default: {}
	 * @param {array}  objResult.resResult.curData.errorQuestionList                               返回结果.响应返回的业务数据.当前业务结果.错题列表
     * @param {object} objResult.resResult.curData.errorQuestionList【i】                           返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录
     * @param {array}  objResult.resResult.curData.errorQuestionList【i】.lpConsumeRecordId         返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.学点消耗记录Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.userId                    返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.用户Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.userNo                    返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.用户编号
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.userAnswer                返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.用户答案
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.createTime                返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.错题创建时间
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.questionId                返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.试题Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.questionNo                返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.试题编码
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.questionCode              返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.题干
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.question                  返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.选项A
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.choiceA                   返回结果.响应返回的业务数据.当前业务结果.错题列表.第i条记录.选项B
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.choiceB
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.choiceC                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项C
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.choiceD                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.选项D
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.answer                    返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.正确答案
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.reference                 返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.引用出处
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.questionLevel             返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题等级
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.difficulty                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.难度系数
     * @param {number} objResult.resResult.curData.errorQuestionList【i】.coinWeight                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.金币权值
     * @param {number} objResult.resResult.curData.errorQuestionList【i】.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.绩点权值
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.试题解析
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.knowledgeId               返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.知识点Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.content                   返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.知识点内容
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.subjectId                 返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.subjectName               返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目名称
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.subjectShortName          返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.科目简称
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.courseId                  返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程Id
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.courseName                返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程名称
     * @param {string} objResult.resResult.curData.errorQuestionList【i】.courseShortName           返回结果.响应返回的业务数据.当前业务结果.收藏题目列表.第i条记录.课程简称
     * @param {boolean} objResult.resResult.isSuccess                   返回结果.响应返回的业务数据.是否成功  true表示取消收藏成功，false表示失败
     * @param {string} objResult.resResult.message                      返回结果.响应返回的业务数据.响应消息
     * @param {object} objResult.resRefData                             返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function GetErrorQuestionList(objParam) {
        var objResult = {};
        return objResult;
    }
}