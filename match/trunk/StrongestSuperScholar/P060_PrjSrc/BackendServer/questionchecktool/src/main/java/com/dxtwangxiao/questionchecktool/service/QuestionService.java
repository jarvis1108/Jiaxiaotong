package com.dxtwangxiao.questionchecktool.service;

import com.dxtwangxiao.questionchecktool.entity.Question;

/**
 * Created by Devin
 * 2018-07-13 上午 08:33
 */
public interface QuestionService {

    Question getQuestionById(String questionID);

    int updateQuestion(Question question);

    int update(String questionID, String questionTitle, String questionAnalyze, Double difficulty);
}
