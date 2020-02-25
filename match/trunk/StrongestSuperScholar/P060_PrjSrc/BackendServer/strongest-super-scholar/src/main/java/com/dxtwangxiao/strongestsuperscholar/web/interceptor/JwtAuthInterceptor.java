package com.dxtwangxiao.strongestsuperscholar.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.dxtwangxiao.strongestsuperscholar.web.annotation.NoAuth;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.util.JwtUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.http.HttpMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * Jwt拦截器
 * <p>
 * Created By Devin
 * 2018-10-08 上午 12:25
 */
public class JwtAuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 将handler强转为HandlerMethod并从中取出Method
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Class<?> declaringClass = method.getDeclaringClass();
        NoAuth noAuth = declaringClass.getAnnotation(NoAuth.class);
        if (noAuth == null)
            noAuth = method.getAnnotation(NoAuth.class);

        if (noAuth == null) {
            RequestInfo requestInfo;
            if (request.getMethod().equals(HttpMethod.GET.name())) {
                requestInfo = WebUtil.parseGetRequest(request);
            } else {
                requestInfo = WebUtil.parsePostRequest(request);
            }
            String token = requestInfo.getReqUserInfo().getString("token");
            if (token == null) {
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                ResponseInfo responseInfo = new ResponseInfo(requestInfo, CommonError.NOAUTH_USER.getMessage());
                out.write(JSON.toJSONString(responseInfo));
                return false;
            }
            try {
                JwtUtil.validateToken(token);
            } catch (StrongestScholarException e) {
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = response.getWriter();
                ResponseInfo responseInfo = new ResponseInfo(requestInfo, CommonError.TOKEN_ERROR.getMessage());
                out.write(JSON.toJSONString(responseInfo));
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}