package com.dxtwangxiao.strongestsuperscholar.web.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 实现功能:MyUtil的辅助工具
 */
public class MyUtilTool
{
    private  static MyUtilTool cur = new MyUtilTool();

    public  static  MyUtilTool GetCur()
    {
        return cur;
    }

    protected  ShardedJedisPool poolRedis;

    protected MyUtilTool()
    {
        this.poolRedis = this.GetCurJedisPool();
    }

    public  JedisCommands GetCurJedis()
    {
        return  this.poolRedis.getResource();
    }

    public  int GetRandomNumber(int nMin,int nMax)
    {
        int nRetVal = 0;

        nRetVal = (int)this.Round(this.GetRandomNumber((double)nMin,(double)nMax),0);

        return  nRetVal;
    }

    public double GetRandomNumber(double dMin,double dMax)
    {
        double dRetVal = 0;

        dRetVal = dMin + (dMax - dMin) * Math.random();

        return dRetVal;
    }

    public  double Round(double dNumber,int nPrecsion)
    {
        return  new BigDecimal(dNumber).setScale(nPrecsion, RoundingMode.UP).doubleValue();
    }

    public Cookie[] GetAllCookies(HttpServletRequest req)
    {
        Cookie[] arrRetVal = null;
        if (req == null)
        {
            arrRetVal = new Cookie[]{};
            return  arrRetVal;
        }

        arrRetVal = req.getCookies();

        return  arrRetVal;
    }

    public  Cookie GetCookieByName(HttpServletRequest req,String strName)
    {
        Cookie curCookie = null;
        Cookie [] arrCookie = null;

        if (    req == null || strName == null || strName.equals("") ||
                (arrCookie = req.getCookies()) == null ||
                arrCookie.length <= 0)
        {
            return  curCookie;
        }

        for (Cookie cookie : arrCookie)
        {
            if (strName.equals(cookie.getName()))
            {
                curCookie = cookie;
                break;
            }
        }

        return  curCookie;
    }

    public boolean SetCookie(HttpServletResponse res, String strName, String strValue, String strDomain, String strPath, int nMaxAge)
    {
        boolean blRetVal = true;

        if (res == null || strName == null || strName.equals(""))
        {
            return blRetVal;
        }

        Cookie cookie = new Cookie(strName,strValue);

        if (strDomain != null)
        {
            cookie.setDomain(strDomain);
        }

        if (strPath != null)
        {
            cookie.setPath(strPath);
        }

        if (nMaxAge >= 0)
        {
            cookie.setMaxAge(nMaxAge);
        }

        //cookie.setSecure(false);

        res.addCookie(cookie);

        return blRetVal;
    }

    /**
     * 实现功能：从Jsonp字符串得到对象
     * @param strJsonData JSON字符串
     * @return 返回对象
     */
    public <T> T GetObjectFromString(String strJsonData,Class<T> classData)
    {
        T objRetVal = null;

        if (strJsonData == null || strJsonData.equals(""))
        {
            return  objRetVal;
        }

        try
        {
            objRetVal = (T)JSON.parseObject(strJsonData,classData,Feature.IgnoreNotMatch);
        }
        catch (Exception ex)
        {
            try
            {
                objRetVal = (T)JSON.parse(strJsonData);
            }
            catch (Exception ex1)
            {
                try
                {
                    objRetVal = (T)JSON.parseObject(strJsonData,Object.class);
                }
                catch (Exception ex2)
                {
                    objRetVal = null;
                }
            }
        }

        return  objRetVal;
    }

    /**
     * 实现功能：得到Object的Json的字符串
     * @param objData 对象的值
     * @return  返回对象字符串的值
     */
    public String GetStringFrom(Object objData)
    {
        String strRetVal = "";

        if (objData == null)
        {
            return strRetVal;
        }

        if (JSON.class.isInstance(objData))
        {
            strRetVal = ((JSON)objData).toJSONString();

            return  strRetVal;
        }

        if (Map.class.isInstance(objData))
        {
            strRetVal = new JSONObject((Map<String,Object>) objData).toJSONString();

            return  strRetVal;
        }

        try
        {
            strRetVal = JSON.toJSONString(objData);
        }
        catch (Exception ex)
        {
            strRetVal = objData.toString();
        }

        return  strRetVal;
    }

    protected ShardedJedisPool GetCurJedisPool()
    {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(50);
        config.setMaxWaitMillis(3000);
        config.setTestOnBorrow(true);
        config.setTestOnReturn(true);

        JedisShardInfo jedisShardInfoA = null;
        List<JedisShardInfo> list = new LinkedList<JedisShardInfo>();

        jedisShardInfoA = new JedisShardInfo("193.112.19.164", 16379);
        //jedisShardInfoA.setPassword("asbx2202");
        list.add(jedisShardInfoA);

        jedisShardInfoA = new JedisShardInfo("193.112.19.164", 16379);
        //jedisShardInfoA.setPassword("asbx2020");
        list.add(jedisShardInfoA);

        ShardedJedisPool pool = new ShardedJedisPool(config,list);

        return pool;
    }
}
