package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.dxtwangxiao.strongestsuperscholar.module.question.dao.QuestionLibRepository;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionLibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 孙伟浩 on 2018/9/8.
 */
@Service
@Transactional
public class QuestionLibServiceImpl implements QuestionLibService {

    @Autowired
    private QuestionLibRepository questionLibRepository;


    /**
     * 存储题库
     *
     * @param  questionLib 题库
     * @return
     */
    @Override
    public QuestionLib saveQuestionLib(QuestionLib questionLib){
        return questionLibRepository.saveAndFlush(questionLib);
    }


    /**
     * 删除题库
     *
     * @param  questionLibId 题库id
     * @return
     */
    @Override
    public void deleteQuestionLib(String questionLibId){
        questionLibRepository.deleteById(questionLibId);
    }
}
