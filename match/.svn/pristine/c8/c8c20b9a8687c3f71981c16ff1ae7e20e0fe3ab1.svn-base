package com.dxtwangxiao.strongestsuperscholar.web.vo;

import com.alibaba.fastjson.JSONObject;

/**
 * 请求参数
 * <p>
 * Created by Devin
 * 2018-06-28 下午 01:16
 */
public class RequestInfo {

    /**
     * 请求的ID，每次请求唯一的ID，由前端产生，建议使用UUID
     */
    private String reqId;

    /**
     * 请求的类型，为该类请求的编码，建议使用接口名
     */
    private String reqType;

    /**
     * 请求的用户相关信息（含用户身份验证信息）
     */
    private JSONObject reqUserInfo;

    /**
     * 请求的参数
     */
    private JSONObject reqParam;

    /**
     * 请求分页信息，包含两个参数：pageSize代表页面大小，curPage代表页码，从1开始
     */
    private JSONObject reqPageInfo;

    /**
     * 存放业务以外的其他信息，一般情况下备用
     */
    private JSONObject reqRefData;

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

    public JSONObject getReqUserInfo() {
        return reqUserInfo;
    }

    public void setReqUserInfo(JSONObject reqUserInfo) {
        this.reqUserInfo = reqUserInfo;
    }

    public JSONObject getReqParam() {
        return reqParam;
    }

    public void setReqParam(JSONObject reqParam) {
        this.reqParam = reqParam;
    }

    public JSONObject getReqPageInfo() {
        return reqPageInfo;
    }

    public void setReqPageInfo(JSONObject reqPageInfo) {
        this.reqPageInfo = reqPageInfo;
    }

    public JSONObject getReqRefData() {
        return reqRefData;
    }

    public void setReqRefData(JSONObject reqRefData) {
        this.reqRefData = reqRefData;
    }
}
