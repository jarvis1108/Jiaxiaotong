package com.dxtwangxiao.strongestsuperscholar.web.interceptor;

import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * 新建Wrapper，防止拦截器获取post请求体中数据后，流丢失
 * <p>
 * Created By Devin
 * 2018-10-08 上午 10:12
 */
public class ReaderHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private final byte[] body;

    public ReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        body = WebUtil.getBodyString(request).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    @Override
    public ServletInputStream getInputStream() {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body);
        return new ServletInputStream() {
            @Override
            public int read() {
                return byteArrayInputStream.read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }
        };
    }
}
