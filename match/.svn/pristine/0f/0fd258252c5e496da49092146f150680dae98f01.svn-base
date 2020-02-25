package com.dxtwangxiao.strongestsuperscholar.module.base.service.Impl;

import com.dxtwangxiao.strongestsuperscholar.module.base.service.SessionCentralizationService;
import com.dxtwangxiao.strongestsuperscholar.web.util.MyUtilTool;
import redis.clients.jedis.JedisCommands;

import java.util.HashMap;
import java.util.Map;

public class RedisDBSessionServiceImpl implements SessionCentralizationService
{
    /**
     * 实现功能：Redis对象
     */
    protected  JedisCommands jedis;

    /**
     * 实现功能：缺省无参构造函数
     * @param jedis Jedis对象
     */
    public RedisDBSessionServiceImpl(JedisCommands jedis)
    {
        this.jedis = jedis;
    }

    /**
     * 实现功能：存储对象
     * @param strKey 对象的Key
     * @param objVal 对象的值
     * @return 操作结果：真：成功,假：失败
     */
    @Override
    public boolean SetByKeyVal(String strKey,Object objVal)
    {
        String strVal = "";
        boolean blRetVal = true;

        if (!this.IsValidKey(strKey))
        {
            blRetVal = false;

            return blRetVal;
        }

        try
        {
            strVal = MyUtilTool.GetCur().GetStringFrom(objVal);

            this.jedis.set(strKey, strVal);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return blRetVal;
    }

    /**
     * 实现功能：存储对象
     * @param strKey    对象的Key
     * @param objVal    对象的值
     * @param nSeconds  秒
     * @return 操作结果：真：成功,假：失败
     */
     public boolean SetByKeyVal(String strKey, Object objVal,int nSeconds)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strKey))
        {
            blRetVal = false;

            return  blRetVal;
        }

        try
        {
            if (!this.SetByKeyVal(strKey,objVal))
            {
                blRetVal = false;
                return  blRetVal;
            }

            this.SetExpireByKey(strKey,nSeconds);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：设置对象的生命周期
     * @param strKey 对象的Key
     * @param nSeconds  对象生命周期，单位：秒
     * @return 操作结果：真：成功,假：失败
     */
    public boolean SetExpireByKey(String strKey,int nSeconds)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strKey))
        {
            blRetVal = false;
            return  blRetVal;
        }

        try
        {
            this.jedis.expire(strKey, nSeconds);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：得到剩余的过期时间毫秒数
     * @param strKey
     * @return 得到毫秒数
     */
    public long GetLeaveExpireOfMillisecond(String strKey)
    {
        if (!this.IsValidKey(strKey))
        {
            return  0;
        }

        return  this.jedis.pttl(strKey);
    }

    /**
     * 实现功能：得到剩余的过期时间秒数
     * @param strKey
     * @return 得到秒数
     */
    public long GetLeaveExpireOfsecond(String strKey)
    {
        if (!this.IsValidKey(strKey))
        {
            return  0;
        }

        return  this.jedis.ttl(strKey);
    }

    /**
     * 实现功能：移除对象
     * @param strKey 要移除的Key
     * @return 操作结果，真：成功，假：失败
     */
    public  boolean RemoevByKey(String strKey)
    {
        boolean blRetVal = true;

        if (this.IsValidKey(strKey))
        {
            blRetVal = false;
            return  blRetVal;
        }

        try
        {
            this.jedis.del(strKey);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：根据Key得到该对象
     * @param strKey 对象的Key
     * @return 得到的当前对象
     */
    public  <T> T GetObjectByKey(String strKey,Class<T> clsData)
    {
        T objRetVal = null;
        String strVal = "";

        if (!this.IsValidKey(strKey))
        {
            return  objRetVal;
        }

        strVal = this.jedis.get(strKey);

        objRetVal = MyUtilTool.GetCur().GetObjectFromString(strVal,clsData);

        return  objRetVal;
    }

    /**
     * 实现功能：得到Map<String,String>整体对象
     * @param strMapKey
     * @return 返回当前的Map对象
     */
    public Map<String,String> GetMapObject(String strMapKey)
    {
        Map<String,String> dictRetVal = null;

        if (!this.IsValidKey(strMapKey))
        {
            dictRetVal = new HashMap<String, String>();
            return  dictRetVal;
        }

        dictRetVal = this.jedis.hgetAll(strMapKey);
        return  dictRetVal;
    }

    /**
     * 实现功能：得到Map<String.String>中Key的对字符串内容
     * @param strMapKey Map的Key
     * @param strKey Key的值
     * @return Key对应的字符串值
     */
    public String GetMapStringByKey(String strMapKey,String strKey)
    {
        String strRetVal = "";

        if (!this.IsValidKey(strMapKey) || !this.IsValidKey(strKey))
        {
            return  strRetVal;
        }

        strRetVal = this.jedis.hget(strMapKey,strKey);

        return  strRetVal;
    }

    /**
     * 实现功能：得到Map<String.String>中Key的对象
     * @param strMapKey Map的Key
     * @param strKey Key的值
     * @return Key对应的对象
     */
    public  <T> T GetMapObjectByKey(String strMapKey,String strKey,Class<T> clsData)
    {
        T objRetVal = null;
        String strVal = "";

        if (!this.IsValidKey(strMapKey) || !this.IsValidKey(strKey))
        {
            return  objRetVal;
        }

        strVal = this.GetMapStringByKey(strMapKey,strKey);

        objRetVal = MyUtilTool.GetCur().GetObjectFromString(strVal,clsData);

        return objRetVal;
    }

    /**
     * 实现功能：整体保存Map<String,String>的对象
     * @param strMapKey     Map的Key
     * @param dictMapData   Map<String,String>数据对象
     * @return 真：成功，假：失败
     */
    public boolean SetMapObject(String strMapKey,Map<String,String> dictMapData)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strMapKey))
        {
            blRetVal = false;
            return  blRetVal;
        }

        try
        {
            this.jedis.hmset(strMapKey, dictMapData);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }
        return  blRetVal;
    }

    /**
     * 实现功能：保存Map<String,String>中的Key的值
     * @param strMapKey     Map的Key
     * @param strKey        Key
     * @param strVal        Value
     * @return 真：成功，假：失败
     */
    public boolean SetMapStringByKey(String strMapKey,String strKey,String strVal)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strMapKey) || !this.IsValidKey(strKey))
        {
            blRetVal = false;

            return  blRetVal;
        }

        try
        {
            this.jedis.hset(strMapKey,strKey,strVal);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：保存Map中的Key,Value键值对
     * @param strMapKey   Map的Key
     * @param strKey      Key
     * @param objVal      Value
     * @param <T>         对象的类型
     * @return 真：成功，假：失败
     */
    public  <T> boolean SetMapObjectByKey(String strMapKey,String strKey,T objVal)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strMapKey) || !this.IsValidKey(strKey))
        {
            blRetVal = false;
            return  blRetVal;
        }

        try
        {
            String strVul = MyUtilTool.GetCur().GetStringFrom(objVal);

            this.jedis.hset(strMapKey, strKey, strVul);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：RemoveMap中的Key,Value键值对
     * @param strMapKey   Map的Key
     * @param strKey      Key
     * @return 真：成功，假：失败
     */
    public boolean RemoveMapObjectByKey(String strMapKey,String strKey)
    {
        boolean blRetVal = true;

        if (!this.IsValidKey(strMapKey) || !this.IsValidKey(strKey))
        {
            blRetVal = false;
            return  blRetVal;
        }

        try
        {
            this.jedis.hdel(strMapKey,strKey);
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }

    /**
     * 实现功能：判断Key是否有效
     * @param strKey Key
     * @return 真:有效，假：无效
     * @remark 目前针对是否为空进行判断
     */
    protected  boolean  IsValidKey(String strKey)
    {
        boolean blRetValue = true;

        if (strKey == null || strKey.equals(""))
        {
            blRetValue = false;

            return blRetValue;
        }

        return blRetValue;
    }
}

