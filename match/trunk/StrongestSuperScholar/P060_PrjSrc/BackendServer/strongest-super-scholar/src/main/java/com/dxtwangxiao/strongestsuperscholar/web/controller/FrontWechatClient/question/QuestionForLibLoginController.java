package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.question;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionForLibLoginService;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author lh
 * @date 2018.09.15
 * 私有题库 微信扫码登录 控制器
 */
@NoAuth
@Controller
@RequestMapping("/api/v1/question/questionForLibLogin")
public class QuestionForLibLoginController {

    @Autowired
    private QuestionForLibLoginService questionForLibLoginService;

    /**
     * 获取微信扫码登录 二维码页面url
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("/getAuthUrl")
    @ResponseBody
    public ResponseInfo getAuthUrl(HttpServletRequest request) throws UnsupportedEncodingException{
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        String authUrl = questionForLibLoginService.getAuthUrl();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("authUrl", authUrl);

        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 用户微信确认登录之后的回调函数
     * @param code
     * @param response
     * @throws IOException
     */
    @RequestMapping("/callBack")
    public void callBack(@RequestParam String code, HttpServletResponse response) throws IOException{
        if(code == null)
            throw new StrongestScholarException(CommonError.REQ_PARAM_ERR);

        String userId = questionForLibLoginService.getUserId(code);

        //用户未绑定小程序
        if(userId == null)
            response.sendRedirect("404.html");
        else {
            Cookie userIdCookie = new Cookie("userId", userId);
            userIdCookie.setPath("/");
            userIdCookie.setMaxAge(60*60*2);
            response.addCookie(userIdCookie);
            response.sendRedirect("http://strongestscholar.dxtwangxiao.com/strongestscholar/privateLibrary");
        }
    }
}
