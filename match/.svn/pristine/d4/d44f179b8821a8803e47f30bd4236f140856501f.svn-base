package com.dxtwangxiao.strongestsuperscholar.web.controller.BackendAdmin.login;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.QRCodeLoginService;
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
 * @date 2018.11.25
 * @description 后台管理扫码登录controller
 */
@NoAuth
@Controller
@RequestMapping("/api/v1/bam/qrCodeLogin")
public class QRCodeLoginController {

    @Autowired
    private QRCodeLoginService qrCodeLoginService;

    /**
     * 获得二维码页面url
     */
    @GetMapping("/getAuthUrl")
    @ResponseBody
    public ResponseInfo getAuthUrl(HttpServletRequest request) throws UnsupportedEncodingException {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);

        String authUrl = qrCodeLoginService.getAuthUrl();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("authUrl", authUrl);

        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 回调函数
     */
    @RequestMapping("/callBack")
    public void callBack(@RequestParam String code, HttpServletResponse response) throws IOException {
        if(code == null)
            throw new StrongestScholarException(CommonError.REQ_PARAM_ERR);

        Cookie cookie = new Cookie("isLogin", "true");
        cookie.setPath("/");
        cookie.setMaxAge(60*60*2);
        response.addCookie(cookie);
        response.sendRedirect("http://strongestscholar.dxtwangxiao.com/strongestscholar/dataManageSystem");
    }
}
