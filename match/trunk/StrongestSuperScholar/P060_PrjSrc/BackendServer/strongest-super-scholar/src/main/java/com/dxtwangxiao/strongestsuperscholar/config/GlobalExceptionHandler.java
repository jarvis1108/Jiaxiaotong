package com.dxtwangxiao.strongestsuperscholar.config;

import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理，主要针对自定义ErrorInfo，返回JSON
 * <p>
 * Created by Devin
 * 2018-07-02 上午 10:03
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = StrongestScholarException.class)
	public ResponseInfo errorInfoHandler(HttpServletRequest request, StrongestScholarException strongestScholarException) throws Exception {
		logger.error("【请求异常】：" + request.getRequestURL() + "，错误码：" + strongestScholarException.getStrErrCode() + "，错误信息：" + strongestScholarException.getStrErrMsg());

		RequestInfo requestInfo = WebUtil.parseGetRequest(request);
		return new ResponseInfo(requestInfo, strongestScholarException.getStrErrMsg());
	}
}