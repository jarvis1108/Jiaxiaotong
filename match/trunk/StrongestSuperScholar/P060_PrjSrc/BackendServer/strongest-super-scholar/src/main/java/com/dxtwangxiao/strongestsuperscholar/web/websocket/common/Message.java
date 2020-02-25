package com.dxtwangxiao.strongestsuperscholar.web.websocket.common;

import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;

import java.io.Serializable;

/**
 * WebSocket服务端返回消息
 * <p>
 * Created by Devin
 * 2018-08-02 下午 03:11
 */
public class Message implements Serializable {

    /**
     * 消息ID
     */
    private String msgID;

    /**
     * 消息类型
     */
    private String msgType;

    /**
     * 消息中业务数据
     */
    private ResultData msgData;

    /**
     * 消息描述
     */
    private String msgDesc;

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public ResultData getMsgData() {
        return msgData;
    }

    public void setMsgData(ResultData msgData) {
        this.msgData = msgData;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }
}
