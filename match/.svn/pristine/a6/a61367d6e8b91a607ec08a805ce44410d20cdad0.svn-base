package com.dxtwangxiao.strongestsuperscholar.web.filter;


import com.dxtwangxiao.strongestsuperscholar.config.RedisCfg;
import com.dxtwangxiao.strongestsuperscholar.config.SessionCfg;
import com.dxtwangxiao.strongestsuperscholar.config.SessionDistributedCfg;
import com.dxtwangxiao.strongestsuperscholar.web.session.DefinedHttpServletRequestWrapper;
import com.dxtwangxiao.strongestsuperscholar.web.util.MyUtilTool;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SessionFilter implements Filter{
    private RedisCfg redisCfg;

    private SessionCfg sessionCfg;

    private SessionDistributedCfg objSessionDistributedCfg;


    private static final String regex =".*(css|htm|ico|html|jpg|jpeg|png|gif|js)";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Properties properties=new Properties();
        InputStream in=this.getClass().getClassLoader().getResourceAsStream("sessionConfig.properties");
        try {
            properties.load(in);
        }
        catch (FileNotFoundException e){

        }
        catch (IOException e){

        }
        //配置redis
        String ip=properties.getProperty("redis.host");
        String password=properties.getProperty("redis.password");
        String dbPort = properties.getProperty("redis.port");
        String user = properties.getProperty("redis.user");
        String distributionWay = properties.getProperty("redis.data-distribution-way");
        this.redisCfg=new RedisCfg();
        redisCfg.setStrRedisHost(ip);
        redisCfg.setStrRedisPort(dbPort);
        redisCfg.setStrRedisUser(user);
        redisCfg.setStrRedisPsw(password);
        redisCfg.setDataDistributionWay(distributionWay);

        //配置session
        String max=properties.getProperty("session.max");
        String sessionid=properties.getProperty("session.id");
        String generalWay = properties.getProperty("session.general-way");
        String redisWay = properties.getProperty("session.redis-way");
        this.sessionCfg=new SessionCfg();
        sessionCfg.setMaxAge(Integer.valueOf(max));
        sessionCfg.setStrSessionIdName(sessionid);
        sessionCfg.setGeneralWay(generalWay);
        sessionCfg.setRedisWay(redisWay);
        this.objSessionDistributedCfg = new SessionDistributedCfg(redisCfg,sessionCfg);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //从cookie中获取sessionId，如果此次请求没有sessionId，重写为这次请求设置一个sessionId
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        //对于静态资源不过滤
        if(httpRequest.getRequestURL().toString().matches(regex))
        {
            chain.doFilter(request, response);
            return;
        }
        Cookie curCookie = MyUtilTool.GetCur().GetCookieByName(httpRequest,this.objSessionDistributedCfg.getObjMySessionCfg().getStrSessionIdName());

        String strSessionID = (curCookie != null?curCookie.getValue():"");

        if (strSessionID == null || strSessionID.equals(""))
        {
            strSessionID = java.util.UUID.randomUUID().toString();
            MyUtilTool.GetCur().SetCookie(httpResponse,this.objSessionDistributedCfg.getObjMySessionCfg().getStrSessionIdName(),strSessionID,null,"/strongestscholar",this.objSessionDistributedCfg.getObjMySessionCfg().getMaxAge());
        }
        chain.doFilter(new DefinedHttpServletRequestWrapper(strSessionID,objSessionDistributedCfg,httpRequest, httpResponse), response);
    }

    @Override
    public void destroy() {

    }
}
