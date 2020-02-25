package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.vo.ErrorMultipleQuestion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * 错题本数据访问层单元测试
 * <p>
 * Created By Devin
 * 2018-09-11 上午 09:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorQuestionMultipleChoiceVORepositoryTest {

    @Autowired
    private ErrorMultipleQuestionRepository errorMultipleQuestionRepository;

    @Test
    public void findByUserIdOrderByCreateTimeTest() {
        List<ErrorMultipleQuestion> errorMultipleQuestionList = errorMultipleQuestionRepository.findByUserIdOrderByCreateTimeDesc("1");
        errorMultipleQuestionList.forEach(System.out::println);

    }
}