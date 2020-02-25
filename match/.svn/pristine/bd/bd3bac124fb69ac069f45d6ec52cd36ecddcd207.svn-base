/** @file
 * @description <br/> //  ******************************************************************
 *              <br/> //  * 功能说明：最强学霸接口设计_私有题库添加选择题
 *              <br/> //  * 创建标志：林航 2018年09月05日创建
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
 * @summary 实现功能：私有题库添加选择题用例中接口定义
 * @memberOf QFL
 * @description   
   问题：
   1. 数据库表QuestionForLib缺失年级id、学科id、答题时间字段
   2. ui原型没有体现一个用户可以有多个题库的设计                        
 */
function QFL_CHO_010() {

    /**
     * @summary 实现功能：用户向私有题库添加选择题
     * @description POST /api/v1/question/questionForLib/addChoice

     * @param {object} objParam                                        要传入的参数
     * @param {string} objParam.reqId                                  要传入的参数.请求的Id
     * @param {string} objParam.reqType                                要传入的参数.请求类型 固定值为: QFL_CHO_010_addChoice
     * @param {object} objParam.reqUserInfo                            要传入的参数.当前用户信息
     * @param {string} objParam.reqUserInfo.userId                     要传入的参数.当前用户信息.用户Id

     * @param {object} objParam.reqParam                               要传入的参数.请求的业务参数
     * @param {string} objParam.reqParam.userId                        要传入的参数.请求的业务参数.用户Id
	 * @param {string} objParam.reqParam.gradeId                       要传入的参数.请求的业务参数.年级Id
	 * @param {string} objParam.reqParam.courseId                      要传入的参数.请求的业务参数.学科Id
	 * @param {string} objParam.reqParam.question                      要传入的参数.请求的业务参数.问题内容
	 * @param {string} objParam.reqParam.choiceA                       要传入的参数.请求的业务参数.A选项答案
	 * @param {string} objParam.reqParam.choiceB                       要传入的参数.请求的业务参数.B选项答案
	 * @param {string} objParam.reqParam.choiceC                       要传入的参数.请求的业务参数.C选项答案
	 * @param {string} objParam.reqParam.choiceD                       要传入的参数.请求的业务参数.D选项答案
	 * @param {number} objParam.reqParam.answer                        要传入的参数.请求的业务参数.正确答案   0:A 1:B 2:C 3:D
	 * @param {number} objParam.reqParam.time                          要传入的参数.请求的业务参数.答题时间  以秒为单位
	 * @param {string} objParam.reqParam.questionLibId                 要传入的参数.请求的业务参数.题库Id
	 * @param {number} objParam.reqParam.isPublic                      要传入的参数.请求的业务参数.是否公开  0：不公开  1：公开
	 * @param {string} objParam.reqParam.provider                      要传入的参数.请求的业务参数.提供者
	 * @param {string} objParam.reqParam.personInCharge                要传入的参数.请求的业务参数.负责人Id
     * @param {string} objParam.reqParam.reference                     要传入的参数.请求的业务参数.引用出处
     * @param {number} objParam.reqParam.questionLevel                 要传入的参数.请求的业务参数.级别
     * @param {number} objParam.reqParam.difficulty                    要传入的参数.请求的业务参数.难度系数
     * @param {number} objParam.reqParam.coinWeight                    要传入的参数.请求的业务参数.金币权值
     * @param {number} objParam.reqParam.gpWeight                      要传入的参数.请求的业务参数.绩点权值
     * @param {string} objParam.reqParam.questionAnalyze               要传入的参数.请求的业务参数.解析
     * @param {string} objParam.reqParam.fromQuestionId                要传入的参数.请求的业务参数.来自试题Id
     * @param {string} objParam.reqParam.fromQuestionNo                要传入的参数.请求的业务参数.来自试题编码
     * @param {string} objParam.reqParam.remark                        要传入的参数.请求的业务参数.备注说明
     * @param {byte}   objParam.reqParam.isFromQuestion                要传入的参数.请求的业务参数.是否来自试题 1:是 0:否

     * @param {object} objParam.reqRefData                             要传入的参数.存放业务以外的其它信息 default: {}
     * @param {object} objParam.reqPageInfo                               要传入的参数.分页信息 default: {}
     * @param {object} objParam.reqPageInfo.pageSize                      要传入的参数.分页信息.页面大小
     * @param {object} objParam.reqPageInfo.curPage                       要传入的参数.分页信息.页码
     
     * @param {object} objResult                                           返回结果
     * @param {string} objResult.resId                                     返回结果.响应ID
     * @param {string} objResult.reqId                                     返回结果.请求的ID
     * @param {string} objResult.reqType                                   返回结果.请求类型

     * @param {Object} objResult.resResult                                 返回结果.响应返回的业务数据
     * @param {boolean} objResult.resResult.isSuccess                      返回结果.响应返回的业务数据.添加是否成功
     * @param {object} objResult.resResult.errorInfo                       返回结果.响应返回的业务数据.当前业务结果.出错信息(具体结构框架统一定义)

     * @param {object} objResult.resResult.curData                           返回结果.响应返回的业务数据.当前业务结果 default: {}
     * @param {string} objResult.resResult.curData.questionForLibId          返回结果.响应返回的业务数据.当前业务结果.题目Id
     * @param {string} objResult.resResult.curData.questionForLibNo          返回结果.响应返回的业务数据.当前业务结果.题目编号
     * @param {string} objResult.resResult.curData.questionForLibCode        返回结果.响应返回的业务数据.当前业务结果.题目编码
     * @param {string} objResult.resResult.curData.GradeId                   返回结果.响应返回的业务数据.当前业务结果.年级Id
     * @param {string} objResult.resResult.curData.GradeName                 返回结果.响应返回的业务数据.当前业务结果.年级名
     * @param {string} objResult.resResult.curData.courseId                  返回结果.响应返回的业务数据.当前业务结果.课程Id
     * @param {string} objResult.resResult.curData.courseName                返回结果.响应返回的业务数据.当前业务结果.课程名 
     * @param {string} objResult.resResult.curData.question                  返回结果.响应返回的业务数据.当前业务结果.问题内容
     * @param {string} objResult.resResult.curData.choiceA                   返回结果.响应返回的业务数据.当前业务结果.A选项答案
     * @param {string} objResult.resResult.curData.choiceB                   返回结果.响应返回的业务数据.当前业务结果.B选项答案
     * @param {string} objResult.resResult.curData.choiceC                   返回结果.响应返回的业务数据.当前业务结果.C选项答案
     * @param {string} objResult.resResult.curData.choiceD                   返回结果.响应返回的业务数据.当前业务结果.D选项答案
     * @param {string} objResult.resResult.curData.answer                    返回结果.响应返回的业务数据.当前业务结果.答案
     * @param {string} objResult.resResult.curData.questionAnalyze           返回结果.响应返回的业务数据.当前业务结果.解析
     * @param {string} objResult.resResult.curData.reference                 返回结果.响应返回的业务数据.当前业务结果.引用出处
     * @param {number} objResult.resResult.curData.questionLevel             返回结果.响应返回的业务数据.当前业务结果.问题级别
     * @param {double} objResult.resResult.curData.difficulty                返回结果.响应返回的业务数据.当前业务结果.难度系数
     * @param {double} objResult.resResult.curData.coinWeight                返回结果.响应返回的业务数据.当前业务结果.金币权值
     * @param {double} objResult.resResult.curData.gpWeight                  返回结果.响应返回的业务数据.当前业务结果.绩点权值
     * @param {number} objResult.resResult.curData.recommendTime             返回结果.响应返回的业务数据.当前业务结果.推荐答题时间
     * @param {string} objResult.resResult.curData.provider                  返回结果.响应返回的业务数据.当前业务结果.提供者
     * @param {string} objResult.resResult.curData.personInCharge            返回结果.响应返回的业务数据.当前业务结果.负责人
     * @param {number} objResult.resResult.curData.isPublic                  返回结果.响应返回的业务数据.当前业务结果.是否公开   1：公开，0：不公开
     * @param {timestamp} objResult.resResult.curData.createTime             返回结果.响应返回的业务数据.当前业务结果.题目创建时间

     * @param {object} objResult.resRefData                                返回结果.存放业务以外的其它信息(预留扩展，一般情况下不用) default: {}
     * @version 1.0
     * @example 暂无
     */
    function addChoice(objParam) {
        var objResult = {};
        return objResult;
    }
}