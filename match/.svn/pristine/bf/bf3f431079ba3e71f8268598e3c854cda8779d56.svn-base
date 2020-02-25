package com.dxtwangxiao.questionchecktool.controller;

import com.dxtwangxiao.questionchecktool.entity.Main;
import com.dxtwangxiao.questionchecktool.vo.GradePhaseInfoVO;
import com.dxtwangxiao.questionchecktool.entity.Question;
import com.dxtwangxiao.questionchecktool.entity.QuestionMultipleChoice;
import com.dxtwangxiao.questionchecktool.service.*;
import com.dxtwangxiao.questionchecktool.vo.MultipleChoiceQuestionVO;
import com.dxtwangxiao.questionchecktool.vo.SubjectVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 试题控制器
 * <p>
 * Created by Devin
 * 2018-07-05 上午 11:56
 */
@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private MultipleChoiceQuestionVOService multipleChoiceQuestionVOService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionMultipleChoiceService questionMultipleChoiceService;

    @Autowired
    private SubjectVOService subjectVOService;

    @Autowired
    private MainService mainService;

    @GetMapping("/index")
    public String home(@RequestParam(defaultValue = "1") Integer pn, @RequestParam(defaultValue = "10") Integer pageSize, String gradePhaseName, String courseName, String gradeName, String booklet, String isCheckPass, String initID, Map<String, Object> result) {
        PageHelper.startPage(pn, pageSize);
        List<MultipleChoiceQuestionVO> questionVOList = multipleChoiceQuestionVOService.getAllQuestions(gradePhaseName, courseName, gradeName, booklet, isCheckPass, initID);
        PageInfo<MultipleChoiceQuestionVO> pageInfo = new PageInfo<>(questionVOList);

        List<Main> mainList = mainService.getAllMains();
        result.put("pageInfo", pageInfo);
        result.put("mainList", mainList);

        return "questions";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam("questionID") String questionID, Map<String, Object> result) {
        MultipleChoiceQuestionVO multipleChoiceQuestionVO = multipleChoiceQuestionVOService.getQuestionById(questionID);
        List<GradePhaseInfoVO> gradePhaseInfoVOList = subjectVOService.getAllGradePhaseInfo();
        List<SubjectVO> basicSubjectList = subjectVOService.getAllBasicSubject();

        result.put("multipleChoiceQuestionVO", multipleChoiceQuestionVO);
        result.put("gradePhaseInfoVOList", gradePhaseInfoVOList);
        result.put("basicKnowledgeSubject", basicSubjectList);

        return "detail";
    }


    @PostMapping("/update")
    @ResponseBody
    public String update(HttpServletRequest request) {
        String questionID = request.getParameter("questionID");
        String questionTitle = request.getParameter("question");
        String choiceA = request.getParameter("choiceA");
        String choiceB = request.getParameter("choiceB");
        String choiceC = request.getParameter("choiceC");
        String choiceD = request.getParameter("choiceD");
        String questionAnswer = request.getParameter("questionAnswer");
        String questionAnalyse = request.getParameter("questionAnalyse");
        String difficulty = request.getParameter("difficulty");

        int result1 = questionService.update(questionID, questionTitle, questionAnalyse, Double.valueOf(difficulty));
        if (result1 != 1)
            return "false";

        int result2 = questionMultipleChoiceService.update(questionID, choiceA, choiceB, choiceC, choiceD, questionAnswer);

        if (result2 == 1)
            return "success";
        else
            return "false";
    }

    @PostMapping("/check")
    @ResponseBody
    public String checkQuestion(HttpServletRequest request) {

        /* 获取session中用户信息 */
        String userStr = (String) request.getSession().getAttribute("user");
        String[] userInfo = userStr.split("-");
        String username = userInfo[1];
        String code = userInfo[0];

        /* 获取请求信息，包括试题ID和审核状态 */
        String questionID = request.getParameter("questionID");
        String status = request.getParameter("questionStatus");

        /* 更新试题信息 */
        Question question = questionService.getQuestionById(questionID);
        question.setCheckUserId(code);
        question.setCheckUsername(username);
        question.setIsCheckPass(status);
        question.setCheckTime(new Date());
        int result = questionService.updateQuestion(question);
        if (result == 1)
            return "success";
        else
            return "false";
    }

    @PostMapping("/changeKnowledge")
    @ResponseBody
    public String changeKnowledge(HttpServletRequest request) {
        String knowledgeID = request.getParameter("knowledgeID");
        String questionID = request.getParameter("questionID");

        /* 更新试题信息 */
        Question question = questionService.getQuestionById(questionID);
        if (question.getKnowledgeID().equals(knowledgeID))
            return "success";

        question.setKnowledgeID(knowledgeID);
        int result = questionService.updateQuestion(question);
        if (result == 1)
            return "success";
        else
            return "false";
    }
}
