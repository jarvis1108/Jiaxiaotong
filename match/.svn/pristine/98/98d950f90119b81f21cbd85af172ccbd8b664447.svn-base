package com.dxtwangxiao.questionchecktool.controller;

import com.dxtwangxiao.questionchecktool.entity.Knowledge;
import com.dxtwangxiao.questionchecktool.service.KnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 知识点控制器
 * <p>
 * Created by Devin
 * 2018-07-17 下午 01:26
 */
@Controller
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;

    @GetMapping("/getBySubjectID")
    @ResponseBody
    public List<Knowledge> getBySubjectID(String subjectID) {
        return knowledgeService.getKnowledgeBySubjectID(subjectID);
    }
}
