package com.dxtwangxiao.strongestsuperscholar.module.question.dao;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionLib;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 孙伟浩 on 2018/9/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionLibRepositoryTest {

    @Autowired
    private QuestionLibRepository questionLibRepository;

    @Test
    public void save(){
        QuestionLib questionLib = new QuestionLib();
        questionLib.setQuestionLibID(UUIDUtil.getUUID());
        questionLib.setQuestionLibNo(UUIDUtil.getUUID());
        questionLib.setQuestionLibCode(UUIDUtil.getUUID());
        questionLibRepository.save(questionLib);
        System.out.println(questionLibRepository.findAll().size());
    }
}
