package com.zhaopeng.Thread;

/**
 * @Author zhaopeng
 * @Date 2020/5/21
 */
public class Method1 {
    /**
     * 创建线程的方式一
     *      定义Thread类的子类
     */
    public static void main(String[] args) {
        //3)创建线程对象
        Test01 t1 = new Test01();
        //4)开启线程--开启的线程会执行run()方法
        t1.start();
        //当前线程是main线程
        for( int i = 1;  i<=100; i++){
            System.out.println( "main : " + i);
        }
        /*
         * 每次运行程序, 运行的结果可能不一样
         * 运行程序后, 当前程序就有两个线程main线程和t1线程在同时执行, 这两个线程中哪个线程抢到CPU执行权, 这个线程就执行
         *
         * 	在单核CPU中, 在某一时刻CPU只能执行一个任务, 因为CPU执行速度非常快, 可以在各个线程之间进行快速切换
         * 	对于用户来说, 感觉是多个线程在同时执行
         */
    }
}
//1)定义类继承Thread
class Test01 extends Thread{
    //2)重写run(), run()方法中的代码就是子线程要执行的代码
    @Override
    public void run(){
        for( int i = 1; i<=100 ; i++){
            System.out.println("Test Thread -->" + i);
        }
    }
}