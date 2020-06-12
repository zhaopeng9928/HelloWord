package com.zhaopeng.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author zhaopeng
 * @Date 2020/5/22
 */
public class Method3 {
    /**
     * 创建线程的方式三
     *      实现Callable接口
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3)创建线程对象
        Test03 test03 = new Test03();//创建Callable接口的实现类对象
        /**
         * 创建FutureTask对象
         * FutureTask类实现了RunnableFuture接口, 该接口继承了Runnable接口、
         * FutureTask类就是Runnable接口的实现类
         */
        FutureTask<Integer> ft = new FutureTask<Integer>(test03);
        Thread t3 = new Thread(ft);
        //4)开启线程
        t3.start();
        // 当前线程是main线程
        for (int i = 1; i <= 100; i++) {
            System.out.println("main : " + i);
        }
        //在main线程中可以取得子线程的返回值
        System.out.println(" task result : " + ft.get() );
    }
}
//1)定义类实现Callable接口---------Callable接口的call()方法有返回值, 可以通过Callable接口泛型指定call()方法的返回值类型
class Test03 implements Callable<Integer> {
    //2)重写call()方法, call()方法中的代码就是子线程要执行的代码
    @Override
    public Integer call() throws Exception {
        //累加1~100之间的整数和
        int sum = 0 ;
        for(int i = 1; i<=100; i++){
            sum += i;
            System.out.println("sum=" + sum);
        }
        return sum;
    }
}