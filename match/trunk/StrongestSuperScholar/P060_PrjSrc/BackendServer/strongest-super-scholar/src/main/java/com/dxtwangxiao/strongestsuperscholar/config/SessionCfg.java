package com.dxtwangxiao.strongestsuperscholar.config;

/**
 * 实现功能:当前Session的配置信息
 */
public class SessionCfg
{
    /**
     * Session的保存时间
     */
    private int maxAge;

    /**
     * Session的ID名
     */
    private String strSessionIdName;

    private String generalWay;

    private String redisWay;

    /**
     * 实现功能:缺省无参构造函数
     */
    public SessionCfg()
    {

    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getStrSessionIdName()
    {
        return strSessionIdName;
    }

    public void setStrSessionIdName(String strSessionIdName)
    {
        this.strSessionIdName = strSessionIdName;
    }


    public String getGeneralWay() {
        return generalWay;
    }

    public void setGeneralWay(String generalWay) {
        this.generalWay = generalWay;
    }

    public String getRedisWay() {
        return redisWay;
    }

    public void setRedisWay(String redisWay) {
        this.redisWay = redisWay;
    }
}
