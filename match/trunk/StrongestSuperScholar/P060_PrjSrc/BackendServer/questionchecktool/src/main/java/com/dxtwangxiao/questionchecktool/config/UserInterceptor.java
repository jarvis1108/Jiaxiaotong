package com.dxtwangxiao.questionchecktool.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户拦截器，员工只有在登录后才能进行审核，否则访问其他url都会跳转到登录界面
 *
 * Created by Devin
 * 2018-07-13 上午 11:44
 */
@Component
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userStr = (String) request.getSession().getAttribute("user");
        if (userStr == null) {
            response.sendRedirect("/QuestionCheckTool/index");
            return false;
        }
        return true;
    }
}
