package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.SubjectMapper;
import com.dxtwangxiao.questionchecktool.entity.Subject;
import com.dxtwangxiao.questionchecktool.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Devin
 * 2018-07-12 下午 04:45
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Resource
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectMapper.selectAll();
    }
}
