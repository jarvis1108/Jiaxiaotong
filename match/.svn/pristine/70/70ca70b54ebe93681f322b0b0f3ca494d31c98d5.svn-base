package com.dxtwangxiao.questionchecktool.service.impl;

import com.dxtwangxiao.questionchecktool.dao.SubjectVOMapper;
import com.dxtwangxiao.questionchecktool.vo.GradeInfoVO;
import com.dxtwangxiao.questionchecktool.vo.GradePhaseInfoVO;
import com.dxtwangxiao.questionchecktool.vo.SubjectVO;
import com.dxtwangxiao.questionchecktool.service.SubjectVOService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Devin
 * 2018-07-17 上午 09:47
 */
@Service
public class SubjectVOServiceImpl implements SubjectVOService {

    @Resource
    private SubjectVOMapper subjectVOMapper;

    @Override
    public List<GradePhaseInfoVO> getAllGradePhaseInfo() {
        return subjectVOMapper.selectAllGradePhaseInfo();
    }

    @Override
    public List<GradeInfoVO> getGradeInfoByGradePhaseID(String gradePhaseID) {
        return subjectVOMapper.selectGradeInfoByGradePhaseID(gradePhaseID);
    }

    @Override
    public List<SubjectVO> getSubjectByGradeID(String gradeID) {
        return subjectVOMapper.selectSubjectByGradeID(gradeID);
    }

    @Override
    public List<SubjectVO> getSubjectByGradePhaseID(String gradePhaseID) {
        return subjectVOMapper.selectSubjectByGradePhaseID(gradePhaseID);
    }

    @Override
    public SubjectVO getSubjectByID(String subjectID) {
        return subjectVOMapper.selectSubjectByID(subjectID);
    }

    @Override
    public List<SubjectVO> getAllBasicSubject() {
        return subjectVOMapper.selectBasicSubject();
    }
}
