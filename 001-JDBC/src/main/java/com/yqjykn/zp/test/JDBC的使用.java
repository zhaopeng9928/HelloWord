//package com.yqjykn.zp.test;
//
//import java.sql.*;
//
///**
// * @Author zhaopeng
// * @Date 2020/2/8
// * jdbc的使用
// */
//public class JDBC的使用 {
//    public static void test1(){
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        try {
//            //1.注册驱动,目的是让JVM可以使用数据库的驱动
//            /**Driver是jdbc规则中声明的接口,com.mysql.jdbc.Driver()是mysql公司对Driver接口的实现类,也就是数据库驱动
//             * 调用DriverManager中的方法注册驱动
//             */
//            Driver driver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            //2.获取和数据库服务器的连接
//            /**
//             * Java程序实际上就是一个客户端,需要连接到数据库服务器中,所以需要获取和服务器的连接
//             * 指定数据库服务器的相关信息
//             * user:数据账户名称
//             * password:数据库密码
//             * url:统一资源定位器,确定数据库服务的相关信息
//             * jdbc:sun公司制定的一套网络协议
//             * jdbc:mysql 表示jdbc下面的子协议
//             */
//            String  user = "root";
//            String  password = "root";
//            String  url = "jdbc:mysql://localhost:3306/test";
//            //3.获取和数据库服务器的连接对象
//            connection = DriverManager.getConnection(url,user,password);
//            /**
//             * jdbc规范中把数据库的连接对象封装成了Connect对象,Connection是jdbc规范中声明的接口
//             *  DriverManager.getConnection()返回的是一个具体类的对象
//             *  这个具体类是哪个类?和我们没有有一毛钱的关系,但是这个具体类的对象肯定实现了Connection接口
//             */
//            //4.通过连接对象获取语句对象
//            /**
//             *jdbc规范中把SQL语句封装在Statement中,Statement就表示SQL语句
//             * Statement是jdbc中声明的接口,connection.createStatement()返回的是接口的实现类
//             * 这个具体类是哪个类?和我们没有有一毛钱的关系,但是这个具体类的驱动在jar文件中
//             */
//            statement = connection.createStatement();
//            //5.通过语句对象执行具体的语句
//            String SQL = "select * from student";
//            /**
//             * SQL语句中有不同的种类;Statemet表示SQL语句
//             * Statement上面有不同的方法执行不同的SQL语句
//             * 调用Statement的executeQuery方法执行DQL语句,返回一个结果集对象
//             */
//            resultSet =  statement.executeQuery(SQL);
//            //6.遍历结果集,获取结果集中的对象
//            while (resultSet.next()){
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString("name");
//                System.out.println(id + name);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            /**
//             * 数据库中的相关连接资源是有限的,用完之后必须要及时关闭
//             *      (1)关闭的时候必须要反向关闭
//             *      (2)关于异常处理?在处理多个异常的时候,可以合着处理,也就是用一个try{}捕获所有的异常;也可以分着处理,也就是分别使用try(){}catch()捕获并处理异常
//             * 何时应该合着处理?何时应该分着处理?
//             * 	    当多个操作之间有联系的使用,应该合着处理;当多个操作之间没有联系的时候,应该分着处理;
//             */
//            try {
//                if (resultSet != null){
//                    resultSet.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (statement != null){
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
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
//    public static void  test2() {
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            Driver driver= new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            String uesr = "root";
//            String password = "root";
//            String url = "jdbc:mysql://localhost:3306/test";
//            connection = DriverManager.getConnection(url,uesr,password);
//            statement = connection.createStatement();
//            String sql = "INSERT into  student VALUES (3,'李白',1.80,'唐朝')";
//            int i = statement.executeUpdate(sql);
//            System.out.println("i="+ i);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (statement != null){
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static void  test3() {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null ;
//        try {
//            Driver driver= new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            String uesr = "root";
//            String password = "root";
//            String url = "jdbc:mysql://localhost:3306/test";
//            connection = DriverManager.getConnection(url,uesr,password);
//            statement = connection.createStatement();
//            String SQL = "select * from student";
//            /**
//             * statement如果执行DQL语句,返回true
//             * 所以需要先获取结果集对象再遍历
//             */
//            System.out.println(statement.execute(SQL));
//            if (statement.execute(SQL)){
//                resultSet = statement.getResultSet();
//                while (resultSet.next()){
//                    int id = resultSet.getInt(1);
//                    String name = resultSet.getString("name");
//                    System.out.println(id + name);
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (statement != null){
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//    public static void  test4() {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null ;
//        try {
//            Driver driver= new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            String uesr = "root";
//            String password = "root";
//            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
//            connection = DriverManager.getConnection(url,uesr,password);
//            statement = connection.createStatement();
//            String sql = "INSERT into  student VALUES (3,'李白',1.80,'唐朝')";
//            /**
//             * statement如果执行DML语句,返回false
//             * 获取更新计数器
//             */
//            System.out.println(statement.execute(sql));
//            if (!statement.execute(sql)){
//                int i = statement.getUpdateCount();
//                System.out.println(i);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (statement != null){
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//   /* public static void  test5() {
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            connection = main.java.com.YQJYKN.ZP.test.JDBCUtil.getConnection();
//            statement = connection.createStatement();
//            String sql = "INSERT into  student VALUES (4,'libai',0.80,'wwwwwwwwwwwwww')";
//            int i = statement.executeUpdate(sql);
//            System.out.println("i="+ i);
//
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            main.java.com.YQJYKN.ZP.test.JDBCUtil.closeDB(connection,statement,null);
//        }
//    }
//
//    public static void  test6() {
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            connection = main.java.com.YQJYKN.ZP.test.JDBCUtil.getConnection();
//            statement = connection.createStatement();
//            String sql = "INSERT into  student VALUES (99,'老三',25)";
//            int i = statement.executeUpdate(sql);
//            System.out.println("i="+ i);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }finally {
//            main.java.com.YQJYKN.ZP.test.JDBCUtil.closeDB(connection,statement,null);
//        }
//    }*/
//
//    public static void main(String[] args) {
//        //test1();
//        //test2();
//        test3();
//        //test4();
//        //test5();
//        //test6();
//    }
//
//
//}
