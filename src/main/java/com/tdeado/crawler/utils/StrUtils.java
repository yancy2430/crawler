package com.tdeado.crawler.utils;

import com.google.gson.Gson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StrUtils {

    /**
     * 参数转json
     * @param string
     * @return
     */
    public static String paramTojson(String string){
        Map<String,String> stringMap = new HashMap<String, String>();
        String[] strs = string.split("&");
        for (String str : strs) {
            String[] sts = new String[]{"",""};
            String[] st = str.split("=");
            if (st.length==1){
                sts[0] = st[0];
            }else {
                sts[0] = st[0];
                sts[1] = st[1];
            }
            stringMap.put(sts[0],sts[1]);
        }
        return new Gson().toJson(stringMap);
    }
    /**
     * bean转json
     * @param string
     * @return
     */
    public static String beanTojson(Object string){
        return new Gson().toJson(string);
    }
    /**
     * bean转参数
     * @param object
     * @return
     */
    public static String beanToParam(Object object){
        return jsonToParam(new Gson().toJson(object));
    }
    /**
     * json转参数
     * @param string
     * @return
     */
    public static String jsonToParam(String string){
        Map<String,String> map = new Gson().fromJson(string, Map.class);
        String str = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str+=entry.getKey()+"="+entry.getValue()+"&";
        }
        str = str.substring(0,str.length()-1);
        return str;
    }
    /**
     * json转bean
     * @param string
     * @return
     */
    public static Object jsonTobean(String string,Class<?> t){
        return new Gson().fromJson(string,t);
    }

    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }


    /**
     * bean 转sql插入
     */
    public static String jsonToSql(String json,String tb){
        Map<String,Object> map = new Gson().fromJson(json, Map.class);
        String str = "INSERT INTO "+tb+" (";
        String sss ="";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sss+="`"+entry.getKey()+"`,";
        }
        sss = sss.substring(0,sss.length()-1);
        str+=sss;
        str+=") VALUES (";
        String bbb ="";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            bbb+="'"+entry.getValue()+"',";
        }
        bbb = bbb.substring(0,bbb.length()-1);
        str+=bbb;
        str+=")";
        System.err.println(str);
        return str;
    }

    public static String jsonToCreate(String json,String tb){
        Map<String,Object> map = new Gson().fromJson(json, Map.class);
        String str = "CREATE TABLE `"+tb+"` ( `id` int(11) unsigned NOT NULL AUTO_INCREMENT,";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            str+="`"+entry.getKey()+"` varchar(200) DEFAULT NULL,";
        }
        str+=" PRIMARY KEY (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;";
        return str;
    }
}
