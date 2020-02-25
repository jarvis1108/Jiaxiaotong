package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.MultipleQuestionCollection;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 试题收藏控制器
 * <p>
 * Created By Devin
 * 2018-09-04 上午 10:36
 */
@RestController
@RequestMapping("/api/v1/qst/questionCollection")
public class QuestionCollectionCtrl {

    @Autowired
    private QuestionService questionService;

    /**
     * 根据用户Id获取其所收藏的选择题目列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo getCollectionQuestionList(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");

        JSONObject jsonObject = new JSONObject();
        List<MultipleQuestionCollection> multipleQuestionCollectionList = questionService.getCollectionsByUserId(userId);
        jsonObject.put("questionList", multipleQuestionCollectionList);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 用户收藏某一题目
     *
     * @param requestInfo
     * @return
     */
    @PostMapping("")
    public ResponseInfo collect(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String questionId = reqParam.getString("questionId");

        JSONObject jsonObject = new JSONObject();
        MultipleQuestionCollection multipleQuestionCollection = questionService.collectQuestion(userId, questionId);
        jsonObject.put("question", multipleQuestionCollection);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 用户取消收藏某一题目
     *
     * @param requestInfo
     * @return
     */
    @PostMapping("/cancel")
    public ResponseInfo cancel(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String questionCollectionId = reqParam.getString("questionCollectionId");
        JSONObject jsonObject = new JSONObject();
        Boolean result = questionService.cancelCollection(questionCollectionId);
        if (result)
            return new ResponseInfo(requestInfo, jsonObject);
        else
            return new ResponseInfo(requestInfo, CommonError.INNER_ERR.getMessage());
    }
}
