package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionForLibService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceForLibVO;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author lh
 * @Date 2018.09.07
 * 私有题库控制器
 */
@NoAuth
@RestController
@CrossOrigin
@RequestMapping("/api/v1/question/questionForLib")
public class QuestionForLibController {

    @Autowired
    private QuestionForLibService questionForLibService;

    @PostMapping("/addChoice")
    public ResponseInfo addChoice(@RequestBody RequestInfo requestInfo) throws StrongestScholarException {
        JSONObject reqParam = requestInfo.getReqParam();

        String questionForLibId = questionForLibService.addChoice(reqParam);
        QuestionMultipleChoiceForLibVO curData = questionForLibService.findQuestionMultipleChoiceForLibVOByQuestionForLibId(questionForLibId);

        return new ResponseInfo(requestInfo, curData);
    }

    @DeleteMapping("/deleteChoice/{questionForLibId}")
    public ResponseInfo deleteChoice(@PathVariable String questionForLibId, HttpServletRequest request) throws StrongestScholarException {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        questionForLibService.deleteChoice(questionForLibId);

        return new ResponseInfo(requestInfo, null);
    }

    /**
     * 得到某一题库的所有选择题
     * @param request
     * @return
     */
    @GetMapping("/listPageChoice")
    public ResponseInfo listPageChoice(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        String questionLibId = requestInfo.getReqParam().getString("questionLibId");
        int pageSize  = requestInfo.getReqPageInfo().getInteger("pageSize");
        int curPage = requestInfo.getReqPageInfo().getInteger("curPage");

        List<QuestionMultipleChoiceForLibVO> choiceForLibList = questionForLibService.listChoiceByQuestionLibId(questionLibId, pageSize, curPage);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("choiceForLibList", choiceForLibList);

        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 私有题库修改选择题
     *
     */
    @PutMapping("/updateChoice/{questionForLibId}")
    public ResponseInfo updateChoice(@PathVariable String questionForLibId, @RequestBody RequestInfo requestInfo) throws StrongestScholarException {
        JSONObject reqParam = requestInfo.getReqParam();

        questionForLibService.updateChoice(questionForLibId, reqParam);
        QuestionMultipleChoiceForLibVO curData = questionForLibService.findQuestionMultipleChoiceForLibVOByQuestionForLibId(questionForLibId);

        return new ResponseInfo(requestInfo, curData);
    }

    /**
     * 私有题库选择题总数
     */
    @GetMapping("/totalNum")
    public ResponseInfo totalNum(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        String questionLibId = requestInfo.getReqParam().getString("questionLibId");
        long totalNum = questionForLibService.getChoiceTotalNum(questionLibId);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("totalNum", totalNum);
        return new ResponseInfo(requestInfo, jsonObject);
    }
}