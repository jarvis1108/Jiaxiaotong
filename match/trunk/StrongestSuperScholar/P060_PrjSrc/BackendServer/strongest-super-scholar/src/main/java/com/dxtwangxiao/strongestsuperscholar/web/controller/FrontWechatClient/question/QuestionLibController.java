package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.entity.QuestionLib;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionLibService;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.util.DateUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

/**
 * Created by 孙伟浩 on 2018/9/8.
 */
@NoAuth
@RestController
@CrossOrigin
@RequestMapping("api/v1/qst/questionLib")
public class QuestionLibController {

    @Autowired
    private QuestionLibService questionLibService;

    /**
      * 存储题库
      *
      * @param requestInfo 请求信息
      * @return  responseInfo
      */
    @PostMapping
    public ResponseInfo save(@RequestBody RequestInfo requestInfo) throws Exception{
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();

        String questionLibId = UUIDUtil.getUUID();
        String createUser = reqUserInfo.getString("userId");
        Timestamp createTime = new Timestamp(DateUtil.getCurrentTimeStamp());

        QuestionLib questionLib = new QuestionLib(questionLibId,questionLibId,questionLibId,createUser,
                reqParam.getByte("isDefaultQuestionLib"),reqParam.getByte("isPublic"),reqParam.getString("questionLibDes"),
                reqParam.getString("questionLibTitle"),createTime,null,createUser,null,reqParam.getByte("isValid"),
                reqParam.getString("remark"));

        try {
            questionLibService.saveQuestionLib(questionLib);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(),e.getMessage());
        }
        return new ResponseInfo(requestInfo,questionLib);
    }

    /**
     * 删除题库
     *
     * @param requestInfo
     * @return  responseInfo
     */
    @PostMapping("/delete")
    public ResponseInfo delete(@RequestBody RequestInfo requestInfo) throws Exception
    {
        JSONObject reqParam = requestInfo.getReqParam();
        String questionLibId = reqParam.getString("questionLibId");
        if (questionLibId == null){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "参数中缺少questionLibId!");
        }

        try {
            questionLibService.deleteQuestionLib(questionLibId);
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }
        return new ResponseInfo(null,null,new ResultData(null));
    }
}
