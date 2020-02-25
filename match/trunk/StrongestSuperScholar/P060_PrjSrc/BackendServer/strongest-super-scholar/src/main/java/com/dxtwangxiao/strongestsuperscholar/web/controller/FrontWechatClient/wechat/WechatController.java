package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.wechat;

import com.dxtwangxiao.strongestsuperscholar.module.wechat.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;

/**
 * 微信相关 控制器
 * <p>
 * Created by Devin
 * 2018-08-09 下午 03:29
 */
@RestController
@RequestMapping("/api/v1/wechat")
public class WechatController {

    @Autowired
    private WechatService wechatService;

    /**
     * 接受微信支付回调
     *
     * @param request  http请求
     * @param response http相应
     * @throws Exception
     */
    @GetMapping("/notify")
    public void wxNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Boolean result = wechatService.wxNotify(request, response);
        String resXml;
        if (result) {
            resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                    + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
        } else {
            resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
                    + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
        }
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        out.write(resXml.getBytes());
        out.flush();
        out.close();
    }
}
