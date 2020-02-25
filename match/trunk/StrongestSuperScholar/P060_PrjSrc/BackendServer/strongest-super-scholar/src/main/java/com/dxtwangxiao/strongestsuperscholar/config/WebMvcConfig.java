package com.dxtwangxiao.strongestsuperscholar.config;

import com.dxtwangxiao.strongestsuperscholar.web.interceptor.CorsInterceptor;
import com.dxtwangxiao.strongestsuperscholar.web.interceptor.JwtAuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Web相关配置
 * <p>
 * Created By Devin
 * 2018-10-08 上午 12:30
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private JwtConfiguration jwtConfiguration;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //String[] excludes = new String[]{"/static/**","/templates/**"};

        registry.addInterceptor(new CorsInterceptor()).addPathPatterns("/**");

        // 测试接口时可关闭权限验证
        if(jwtConfiguration.isAuthOpen())
            registry.addInterceptor(new JwtAuthInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/privateLibrary").setViewName("privateLibrary/privateLibrary-2");
        registry.addViewController("/test").setViewName("test/index");
        registry.addViewController("/dataManageSystem").setViewName("dataManage/dataManage");
    }
}