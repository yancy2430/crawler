package com.tdeado.crawler.utils;

import com.tdeado.crawler.MyProxySelector;
import okhttp3.OkHttpClient;

public enum HttpUtils {
    IN;
    private OkHttpClient client;
    HttpUtils() {
//        MyProxySelector myProxySelector = new MyProxySelector();
        client = new OkHttpClient.Builder()
//                .proxySelector(myProxySelector)
                .build();
    }

    public OkHttpClient getClient() {
        return client;
    }

}

