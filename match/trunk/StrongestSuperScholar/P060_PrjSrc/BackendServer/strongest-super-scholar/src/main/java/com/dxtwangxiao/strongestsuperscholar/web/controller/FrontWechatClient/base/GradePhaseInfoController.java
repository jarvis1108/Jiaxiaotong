package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.base;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.base.entity.GradePhaseInfo;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.GradePhaseInfoService;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 年级阶段 控制器
 * <p>
 * Created By Devin
 * 2018-08-31 上午 09:28
 */
@RestController
@RequestMapping("/api/v1/base/gradePhaseInfo")
public class GradePhaseInfoController {

    @Autowired
    private GradePhaseInfoService gradePhaseInfoService;

    /**
     * 获得年级阶段信息列表
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo list(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        JSONObject jsonObject = new JSONObject();
        List<GradePhaseInfo> gradePhaseInfoList = gradePhaseInfoService.findAll();
        jsonObject.put("gradePhaseInfoList", gradePhaseInfoList);
        System.out.println("Hello World");
        return new ResponseInfo(requestInfo, jsonObject);
    }
}
