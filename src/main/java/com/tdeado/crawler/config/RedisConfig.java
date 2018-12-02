package com.tdeado.crawler.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public enum  RedisConfig {
    IN;
    private Jedis jedis;
    private JedisPool jedisPool;

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }

    RedisConfig() {
        try {
            jedisPool = new JedisPool("120.79.75.44",80);
            GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
            poolConfig.setMaxTotal(1000);
//            poolConfig.setMaxWaitMillis(1);
            JedisPool pool = new JedisPool(poolConfig, "120.79.75.44", 80);

            jedis = pool.getResource();
        }catch (Exception e){
            System.err.println("Redis异常初始化");
        }
    }


}
