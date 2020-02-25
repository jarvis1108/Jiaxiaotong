package com.dxtwangxiao.strongestsuperscholar.web.error;

/**
 * 常量设置，主要针对错误码和错误信息（公共的）
 * <p>
 * Created by Devin
 * 2018-07-02 上午 09:08
 */
public enum CommonError {

    SUCCESS("000000", "请求成功"),
    REQ_PARAM_ERR("000001", "请求参数错误"),
    INNER_ERR("000002", "系统内部错误"),
    WX_PAY_ERR("000003", "微信支付内部错误"),
    XML_PARSE_ERR("000004", "XML数据解析错误"),
    USER_NOT_EXIST("000005", "用户不存在"),
    PRODUCT_NOT_EXIST("000006", "商品不存在"),
    SCHOLARSHIP_NOT_EXIST("000007", "奖学金信息不存在"),
    WECHAT_CODE_ERROR("000008", "微信code错误"),
    NOAUTH_USER("000009", "不明用户试图访问非公开API"),
    TOKEN_ERROR("000010", "请求token错误"),
    WX_REQUEST_ERROR("000011", "微信接口请求失败");

    private String code;

    private String message;

    CommonError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
