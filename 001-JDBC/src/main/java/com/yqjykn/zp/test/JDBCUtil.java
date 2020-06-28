///*
//package com.yqjykn.zp.test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.util.Properties;
//
//*/
///**
// * @Author zhaopeng
// * @Date 2020/2/8
// * JDBC封装
// *//*
//
//public class JDBCUtil {
//
//    private static String user;
//    private static String password;
//    private static String url;
//    private static String className;
//
//    static {
//
//        */
///**
//         * 注意:下面的方法只适合读取src下的文件
//         * 获取流对象: InputStream
//         * Class clas = JDBCUtil.class;//获取JDBCUtil类对应的Class对象
//         * ClassLoader loader = clas.getClassLoader();//通过Class对象获取字节码加载器对象
//         * InputStream in = loader.getResourceAsStream("db.properties");//调用ClassLoader的方法获取流对象
//         *//*
//
//        InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
//        */
///**
//         * 为了方便的读取db.properties这种特殊格式的文件,创建一个java.util.Properties类的对象
//         *//*
//
//        Properties pro = new Properties();
//        try {
//            pro.load(inputStream);
//            user = pro.getProperty("user");
//            password = pro.getProperty("password");
//            url = pro.getProperty("url");
//            className = pro.getProperty("className");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (inputStream != null){
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    */
///**
//     * 注册数据库驱动
//     *//*
//
//    public  static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName(className);
//        return  DriverManager.getConnection(url,user,password);
//    }
//
//    */
///**
//     * 关闭数据库相关对象
//     * @param connection
//     * @param statement
//     * @param resultSet
//     *//*
//
//    public static void  closeDB(Connection connection, Statement statement, ResultSet resultSet){
//        try {
//            if (resultSet != null){
//                resultSet.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            if (statement != null){
//                statement.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            if (connection != null){
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//*/
