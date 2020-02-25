package com.dxtwangxiao.strongestsuperscholar.web.websocket.config;

import com.dxtwangxiao.strongestsuperscholar.web.websocket.common.WebSocketInterceptor;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.GroupWebSocketHandler;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.MatchWebSocketHandler;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.handler.PkWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * WebSocket配置类
 * <p>
 * Created by Devin
 * 2018-10-12 上午 10:48
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 添加匹配对战处理Websocket
        registry.addHandler(matchWebSocketHandler(), "/websocket/match")
                .addInterceptors(webSocketInterceptor())
                .setAllowedOrigins("*");

        // 添加好友对战处理Websocket
        registry.addHandler(pkWebSocketHandler(), "/websocket/pk")
                .addInterceptors(webSocketInterceptor())
                .setAllowedOrigins("*");

        // 添加群PK处理Websocket
        registry.addHandler(groupWebSocketHandler(), "/websocket/group")
                .addInterceptors(webSocketInterceptor())
                .setAllowedOrigins("*");
    }

    @Bean
    public WebSocketInterceptor webSocketInterceptor() {
        return new WebSocketInterceptor();
    }

    @Bean
    public MatchWebSocketHandler matchWebSocketHandler() {
        return new MatchWebSocketHandler();
    }

    @Bean
    public PkWebSocketHandler pkWebSocketHandler() {
        return new PkWebSocketHandler();
    }

    @Bean
    public GroupWebSocketHandler groupWebSocketHandler() {
        return new GroupWebSocketHandler();
    }
}
