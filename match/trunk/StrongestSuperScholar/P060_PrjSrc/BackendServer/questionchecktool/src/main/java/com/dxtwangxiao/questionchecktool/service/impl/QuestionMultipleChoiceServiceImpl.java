package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.QuestionMultipleChoiceMapper;
import com.dxtwangxiao.questionchecktool.entity.QuestionMultipleChoice;
import com.dxtwangxiao.questionchecktool.service.QuestionMultipleChoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Devin
 * 2018-07-13 上午 10:17
 */
@Service
public class QuestionMultipleChoiceServiceImpl implements QuestionMultipleChoiceService {

    @Resource
    private QuestionMultipleChoiceMapper questionMultipleChoiceMapper;

    @Override
    public QuestionMultipleChoice getByQuestionId(String questionID) {
        return questionMultipleChoiceMapper.selectByPrimaryKey(questionID);
    }

    @Override
    public int updateQuestionMultipleChoice(QuestionMultipleChoice questionMultipleChoice) {
        return questionMultipleChoiceMapper.updateByPrimaryKeySelective(questionMultipleChoice);
    }

    @Override
    public int update(String questionID, String choiceA, String choiceB, String choiceC, String choiceD, String answer) {
        return questionMultipleChoiceMapper.updateQuestionMultipleChoice(questionID, choiceA, choiceB, choiceC, choiceD, answer);
    }
}
