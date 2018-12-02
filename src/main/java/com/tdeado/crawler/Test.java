package com.tdeado.crawler;

import com.tdeado.crawler.config.RedisConfig;
import com.tdeado.crawler.reptile.Impl.ChReptileServiceImpl;
import com.tdeado.crawler.reptile.ReptileService;
import com.tdeado.crawler.utils.Base64Utils;
import com.tdeado.crawler.utils.JedisPoolCacheUtils;
import com.tdeado.crawler.utils.StrUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws Exception {
//        while (true){
//            String ss = JedisPoolCacheUtils.IN.Pop("ips");
//            ss = ss.replace("\"","");
//            System.err.println(ss.split(":")[0]);
//            System.err.println(ss.split(":")[1]);
//
//            System.err.println(ss);
//            System.err.println(RedisConfig.IN.getJedis().llen("ips"));
//            Thread.sleep(1000);
//            JedisPoolCacheUtils.IN.Push("ips",ss);
//            System.err.println(RedisConfig.IN.getJedis().llen("ips"));
//        }


        for (int j = 0; j < 1; j++) {
            String string = StrUtils.readToString("/home/fx.txt");
            String[] strs = string.split("\n");
            for (int i = 0; i < strs.length; i++) {
                JedisPoolCacheUtils.IN.Push("chhk",strs[i]);
//                System.err.println(strs[i]);
//                System.err.println(JedisPoolCacheUtils.IN.llen("chhk"));
            }
        }
        while (true){
            Thread.sleep(1000);
            System.err.println(JedisPoolCacheUtils.IN.llen("chhk"));
        }



//        System.err.println(jedis.rpop("aaa"));

//        for (int j = 0; j < RedisConfig.IN.getJedis().llen("chhk"); j++) {
//            JedisPoolCacheUtils.IN.Pop("chhk");
//        }

//        System.err.println(RedisConfig.IN.getJedis().llen("aaa"));
//        long time = System.currentTimeMillis();
//        while (true){
//            System.err.println(RedisConfig.IN.getJedis().llen("chhk"));
//            Thread.sleep(1000);
//            if (RedisConfig.IN.getJedis().llen("chhk")==0){
//                long ss = (time - System.currentTimeMillis())/1000;
//                System.err.println("这么多秒"+ss);
//            }
//        }
//        long num = RedisConfig.IN.getJedis().llen("chhk");
//        System.err.println(num);
//        StrUtils.jsonToCreate("");
//        StrUtils.jsonTobean(chhk);

//        String ips = "183.130.47.228:766\n" +
//                "114.231.64.16:36410\n" +
//                "27.220.127.234:5412\n" +
//                "182.241.37.66:894\n" +
//                "119.176.16.130:766\n" +
//                "183.130.57.46:3617\n" +
//                "119.140.160.195:23564\n" +
//                "124.135.98.222:766\n" +
//                "42.54.91.220:894\n" +
//                "117.85.83.211:894\n" +
//                "59.63.75.23:894\n" +
//                "116.55.186.161:894\n" +
//                "183.147.30.84:5412\n" +
//                "106.59.59.39:23564\n" +
//                "180.118.86.114:23564\n" +
//                "114.105.187.201:5412\n" +
//                "182.98.36.99:894\n" +
//                "60.161.177.55:36410\n" +
//                "182.111.229.175:23564\n" +
//                "182.87.239.24:3617";
//        for (String s : ips.split("\n")) {
//            RedisConfig.IN.getJedis().lpush("ips",s);
//        }
//
//
    }
}
