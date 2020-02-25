package com.dxtwangxiao.strongestsuperscholar.config;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 服务层日志切面
 * <p>
 * Created by Devin
 * 2018-07-02 下午 02:33
 */
@Aspect
@Component
public class ApiServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(ApiServiceAspect.class);

    @Pointcut("execution(public * com.dxtwangxiao.strongestsuperscholar.module.*.service..*.*ServiceImpl.*(..))")
    public void serviceLogger() {
    }

    @Before("serviceLogger()")
    public void doBefore(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        StringBuilder log = new StringBuilder();
        log.append("before: ")
                .append(className)
                .append("@")
                .append(methodName)
                .append(" , params: ");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            log.append(JSONObject.toJSONString(arg)).append(", ");
        }
        logger.info(log.toString());
    }

    @AfterReturning(value = "serviceLogger()", returning = "returnObj")
    public void afterReturn(Object returnObj) {
        String result = JSONObject.toJSONString(returnObj);
        logger.info("afterReturning: " + result);
    }
}
