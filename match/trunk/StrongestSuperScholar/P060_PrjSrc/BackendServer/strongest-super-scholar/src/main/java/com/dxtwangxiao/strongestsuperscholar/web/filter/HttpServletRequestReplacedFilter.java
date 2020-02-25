package com.dxtwangxiao.strongestsuperscholar.web.filter;

import com.dxtwangxiao.strongestsuperscholar.web.interceptor.ReaderHttpServletRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * http请求包装过滤器
 * <p>
 * Created By Devin
 * 2018-10-08 上午 10:15
 */
public class HttpServletRequestReplacedFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletRequest requestWrapper = null;
        if (request instanceof HttpServletRequest) {
            requestWrapper = new ReaderHttpServletRequestWrapper((HttpServletRequest) request);
        }
        // 获取请求中的流如何，将取出来的字符串，再次转换成流，然后把它放入到新request对象中。
        // 在chain.doFiler方法中传递新的request对象
        if (requestWrapper == null) {
            chain.doFilter(request, response);
        } else {
            chain.doFilter(requestWrapper, response);
        }
    }

    @Override
    public void destroy() {

    }
}
