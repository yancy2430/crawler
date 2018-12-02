package com.tdeado.crawler.service.Impl;

import com.tdeado.crawler.bean.IPBean;
import com.tdeado.crawler.service.AgencyService;

import java.util.List;

public class AgencyServiceImpl implements AgencyService {

    public IPBean getIp() {
        IPBean ip=new IPBean();
        return ip;
    }

    public boolean putIp(IPBean ipBean) {
        return false;
    }

    public List<IPBean> getIps() {
        return null;
    }

    public boolean putIps(List<IPBean> ipBeans) {
        return false;
    }
}
