package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.mall;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.ScholarshipService;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.service.WechatService;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 奖学金数据 控制访问层
 * <p>
 * Created by 孙伟浩 on 2018/9/18.
 */
@RestController
@RequestMapping("/api/v1/mall/scholarship")
public class ScholarshipController {

    @Autowired
    private WechatService wechatService;

    @Autowired
    private ScholarshipService scholarshipService;

    /**
     * 获取奖学金列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping(value = "/list")
    public ResponseInfo listScholarship(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject jsonObject = new JSONObject();
        List<Scholarship> scholarshipList = scholarshipService.listScholarship();
        jsonObject.put("scholarshipList", scholarshipList);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 用户兑换奖学金
     *
     * @param requestInfo 请求信息
     * @param request     http请求
     * @return
     */
    @PostMapping("/exchange")
    public ResponseInfo exchangeScholarship(@RequestBody RequestInfo requestInfo, HttpServletRequest request) throws Exception {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String scholarshipId = reqParam.getString("scholarshipId");
        String clientIp = WebUtil.getClientIp(request);

        Boolean result = wechatService.wxCorporatePay(userId, scholarshipId, clientIp);
        if (result) {
            return new ResponseInfo(requestInfo, new JSONObject());
        }
        return new ResponseInfo(requestInfo, "企业付款失败!");
    }
}
