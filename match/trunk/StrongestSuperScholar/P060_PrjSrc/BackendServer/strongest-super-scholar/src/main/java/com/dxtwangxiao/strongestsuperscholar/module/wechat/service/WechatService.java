package com.dxtwangxiao.strongestsuperscholar.module.wechat.service;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.entity.WechatToken;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 微信相关服务
 * <p>
 * Created by Devin
 * 2018-08-09 下午 03:33
 */
public interface WechatService {

    /**
     * 小程序通过code获取openid等相关信息
     *
     * @param code code
     * @return
     */
    WechatToken getTokenByCode(String code);

    /**
     * 微信支付
     *
     * @param userId    用户Id
     * @param productId 商品Id
     * @param amount    商品数量
     * @param clientIp  请求客户端Ip
     * @return
     */
    JSONObject wxPay(String userId, String productId, Integer amount, String clientIp) throws Exception;

    /**
     * 微信支付回调处理
     *
     * @param request  http请求
     * @param response http相应
     * @return
     */
    Boolean wxNotify(HttpServletRequest request, HttpServletResponse response) throws Exception;


    /**
     * 微信企业付款
     *
     * @param userId        用户id
     * @param scholarshipId 奖学金id
     * @param clientIp      客户端真实ip地址
     * @return
     * @throws Exception
     */
    Boolean wxCorporatePay(String userId, String scholarshipId, String clientIp) throws Exception;
}
