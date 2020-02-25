package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.setting;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.MatchSetting;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.RuleSettingService;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 孙伟浩 on 2018/10/22.
 */
@RestController
@RequestMapping("api/v1/bam/ruleSetting")
public class RuleSettingController {

    @Autowired
    private RuleSettingService ruleSettingService;


    /**
      * 获取规则列表
      *
      * @param request
      * @return
      */
    @GetMapping("/list")
    public ResponseInfo list(HttpServletRequest request){
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        Integer questionNumber = null;
        Integer maxMatchCount = null;
        Integer maxMatchTime = null;

        // 1.获取设定
        try {
            questionNumber = ruleSettingService.findQS().getQuestionNumber();
            maxMatchCount = ruleSettingService.findMS().getMaxMatchCount();
            maxMatchTime = ruleSettingService.findMS().getMatchTime();
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        // 2.封装为JSON对象
        JSONObject res = new JSONObject();
        res.put("questionNumber", questionNumber);
        res.put("maxMatchCount", maxMatchCount);
        res.put("maxMatchTime", maxMatchTime);

        return new ResponseInfo(requestInfo, res);
    }

    /**
      * 更新规则
      *
      * @param   requestInfo
      * @return
      */
    @PostMapping
    public ResponseInfo update(@RequestBody RequestInfo requestInfo){
        JSONObject reqParam = requestInfo.getReqParam();
        JSONObject reqUserInfo = requestInfo.getReqUserInfo();
        Integer questionNumber = reqParam.getInteger("questionNumber");
        Integer maxMatchCount = reqParam.getInteger("maxMatchCount");
        Integer maxMatchTime = reqParam.getInteger("maxMatchTime");

        try {
            questionNumber = ruleSettingService.updateQS(questionNumber).getQuestionNumber();
            MatchSetting matchSetting = ruleSettingService.updateMS(maxMatchCount, maxMatchTime);
            maxMatchCount = matchSetting.getMaxMatchCount();
            maxMatchTime = matchSetting.getMatchTime();
        }
        catch (Exception e){
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), e.getMessage());
        }

        JSONObject res = new JSONObject();
        res.put("questionNumber", questionNumber);
        res.put("maxMatchCount", maxMatchCount);
        res.put("maxMatchTime", maxMatchTime);

        return new ResponseInfo(requestInfo, res);

    }
}
