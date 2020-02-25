package com.dxtwangxiao.strongestsuperscholar.module.wechat.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.config.WechatConfiguration;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.OrderRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ProductInfoRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.OrderRecord;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ProductInfo;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ScholarshipRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ScholarshipRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.ScholarshipRecord;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.*;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.*;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.entity.WechatToken;
import com.dxtwangxiao.strongestsuperscholar.module.wechat.service.WechatService;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WechatUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信相关服务 实现类
 * <p>
 * Created by Devin
 * 2018-08-09 下午 03:34
 */
@Service
public class WechatServiceImpl implements WechatService {

    @Autowired
    private WechatConfiguration wechatConfiguration;

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private OrderRecordRepository orderRecordRepository;

    @Autowired
    private UserRelInfoRepository userRelInfoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCoinDetailRepository userCoinDetailRepository;

    @Autowired
    private UserLPDetailRepository userLPDetailRepository;

    @Autowired
    private UserGPDetailRepository userGPDetailRepository;

    @Autowired
    private ScholarshipRecordRepository scholarshipRecordRepository;

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    /**
     * 小程序通过code换取openid等相关信息
     *
     * @param code code
     * @return
     */
    @Override
    public WechatToken getTokenByCode(String code) {
        String url = wechatConfiguration.getCodeToOpenidUrl()
                .replace("APPID", wechatConfiguration.getAppid())
                .replace("SECRET", wechatConfiguration.getAppSecret())
                .replace("JSCODE", code);

        ResponseEntity<String> responseEntity = WebUtil.getRestTemplate().getForEntity(url, String.class);
        String ret = responseEntity.getBody();

        return JSON.parseObject(ret, WechatToken.class);
    }

