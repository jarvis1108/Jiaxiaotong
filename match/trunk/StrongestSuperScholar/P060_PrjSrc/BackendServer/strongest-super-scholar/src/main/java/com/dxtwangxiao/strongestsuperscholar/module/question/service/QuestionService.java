package com.dxtwangxiao.strongestsuperscholar.module.question.service;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.Question;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionMultipleChoice;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionRecitation;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.MultipleQuestionCollection;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationVO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 试题服务 接口
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:57
 */
public interface QuestionService {

    /**
     * 根据用户Id获取其所收藏的题目列表
     *
     * @param userId 用户Id
     * @return 收藏的题目列表
     */
    List<MultipleQuestionCollection> getCollectionsByUserId(String userId);

    /**
     * 用户收藏题目
     *
     * @param userId     用户Id
     * @param questionId 试题Id
     * @return 收藏的题目信息
     */
    MultipleQuestionCollection collectQuestion(String userId, String questionId);

    /**
     * 用户取消收藏题目
     *
     * @param questionCollectionId 收藏题目Id
     * @return
     */
    Boolean cancelCollection(String questionCollectionId);


    /**
     * 随机获取5道选择题，针对匹配对战、好友对战及群PK
     *
     * @return 题目列表
     */
    List<QuestionMultipleChoiceVO> getRandomQuestions();

    /**
     * 根据战局Id获取10道题目，用户知识练兵场
     *
     * @param subjectId 战局Id
     * @return 题目列表
     */
    List<QuestionMultipleChoiceVO> getQuestionsBySubjectId(String subjectId);


    /**
      * 存储试题
      *
      * @param question 试题
      * @return
      */
    //void saveQuestion(Question question);

    /**
      * 删除试题
      *
      * @param questionId 题目Id
      * @return
      */
    //void deleteQuestion(String questionId);

    /**
      * 更新试题信息
      *
      * @param  question 更新后的试题
      * @return
      */
    //void updateQuestion(Question question);

    /**
      * 存储选择题
      *
      * @param  userId 用户Id
      * @param  reqParam 请求参数
      * @return
      */
    QuestionMultipleChoiceVO saveQuestionMultipleChoice(String userId,  JSONObject reqParam);

    /**
      * 删除选择题
      *
      * @param  questionMultipleChoiceId 选择题Id
      * @return
      */
    void deleteQuestionMultipleChoice(String questionMultipleChoiceId);

    /**
      * 更新选择题
      *
      * @param questionId 试题Id
      * @param  userId 用户Id
      * @param  reqParam 请求参数
      * @return
      */
    QuestionMultipleChoiceVO updateQuestionMultipleChoice(String questionId, String userId,  JSONObject reqParam);

    /**
      * 存储背诵题
      *
      * @param  userId 用户Id
      * @param  reqParam 请求参数
      * @return
      */
    QuestionRecitationVO saveQuestionRecitation(String userId,  JSONObject reqParam);

    /**
      * 删除背诵题
      *
      * @param  questionRecitationId 背诵题Id
      * @return
      */
    void deleteQuestionRecitation(String questionRecitationId);

    /**
      * 更新背诵题
      *
      * @param questionId 试题Id
      * @param  userId 用户Id
      * @param  reqParam 请求参数
      * @return
      */
    QuestionRecitationVO updateQuestionRecitation(String questionId, String userId,  JSONObject reqParam);


    /**
      * 使试题生效
      *
      * @param  questionId 试题Id
      * @return
      */
    void validateQuestion(String questionId);

    /**
      * 使试题失效
      *
      * @param  questionId 试题Id
      * @return
      */
    void invalidateQuestion(String questionId);

    /**
      * 更改试题状态
      *
      * @param  questionId 试题Id
      * @return
      */
    Byte changeStatus(String questionId, String userId);

    /**
      * 根据Id寻找试题
      *
      * @param  questionId 试题Id
      * @return
      */
    //Question findQuestionById(String questionId);

    /**
      * 根据Id寻找选择题
      *
      * @param  questionId 试题Id
      * @return
      */
    //QuestionMultipleChoice findQuestionMultipleChoiceById(String questionId);

    /**
      * 根据Id寻找选择题表现层对象
      *
      * @param  questionId 试题Id
      * @return
      */
    QuestionMultipleChoiceVO findQuestionMultipleChoiceVOById(String questionId);

    /**
     * 根据Id寻找背诵题
     *
     * @param  questionId 试题Id
     * @return
     */
    //QuestionRecitation findQuestionRecitationById(String questionId);

    /**
      * 根据Id寻找背诵题表现层对象
      *
      * @param  questionId 试题Id
      * @return
      */
    QuestionRecitationVO findQuestionRecitationVOById(String questionId);

    /**
      * 获取条件过滤后的分页选择题列表
      *
      * @param  pageable 分页信息
      * @param reqParam 过滤条件
      * @return  选择题列表
      */
    Page<QuestionMultipleChoiceVO> listQuestionMultipleChoice(Pageable pageable, JSONObject reqParam);

    /**
     * 获取条件过滤后的分页背诵题列表
     *
     * @param  pageable 分页信息
     * @param reqParam 过滤条件
     * @return  背诵题列表
     */
    Page<QuestionRecitationVO> listQuestionRecitation(Pageable pageable, JSONObject reqParam);


    /**
      * 获取条件过滤后的分页试题列表
      *
      * @param  pageable 分页信息
      * @param  reqParam 过滤参数
      * @return
      */
    Page<QuestionVO> listQuestion(Pageable pageable, JSONObject reqParam);


}