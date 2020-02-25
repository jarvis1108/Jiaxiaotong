package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.question.service.ErrorMultipleQuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.ErrorMultipleQuestion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created By Devin
 * 2018-09-15 上午 11:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorMultipleQuestionMultipleChoiceVOServiceImplTest {

    @Autowired
    private ErrorMultipleQuestionService errorMultipleQuestionService;

    @Test
    public void getByUserId() {
        List<ErrorMultipleQuestion> errorMultipleQuestionList = errorMultipleQuestionService.getByUserId("1439fcf5-7325-4a84-b8f4-94d378762b7e");
        errorMultipleQuestionList.forEach(System.out::println);
    }
}