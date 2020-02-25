package com.dxtwangxiao.strongestsuperscholar.web.annotation;

import java.lang.annotation.*;

/**
 * Api不必进行权限验证注解
 * <p>
 * Created By Devin
 * 2018-10-08 上午 12:18
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NoAuth {
    String value() default "No Auth";
}
