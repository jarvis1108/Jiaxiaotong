package com.dxtwangxiao.strongestsuperscholar.web.vo;


import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;

import java.util.UUID;

/**
 * 响应参数
 * <p>
 * Created by Devin
 * 2018-06-28 下午 01:02
 */
public class ResponseInfo {

    /**
     * 响应ID，每次响应具有唯一的ID，建议使用UUID
     */
    private String resId;

    /**
     * 请求ID，每次请求的ID，由前端产生，建议使用UUID
     */
    private String reqId;

    /**
     * 请求的类型，为该类请求的编码，建议使用接口名
     */
    private String reqType;

    /**
     * 请求的业务数据
     */
    private ResultData resResult;

    /**
     * 存放业务以外的其他信息
     */
    private Object resRefData;

    /**
     * 构造函数
     *
     * @param resId      相应ID
     * @param reqId      对应请求ID
     * @param reqType    对应请求类型
     * @param resResult  响应结果
     * @param resRefData 其他信息
     */
    public ResponseInfo(String resId, String reqId, String reqType, ResultData resResult, Object resRefData) {
        this.initData(resId, reqId, reqType, resResult, resRefData);
    }

    /**
     * 构造函数，主要用于成功时
     *
     * @param reqId
     * @param reqType
     * @param resResult
     */
    public ResponseInfo(String reqId, String reqType, ResultData resResult) {
        this.initData(null, reqId, reqType, resResult, null);
    }

    /**
     * 构造函数，主要用于成功时
     *
     * @param reqId
     * @param reqType
     * @param curData
     */
    public ResponseInfo(String reqId, String reqType, Object curData) {
        this.initData(null, reqId, reqType, new ResultData(curData), null);
    }

    /**
     * 构造函数(主要用于错误时)
     *
     * @param reqId   请求ID
     * @param reqType 请求类型
     * @param message 错误信息
     */
    public ResponseInfo(String reqId, String reqType, String message) {
        this.initData(null, reqId, reqType, new ResultData(message), null);
    }

    /**
     * 构造函数（主要用于成功时且采用框架请求的情况下使用）
     *
     * @param requestInfo 请求信息（框架定义的请求信息）
     * @param curData     请求的结果数据（一般是业务结果数据）
     */
    public ResponseInfo(RequestInfo requestInfo, Object curData) {
        ResultData resultData = new ResultData(curData);
        this.initData(null, requestInfo.getReqId(), requestInfo.getReqType(), resultData, null);
    }

    /**
     * 构造函数（主要用于失败时且采用框架请求的情况下使用）
     *
     * @param requestInfo 请求信息（框架中定义的）
     * @param message     错误信息
     */
    public ResponseInfo(RequestInfo requestInfo, String message) {
        ResultData resultData = new ResultData(message);
        this.initData(null, requestInfo.getReqId(), requestInfo.getReqType(), resultData, null);
    }

    /**
     * 初始化数据(是构造链基础处理逻辑)
     *
     * @param resID      响应ID
     * @param reqID      请求ID
     * @param reqType    请求类型
     * @param resResult  响应人结果（含错误信息）
     * @param resRefData 响应相关结果
     */
    private void initData(String resID, String reqID, String reqType, ResultData resResult, Object resRefData) {
        if (resID == null || resID.equals("")) {
            this.resId = UUID.randomUUID().toString();
        } else {
            this.resId = resID;
        }

        this.reqId = reqID;
        this.reqType = reqType;
        this.resResult = resResult;
        this.resRefData = resRefData;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public ResultData getResResult() {
        return resResult;
    }

    public void setResResult(ResultData resResult) {
        this.resResult = resResult;
    }

    public Object getResRefData() {
        return resRefData;
    }

    public void setResRefData(Object resRefData) {
        this.resRefData = resRefData;
    }
}
