package com.dxtwangxiao.questionchecktool.service;

import com.dxtwangxiao.questionchecktool.entity.Knowledge;

import java.util.List;

/**
 * Created by Devin
 * 2018-07-12 下午 07:01
 */
public interface KnowledgeService {

    List<Knowledge> getAllKnowledge();

    List<Knowledge> getKnowledgeBySubjectID(String subjectID);
}
