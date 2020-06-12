package com.zhaopeng.Thread;

/**
 * @Author zhaopeng
 * @Date 2020/5/22
 */
public class test02 {

    /**
     * 守护线程
     * 		为其他线程服务的, 不能单独运行 , 当JVM中只有守护线程时, JVM退出
     *
     * 	判断线程的状态
     * 	     NEW 新建状态,刚刚创建了线程对象
     * 	     RUNNABLE 可运行状态,就绪状态, 调用了start()
     * 	     TERMINATED 终止状态,线程已结束
     */
    public static void main(String[] args) {
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 1; i<=100; i++){
                    System.out.println( Thread.currentThread().getName() + "===子线程===>" + i);
                }
            }
        });
        t2.setDaemon(true);//设置线程为守护线程
        System.out.println("111: " + t2.getState());	 //111: NEW 新建状态,刚刚创建了线程对象
        t2.start();
        System.out.println("222: " + t2.getState());	//222: RUNNABLE 可运行状态,就绪状态, 调用了start()
        System.out.println("线程活动的数量 : "+t2.activeCount());//活动线程的数量
        //main线程
        for( int i = 1; i<=100; i++){
            System.out.println( Thread.currentThread().getName() + "---主线程--->" + i);
        }
        System.out.println( "线程是否终止: " + t2.isAlive());
        System.out.println("333: " + t2.getState()); 	//333: TERMINATED 终止状态,线程已结束
    }
}
