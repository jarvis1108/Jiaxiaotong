package com.dxtwangxiao.strongestsuperscholar.module.question.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.config.WechatConfiguration;
import com.dxtwangxiao.strongestsuperscholar.module.question.service.QuestionForLibLoginService;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.UserRepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.User;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author lh
 * @date 2018.09.15
 * 私有题库登录 服务类
 */
@Service
public class QuestionForLibLoginServiceImpl implements QuestionForLibLoginService {

    @Autowired
    private WechatConfiguration wechatConfiguration;

    @Autowired
    private UserRepository userRepository;

    /**
     * 得到微信扫码登录 二维码页面Url
     * @return
     * @throws UnsupportedEncodingException
     */
    public String getAuthUrl() throws UnsupportedEncodingException{
        String callBackUrl = "http://strongestscholar.dxtwangxiao.com:8089/strongestscholar/api/v1/question/questionForLibLogin/callBack";
        callBackUrl = URLEncoder.encode(callBackUrl, "utf-8");
        String authUrl = wechatConfiguration.getAuthorizationUrl();
        authUrl = authUrl.replace("APPID", wechatConfiguration.getQuestionForLibAppid())
                .replace("REDIRECT_URI", callBackUrl).replace("STATE", System.currentTimeMillis()+"");

        return authUrl;
    }

    /**
     * 根据code获得userId
     * @param code
     * @return
     */
    public String getUserId(String code) {
        String accessTokenUrl = wechatConfiguration.getAccessTokenUrl();
        accessTokenUrl = accessTokenUrl.replace("APPID", wechatConfiguration.getQuestionForLibAppid())
                .replace("SECRET", wechatConfiguration.getQuestionForLibAppSecret())
                .replace("CODE", code);

        ResponseEntity<String> res = WebUtil.getRestTemplate().getForEntity(accessTokenUrl, String.class);
        if(res == null)
            throw new StrongestScholarException(CommonError.WX_REQUEST_ERROR);
        String body = res.getBody();
        JSONObject jsonObject = JSONObject.parseObject(body);
        String unionid = jsonObject.getString("unionid");
        if(unionid == null)
            return null;
        User user = userRepository.findByUnionId(unionid);

        return user.getUserId();
    }
}