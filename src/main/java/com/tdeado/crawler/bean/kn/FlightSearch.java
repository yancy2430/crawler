package com.tdeado.crawler.bean.kn;

public class FlightSearch {

    /**
     * dstCode : SHA
     * orgCode : NAY
     * takeoffdate1 : 2018-10-28
     * takeoffdate2 : 2018-10-29
     * tripType : RT
     */

    private String dstCode;
    private String orgCode;
    private String takeoffdate1;
    private String takeoffdate2;
    private String tripType;

    public String getDstCode() {
        return dstCode;
    }

    public void setDstCode(String dstCode) {
        this.dstCode = dstCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getTakeoffdate1() {
        return takeoffdate1;
    }

    public void setTakeoffdate1(String takeoffdate1) {
        this.takeoffdate1 = takeoffdate1;
    }

    public String getTakeoffdate2() {
        return takeoffdate2;
    }

    public void setTakeoffdate2(String takeoffdate2) {
        this.takeoffdate2 = takeoffdate2;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    @Override
    public String toString() {
        return "FlightSearch{" +
                "dstCode='" + dstCode + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", takeoffdate1='" + takeoffdate1 + '\'' +
                ", takeoffdate2='" + takeoffdate2 + '\'' +
                ", tripType='" + tripType + '\'' +
                '}';
    }
}
