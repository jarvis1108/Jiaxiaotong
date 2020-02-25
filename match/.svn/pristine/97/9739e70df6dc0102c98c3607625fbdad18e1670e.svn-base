package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.personal.QuestionRecitationForLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionForLibService;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionRecitationForLibService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationForLibVO;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 孙伟浩 on 2018/9/8.
 */
@NoAuth
@RestController
@CrossOrigin
@RequestMapping("api/v1/qst/questionRecitationForLib")
@Transactional
public class QuestionRecitationForlibController {

    @Autowired
    private QuestionRecitationForLibService questionRecitationForLibService;

    @Autowired
    private QuestionForLibService questionForLibService;

    /**
     * 存储题目
     *
     * @param requestInfo 请求信息
     * @return ResponseInfo
     */
    @PostMapping
    public ResponseInfo save(@RequestBody RequestInfo requestInfo) throws Exception {

        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();

        String questionForlibId = UUIDUtil.getUUID();
        String questionLibId = reqParam.getString("questionLibId");
        String fromQuestionId = reqParam.getString("fromQuestionId");
        String answer = reqParam.getString("answer");
        String part = reqParam.getString("part");
        Byte isPartial = reqParam.getByte("isPartial");
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        String createUser = reqUserInfo.getString("userId");
        Byte isValid = 1;

        try {
            //存储questionForLib
            QuestionForLib questionForLib =
                    new QuestionForLib(questionForlibId, questionForlibId, questionForlibId, questionLibId, questionLibId,
                            reqParam.getByte("isPublic"), reqParam.getString("requestTypeId"), reqParam.getString("knowledgeId"),
                            reqParam.getString("courseId"), reqParam.getString("gradeId"),
                            reqParam.getString("question"), reqParam.getString("provider"), reqParam.getString("personInCharge"),
                            reqParam.getString("reference"), reqParam.getInteger("questionLevel"), reqParam.getDouble("difficulty"),
                            reqParam.getDouble("coinWeight"), reqParam.getDouble("gpWeight"), reqParam.getString("questionAnalyze"),
                            reqParam.getInteger("recommendTime"), fromQuestionId, fromQuestionId, createTime, createUser, null, null, isValid, reqParam.getString("remark"),
                            reqParam.getByte("isFromQuestion"));

            questionForLibService.saveQuestionForLib(questionForLib);

            //存储questionRecitationForLib
            QuestionRecitationForLib questionRecitationForLib =
                    new QuestionRecitationForLib(questionForlibId, questionForlibId, questionLibId, questionLibId, fromQuestionId, fromQuestionId,
                            answer, part, createTime, createUser, null, null, isPartial, isValid, reqParam.getString("remark"));
            questionRecitationForLibService.saveQuestionRecitationForLib(questionRecitationForLib);
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        QuestionRecitationForLibVO questionRecitationForLibVO = questionRecitationForLibService.findRecitationForLibById(questionForlibId);
        return new ResponseInfo(requestInfo, questionRecitationForLibVO);
    }

    /**
     * 删除题目
     *
     * @param requestInfo
     * @return responseInfo
     */
    @PostMapping("/delete")
    public ResponseInfo delete(@RequestBody RequestInfo requestInfo) throws Exception {

        JSONObject reqParam = requestInfo.getReqParam();
        String questionForLibId = reqParam.getString("questionForLibId");
        if (questionForLibId == null){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "参数中缺少questionForLibId!");
        }
        try {
            questionForLibService.deleteQuestionForLib(questionForLibId);
            questionRecitationForLibService.deleteQuestionRecitationForLib(questionForLibId);
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo, new JSONObject());
    }

    /**
     * 更新题目
     *
     * @param requestInfo      请求信息
     * @return responseInfo
     */
    @PostMapping("/update")
    public ResponseInfo update(@RequestBody RequestInfo requestInfo)
            throws Exception {
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();
        //从请求中获取参数
        String questionForLibId = reqParam.getString("questionId");
        if (questionForLibId == null){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "参数中缺少questionId!");
        }
        String questionLibId = reqParam.getString("questionLibId");
        String fromQuestionId = reqParam.getString("fromQuestionId");
        String answer = reqParam.getString("answer");
        String part = reqParam.getString("part");
        Byte isPartial = reqParam.getByte("isPartial");
        Timestamp lastUpdTime = new Timestamp(System.currentTimeMillis());
        String lastUpdUser = reqUserInfo.getString("userId");
        Byte isValid = reqParam.getByte("isValid");

        try {
            //更新questionForLib
            QuestionForLib newQuestionForLib =
                    new QuestionForLib(questionForLibId, questionForLibId, questionForLibId, questionLibId, questionLibId,
                            reqParam.getByte("isPublic"), reqParam.getString("requestTypeId"), reqParam.getString("knowledgeId"),
                            reqParam.getString("courseId"), reqParam.getString("gradeId"),
                            reqParam.getString("question"), reqParam.getString("provider"), reqParam.getString("personInCharge"),
                            reqParam.getString("reference"), reqParam.getInteger("questionLevel"), reqParam.getDouble("difficulty"),
                            reqParam.getDouble("coinWeight"), reqParam.getDouble("gpWeight"), reqParam.getString("questionAnalyze"),
                            reqParam.getInteger("recommendTime"), fromQuestionId, fromQuestionId, null, null, lastUpdTime, lastUpdUser, isValid, reqParam.getString("remark"),
                            reqParam.getByte("isFromQuestion"));
            QuestionForLib questionForLib = questionForLibService.findQuestionForLibById(questionForLibId);
            //问题不存在
            if (questionForLib == null) {
                return new ResponseInfo(requestInfo, "问题不存在!");
            }
            //填充空属性
            UpdateUtil.copyProperties(newQuestionForLib, questionForLib);
            questionForLibService.updateQuestionForLib(questionForLib);

            //更新questionRecitationForLib
            QuestionRecitationForLib newQuestionRecitationForLib =
                    new QuestionRecitationForLib(questionForLibId, questionForLibId, questionLibId, questionLibId, fromQuestionId, fromQuestionId,
                            answer, part, null, null, lastUpdTime, lastUpdUser, isValid,isPartial, reqParam.getString("remark"));
            QuestionRecitationForLib questionRecitationForLib = questionRecitationForLibService.findQuestionRecitationForLibById(questionForLibId);
            UpdateUtil.copyProperties(newQuestionRecitationForLib, questionRecitationForLib);
            questionRecitationForLibService.saveQuestionRecitationForLib(questionRecitationForLib);
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, questionRecitationForLibService.findRecitationForLibById(questionForLibId));
    }

    /**
     * 查询题目
     *
     * @param request 请求信息
     * @return responseInfo
     */
    @GetMapping("/list")
    public ResponseInfo search(HttpServletRequest request) throws Exception {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqPageInfo = requestInfo.getReqPageInfo();
        Integer pageSize = reqPageInfo.getInteger("pageSize");
        Integer pageNum = reqPageInfo.getInteger("curPage");
        Pageable pageable = new PageRequest(pageNum - 1, pageSize == null ? Constants.PAGE_SIZE : pageSize);


        Page<QuestionRecitationForLibVO> questionRecitationForLibVOList = null;
        try {
            questionRecitationForLibVOList = questionRecitationForLibService.search(pageable, reqParam);
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo, questionRecitationForLibVOList);
    }
}
