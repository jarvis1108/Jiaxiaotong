package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created By Devin
 * 2018-09-10 下午 02:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceImplTest {

    @Autowired
    private QuestionService questionService;

    @Test
    public void getRandomQuestions() {
        List<QuestionMultipleChoiceVO> randomQuestions = questionService.getRandomQuestions();
        randomQuestions.forEach(System.out::println);
    }

    @Test
    public void getQuestionsBySubjectId() {
        String subjectId = "44251c2f-88a0-11e8-a7b0-5254009bf409";
        List<QuestionMultipleChoiceVO> questionMultipleChoiceVOList = questionService.getQuestionsBySubjectId(subjectId);
        questionMultipleChoiceVOList.forEach(System.out::println);
    }
}