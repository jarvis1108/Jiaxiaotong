package com.dxtwangxiao.strongestsuperscholar.web.websocket.common;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 前端页面与后台通信握手拦截器
 * <p>
 * Created by Devin
 * 2018-07-25 下午 03:05
 */
@Component
public class WebSocketInterceptor implements HandshakeInterceptor {

    /**
     * 进入handler之前的拦截，获取URI中的参数，将信息保存到当前session中
     *
     * @param request
     * @param response
     * @param webSocketHandler
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            HttpServletRequest httpServletRequest = ((ServletServerHttpRequest) request).getServletRequest();
            String userId = httpServletRequest.getParameter("userId");
            String matchId = httpServletRequest.getParameter("matchId");
            if (userId == null || userId.equals("")) {
                return false;
            }
            map.put("MATCH_USER_ID", userId);

            if (matchId != null && !matchId.equals("")) {
                map.put("MATCH_ID", matchId);
            }
            return true;
        }
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {

    }
}
