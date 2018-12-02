package com.tdeado.crawler.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Properties;

/**
 * redis 操作数据库配置类
 */
public enum  JedisPoolCacheUtils {
    IN;


    private final static String DATA_REDIS_KEY = "";

    /** 
     * redis过期时间,以秒为单位 
     */
    private final static int EXRP_HOUR = 60 * 60;            //一小时
    private final static int EXRP_HALF_DAY = 60 * 60 * 12;        //半天
    private final static int EXRP_DAY = 60 * 60 * 24;        //一天
    private final static int EXRP_MONTH = 60 * 60 * 24 * 30; //一个月
    private final static int maxActive =300;
    private final static int maxIdle =150;
    private final static int minIdle =10;
    private final static int maxWait =300;
    private final static String host ="120.79.75.44";
    private final static int port =80;
    private final static int timeout =6000;
    private JedisPool jedisPool = null;

    JedisPoolCacheUtils() {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(maxActive);
            config.setMaxIdle(maxIdle);
            config.setMinIdle(minIdle);
            config.setMaxWaitMillis(maxWait);
            config.setTestOnBorrow(true);
            config.setTestOnReturn(true);
            config.setTestWhileIdle(true);
            jedisPool = new JedisPool(config, host, port, timeout);
        } catch (Exception e) {
            try{
                //如果第一个IP异常，则访问第二个IP
                JedisPoolConfig config = new JedisPoolConfig();
                config.setMaxTotal(maxActive);
                config.setMaxIdle(maxIdle);
                config.setMinIdle(minIdle);
                config.setMaxWaitMillis(maxWait);
                config.setTestOnBorrow(true);
                jedisPool = new JedisPool(config, host, port, timeout);
            }catch(Exception e2){

            }
        }
    }



    /**
     * 
      * setVExpire(设置key值，同时设置失效时间 秒)
      * @Title: setVExpire
      * @param @param key
      * @param @param value
      * @param @param seconds
      * @param index 具体数据库 默认使用0号库
      * @return void
      * @throws
     */
    public<V> void setVExpire(String key, V value,int seconds,int index) {
        String json = StrUtils.beanTojson(value);
        //String json = JSON.toJSONString(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(index);
            jedis.set(DATA_REDIS_KEY +key, json);
            jedis.expire(DATA_REDIS_KEY +key, seconds);
        } catch (Exception e) {
//            log.error("setV初始化jedis异常：" + e);
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }

    }
    /**
     * 
      * (存入redis数据)
      * @Title: setV
      * @param @param key
      * @param @param value
      * @param index 具体数据库
      * @return void
      * @throws
     */
    public<V> void setV(String key, V value,int index) {
        String json = StrUtils.beanTojson(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(index);
            jedis.set(DATA_REDIS_KEY +key, json);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }

    }

    /**
     * 
      * getV(获取redis数据信息)
      * @Title: getV
      * @param @param key
      * @param index 具体数据库 0:常用数据存储      3：session数据存储
      * @param @return
      * @return V
      * @throws
     */
    @SuppressWarnings("unchecked")
    public String getV(String key,int index) {
        String value = "";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(index);
            value = jedis.get(DATA_REDIS_KEY +key);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
        return value;
    }
    /**
     * 
      * getVString(返回json字符串)
      * @Title: getVString
      * @param @param key
      * @param @param index
      * @param @return
      * @return String
      * @throws
     */
    public String getVStr(String key,int index) {
        String value = "";
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(index);
            value = jedis.get(DATA_REDIS_KEY +key);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
        return value;
    }

    /**
     * 
     * Push(存入 数据到队列中)
     * 
     * @Title: Push
     * @param @param key
     * @param @param value
     * @return void
     * @throws
     */
    public <V> void Push(String key, V value) {
        String json = StrUtils.beanTojson(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.lpush(key, json);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
    }
    /**
     *
     * Push(存入 数据到队列中)
     *
     * @Title: Push
     * @param @param key
     * @param @param value
     * @return void
     * @throws
     */
    public <V> void rPush(String key, V value) {
        String json = StrUtils.beanTojson(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.rpush(key, json);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
    }
    public long llen(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.llen(key);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
        return 0;
    }
    /**
     * 
     * Push(存入 数据到队列中)
     * 
     * @Title: PushV
     * @param  key
     * @param value
     * @param dBNum
     * @return void
     * @throws
     */
    public <V> void PushV(String key, V value,int dBNum) {
        String json = StrUtils.beanTojson(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(dBNum);
            jedis.lpush(key, json);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
    }

    /**
     * 
     * Push(存入 数据到队列中)
     * 
     * @Title: Push
     * @param @param key
     * @param @param value
     * @return void
     * @throws
     */
    public <V> void PushEmail(String key, V value) {

        String json = StrUtils.beanTojson(value);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(15);
            jedis.lpush(key, json);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
    }

    /**
     * 
     * Pop(从队列中取值)
     * 
     * @Title: Pop
     * @param @param key
     * @param @return
     * @return V
     * @throws
     */
    @SuppressWarnings("unchecked")
    public String Pop(String key) {
        List<String> value = null;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
//            jedis.select(15);
            value = jedis.brpop(1,DATA_REDIS_KEY +key);
            return value.get(1).replace("\"","");
        } catch (Exception e) {
            System.err.println(e);
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }
        return null;
    }


    /**
     * 
     * expireKey(限时存入redis服务器)
     * 
     * @Title: expireKey
     * @param @param key
     * @param @param seconds
     * @return void
     * @throws
     */
    public void expireKey(String key, int seconds) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(3);
            jedis.expire(DATA_REDIS_KEY +key, seconds);
        } catch (Exception e) {
            if (jedis != null) {
                //jedisPool.returnBrokenResource(jedis);
                jedis.close();
            }
        } finally {
            closeJedis(jedis);
        }

    }

    /**
     * 
     * closeJedis(释放redis资源)
     * 
     * @Title: closeJedis
     * @param @param jedis
     * @return void
     * @throws
     */
    public void closeJedis(Jedis jedis) {
        try {
            if (jedis != null) {
                /*jedisPool.returnBrokenResource(jedis);
                jedisPool.returnResource(jedis);
                jedisPool.returnResourceObject(jedis);*/
                //高版本jedis close 取代池回收
                jedis.close();
            }
        } catch (Exception e) {
        }
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

}