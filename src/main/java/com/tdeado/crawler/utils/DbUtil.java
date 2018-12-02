package com.tdeado.crawler.utils;
import com.tdeado.crawler.bean.Flight;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 操作数据库工具类
 *
 *
 */
public enum  DbUtil {
    IN;
    Connection conn = null;
    DbUtil() {
        getConnection("com.mysql.jdbc.Driver","jdbc:mysql://mysql.tdeado.com:3306/upup","root","asd243046870");
    }
    /**
     * 连接数据
     *
     * @return conn
     */
    private Connection getConnection(String driver,String url,String username,String password) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭连接对象
     *
     *            连接对象
     * @param pstmt
     *            预编译对象
     * @param rs
     *            结果集
     */
    public void closeAll(PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 增删改操作
     *
     * @param sql
     *            SQL命令
     * @param param
     *            参数
     * @return
     */
    public int executUpdate(String sql, Object[] param) {
        int result = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setObject(i + 1, param[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            closeAll(pstmt, null);
        }
        return result;
    }


    /**
     * 增删改操作
     *            SQL命令
     *            参数
     * @return
     */
    public int executinsert(Flight flight,String table) {
        Object[] param = new Object[]{
                flight.getCreateTime(),
                flight.getDepart(),
                flight.getArrive(),
                flight.getFlightDate(),
                flight.getFlightInfo(),
        };
        int result = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement("INSERT INTO `"+table+"` (`createTime`, `depart`, `arrive`,  `flightDate`, `flightInfo`) " +
                    " VALUES (?, ?, ?, ?, ?);");
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setObject(i + 1, param[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            closeAll(pstmt, null);
        }
        return result;
    }
    /**
     * 查询
     *
     * @return int
     */
    public List<Map<String,Object>> executQuery(String sql, String[] param) {
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setString(i + 1, param[i]);
                }
            }
            result = pstmt.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();
            while(result.next()){
                Map<String,Object> map = new HashMap<String,Object>();
                for(int i=1;i<=rsmd.getColumnCount();i++){
                    String column_name  = rsmd.getColumnName(i);
                    Object column_value = result.getObject(column_name);
                    if(column_value == null){
                        column_value = "";
                    }
                    map.put(column_name, column_value);
                }
                list.add(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}