package com.dxtwangxiao.strongestsuperscholar.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器层日志切面
 * <p>
 * Created by Devin
 * 2018-07-02 下午 02:42
 */
@Aspect
@Component
public class ApiControllerAspect {

    private static final Logger logger = LoggerFactory.getLogger(ApiControllerAspect.class);

    @Pointcut("execution(public * com.dxtwangxiao.strongestsuperscholar.web.controller..*.*Controller.*(..))")
    public void controllerLogger() {
    }

    @Before("controllerLogger()")
    public void doBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();

        // TODO: 解析request，获取用户请求信息

        String log = "请求URL: " +
                request.getRequestURL() +
                " , 请求用户: user" +
                " , 请求ip: " +
                request.getRemoteAddr();
        logger.info(log);
        logger.info(className + "@" + methodName);
    }
}
