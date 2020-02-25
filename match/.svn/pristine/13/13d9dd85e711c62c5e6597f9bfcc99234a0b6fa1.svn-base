package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.system;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.Feedback;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.FeedbackService;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 意见反馈控制器
 * <p>
 * Created By Devin
 * 2018-09-25 上午 09:50
 */
@RestController
@RequestMapping("/api/v1/sys/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public ResponseInfo create(@RequestBody RequestInfo requestInfo) {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String content = reqParam.getString("content");

        JSONObject jsonObject = new JSONObject();
        Feedback feedback = feedbackService.create(userId, content);
        jsonObject.put("feedback", feedback);
        return new ResponseInfo(requestInfo, jsonObject);
    }
}
