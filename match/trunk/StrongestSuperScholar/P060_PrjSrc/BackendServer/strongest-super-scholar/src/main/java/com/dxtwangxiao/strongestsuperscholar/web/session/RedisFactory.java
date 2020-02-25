package com.dxtwangxiao.strongestsuperscholar.web.session;


import com.dxtwangxiao.strongestsuperscholar.config.SessionDistributedCfg;

import java.util.concurrent.locks.ReentrantLock;

public class RedisFactory
{
    protected  static  RedisFactory cur;

    private static ReentrantLock objLock = new ReentrantLock();


    public static RedisFactory getCur(SessionDistributedCfg sessionDistributedCfg)
    {
        if (cur == null)
        {
            objLock.lock();

            if (cur != null)
            {
                return cur;
            }

            cur = new RedisFactory(sessionDistributedCfg);

            objLock.unlock();
        }
        return  cur;
    }

    private Redis curRedis;



    protected RedisFactory(SessionDistributedCfg sessionDistributedCfg)
    {

        this.curRedis = this.getRedis(sessionDistributedCfg);
    }

    public  Redis getCurRedis()
    {
        return  this.curRedis;
    }

    private Redis getRedis(SessionDistributedCfg sessionDistributedCfg)
    {
        Redis objRedis = null;

        switch (sessionDistributedCfg.getObjMyRedisCfg().getDataDistributionWay())
        {
            default:
            case  "general":
            {
                objRedis = new GeneralRedis(sessionDistributedCfg.getObjMyRedisCfg());
            }break;
            case "cluster":
            {
                objRedis = new ClusterRedis(sessionDistributedCfg.getObjMyRedisCfg());
            }break;
            case  "clusterReal":
            {
                objRedis = new ClusterRealRedis(sessionDistributedCfg.getObjMyRedisCfg());
            }break;
        }

        return  objRedis;
    }
}
