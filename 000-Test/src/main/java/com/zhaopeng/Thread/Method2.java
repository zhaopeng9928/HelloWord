package com.zhaopeng.Thread;

/**
 * @Author zhaopeng
 * @Date 2020/5/21
 */
public class Method2 {
    /**
     * 创建线程的方式二
     *      实现Runnable接口
     */
    public static void main(String[] args) {
        //3) 创建线程对象, 调用构造方法 Thread(Runnable) , 在调用时, 传递Runnable接口的实现类对象
        Test02 t2 = new Test02();//创建Runnable接口的实现类对象
        Thread thread = new Thread(t2);
        //4) 开启线程
        thread.start();
        //通过Runnable接口匿名内部类的形式创建线程
        Thread t22 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 1; i <= 100; i++){
                    System.out.println("t22==> " + i);
                }
            }
        });
        t22.start();
        // 当前线程是main线程
        for (int i = 1; i <= 100; i++) {
            System.out.println("main : " + i);
        }
    }
}
//1) 定义一个类实现Runnable接口
class Test02 implements Runnable {
    //2)重写run()方法, run()方法中的代码就是子线程要执行的代码
    @Override
    public void run() {
        //在子线程中打印100行字符串
        for (int i = 1; i <= 100; i++) {
            System.out.println("Test Thread -->" + i);
        }
    }
}

