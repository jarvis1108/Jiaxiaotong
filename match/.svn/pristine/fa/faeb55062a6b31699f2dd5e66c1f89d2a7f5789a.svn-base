package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.MultipleChoiceQuestionVOMapper;
import com.dxtwangxiao.questionchecktool.service.MultipleChoiceQuestionVOService;
import com.dxtwangxiao.questionchecktool.vo.MultipleChoiceQuestionVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Devin
 * 2018-07-16 下午 05:09
 */
@Service
public class MultipleChoiceQuestionVOServiceImpl implements MultipleChoiceQuestionVOService {

    @Resource
    private MultipleChoiceQuestionVOMapper multipleChoiceQuestionVOMapper;


    @Override
    public List<MultipleChoiceQuestionVO> getAll() {
        return multipleChoiceQuestionVOMapper.selectAll();
    }

    @Override
    public List<MultipleChoiceQuestionVO> getAllQuestions(String gradePhaseName, String courseName, String gradeName, String booklet, String isCheckPass, String initID) {
        return multipleChoiceQuestionVOMapper.selectAllQuestions(gradePhaseName, courseName, gradeName, booklet, isCheckPass, initID);
    }

    @Override
    public MultipleChoiceQuestionVO getQuestionById(String questionID) {
        return multipleChoiceQuestionVOMapper.selectById(questionID);
    }

    @Override
    public List<String> getAllInitId() {
        return multipleChoiceQuestionVOMapper.selectAllInitId();
    }

}
