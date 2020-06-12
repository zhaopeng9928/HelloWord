package com.zhaopeng.Thread;

/**
 * @Author zhaopeng
 * @Date 2020/5/22
 */
public class test01 {

    /**
     * 演示线程的基本操作
     * 			currentThread()		    返回当前线程
     * 			getName()				返回线程名称, 线程默认名称 : Thread-0 / Thread-1
     * 			setName()			    设置线程名称
     * 			isAlive()				判断线程是否终止
     * 			activeCount()			活动线程的数量
     */

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" +i);
                }
            }
        });
        t1.setName("子线程1");//设置线程的名字：如果不设置 默认为 Thread-0/Thread-1...
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 1; i<=100; i++){
                    System.out.println( Thread.currentThread().getName() + "====>" + i);
                }
            }
        },"子线程2").start();
        System.out.println("线程活动的数量 : " +  Thread.activeCount() );//活动线程的数量
        //main线程
        for( int i = 1; i<=100; i++){
            System.out.println( Thread.currentThread().getName() + "------->" + i);
        }
        System.out.println( "线程是否终止: " + t1.isAlive());
    }
}
