package com.dxtwangxiao.strongestsuperscholar.web.vo;

import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;

/**
 * Created by Devin
 * 2018-06-29 上午 08:41
 */
public class ResultData {
	/**
	 * 当前结果的数据
	 */
	private Object curData;

	/**
	 * 是否成功
	 */
	private Boolean isSuccess;

	/**
	 * 当前的错误信息
	 */
	private String message;

	/**
	 * 构造函数（缺省无参构造函数）
	 */
	public ResultData() {
	}

	/**
	 * 构造函数(完整参数)
	 *
	 * @param message   错误消息
	 * @param isSuccess 是否成功
	 * @param curData   当前业务数据
	 */
	public ResultData(String message, Boolean isSuccess, Object curData) {
		this.message = message;
		this.isSuccess = isSuccess;
		this.curData = curData;
	}

	/**
	 * 构造函数，主要用于成功时
	 *
	 * @param curData 当前业务数据
	 */
	public ResultData(Object curData) {
		this(CommonError.SUCCESS.getMessage(), true, curData);
	}

	/**
	 * 构造函数(主要用于错误时)
	 *
	 * @param message 错误信息
	 */
	public ResultData(String message) {
		this(message, false, null);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getCurData() {
		return curData;
	}

	public void setCurData(Object curData) {
		this.curData = curData;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
