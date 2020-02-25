package com.dxtwangxiao.strongestsuperscholar.web.session;

import redis.clients.jedis.JedisCommands;

import java.io.IOException;

public interface Redis {
    void set(String key, String value) throws IOException;
    String get(String key) throws IOException;
    JedisCommands getCurJedisCmd();
    boolean closeJedisCmd(JedisCommands jedis);
}
