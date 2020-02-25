package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created By Devin
 * 2018-09-07 下午 04:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionMultipleChoiceVORepositoryTest {

    @Autowired
    private QuestionMultipleChoiceVORepository repository;

    @Test
    public void count() {
        long rowNumber = repository.count();
        System.out.println(rowNumber);
    }

    @Test
    public void countBySubject() {
        String subjectId = "44251c2f-88a0-11e8-a7b0-5254009bf409";
        System.out.println(repository.countAllBySubjectId(subjectId));
    }
}