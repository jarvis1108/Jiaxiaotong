package com.dxtwangxiao.strongestsuperscholar.web.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by Devin
 * 2018-06-28 下午 04:08
 */
public class WebUtil {

    private static RestTemplate restTemplate = new RestTemplate();

    public static RestTemplate getRestTemplate() {
        return restTemplate;
    }

    /**
     * 解析HTTP get请求，获取RequestInfo实例
     *
     * @param request http请求
     * @return
     */
    public static RequestInfo parseGetRequest(HttpServletRequest request) {
        RequestInfo requestInfo = new RequestInfo();

        String reqId = request.getParameter("reqId");
        String reqType = request.getParameter("reqType");
        String reqUserInfo = request.getParameter("reqUserInfo");
        String reqParam = request.getParameter("reqParam");
        String pageInfo = request.getParameter("reqPageInfo");
        String reqRefData = request.getParameter("reqRefData");

        requestInfo.setReqId(reqId);
        requestInfo.setReqType(reqType);
        requestInfo.setReqUserInfo(JSONObject.parseObject(reqUserInfo));
        requestInfo.setReqParam(JSONObject.parseObject(reqParam));
        requestInfo.setReqPageInfo(JSONObject.parseObject(pageInfo));
        requestInfo.setReqRefData(JSONObject.parseObject(reqRefData));

        return requestInfo;
    }

    /**
     * 解析HTTP post请求，获取RequestInfo实例
     *
     * @param request http请求
     * @return
     * @throws IOException
     */
    public static RequestInfo parsePostRequest(HttpServletRequest request) throws IOException {
        return JSON.parseObject(getBodyString(request), RequestInfo.class);
    }

    /**
     * 获取用户真实IP地址
     * <p>
     * 不使用request.getRemoteAddr()的原因是有可能用户使用了代理软件方式避免真实IP地址,
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值
     *
     * @param request http请求
     * @return 客户端真实ip地址
     */
    public static String getClientIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forward-for");
        if (ip != null && ip.length() != 0 && "unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            if (ip.contains(",")) {
                ip = ip.split(",")[0];
            }
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
            System.out.println("Proxy-Client-IP ip: " + ip);
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            System.out.println("WL-Proxy-Client-IP ip: " + ip);
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
            System.out.println("HTTP_CLIENT_IP ip: " + ip);
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            System.out.println("HTTP_X_FORWARDED_FOR ip: " + ip);
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
            System.out.println("X-Real-IP ip: " + ip);
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            System.out.println("getRemoteAddr ip: " + ip);
        }

        System.out.println("获取客户端ip: " + ip);
        return ip;
    }

    /**
     * 获取http请求体中的字符串
     *
     * @param request http请求
     * @return 请求体字符串
     * @throws IOException
     */
    public static String getBodyString(HttpServletRequest request) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = request.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
