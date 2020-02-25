package com.dxtwangxiao.questionchecktool.controller;

import com.dxtwangxiao.questionchecktool.service.SubjectVOService;
import com.dxtwangxiao.questionchecktool.vo.GradeInfoVO;
import com.dxtwangxiao.questionchecktool.vo.SubjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 科目控制器
 * <p>
 * Created by Devin
 * 2018-07-17 上午 09:31
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectVOService subjectVOService;

    @GetMapping("/getGradeInfo")
    @ResponseBody
    public List<GradeInfoVO> getByGradePhaseID(@RequestParam("gradePhaseID") String gradePhaseID) {
        return subjectVOService.getGradeInfoByGradePhaseID(gradePhaseID);
    }

    @GetMapping("/getSubjectByGradePhaseID")
    @ResponseBody
    public List<SubjectVO> getCourseByGradePhaseID(String gradePhaseID) {
        return subjectVOService.getSubjectByGradePhaseID(gradePhaseID);
    }

    @GetMapping("/getSubjectByGradeID")
    @ResponseBody
    public List<SubjectVO> selectSubjectByGradeID(String gradeID) {
        return subjectVOService.getSubjectByGradeID(gradeID);
    }

    @GetMapping("/getSubjectByID")
    public String getSubjectByID(String subjectID) {
        SubjectVO subjectVO = subjectVOService.getSubjectByID(subjectID);
        return "redirect:/knowledge/getBySubjectID?subjectID=" + subjectVO.getSubjectID();
    }


}