    /**
     * 微信支付服务
     *
     * @param userId    用户Id
     * @param productId 商品Id
     * @param amount    商品数量
     * @param clientIp  请求客户端Ip
     * @return
     */
    @Override
    @Transactional
    public JSONObject wxPay(String userId, String productId, Integer amount, String clientIp) throws StrongestScholarException {
        ProductInfo productInfo = productInfoRepository.findByProductId(productId);
        if (productInfo == null) {
            throw new StrongestScholarException(CommonError.PRODUCT_NOT_EXIST.getCode(), CommonError.PRODUCT_NOT_EXIST.getMessage());
        }
        double sumPrice = productInfo.getProductPrice() * amount;

        User user = userRepository.findUserByUserId(userId);
        if (user == null) {
            throw new StrongestScholarException(CommonError.USER_NOT_EXIST.getCode(), CommonError.USER_NOT_EXIST.getMessage());
        }
        String openid = user.getOpenid();

        // 1.添加订单记录
        OrderRecord orderRecord = new OrderRecord();
        orderRecord.setOrderRecordId(UUIDUtil.getUUIDForShort());
        orderRecord.setOrderRecordNo(orderRecord.getOrderRecordId());
        orderRecord.setUserId(userId);
        orderRecord.setProductId(productInfo.getProductId());
        orderRecord.setProductNo(productInfo.getProductNo());
        orderRecord.setProductAmount(amount);
        orderRecord.setSumPrice(sumPrice);
        orderRecord.setActualSumPrice(sumPrice);
        orderRecord.setPurchaseWay(Byte.valueOf("0"));
        orderRecord.setStatus("0");
        orderRecord.setSubscribeTime(new Timestamp(System.currentTimeMillis()));
        orderRecord.setCreateTime(new Timestamp(System.currentTimeMillis()));
        orderRecord.setCreateUser(userId);
        orderRecordRepository.save(orderRecord);

        try {
            // 2.调用微信统一下单接口
            String nonce_str = UUIDUtil.getUUIDForShort();
            String body = productInfo.getProductName(); // 商品名称
            Map<String, String> packageParams = new HashMap<>();
            packageParams.put("appid", wechatConfiguration.getAppid());
            packageParams.put("mch_id", wechatConfiguration.getMch_id());
            packageParams.put("nonce_str", nonce_str);
            packageParams.put("body", body);
            packageParams.put("out_trade_no", orderRecord.getOrderRecordId()); // 商户订单号
            packageParams.put("total_fee", (int) (sumPrice * 100) + ""); // 支付金额，以分为单位，这边需要转成字符串类型，否则后面的签名会失败
            packageParams.put("spbill_create_ip", clientIp);
            packageParams.put("notify_url", wechatConfiguration.getNotifyUrl()); // 支付成功后的回调地址
            packageParams.put("trade_type", wechatConfiguration.getTradeType()); // 支付方式
            packageParams.put("openid", openid);
            String preStr = WechatUtil.createLinkString(packageParams);                                    // 把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串
            String mySign = WechatUtil.sign(preStr, wechatConfiguration.getKey(), "utf-8");   // MD5运算生成签名，这里是第一次签名，用于调用统一下单接口
            String xml = "<xml>" + "<appid>" + wechatConfiguration.getAppid() + "</appid>"                // 拼接统一下单接口使用的xml数据，要将上一步生成的签名一起拼接进去
                    + "<body><![CDATA[" + body + "]]></body>"
                    + "<mch_id>" + wechatConfiguration.getMch_id() + "</mch_id>"
                    + "<nonce_str>" + nonce_str + "</nonce_str>"
                    + "<notify_url>" + wechatConfiguration.getNotifyUrl() + "</notify_url>"
                    + "<openid>" + openid + "</openid>"
                    + "<out_trade_no>" + orderRecord.getOrderRecordId() + "</out_trade_no>"
                    + "<spbill_create_ip>" + clientIp + "</spbill_create_ip>"
                    + "<total_fee>" + (int) (sumPrice * 100) + "</total_fee>"
                    + "<trade_type>" + wechatConfiguration.getTradeType() + "</trade_type>"
                    + "<sign>" + mySign + "</sign>"
                    + "</xml>";
            String result = WechatUtil.httpRequest(wechatConfiguration.getUnifiedOrderUrl(), "POST", xml);  // 调用统一下单接口，并接受返回的结果
            Map map = WechatUtil.doXmlParse(result); // 将解析结果存放到map里

            // 3.封装返回给小程序端需要的参数
            JSONObject response = new JSONObject();
            String return_code = (String) map.get("return_code");
            if (return_code.equals("SUCCESS")) {
                String prepay_id = (String) map.get("prepay_id");
                response.put("nonceStr", nonce_str);
                response.put("package", "prepay_id=" + prepay_id);
                long timeStamp = System.currentTimeMillis() / 1000;
                response.put("timeStamp", timeStamp + ""); // 这边要将返回的时间戳转化成字符串，不然小程序端调用wx.requestPayment方法会报签名错误
                // 拼接签名需要的参数
                String stringSignTemp = "appId=" + wechatConfiguration.getAppid() + "&nonceStr=" + nonce_str + "&package=prepay_id=" + prepay_id + "&signType=MD5&timeStamp=" + timeStamp;
                // 再次签名，这个签名用于小程序端调用wx.requestPayment方法
                String paySign = WechatUtil.sign(stringSignTemp, wechatConfiguration.getKey(), "utf-8").toUpperCase();
                response.put("paySign", paySign);
                response.put("signType", "MD5");
            }
            response.put("appid", wechatConfiguration.getAppid());
            return response;
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.WX_PAY_ERR.getCode(), e.getMessage());
        }
    }

    /**
     * 微信支付回调处理
     *
     * @param request  http请求
     * @param response http响应
     * @return
     */
    @Override
    @Transactional
    public Boolean wxNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 1. 获取微信服务端返回的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        String notifyXml = sb.toString();
        System.out.println("接收到微信支付回复报文：" + notifyXml);

        // 2.解析微信支付回调报文，进行相关业务处理
        Map map = WechatUtil.doXmlParse(notifyXml);
        String returnCode = (String) map.get("return_code");
        if ("SUCCESS".equals(returnCode)) {
            Map<String, String> validParams = WechatUtil.paraFilter(map);
            String validStr = WechatUtil.createLinkString(validParams);
            String sign = WechatUtil.sign(validStr, wechatConfiguration.getKey(), "utf-8").toUpperCase();
            if (sign.equals(map.get("sign"))) {

                // 处理订单状态信息，并更新用户信息
                String orderRecordId = validParams.get("out_trade_no");
                OrderRecord orderRecord = orderRecordRepository.findByOrderRecordId(orderRecordId);
                if (!orderRecord.getStatus().equals("2")) {
                    orderRecord.setStatus("2");
                    OrderRecord orderRecordResult = orderRecordRepository.save(orderRecord);
                    return updateUserInfoByOrder(orderRecordResult);
                }
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * 微信企业付款，用于用户兑换奖学金
     *
     * @param userId        用户id
     * @param scholarshipId 奖学金id
     * @param clientIp      请求客户端Ip
     * @return 付款相关信息
     */
    @Override
    @Transactional
    public Boolean wxCorporatePay(String userId, String scholarshipId, String clientIp) throws Exception {
        // 1. 获取用户相关信息
        User user = userRepository.findUserByUserId(userId);
        if (user == null) {
            throw new StrongestScholarException(CommonError.USER_NOT_EXIST.getCode(), CommonError.USER_NOT_EXIST.getMessage());
        }
        String openid = user.getOpenid();

        // 2.获取奖学金相关信息
        Scholarship scholarship = scholarshipRepository.findByScholarshipId(scholarshipId);
        if (scholarship == null) {
            throw new StrongestScholarException(CommonError.SCHOLARSHIP_NOT_EXIST.getCode(), CommonError.SCHOLARSHIP_NOT_EXIST.getMessage());
        }

        // 3. 建立奖学金记录
        ScholarshipRecord scholarshipRecord = new ScholarshipRecord();
        String sId = UUIDUtil.getUUIDForShort();
        scholarshipRecord.setScholarshipRecordId(sId);
        scholarshipRecord.setScholarshipRecordNo(sId);
        scholarshipRecord.setScholarshipRecordCode(sId);
        scholarshipRecord.setUserId(userId);
        scholarshipRecord.setScholarshipId(scholarshipId);
        scholarshipRecord.setCreateUser(userId);
        scholarshipRecord.setCreateTime(new Timestamp(System.currentTimeMillis()));
        scholarshipRecord.setIsValid(Byte.valueOf("0"));
        scholarshipRecordRepository.save(scholarshipRecord);

        // 4. 进行企业付款
        // (1) 封装参数
        String nonce_str = UUIDUtil.getUUIDForShort();
        String trade_no = scholarshipRecord.getScholarshipRecordId();
        Map<String, String> packageParams = new HashMap<>();
        packageParams.put("mch_appid", wechatConfiguration.getAppid());
        packageParams.put("mchid", wechatConfiguration.getMch_id());
        packageParams.put("nonce_str", nonce_str);
        packageParams.put("partner_trade_no", trade_no);
        packageParams.put("openid", openid);
        packageParams.put("check_name", "NO_CHECK");
        packageParams.put("amount", scholarship.getAcquiredGP() * 100 + "");
        packageParams.put("desc", "兑换奖学金" + scholarship.getAcquiredGP() + "元");
        packageParams.put("spbill_create_ip", clientIp);
        String strToSign = WechatUtil.createLinkString(packageParams);
        // (2) 签名
        String mySign = WechatUtil.sign(strToSign, wechatConfiguration.getKey(), "utf-8");
        // (3) 构造请求的xml参数
        String xml = "<xml>" + "<mch_appid>" + wechatConfiguration.getAppid() + "</mch_appid>"
                + "<mchid>" + wechatConfiguration.getMch_id() + "</mchid>"
                + "<nonce_str>" + nonce_str + "</nonce_str>"
                + "<partner_trade_no>" + trade_no + "</partner_trade_no>"
                + "<openid>" + openid + "</openid>"
                + "<check_name>" + "NO_CHECK" + "</check_name>"
                + "<spbill_create_ip>" + clientIp + "</spbill_create_ip>"
                + "<amount>" + scholarship.getAmount() * 100 + "</amount>"
                + "<desc>" + "兑换奖学金" + scholarship.getAmount() + "元" + "</desc>"
                + "<sign>" + mySign + "</sign>"
                + "</xml>";
        // (4) 发出请求,得到响应
        String result = WechatUtil.postRequestWithCert(wechatConfiguration.getTransfersUrl(), wechatConfiguration.getCertLocation(), xml, wechatConfiguration.getMch_id());

        // (5) 解析并返回结果
        Map map = WechatUtil.doXmlParse(result);
        if ("SUCCESS".equals(map.get("return_code")) && "SUCCESS".equals(map.get("result_code"))) {
            scholarshipRecord.setIsValid(Byte.valueOf("1"));
            scholarshipRecordRepository.save(scholarshipRecord);
            return updateUserInfoByScholarship(userId, scholarship.getAcquiredGP());
        } else {
            return false;
        }
    }


    private Boolean updateUserInfoByOrder(OrderRecord orderRecord) {
        String userId = orderRecord.getUserId();
        String productId = orderRecord.getProductId();
        Integer amount = orderRecord.getProductAmount();
        ProductInfo productInfo = productInfoRepository.findByProductId(productId);

        // 更新UserRelInfo表信息和用户明细信息
        UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);
        String productType = productInfo.getProductType();
        if (productType.equals("A1")) {  // 现金买金币
            Integer coinAmount = 1000 * amount;

            UserCoinDetail userCoinDetail = new UserCoinDetail();
            userCoinDetail.setUserCoinDetailId(UUIDUtil.getUUID());
            userCoinDetail.setUserCoinDetailNo(userCoinDetail.getUserCoinDetailId());
            userCoinDetail.setUserId(userId);
            userCoinDetail.setUserNo(userRelInfo.getUserNo());
            userCoinDetail.setOccurTime(new Timestamp(new Date().getTime()));
            userCoinDetail.setOriginalAmount(userRelInfo.getCoin());
            userCoinDetail.setAcquiredAmount(coinAmount);
            userCoinDetail.setLossAmount(0);
            Integer currentAmount = userRelInfo.getCoin() + coinAmount;
            userCoinDetail.setCurrentAmount(currentAmount);
            userCoinDetail.setReasonType("金币充值");
            userCoinDetail.setOrderRecordId(orderRecord.getOrderRecordId());
            userCoinDetail.setOrderRecordNo(orderRecord.getOrderRecordNo());
            userCoinDetail.setCreateTime(new Timestamp(new Date().getTime()));
            userCoinDetail.setCreateUser(userId);
            userCoinDetail.setLastUpdUser(userId);
            userCoinDetail.setIsValid(Byte.valueOf("1"));
            userCoinDetailRepository.save(userCoinDetail);

            userRelInfo.setCoin(currentAmount);
        }

        if (productType.equals("A2")) {  // 现金买学点
            Integer learningPointAmount = 1000 * amount;

            UserLPDetail userLPDetail = new UserLPDetail();
            userLPDetail.setUserLpDetailId(UUIDUtil.getUUID());
            userLPDetail.setUserLpDetailNo(userLPDetail.getUserLpDetailId());
            userLPDetail.setUserId(userId);
            userLPDetail.setUserNo(userRelInfo.getUserNo());
            userLPDetail.setOccurTime(new Timestamp(new Date().getTime()));
            userLPDetail.setOriginalAmount(userRelInfo.getCoin());
            userLPDetail.setAcquiredAmount(learningPointAmount);
            userLPDetail.setLossAmount(0);
            Integer currentAmount = userRelInfo.getCoin() + learningPointAmount;
            userLPDetail.setCurrentAmount(currentAmount);
            userLPDetail.setReasonType("学点充值");
            userLPDetail.setOrderRecordId(orderRecord.getOrderRecordId());
            userLPDetail.setOrderRecordNo(orderRecord.getOrderRecordNo());
            userLPDetail.setCreateTime(new Timestamp(new Date().getTime()));
            userLPDetail.setCreateUser(userId);
            userLPDetail.setLastUpdUser(userId);
            userLPDetail.setIsValid(Byte.valueOf("1"));
            userLPDetailRepository.save(userLPDetail);

            userRelInfo.setLearningPoint(currentAmount);
        }
        userRelInfoRepository.save(userRelInfo);

        return true;
    }

    private Boolean updateUserInfoByScholarship(String userId, Integer consumedGP) {
        UserRelInfo userRelInfo = userRelInfoRepository.findByUserId(userId);

        UserGPDetail userGPDetail = new UserGPDetail();
        String id = UUIDUtil.getUUID();
        userGPDetail.setUserGpDetailId(id);
        userGPDetail.setUserGpDetailNo(id);
        userGPDetail.setUserId(userId);
        userGPDetail.setUserNo(id);
        userGPDetail.setOriginalAmount(userRelInfo.getGradePoint());
        userGPDetail.setAcquiredAmount(consumedGP);
        userGPDetail.setLossAmount(consumedGP);
        userGPDetail.setCurrentAmount(userRelInfo.getGradePoint() - consumedGP);
        userGPDetail.setCreateUser(userId);
        userGPDetail.setCreateTime(new Timestamp(System.currentTimeMillis()));
        userGPDetail.setOccurTime(new Timestamp(System.currentTimeMillis()));
        userGPDetail.setIsValid(Byte.valueOf("1"));
        userGPDetail.setReasonType("发放奖学金");
        userGPDetailRepository.save(userGPDetail);

        userRelInfo.setGradePoint(userRelInfo.getGradePoint() - consumedGP);
        userRelInfoRepository.save(userRelInfo);
        return true;
    }
}