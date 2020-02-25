package com.dxtwangxiao.strongestsuperscholar.web.session;

import com.dxtwangxiao.strongestsuperscholar.config.RedisCfg;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * 实现功能：Redis真正的集群
 * 附注说明：主要针对Redistributio3.0以及以后版本中高可用集群
 */
public class ClusterRealRedis implements Redis
{
    protected JedisCluster jedis;

    public  ClusterRealRedis(RedisCfg redisCfg)
    {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(50);
        config.setMaxWaitMillis(3000);
        config.setTestOnBorrow(true);
        config.setTestOnReturn(true);

        String ip=redisCfg.getStrRedisHost().trim();
        String password=redisCfg.getStrRedisPsw().trim();
        String dbPort = redisCfg.getStrRedisPort().trim();
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();

//        {
//            {
//                add(new HostAndPort("193.112.19.164",9001));
//                add(new HostAndPort("193.112.19.164",9002));
//                add(new HostAndPort("193.112.19.164",9003));
//                add(new HostAndPort("193.112.19.164",9004));
//                add(new HostAndPort("193.112.19.164",9005));
//                add(new HostAndPort("193.112.19.164",9006));
//            }
//        };

        String [] ips = ip.split(",");
        String [] passwords = password.split(",");
        String [] dbPorts = dbPort.split(",");

        //本集群中暂时没涉及到密码选项
        for(int nI = 0;nI < ips.length;nI ++)
        {
            nodes.add(new HostAndPort(ips[nI].trim(),Integer.valueOf(dbPorts[nI].trim())));
        }

        jedis = new JedisCluster(nodes,config);
    }

    @Override
    public void set(String key, String value) throws IOException
    {
        this.jedis.set(key,value);
    }

    @Override
    public String get(String key) throws IOException
    {
        String strRetVal = "";

        strRetVal = this.jedis.get(key);

        return  strRetVal;
    }

    @Override
    public JedisCommands getCurJedisCmd()
    {
        return  this.jedis;
    }

    @Override
    public boolean closeJedisCmd(JedisCommands jedis)
    {
        boolean blRetVal = true;

        if (jedis == null)
        {
            return  blRetVal;
        }

        try
        {
            ((JedisCluster)jedis).close();
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return blRetVal;
    }
}
