package com.dxtwangxiao.strongestsuperscholar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Jwt 配置
 * @author lh
 * @date 2018.10.15
 */
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtConfiguration {
    private boolean authOpen;

    public boolean isAuthOpen() {
        return authOpen;
    }

    public void setAuthOpen(boolean authOpen) {
        this.authOpen = authOpen;
    }
}
