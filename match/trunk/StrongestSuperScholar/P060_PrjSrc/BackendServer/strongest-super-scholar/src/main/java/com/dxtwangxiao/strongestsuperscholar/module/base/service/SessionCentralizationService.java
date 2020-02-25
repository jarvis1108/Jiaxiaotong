package com.dxtwangxiao.strongestsuperscholar.module.base.service;

import java.util.Map;

/**
 * 实现功能：针对会话集中式管理的服务
 */
public interface SessionCentralizationService
{
    /**
     * 实现功能：存储对象
     * @param strKey 对象的Key
     * @param objVal 对象的值
     * @return 操作结果：真：成功,假：失败
     */
    boolean SetByKeyVal(String strKey, Object objVal);

    /**
     * 实现功能：存储对象
     * @param strKey    对象的Key
     * @param objVal    对象的值
     * @param nSeconds  秒
     * @return 操作结果：真：成功,假：失败
     */
    boolean SetByKeyVal(String strKey, Object objVal, int nSeconds);

    /**
     * 实现功能：设置对象的生命周期
     * @param strKey 对象的Key
     * @param nSeconds  对象生命周期，单位：秒
     * @return 操作结果：真：成功,假：失败
     */
    boolean SetExpireByKey(String strKey, int nSeconds);

    /**
     * 实现功能：移除对象
     * @param strKey 要移除的Key
     * @return 操作结果，真：成功，假：失败
     */
    boolean RemoevByKey(String strKey);

    /**
     * 实现功能：根据Key得到该对象
     * @param strKey 对象的Key
     * @return 得到的当前对象
     */
    <T> T GetObjectByKey(String strKey, Class<T> clsData);

    /**
     * 实现功能：得到Map<String,String>整体对象
      * @param strMapKey
     * @return 返回当前的Map对象
     */
    Map<String,String> GetMapObject(String strMapKey);

    /**
     * 实现功能：得到Map<String.String>中Key的对字符串内容
     * @param strMapKey Map的Key
     * @param strKey Key的值
     * @return Key对应的字符串值
     */
    String GetMapStringByKey(String strMapKey, String strKey);

    /**
     * 实现功能：得到剩余的过期时间毫秒数
     * @param strKey
     * @return 得到毫秒数
     */
    long GetLeaveExpireOfMillisecond(String strKey);

    /**
     * 实现功能：得到剩余的过期时间秒数
     * @param strKey
     * @return 得到秒数
     */
    long GetLeaveExpireOfsecond(String strKey);

    /**
     * 实现功能：得到Map<String.String>中Key的对象
     * @param strMapKey Map的Key
     * @param strKey Key的值
     * @return Key对应的对象
     */
    <T> T GetMapObjectByKey(String strMapKey, String strKey, Class<T> clsData);

    /**
     * 实现功能：整体保存Map<String,String>的对象
     * @param strMapKey     Map的Key
     * @param dictMapData   Map<String,String>数据对象
     * @return 真：成功，假：失败
     */
    boolean SetMapObject(String strMapKey, Map<String, String> dictMapData);

    /**
     * 实现功能：保存Map<String,String>中的Key的值
     * @param strMapKey     Map的Key
     * @param strKey        Key
     * @param strVal        Value
     * @return 真：成功，假：失败
     */
    boolean SetMapStringByKey(String strMapKey, String strKey, String strVal);

    /**
     * 实现功能：保存Map中的Key,Value键值对
     * @param strMapKey   Map的Key
     * @param strKey      Key
     * @param objVal      Value
     * @param <T>         对象的类型
     * @return 真：成功，假：失败
     */
    <T> boolean SetMapObjectByKey(String strMapKey, String strKey, T objVal);

    /**
     * 实现功能：RemoveMap中的Key,Value键值对
     * @param strMapKey   Map的Key
     * @param strKey      Key
     * @return 真：成功，假：失败
     */
    boolean RemoveMapObjectByKey(String strMapKey, String strKey);
}
