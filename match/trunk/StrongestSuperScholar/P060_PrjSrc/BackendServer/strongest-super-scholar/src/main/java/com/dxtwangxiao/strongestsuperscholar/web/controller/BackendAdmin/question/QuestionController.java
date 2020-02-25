package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionVO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@RestController
@RequestMapping("api/v1/bam/qst")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
      * 获取试题列表
      *
      * @param  request
      * @return
      */
    @GetMapping("/list")
    public ResponseInfo list(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqPageInfo = requestInfo.getReqPageInfo();

        Integer pageSize = reqPageInfo.getInteger("pageSize");
        Integer pageNum = reqPageInfo.getInteger("curPage");
        Pageable pageable = new PageRequest(pageNum - 1, pageSize == null ? Constants.PAGE_SIZE : pageSize);
        Page<QuestionVO> questionVOPage = null;

        try {
            questionVOPage = questionService.listQuestion(pageable, reqParam);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo, questionVOPage);

    }

    /**
      * 更改试题状态
      *
      * @param  requestInfo
      * @return
      */
    @PostMapping("/status")
    public ResponseInfo changeStatus(@RequestBody RequestInfo requestInfo){
       Byte newStatus = null;

        try {
           newStatus = questionService.changeStatus(requestInfo.getReqParam().getString("questionId"),
                   requestInfo.getReqUserInfo().getString("userId"));
       }
       catch (Exception e){
           throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
       }
       JSONObject res = new JSONObject();
        res.put("newStatus", newStatus);

       return new ResponseInfo(requestInfo, res);
    }

    /**
      * 获取试题表现层实体
      *
      * @param  request
      * @return
      */
    @GetMapping
    public ResponseInfo get(HttpServletRequest request) throws Exception{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        String questionTypeName = reqParam.getString("questionTypeName");
        String questionId = reqParam.getString("questionId");
        Object o = null;

        try {
            if ("背诵题".equals(questionTypeName)){
                o = questionService.findQuestionRecitationVOById(questionId);
            }
            else {
                o = questionService.findQuestionMultipleChoiceVOById(questionId);
            }
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, o);
    }
}
