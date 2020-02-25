package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.mall;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.MallService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.ProductInfoService;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.service.WechatService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 商品信息 控制器
 * <p>
 * Created by Devin
 * 2018-09-01 PM 03:51
 */
@RestController
@RequestMapping("/api/v1/mall/productInfo")
public class ProductInfoController {

    @Autowired
    private MallService mallService;

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private WechatService wechatService;

    /**
     * 根据支付类型获取商品信息，支付类型，0表示人民币，1表示金币，2表示都支持
     *
     * @param request http请求
     * @return
     */
    @GetMapping("/list")
    public ResponseInfo getProductInfoList(HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        Byte payType = requestInfo.getReqParam().getByte("paymentType");

        JSONObject jsonObject = new JSONObject();
        List<ProductInfo> productInfoList = productInfoService.getByPaymentType(payType);
        jsonObject.put("productList", productInfoList);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 根据商品Id获取商品信息
     *
     * @param productInfoId 商品Id
     * @param request       http请求
     * @return
     */
    @GetMapping("/{productInfoId}")
    public ResponseInfo getProductInfo(@PathVariable("productInfoId") String productInfoId, HttpServletRequest request) {
        RequestInfo requestInfo = WebUtil.parseGetRequest(request);
        JSONObject jsonObject = new JSONObject();

        ProductInfo productInfo = productInfoService.getProductById(productInfoId);
        jsonObject.put("product", productInfo);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 充值，包括充值学点和金币
     *
     * @param requestInfo 请求信息
     * @return
     */
    @PostMapping("/recharge")
    public ResponseInfo recharge(@RequestBody RequestInfo requestInfo, HttpServletRequest request) throws Exception {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String productId = reqParam.getString("productId");
        Integer amount = reqParam.getInteger("amount");
        String clientId = WebUtil.getClientIp(request);

        JSONObject jsonObject = wechatService.wxPay(userId, productId, amount, clientId);
        return new ResponseInfo(requestInfo, jsonObject);
    }

    /**
     * 兑换，目前只包括金币兑换学点
     *
     * @param requestInfo 请求信息
     * @return
     */
    @PostMapping("/exchange")
    public ResponseInfo exchange(@RequestBody RequestInfo requestInfo) throws StrongestScholarException {
        JSONObject reqParam = requestInfo.getReqParam();
        String userId = reqParam.getString("userId");
        String productId = reqParam.getString("productId");
        Integer amount = reqParam.getInteger("amount");

        UserDTO userDTO = mallService.exchange(userId, productId, amount);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user", userDTO);
        return new ResponseInfo(requestInfo, jsonObject);
    }
}