//package com.yqjykn.zp.test;
//
//
//
//import java.sql.*;
//
///**
// * @Author zhaopeng
// * @Date 2020/2/8
// * 注册数据库驱动的不同方式
// */
//public class 注册数据库驱动 {
//    //方式一:
//    public static void test1(){
//        Connection connection = null;
//        try {
//            //1.注册驱动,目的是让JVM可以使用数据库的驱动
//            /**Driver是jdbc规则中声明的接口,com.mysql.jdbc.Driver()是mysql公司对Driver接口的实现类,也就是数据库驱动
//             * 调用DriverManager中的方法注册驱动
//             */
//            Driver driver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            //2.获取和数据库服务器的连接
//            String  user = "root";
//            String  password = "root";
//            String  url = "jdbc:mysql://localhost:3306/test";
//            //3.获取和数据库服务器的连接对象
//            connection = DriverManager.getConnection(url,user,password);
//            if(connection != null){
//                System.out.println("数据库驱动注册成功");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    //方式二:
//    public static void test2(){
//        Connection connection = null;
//        try {
//            //1.注册驱动,目的是让JVM可以使用数据库的驱动
//            /**创建com.mysql.jdbc.Driver()的时候jvm将这个类加载到内存中
//             * 实际上com.mysql.jdbc.Driver()就是数据库驱动
//             * 所以需要要再调用DriverManager中的方法注册驱动(这行代码可以省略)
//             */
//            Driver driver = new com.mysql.jdbc.Driver();
//            //2.获取和数据库服务器的连接
//            String  user = "root";
//            String  password = "root";
//            String  url = "jdbc:mysql://localhost:3306/test";
//            //3.获取和数据库服务器的连接对象
//            connection = DriverManager.getConnection(url,user,password);
//            if(connection != null){
//                System.out.println("数据库驱动注册成功");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    //方式二:反射
//    public static void test3(){
//        Connection connection = null;
//        try {
//            //1.注册驱动,目的是让JVM可以使用数据库的驱动
//            /**通过反射创建com.mysql.jdbc.Driver() 这时jvm将这个类加载到内存中
//             * 实际上com.mysql.jdbc.Driver()就是数据库驱动
//             */
//            String className = "com.mysql.jdbc.Driver";
//            try {
//                Class.forName(className);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            //2.获取和数据库服务器的连接
//            String  user = "root";
//            String  password = "root";
//            String  url = "jdbc:mysql://localhost:3306/test";
//            //3.获取和数据库服务器的连接对象
//            connection = DriverManager.getConnection(url,user,password);
//            if(connection != null){
//                System.out.println("数据库驱动注册成功");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        //test1();
//        //test2();
//        test3();
//    }
//}
