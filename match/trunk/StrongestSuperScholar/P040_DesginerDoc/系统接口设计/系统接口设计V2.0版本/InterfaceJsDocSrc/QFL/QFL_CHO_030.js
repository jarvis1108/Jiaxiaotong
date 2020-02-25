/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_分页查询私有题库选择题
 *              <br/> //  * 创建标志：林航 2018年09月26日创建
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
 * @summary 实现功能：分页查询私有题库选择题
 * @memberOf QFL
 * @description           
 */
function QFL_CHO_030() {

    /**
     * @summary 实现功能：分页查询私有题库选择题
     * @description GET /api/v1/question/questionForLib/listPageChoice

     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QFL_CHO_030_listPageChoice
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id

     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {object} objParam.reqParam.questionLibId                 要传入的参数.请求的业务参数.题库Id

     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {int} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面题目数
     * @param {int} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码    从0开始
     
     * @param {object} objResult                                           返回结果
     * @param {string} objResult.resId                                     返回结果.响应ID
     * @param {string} objResult.reqId                                     返回结果.请求的ID
     * @param {string} objResult.reqType                                   返回结果.请求类型

     * @param {Object} objResult.resResult                                 返回结果.响应返回的业务数据
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.添加是否成功
     * @param {object} objResult.resResult.errorInfo                       返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)

     * @param {object} objResult.resResult.curData                                               返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {list} objResult.resResult.curData.choiceForLibList                                返回结果.响应返回的业务数据.当前业务结果.选择题数组
     * @param {string} objResult.resResult.curData.choiceForLibList[i].questionForLibId          返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].题目Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].questionForLibNo          返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].题目编号
     * @param {string} objResult.resResult.curData.choiceForLibList[i].questionForLibCode        返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].题目编码
     * @param {string} objResult.resResult.curData.choiceForLibList[i].knowledgeId               返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].知识点Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].knowledgeContent          返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].知识点内容
     * @param {string} objResult.resResult.curData.choiceForLibList[i].GradeId                   返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].年级Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].GradeName                 返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].年级名
     * @param {string} objResult.resResult.curData.choiceForLibList[i].subjectId                 返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].学科Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].subjectName               返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].学科名
     * @param {string} objResult.resResult.curData.choiceForLibList[i].courseId                  返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].课程Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].courseName                返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].课程名 
     * @param {string} objResult.resResult.curData.choiceForLibList[i].gradePhaseId              返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].年级阶段Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].gradePhaseName            返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].年级阶段名 
     * @param {string} objResult.resResult.curData.choiceForLibList[i].bookVerId                 返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].书本版本Id
     * @param {string} objResult.resResult.curData.choiceForLibList[i].bookVerName               返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].书本版本名 
     * @param {string} objResult.resResult.curData.choiceForLibList[i].question                  返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].问题内容
     * @param {string} objResult.resResult.curData.choiceForLibList[i].choiceA                   返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].A选项答案
     * @param {string} objResult.resResult.curData.choiceForLibList[i].choiceB                   返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].B选项答案
     * @param {string} objResult.resResult.curData.choiceForLibList[i].choiceC                   返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].C选项答案
     * @param {string} objResult.resResult.curData.choiceForLibList[i].choiceD                   返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].D选项答案
     * @param {string} objResult.resResult.curData.choiceForLibList[i].answer                    返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].答案
     * @param {string} objResult.resResult.curData.choiceForLibList[i].questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].解析
     * @param {string} objResult.resResult.curData.choiceForLibList[i].reference                 返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].引用出处
     * @param {number} objResult.resResult.curData.choiceForLibList[i].questionLevel             返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].问题级别
     * @param {double} objResult.resResult.curData.choiceForLibList[i].difficulty                返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].难度系数
     * @param {double} objResult.resResult.curData.choiceForLibList[i].coinWeight                返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].金币权值
     * @param {double} objResult.resResult.curData.choiceForLibList[i].gpWeight                  返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].绩点权值
     * @param {number} objResult.resResult.curData.choiceForLibList[i].recommendTime             返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].推荐答题时间
     * @param {string} objResult.resResult.curData.choiceForLibList[i].provider                  返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].提供者
     * @param {string} objResult.resResult.curData.choiceForLibList[i].personInCharge            返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].负责人
     * @param {number} objResult.resResult.curData.choiceForLibList[i].isPublic                  返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].是否公开   1：公开，0：不公开
     * @param {timestamp} objResult.resResult.curData.choiceForLibList[i].createTime             返回结果.响应返回的业务数据.当前业务结果.选择题数组[i].题目创建时间

     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function listPageChoice(objParam) {
        var objResult = {};
        return objResult;
    }
}