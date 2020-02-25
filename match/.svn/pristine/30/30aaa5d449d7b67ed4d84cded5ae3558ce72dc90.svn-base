package com.dxtwangxiao.strongestsuperscholar.web.error;

/**
 * 通用异常类
 * 无论是否错误，错误码必须提供。一般返回具体错误，因此一般情况下错误码中的objInnerErr为null
 * <p>
 * Created by Devin
 * 2018-06-28 下午 01:07
 */
public class StrongestScholarException extends RuntimeException {

    /**
     * 错误码
     */
    private String strErrCode;

    /**
     * 错误信息
     */
    private String strErrMsg;

    /**
     * 缺省无参构造函数
     */
    public StrongestScholarException() {

    }

    /**
     * 构造函数（构造链基础实现）
     *
     * @param strErrCode 错误码
     * @param strErrMsg  错误信息
     */
    public StrongestScholarException(String strErrCode, String strErrMsg) {
        super(strErrMsg);
        this.strErrCode = strErrCode;
        this.strErrMsg = strErrMsg;
    }

    /**
     * 构造函数（构造链基础实现）
     *
     * @param commonError 错误信息枚举
     */
    public StrongestScholarException(CommonError commonError) {
        super(commonError.getMessage());
        this.strErrCode = commonError.getCode();
        this.strErrMsg = commonError.getMessage();
    }

    public String getStrErrCode() {
        return strErrCode;
    }

    public void setStrErrCode(String strErrCode) {
        this.strErrCode = strErrCode;
    }

    public String getStrErrMsg() {
        return strErrMsg;
    }

    public void setStrErrMsg(String strErrMsg) {
        this.strErrMsg = strErrMsg;
    }
}
