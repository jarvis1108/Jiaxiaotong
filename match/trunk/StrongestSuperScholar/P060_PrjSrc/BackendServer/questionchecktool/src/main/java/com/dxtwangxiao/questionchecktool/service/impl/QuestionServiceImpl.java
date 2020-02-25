package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.QuestionMapper;
import com.dxtwangxiao.questionchecktool.entity.Question;
import com.dxtwangxiao.questionchecktool.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Devin
 * 2018-07-13 上午 08:35
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionMapper questionMapper;

    @Override
    public Question getQuestionById(String questionID) {
        return questionMapper.selectByPrimaryKey(questionID);
    }

    @Override
    public int updateQuestion(Question question) {
        return questionMapper.updateByPrimaryKeySelective(question);
    }

    @Override
    public int update(String questionID, String questionTitle, String questionAnalyze, Double difficulty) {
        return questionMapper.updateQuestion(questionID, questionTitle, questionAnalyze, difficulty);
    }
}
