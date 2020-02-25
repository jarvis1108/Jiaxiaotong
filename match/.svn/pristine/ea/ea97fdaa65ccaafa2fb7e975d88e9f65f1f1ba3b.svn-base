package com.dxtwangxiao.strongestsuperscholar;

import com.dxtwangxiao.strongestsuperscholar.web.filter.HttpServletRequestReplacedFilter;
import com.dxtwangxiao.strongestsuperscholar.web.filter.SessionFilter;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.GroupWebSocketHandler;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.MatchWebSocketHandler;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.PkWebSocketHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StrongestSuperScholarApplication /*extends SpringBootServletInitializer*/ {

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StrongestSuperScholarApplication.class);
    }*/

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StrongestSuperScholarApplication.class, args);

        MatchWebSocketHandler.setApplicationContext(applicationContext);
        PkWebSocketHandler.setApplicationContext(applicationContext);
        GroupWebSocketHandler.setApplicationContext(applicationContext);
    }

    @Bean
    public FilterRegistrationBean httpServletRequestReplacedRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new HttpServletRequestReplacedFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("httpServletRequestReplacedFilter");
        registration.setOrder(1);
        return registration;
    }

    /**
     * 配置Session过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SessionFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("sessionFilter");
        registration.setOrder(Integer.MAX_VALUE);
        return registration;
    }
}
