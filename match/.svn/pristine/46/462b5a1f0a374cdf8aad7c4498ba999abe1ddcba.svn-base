package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.KnowledgeMapper;
import com.dxtwangxiao.questionchecktool.entity.Knowledge;
import com.dxtwangxiao.questionchecktool.service.KnowledgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Devin
 * 2018-07-12 下午 07:01
 */
@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Resource
    private KnowledgeMapper knowledgeMapper;

    @Override
    public List<Knowledge> getAllKnowledge() {
        return knowledgeMapper.selectAll();
    }

    @Override
    public List<Knowledge> getKnowledgeBySubjectID(String subjectID) {
        return knowledgeMapper.selectBySubjectID(subjectID);
    }
}
