package com.dxtwangxiao.strongestsuperscholar.web.session;

import com.dxtwangxiao.strongestsuperscholar.config.RedisCfg;
import redis.clients.jedis.*;

import java.io.IOException;

/**
 * 实现功能：Redis单结点方式数据库访问
 * 附注说明：
 */
public class GeneralRedis implements Redis{

    private JedisPool curPool;

    public  GeneralRedis(RedisCfg redisCfg)
    {

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(50);
        config.setMaxWaitMillis(3000);
        config.setTestOnBorrow(true);
        config.setTestOnReturn(true);

        this.curPool = new JedisPool(config,redisCfg.getStrRedisHost().trim(),Integer.valueOf(redisCfg.getStrRedisPort()),100000,redisCfg.getStrRedisPsw().trim());
    }

    @Override
    public void set(String key, String value) throws IOException {
//        Properties properties=new Properties();
//        String config=Thread.currentThread().getContextClassLoader().getResource("needProduct.properties").getPath();
//        properties.load(new FileInputStream(config));
//        String ip=properties.getProperty("host-ip");
//        String password=properties.getProperty("redis.password");
//
//        JedisShardInfo jedisShardInfo = new JedisShardInfo(ip, 6379);
//        jedisShardInfo.setPassword(password);
//        jedisShardInfo.setSoTimeout(100000);
//
//        JedisCommands jedis = new Jedis(jedisShardInfo);
//        jedis.set(key,value);

        JedisCommands jedis = null;

        try
        {
            jedis = this.curPool.getResource();
            jedis.set(key, value);
        }
        catch (Exception ex)
        {

        }
        finally
        {
            if (jedis != null)
            {
                ((Jedis)jedis).close();
            }
        }
    }

    @Override
    public String get(String key) throws IOException {
//        Properties properties=new Properties();
//        String config=Thread.currentThread().getContextClassLoader().getResource("needProduct.properties").getPath();
//        properties.load(new FileInputStream(config));
//        String ip=properties.getProperty("host-ip");
//        String password=properties.getProperty("redis.password");
//
//        JedisShardInfo jedisShardInfo = new JedisShardInfo(ip, 6379);
//        jedisShardInfo.setPassword(password);
//        jedisShardInfo.setSoTimeout(100000);

        //JedisCommands jedis = new Jedis(jedisShardInfo);

        JedisCommands jedis = null;
        String value = null;

        try
        {
            jedis = this.curPool.getResource();
            value = jedis.get(key);
        }
        catch (Exception ex)
        {

        }
        finally
        {
            if (jedis != null)
            {
                ((Jedis) jedis).close();
            }
        }

        return value;
    }

    @Override
    public JedisCommands getCurJedisCmd()
    {
        JedisCommands jedis = this.curPool.getResource();

        return jedis;
    }

    @Override
    public boolean closeJedisCmd(JedisCommands jedis)
    {
        boolean blRetVal = true;

        try
        {
            ((Jedis) jedis).close();
        }
        catch (Exception ex)
        {
            blRetVal = false;
        }

        return  blRetVal;
    }
}
