package com.dxtwangxiao.strongestsuperscholar.module.system.service.impl;

import com.dxtwangxiao.strongestsuperscholar.config.WechatConfiguration;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.QRCodeLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author lh
 * @date 2018.11.25
 * @description 后台扫码登录service
 */
@Service
public class QRCodeLoginServiceImpl implements QRCodeLoginService{

    @Autowired
    private WechatConfiguration wechatConfiguration;

    /**
     * 得到二维码地址
     */
    public String getAuthUrl() throws UnsupportedEncodingException {
        String callBackUrl = "http://strongestscholar.dxtwangxiao.com:8089/strongestscholar/api/v1/bam/qrCodeLogin/callBack";
        callBackUrl = URLEncoder.encode(callBackUrl, "utf-8");
        String authUrl = wechatConfiguration.getAuthorizationUrl();
        authUrl = authUrl.replace("APPID", wechatConfiguration.getBackendAppid())
                .replace("REDIRECT_URI", callBackUrl).replace("STATE", System.currentTimeMillis()+"");

        return authUrl;
    }
}
