package com.dxtwangxiao.strongestsuperscholar.web.session;

import com.dxtwangxiao.strongestsuperscholar.config.SessionDistributedCfg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/***
 *
 * @author xiaoshuai
 *
 */
public class DefinedHttpServletRequestWrapper extends HttpServletRequestWrapper
{
    private HttpSessionWrapper currentSession;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String sid = "";
    private SessionDistributedCfg objSessionDistributedCfg;

    public DefinedHttpServletRequestWrapper(HttpServletRequest request)
    {
        super(request);
    }

    public DefinedHttpServletRequestWrapper(String sid, SessionDistributedCfg objSessionDistributedCfg, HttpServletRequest request,
                                            HttpServletResponse response)
    {
        super(request);
        this.request = request;
        this.response = response;
        this.sid = sid;
        this.objSessionDistributedCfg = objSessionDistributedCfg;
    }

    @Override
    public HttpSession getSession(boolean create)
    {
        if(currentSession != null)
        {
            return currentSession;
        }

        if(!create)
        {
            return null;
        }

        currentSession = new HttpSessionWrapper(sid,this.objSessionDistributedCfg, request, response);

        return currentSession;
    }

    @Override
    public HttpSession getSession()
    {
        return getSession(true);
    }
}

