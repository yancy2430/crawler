package com.tdeado.crawler.reptile.Impl;

import com.tdeado.crawler.bean.Flight;
import com.tdeado.crawler.bean.IPBean;
import com.tdeado.crawler.bean.ch.ReqBaseBean;
import com.tdeado.crawler.bean.ch.ReqFlight;
import com.tdeado.crawler.bean.ch.RspeFlight;
import com.tdeado.crawler.reptile.ReptileService;
import com.tdeado.crawler.utils.Base64Utils;
import com.tdeado.crawler.utils.DESUtils;
import com.tdeado.crawler.utils.HttpUtils;
import com.tdeado.crawler.utils.StrUtils;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

public class ChReptileServiceImpl implements ReptileService {
    static ReqFlight reqFlight = new ReqFlight();
    static String reqBaseString = "{\"isEmulator\":\"n\",\"remoteIP\":\"192.168.2.5\",\"latitude\":\"21.837084\",\"deviceSNPlus\":\"e9cd0288ed233d6412147e02194ece7a\",\"subTerminalType\":\"Android\",\"deviceSN\":\"35436007021649\",\"terminalType\":\"g\",\"const_id\":\"\",\"moneyClassId\":\"0\",\"versionNo\":\"6.5.4\",\"lang\":\"zh_CN\",\"channelid\":\"1\",\"channelId\":\"-2\",\"locationCity\":\"中国\",\"longitude\":\"132.930083\"}";
    static ReqBaseBean reqBaseBean = (ReqBaseBean) StrUtils.jsonTobean(reqBaseString, ReqBaseBean.class);
    //春秋域名
    private static final String url = "https://app.ch.com";
    //获取秘钥 请求参数为
    private static final String flightQuery = url + "/ECommercePlatform/m/flightV651/query?";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static final MediaType FORM = MediaType.parse("application/x-www-form-urlencoded");

    @Override
    public String requestContent(String url, String data, Type type) {
        return null;
    }

    @Override
    public Flight getFlight(String c, String d, String date) {
        reqFlight.setChannelId(reqBaseBean.getChannelid());
        reqFlight.setIsEmulator(reqBaseBean.getIsEmulator());
        reqFlight.setLatitude(reqBaseBean.getLatitude());
        reqFlight.setLongitude(reqBaseBean.getLongitude());
        reqFlight.setVersionNo(reqBaseBean.getVersionNo());
        reqFlight.setLang(reqBaseBean.getLang());
        reqFlight.setDeviceSNPlus(reqBaseBean.getDeviceSNPlus());
        reqFlight.setDeviceSN(reqBaseBean.getDeviceSN());
        reqFlight.setSubTerminalType(reqBaseBean.getSubTerminalType());
        reqFlight.setLocationCity(reqBaseBean.getLocationCity());
        reqFlight.setRemoteIP(reqBaseBean.getRemoteIP());
        reqFlight.setTerminalType(reqBaseBean.getTerminalType());
        reqFlight.setMoneyClassId(reqBaseBean.getMoneyClassId());
        reqFlight.setChannelid(reqBaseBean.getChannelid());
        reqFlight.setChannelId(reqBaseBean.getChannelId());
        reqFlight.setUserId("");
        reqFlight.setLoginId("");
        reqFlight.setCabin("0");//舱位
        reqFlight.setCompanyId("0");//公司标识
        reqFlight.setFlightDateGo("");//
        reqFlight.setOriCityCode(c);//出发城市三字码
        reqFlight.setDestCityCode(d);//到达城市三字码
        reqFlight.setTermId("-1");
        reqFlight.setIsNewProduct("Y");//是否新航线
        reqFlight.setWfFlag("0");
        reqFlight.setSaleTypeDetail("4");
        reqFlight.setFlightDate(date);
        reqFlight.setLcNo("1");
        reqFlight.setFlightType("1");
        reqFlight.setCustType("1");
        try {
            String body = DESUtils.decode(postRequest(flightQuery, "data=" + URLEncoder.encode(DESUtils.encode(StrUtils.beanTojson(reqFlight)), "UTF-8"), FORM));
//            System.err.println(body);
            //判断返回内容是否正确 如果不正确则抛异常
            StrUtils.jsonTobean(body, RspeFlight.class);
            return new Flight(c, d, date, body);
//            return new Flight(c, d, date, "");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Network anomalies...");
        }
        return null;

    }

    @Override
    public void iniproxy(Proxy proxy) {
    }

    private static String postRequest(String url, String data, MediaType type) throws Exception {
        RequestBody body = RequestBody.create(type, data);
        Request request = new Request.Builder()
                .url(url)
//                .addHeader("Proxy-Authorization","Basic "+ Base64Utils.encode("yancy@tdeado.com:YANGzhe2430".getBytes()))
                .post(body)
                .build();
        Response response = HttpUtils.IN.getClient().newCall(request).execute();
        return response.body().string();
    }

}
