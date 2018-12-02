package com.tdeado.crawler.service;

import com.tdeado.crawler.bean.IPBean;

import java.util.List;

/**
 * 代理IP服务
 */
public interface AgencyService {

    IPBean getIp();
    boolean putIp(IPBean ipBean);
    List<IPBean> getIps();
    boolean putIps(List<IPBean> ipBeans);

}
