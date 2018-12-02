package com.tdeado.crawler.bean;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 请求航线bean
 */
public class Flight {
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 出发三字码
     */
    private String depart;
    /**
     * 到达三字码
     */
    private String arrive;
    /**
     * 航班日期
     */
    private String flightDate;
    /**
     * 航班信息
     */
    private String flightInfo;

    public String getFlightInfo() {
        return flightInfo;
    }

    public void setFlightInfo(String flightInfo) {
        this.flightInfo = flightInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public Flight(String depart, String arrive, String flightDate, String flightInfo) {
        this.createTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        this.depart = depart;
        this.arrive = arrive;
        this.flightDate = flightDate;
        this.flightInfo = flightInfo;
    }
}
