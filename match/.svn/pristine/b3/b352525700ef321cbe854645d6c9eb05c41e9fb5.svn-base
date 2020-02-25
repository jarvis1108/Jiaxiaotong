package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.question;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.Question;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionMultipleChoice;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionRecitation;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionRecitationVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.Constants;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UpdateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 孙伟浩 on 2018/10/11.
 */
@RestController
@RequestMapping("api/v1/bam/qst/questionRecitation")
@Transactional
public class QuestionRecitationController {

    @Autowired
    private QuestionService questionService;

    /**
      * 存储背诵题
      *
      * @param  requestInfo 请求信息
      * @return
      */
    @PostMapping
    public ResponseInfo save(@RequestBody RequestInfo requestInfo) throws Exception{
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();
        QuestionRecitationVO questionRecitationVO = new QuestionRecitationVO();
        try {
            questionRecitationVO = questionService.saveQuestionRecitation(reqUserInfo.getString("userId"), reqParam);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, questionRecitationVO);
    }

    /**
      * 删除背诵题
      *
      * @param requestInfo
      * @return
      */
    @PostMapping("/delete")
    public ResponseInfo delete(@RequestBody RequestInfo requestInfo) throws Exception{
        JSONObject reqParam = requestInfo.getReqParam();
        String questionId = reqParam.getString("questionId");
        if (questionId == null){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "参数中缺少questionId!");
        }
        try {
            questionService.deleteQuestionRecitation(questionId);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo, new JSONObject());
    }

    /**
      * 更新背诵题
      *
      * @param  requestInfo 请求信息
      * @return
      */
    @PostMapping("/update")
    public ResponseInfo update( @RequestBody RequestInfo requestInfo)
        throws Exception{

        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();
        String questionId = reqParam.getString("questionId");
        if (questionId == null){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "参数中缺少questionId!");
        }
        QuestionRecitationVO questionRecitationVO = new QuestionRecitationVO();
        try {
            questionRecitationVO = questionService.updateQuestionRecitation(questionId, reqUserInfo.getString("userId"), reqParam);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(requestInfo, questionRecitationVO);

    }


    /**
      * 获取背诵题列表
      *
      * @param  request 请求
      * @return
      */
    @GetMapping("/list")
    public ResponseInfo list(HttpServletRequest request) throws Exception{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqPageInfo = requestInfo.getReqPageInfo();

        Integer pageSize = reqPageInfo.getInteger("pageSize");
        Integer pageNum = reqPageInfo.getInteger("curPage");
        Pageable pageable = new PageRequest(pageNum - 1, pageSize == null ? Constants.PAGE_SIZE : pageSize);
        // TODO: 2018/10/11 增加排序 
        Page<QuestionRecitationVO> questionRecitationVOS = null;
        try {
            questionRecitationVOS = questionService.listQuestionRecitation(pageable, reqParam);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        return new ResponseInfo(requestInfo, questionRecitationVOS);

    }

}
