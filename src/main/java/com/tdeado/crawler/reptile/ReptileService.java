package com.tdeado.crawler.reptile;

import com.tdeado.crawler.bean.Flight;
import com.tdeado.crawler.bean.IPBean;

import java.net.Proxy;

/**
 * 爬虫抓取数据接口
 */
public interface ReptileService {
    /**
     * 请求内容 返回内容
     * @return
     */
    String requestContent(String url,String data,Type type);
    /**
     * 请求内容 返回内容
     * @return
     */
    Flight getFlight(String c, String d, String date) throws Exception;

    /**
     * 设置代理
     * @param ipBean
     */
    void iniproxy(Proxy ipBean);
    class Type{
        public final static String POST = "POST";
        public final static String GET = "GET";
    }
}
