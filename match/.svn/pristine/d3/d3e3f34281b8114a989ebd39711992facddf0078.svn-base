package com.dxtwangxiao.strongestsuperscholar.web.session;

import com.dxtwangxiao.strongestsuperscholar.config.SessionDistributedCfg;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl.RedisDBSessionServiceImpl;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.SessionCentralizationService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * 实现功能：针对自定义的http会话
 */
public class    HttpSessionWrapper implements HttpSession
{
    private String sid = "";
    private HttpServletRequest request;
    private HttpServletResponse response;
    private final long creationTime = System.currentTimeMillis();
    private final long lastAccessedTime = System.currentTimeMillis();
    private SessionDistributedCfg objSessionDistributedCfg;
    private SessionCentralizationService objRedisService;

    public HttpSessionWrapper()
    {

    }

    public HttpSessionWrapper(String sid,SessionDistributedCfg objSessionDistributedCfg, HttpServletRequest request, HttpServletResponse response)
    {
        this.sid = sid;
        this.request = request;
        this.response = response;
        this.objSessionDistributedCfg = objSessionDistributedCfg;
        this.objRedisService = new RedisDBSessionServiceImpl(RedisFactory.getCur(objSessionDistributedCfg).getCurRedis().getCurJedisCmd());
    }

    /**
     * 实现功能：得到当前Sessio当前配置
     * @return
     */
    public SessionDistributedCfg GetSessionDistributedCfg()
    {
        return  this.objSessionDistributedCfg;
    }

    public Object getAttribute(String name)
    {
        Object obj = null;

        obj = this.objRedisService.GetMapObjectByKey(this.sid,name,Object.class);

        return obj;
    }

    public void setAttribute(String name, Object value)
    {
        this.objRedisService.SetMapObjectByKey(this.sid,name,value);
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public void invalidate()
    {

    }

    public void removeAttribute(String name)
    {
        this.objRedisService.RemoveMapObjectByKey(this.sid,name);
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public Object getValue(String name)
    {
        return null;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public Enumeration getAttributeNames()
    {
        return null;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public String[] getValueNames()
    {
        return null;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public void putValue(String name, Object value)
    {
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public void removeValue(String name)
    {

    }

    public long getCreationTime()
    {
        return creationTime;
    }

    public String getId()
    {
        return sid;
    }

    public long getLastAccessedTime()
    {
        return lastAccessedTime;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public ServletContext getServletContext()
    {
        return null;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public void setMaxInactiveInterval(int interval)
    {
        this.objRedisService.SetExpireByKey(this.sid,interval);
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public int getMaxInactiveInterval()
    {
        return (int) this.objRedisService.GetLeaveExpireOfsecond(this.sid);
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public HttpSessionContext getSessionContext()
    {
        return null;
    }

    /**
     * 不可用
     *
     * @deprecated
     */
    public boolean isNew()
    {
        return false;
    }
}
