package com.dxtwangxiao.questionchecktool.dao;

import com.dxtwangxiao.questionchecktool.vo.GradeInfoVO;
import com.dxtwangxiao.questionchecktool.vo.GradePhaseInfoVO;
import com.dxtwangxiao.questionchecktool.vo.SubjectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectVOMapper {

    List<GradePhaseInfoVO> selectAllGradePhaseInfo();

    List<GradeInfoVO> selectGradeInfoByGradePhaseID(String gradePhaseID);

    List<SubjectVO> selectSubjectByGradeID(String gradeID);

    List<SubjectVO> selectSubjectByGradePhaseID(String gradePhaseID);

    SubjectVO selectSubjectByID(String subjectID);

    List<SubjectVO> selectBasicSubject();
}