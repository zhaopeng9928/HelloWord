package com.zhaopeng.Thread;

/**
 * @Author zhaopeng
 * @Date 2020/5/22
 */
public class test03 {

    /**
     * 线程优先级
     * 	1) 优先级的取值范围: 1 ~ 10
     * 	2) 所有线程默认的优先级; 5
     * 	3) 优先级越高, 获得CPU执行权的机率越大
     * 	4) t1.setPriority( 10 )  设置线程优先级
     */

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 1; i<=100; i++){
                    System.out.println( Thread.currentThread().getName() + "===子线程===>" + i);
                }
            }
        });
        t1.setPriority(1);
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 1; i<=100; i++){
                    System.out.println( Thread.currentThread().getName() + "===子线程===>" + i);
                }
            }
        });
        t2.setPriority(10);
        t2.start();
        //打印线程的优先级
        System.out.println( "t1 priority: " + t1.getPriority());
        System.out.println( "t2 priority: " + t2.getPriority());
        System.out.println( "main priority: " + Thread.currentThread().getPriority());

        //main线程
        for(int i = 1; i <= 100; i++){
            System.out.println( Thread.currentThread().getName() + "-->" + i);
        }

    }
}
