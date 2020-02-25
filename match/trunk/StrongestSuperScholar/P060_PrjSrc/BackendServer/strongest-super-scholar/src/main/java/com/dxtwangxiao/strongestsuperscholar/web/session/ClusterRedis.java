package com.dxtwangxiao.strongestsuperscholar.web.session;

import com.dxtwangxiao.strongestsuperscholar.config.RedisCfg;
import redis.clients.jedis.*;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 实现功能：针对Hash一致性分布式集群
 * 附注说明：主要应对Redisx.3.0(不含3.0)以前版本没有提供集群的方案
 */
public class ClusterRedis implements Redis{

    private ShardedJedisPool curPool;

    public ClusterRedis(RedisCfg redisCfg)
    {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(50);
        config.setMaxWaitMillis(200000);
        config.setTestOnBorrow(false);
        config.setTestOnReturn(false);

        JedisShardInfo jedisShardInfoA = null;
        List<JedisShardInfo> list = new LinkedList<JedisShardInfo>();

        String ip = redisCfg.getStrRedisHost().trim();
        String password =redisCfg.getStrRedisPsw().trim();
        String dbPort = redisCfg.getStrRedisPort().trim();

        String [] ips = ip.split(",");
        String [] passwords = password.split(",");
        String [] dbPorts = dbPort.split(",");

        for(int nI = 0;nI < ips.length;nI ++)
        {
            jedisShardInfoA = new JedisShardInfo(ips[nI].trim(),Integer.valueOf(dbPorts[nI].trim()));
            jedisShardInfoA.setPassword(passwords[nI].trim());
            list.add(jedisShardInfoA);
        }

        this.curPool = new ShardedJedisPool(config,list);
    }

    @Override
    public void set(String key, String value) throws IOException {
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxTotal(100);
//        config.setMaxIdle(50);
//        config.setMaxWaitMillis(200000);
//        config.setTestOnBorrow(false);
//        config.setTestOnReturn(false);
//
//        JedisShardInfo jedisShardInfoA = null;
//        List<JedisShardInfo> list = new LinkedList<JedisShardInfo>();
//
//        Properties properties=new Properties();
//        String con=Thread.currentThread().getContextClassLoader().getResource("needProduct.properties").getPath();
//        properties.load(new FileInputStream(con));
//        String ip=properties.getProperty("host-ip");
//        String password=properties.getProperty("redis.password");
//        jedisShardInfoA = new JedisShardInfo(ip, 16379);
//        jedisShardInfoA.setPassword(password);
//        list.add(jedisShardInfoA);
//
////        jedisShardInfoA = new JedisShardInfo("119.29.228.21", 6380);
////        //jedisShardInfoA.setPassword("asbx2202");
////        list.add(jedisShardInfoA);
//
//        ShardedJedisPool pool = new ShardedJedisPool(config,list);
//        ShardedJedis jedis = pool.getResource();

        JedisCommands jedis = curPool.getResource();

        jedis.set(key, value);

        ((ShardedJedis)jedis).close();
    }

    @Override
    public String get(String key) throws IOException {
//        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxTotal(100);
//        config.setMaxIdle(50);
//        config.setMaxWaitMillis(200000);
//        config.setTestOnBorrow(false);
//        config.setTestOnReturn(false);
//
//        JedisShardInfo jedisShardInfoA = null;
//        List<JedisShardInfo> list = new LinkedList<JedisShardInfo>();
//
//        Properties properties=new Properties();
//        String con=Thread.currentThread().getContextClassLoader().getResource("needProduct.properties").getPath();
//        properties.load(new FileInputStream(con));
//        String ip=properties.getProperty("host-ip");
//        String password=properties.getProperty("redis.password");
//        jedisShardInfoA = new JedisShardInfo(ip, 16379);
//        jedisShardInfoA.setPassword(password);
//        list.add(jedisShardInfoA);
//
////        jedisShardInfoA = new JedisShardInfo("119.29.228.21", 6380);
////        //jedisShardInfoA.setPassword("asbx2202");
////        list.add(jedisShardInfoA);
//
//        ShardedJedisPool pool = new ShardedJedisPool(config,list);
////        ShardedJedis jedis = pool.getResource();

        JedisCommands jedis = curPool.getResource();

        String value=jedis.get(key);

        ((ShardedJedis)jedis).close();

        return value;
    }

    @Override
    public JedisCommands getCurJedisCmd()
    {
        JedisCommands jedis = null;

        jedis = this.curPool.getResource();

        return  jedis;
    }

    @Override
    public boolean closeJedisCmd(JedisCommands jedis)
    {
        boolean blRetVal = true;

        try
        {
            ((ShardedJedis)jedis).close();
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }
        return  blRetVal;
    }
}
