package com.tdeado.crawler;

import com.tdeado.crawler.bean.Flight;
import com.tdeado.crawler.reptile.ReptileService;
import com.tdeado.crawler.service.AgencyService;
import com.tdeado.crawler.utils.DbUtil;
import com.tdeado.crawler.utils.JedisPoolCacheUtils;
import okhttp3.OkHttpClient;
import redis.clients.jedis.Jedis;
/**
 * 抓取线程
 */
public class Capture implements Runnable {
    private ReptileService reptileService = null;
    private AgencyService agencyService = null;
    private String keys = null;
    private static final Object lock = new Object();
    private static final OkHttpClient client =null;

    public Capture(ReptileService reptileService, String keys) {
        this.reptileService = reptileService;
        this.keys = keys;
    }

    public void run() {
        while (true) {
            try {
                String thisVIN = null;
                synchronized (lock) {    //尽量减小锁的粒度和范围
                    thisVIN = JedisPoolCacheUtils.IN.Pop(keys);
                }
                String[] split = thisVIN.split("\\|");
                Flight flight = null;
                for (int i = 0; i < 3; i++) {
                    flight = reptileService.getFlight(split[0], split[1], split[2]);
                    if (flight!=null){
                        System.out.println(Thread.currentThread().getName() + "get_ok：" + thisVIN);
                        DbUtil.IN.executinsert(flight, keys);
                        break;
                    }else {
                        System.err.println("get error");
                    }
                }
                if (null==flight){//如果还是无法获取 就重新插入队列
                    JedisPoolCacheUtils.IN.rPush(keys,thisVIN);
                }
            } catch (Exception e) {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                System.err.println("异常"+e.getMessage());
            }
        }
    }
}