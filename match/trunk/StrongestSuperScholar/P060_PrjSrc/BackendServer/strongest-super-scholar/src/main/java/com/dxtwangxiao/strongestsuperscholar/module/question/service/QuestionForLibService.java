package com.dxtwangxiao.strongestsuperscholar.module.question.service;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionMultipleChoiceForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceForLibVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;

import java.util.List;

/**
 * @Author lh
 * @Date 2018.09.07
 */
public interface QuestionForLibService {

    String addChoice(JSONObject reqParam) throws StrongestScholarException;

    void deleteChoice(String questionForLibId) throws StrongestScholarException;

    List<QuestionMultipleChoiceForLibVO> listChoiceByQuestionLibId(String questionLibId, int pageSize, int curPage);

    void updateChoice(String questionForLibId, JSONObject reqParam) throws StrongestScholarException;

    QuestionForLib findByQuestionForLibId(String questionForLibId);

    QuestionMultipleChoiceForLib findQustionMultipleForLibByQuestionForLibId(String questionForLibId);

    QuestionMultipleChoiceForLibVO findQuestionMultipleChoiceForLibVOByQuestionForLibId(String questionForLibId);



    /**
     * 存储题库题目
     *
     * @param questionForLib 上传的题目
     * @return
     */
    void saveQuestionForLib(QuestionForLib questionForLib);

    /**
     * 删除题库题目
     *
     * @param questionForLibId 要删除的题目Id
     * @return
     */
    void deleteQuestionForLib(String questionForLibId);
    /**
     * 更新题库题目
     *
     * @param  questionForLib 更新的题目
     * @return
     */
    void updateQuestionForLib(QuestionForLib questionForLib);


    /**
     * 根据Id查找题库题目
     *
     * @param  questionForLibId 题目Id
     * @return  存在返回题目,否则返回null
     */
    QuestionForLib findQuestionForLibById(String questionForLibId);

    /**
     * 得到选择题总数
     */
    long getChoiceTotalNum(String questionLibId);
}