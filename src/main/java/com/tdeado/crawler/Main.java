package com.tdeado.crawler;

import com.tdeado.crawler.bean.IPBean;
import com.tdeado.crawler.config.RedisConfig;
import com.tdeado.crawler.reptile.Impl.KnReptileServiceImpl;
import com.tdeado.crawler.reptile.ReptileService;
import com.tdeado.crawler.reptile.Impl.ChReptileServiceImpl;

import java.net.InetSocketAddress;
import java.net.Proxy;


public class Main {
    public static void main(String[] args) throws Exception {
        ReptileService chReptileService = new ChReptileServiceImpl();
        ReptileService knReptileService = new KnReptileServiceImpl();
        for (int i = 0; i < 200; i++) {
            new Thread(new Capture(chReptileService,"chhk"),"chhk"+i).start();
        }
    }
}
