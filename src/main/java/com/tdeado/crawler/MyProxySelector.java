package com.tdeado.crawler;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 * 代理IP选择
 */
public class MyProxySelector extends ProxySelector {
    List<Proxy> proxies = new ArrayList<>();
    Map<String, Proxy> proxyMap = new HashMap<>();

    private String string = "";

    public MyProxySelector() {
        if (!StringUtils.isBlank(string)){
            for (String s : string.split("\n")) {
                String[] arr = s.split(":");
                proxyMap.put(arr[0], new Proxy(Proxy.Type.HTTP, new InetSocketAddress(arr[0], Integer.parseInt(arr[1]))));
            }
        }

    }

    @Override
    public List<Proxy> select(URI uri) {
        proxies.clear();
        for (Map.Entry<String, Proxy> entry : proxyMap.entrySet()) {
            proxies.add(entry.getValue());
        }
        Collections.shuffle(proxies);
        System.err.println(proxies.size());
        return proxies;
    }


    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        proxyMap.remove(sa.toString().replace("/","").split(":")[0]);
    }
}
