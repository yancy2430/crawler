package com.tdeado.crawler.bean.kn;

public class ResponseJson {

    /**
     * ifaceVersion : 1.2
     * next : B00002
     * responseJSON :
     * ok : true
     * responseTime : 1540618593460
     * safety : true
     */

    private String ifaceVersion;
    private String next;
    private String responseJSON;
    private boolean ok;
    private long responseTime;
    private boolean safety;

    public String getIfaceVersion() {
        return ifaceVersion;
    }

    public void setIfaceVersion(String ifaceVersion) {
        this.ifaceVersion = ifaceVersion;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getResponseJSON() {
        return responseJSON;
    }

    public void setResponseJSON(String responseJSON) {
        this.responseJSON = responseJSON;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public boolean isSafety() {
        return safety;
    }

    public void setSafety(boolean safety) {
        this.safety = safety;
    }
}
