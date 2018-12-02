package com.tdeado.crawler.reptile.Impl;

import com.google.gson.Gson;
import com.tdeado.crawler.bean.Flight;
import com.tdeado.crawler.bean.IPBean;
import com.tdeado.crawler.bean.kn.AppInfoBean;
import com.tdeado.crawler.bean.kn.FlightSearch;
import com.tdeado.crawler.bean.kn.RequestJson;
import com.tdeado.crawler.bean.kn.ResponseJson;
import com.tdeado.crawler.reptile.ReptileService;
import com.tdeado.crawler.utils.Base64Utils;
import com.tdeado.crawler.utils.HttpUtils;
import com.tdeado.crawler.utils.KNDESUtil;
import com.tdeado.crawler.utils.RSAUtils;
import okhttp3.*;

import java.net.Proxy;
import java.util.Date;

public class KnReptileServiceImpl implements ReptileService {
    private static final String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCaC6meusPysktDVatRM5uRO6Jwzdr9lJI7U7NTrhJNzfPnzjHQ6jF6r+baBJUsdZtJkgu9gJMABUPyP2qV49iIrem1H8AP3azPLRLNQJ2CNA6pNHrgFMAJ9DuKbwMmBCWSqsof7CEmbeQLxu+cStGCfagpYr0l+pavoiE9Sz2WxQIDAQAB";
    private static String str = "{\"os\":\"android;Google Nexus 5X - 6.0.0 - API 23 - 1080x1920;6.0\",\"version\":\"8.2.5\",\"hardware\":\"0;2051740k;Y=1080.0,X=1794.0\",\"ssoKey\":\"as_1ilidawh\",\"deviceCode\":\"deviceCode\"}";

    static Gson gson = new Gson();
    static AppInfoBean appInfoBean = null;


    public KnReptileServiceImpl() {
        getSafeKey();
    }

    @Override
    public String requestContent(String url, String data, Type type) {
        return null;
    }

    @Override
    public Flight getFlight(String c, String d, String date) throws Exception {
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.setOrgCode(c);
        flightSearch.setDstCode(d);
        flightSearch.setTakeoffdate1(date);
        flightSearch.setTakeoffdate2("");
        flightSearch.setTripType("OW");
        RequestJson requestJson = new RequestJson();
        requestJson.setRequestTime(new Date().getTime());
        requestJson.setSafety(true);
        requestJson.setSessionKey(appInfoBean.getSessionKey());
        System.err.println("asdasdas");
        requestJson.setRequestJSON(KNDESUtil.encrypt(new Gson().toJson(flightSearch),appInfoBean.getSafeKey()));
        System.err.println("请求数据："+requestJson.toString());
        Request request = new Request.Builder()
                .url("http://app.flycua.com:80/ewp/pip/book/flightSearch.html")
                .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), gson.toJson(requestJson)))
                .build();
        Response response = HttpUtils.IN.getClient().newCall(request).execute();
        String resp = response.body().string();
        System.err.println("获取航线数据："+resp);
        ResponseJson respon = new Gson().fromJson(resp, ResponseJson.class);
        String s = KNDESUtil.decryptor(respon.getResponseJSON(),appInfoBean.getSafeKey());
        return new Flight(c,d,date,s);
    }

    @Override
    public void iniproxy(Proxy ipBean) {

    }
    public void getSafeKey(){
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .addHeader("X-Tingyun-Id","ksUObdTmc7c;c=2;r=519861431;")
                    .addHeader("X-Tingyun-Lib-Type-N-ST","0;1540612057277")
                    .addHeader("Accept","application/json")
                    .addHeader("User-Agent","Dalvik/2.1.0 (Linux; U; Android 6.0; Google Nexus 5X - 6.0.0 - API 23 - 1080x1920 Build/MRA58K)")
                    .addHeader("Connection","Keep-Alive")
                    .addHeader("Accept-Encoding","gzip")
                    .addHeader("Host","app.flycua.com")
                    .url("http://app.flycua.com:80/ewp/touch.html")
                    .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), encrypt(str)))
                    .build();
            Response response = client.newCall(request).execute();
            String resp = response.body().string();
            System.err.println("原文："+resp);
            String sjson = decrypt(resp);
            appInfoBean = gson.fromJson(sjson, AppInfoBean.class);
            if (appInfoBean.isOk()){
                System.err.println("获取配置数据："+appInfoBean.toString());
            }
        } catch (Exception e) {
            System.err.println("appInfoBean为空");
            e.printStackTrace();
        }
    }


    public static String encrypt(String str){
        byte[] encodedData = new byte[0];
        try {
            encodedData = RSAUtils.encryptByPublicKey(str.getBytes(), DEFAULT_PUBLIC_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return Base64Utils.encode(encodedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String decrypt(String str){
        byte[] data2 = new byte[0];
        try {
            data2 = Base64Utils.decode(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] encodedData2 = new byte[0];
        try {
            encodedData2 = RSAUtils.decryptByPublicKey(data2, DEFAULT_PUBLIC_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(encodedData2);
    }


}
