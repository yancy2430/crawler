package com.tdeado.crawler.bean.kn;

public class RequestJson {

    /**
     * requestJSON :
     * requestTime : 1540618593926
     * safety : true
     * sessionKey : as_1ilz03s83l
     */

    private String requestJSON;
    private long requestTime;
    private boolean safety;
    private String sessionKey;

    public String getRequestJSON() {
        return requestJSON;
    }

    public void setRequestJSON(String requestJSON) {
        this.requestJSON = requestJSON;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

    public boolean isSafety() {
        return safety;
    }

    public void setSafety(boolean safety) {
        this.safety = safety;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    @Override
    public String toString() {
        return "RequestJson{" +
                "requestJSON='" + requestJSON + '\'' +
                ", requestTime=" + requestTime +
                ", safety=" + safety +
                ", sessionKey='" + sessionKey + '\'' +
                '}';
    }
}
