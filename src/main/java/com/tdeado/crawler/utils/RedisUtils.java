package com.tdeado.crawler.utils;

import redis.clients.jedis.Jedis;

public enum RedisUtils {
    IN;
    private Jedis jedis = null;
    RedisUtils() {
        this.jedis = new Jedis("localhost");
    }

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
