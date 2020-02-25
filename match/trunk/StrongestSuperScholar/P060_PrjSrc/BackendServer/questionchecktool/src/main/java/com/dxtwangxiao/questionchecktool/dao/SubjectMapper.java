package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.entity.Subject;

import java.util.List;

public interface SubjectMapper {
    int deleteByPrimaryKey(String subjectID);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(String subjectID);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    List<Subject> selectAll();
}