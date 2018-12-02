package com.tdeado.crawler.bean.kn;

import java.util.List;

public class AppInfoBean {

    /**
     * deviceCode : deviceCode
     * ip : 118.251.250.246
     * os : android;Google Nexus 5X - 6.0.0 - API 23 - 1080x1920;6.0
     * version : 8.2.5
     * hardware : 0;2051740k;Y=1080.0,X=1794.0
     * safeKey : 9zsa44CXcAI=
     * sessionKey : as_1ilyywn3yr
     * ssoKey : as_1ily5dfxgs
     * updateStatus : {"newVersion":"3.6.5","updateStatus":"noUpdate","updateUrl":"/native/update.html"}
     * defaultCitys : [{"airportName":"北京南苑","code":"NAY","headerChar":"B","orgDst":"orgCity"},{"airportName":"上海虹桥","code":"SHA","headerChar":"S","orgDst":"dstCity"}]
     * defaultJjjCitys : [{"airportName":"北京南苑","code":"NAY","headerChar":"B","orgDst":"orgCity"},{"airportName":"安顺","code":"AVA","headerChar":"S","orgDst":"dstCity"}]
     * ok : true
     * auth : false
     * login : false
     */

    private String deviceCode;
    private String ip;
    private String os;
    private String version;
    private String hardware;
    private String safeKey;
    private String sessionKey;
    private String ssoKey;
    private UpdateStatusBean updateStatus;
    private boolean ok;
    private boolean auth;
    private boolean login;
    private List<DefaultCitysBean> defaultCitys;
    private List<DefaultJjjCitysBean> defaultJjjCitys;

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getSafeKey() {
        return safeKey;
    }

    public void setSafeKey(String safeKey) {
        this.safeKey = safeKey;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSsoKey() {
        return ssoKey;
    }

    public void setSsoKey(String ssoKey) {
        this.ssoKey = ssoKey;
    }

    public UpdateStatusBean getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(UpdateStatusBean updateStatus) {
        this.updateStatus = updateStatus;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public List<DefaultCitysBean> getDefaultCitys() {
        return defaultCitys;
    }

    public void setDefaultCitys(List<DefaultCitysBean> defaultCitys) {
        this.defaultCitys = defaultCitys;
    }

    public List<DefaultJjjCitysBean> getDefaultJjjCitys() {
        return defaultJjjCitys;
    }

    public void setDefaultJjjCitys(List<DefaultJjjCitysBean> defaultJjjCitys) {
        this.defaultJjjCitys = defaultJjjCitys;
    }

    public static class UpdateStatusBean {
        /**
         * newVersion : 3.6.5
         * updateStatus : noUpdate
         * updateUrl : /native/update.html
         */

        private String newVersion;
        private String updateStatus;
        private String updateUrl;

        public String getNewVersion() {
            return newVersion;
        }

        public void setNewVersion(String newVersion) {
            this.newVersion = newVersion;
        }

        public String getUpdateStatus() {
            return updateStatus;
        }

        public void setUpdateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
        }

        public String getUpdateUrl() {
            return updateUrl;
        }

        public void setUpdateUrl(String updateUrl) {
            this.updateUrl = updateUrl;
        }
    }

    public static class DefaultCitysBean {
        /**
         * airportName : 北京南苑
         * code : NAY
         * headerChar : B
         * orgDst : orgCity
         */

        private String airportName;
        private String code;
        private String headerChar;
        private String orgDst;

        public String getAirportName() {
            return airportName;
        }

        public void setAirportName(String airportName) {
            this.airportName = airportName;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getHeaderChar() {
            return headerChar;
        }

        public void setHeaderChar(String headerChar) {
            this.headerChar = headerChar;
        }

        public String getOrgDst() {
            return orgDst;
        }

        public void setOrgDst(String orgDst) {
            this.orgDst = orgDst;
        }
    }

    public static class DefaultJjjCitysBean {
        /**
         * airportName : 北京南苑
         * code : NAY
         * headerChar : B
         * orgDst : orgCity
         */

        private String airportName;
        private String code;
        private String headerChar;
        private String orgDst;

        public String getAirportName() {
            return airportName;
        }

        public void setAirportName(String airportName) {
            this.airportName = airportName;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getHeaderChar() {
            return headerChar;
        }

        public void setHeaderChar(String headerChar) {
            this.headerChar = headerChar;
        }

        public String getOrgDst() {
            return orgDst;
        }

        public void setOrgDst(String orgDst) {
            this.orgDst = orgDst;
        }
    }

    @Override
    public String toString() {
        return "AppInfoBean{" +
                "deviceCode='" + deviceCode + '\'' +
                ", ip='" + ip + '\'' +
                ", os='" + os + '\'' +
                ", version='" + version + '\'' +
                ", hardware='" + hardware + '\'' +
                ", safeKey='" + safeKey + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", ssoKey='" + ssoKey + '\'' +
                ", updateStatus=" + updateStatus +
                ", ok=" + ok +
                ", auth=" + auth +
                ", login=" + login +
                ", defaultCitys=" + defaultCitys +
                ", defaultJjjCitys=" + defaultJjjCitys +
                '}';
    }
}
