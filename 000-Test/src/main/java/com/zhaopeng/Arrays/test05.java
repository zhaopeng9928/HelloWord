package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/26
 */
public class test05 {
    /**
     * 数组扩容
     *      m1.调用Arrays工具类copyOf(源数组, 新数组的长度)
     *      m2.定义一个更大的数组,将原来的数组复制到新的数组，System.arrayCopy()
     *      m3.手动扩容，将原来数组的内容指向新的数组
     */

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    private static void m1(){
        //定义长度为5的数组
        int data1 [] = new int[]{1,2,3,4,5};
        //Arrays工具类copyOf(源数组, 新数组的长度) 可以实现数组的扩容
        data1 = Arrays.copyOf(data1,data1.length*3/2);
        System.out.println(Arrays.toString(data1));
    }

    private static void m2(){
        //1.定义长度为5的数组
        int data2 [] = new int[]{1,2,3,4,5};
        //2.定义一个更大的数组
        int newData [] = new int[data2.length*3/2];
        /**
         * 3.将原来数组的内容复制到新的数组：
         *      System.arraycopy(src, srcPos, dest, destPos, length);
         *      把src数组从srcPos开始的length个元素复制到dest数组的destPos开始的位置
         */
        System.arraycopy(data2,0,newData,0,data2.length);
        //4.让原来的数组名指向新的数组
        data2 = newData;
        System.out.println(Arrays.toString(data2));
    }

    private static void m3(){
        //1.定义长度为5的数组
        int data3 [] = new int[]{1,2,3,4,5};
        //2.定义一个更大的数组
        int newData [] = new int[data3.length*3/2];
        /**
         * 3.将原来数组的内容复制到新的数组
         */
        for (int i = 0; i <data3.length; i++) {
            newData[i] = data3[i];
        }
        //4.让原来的数组名指向新的数组
        data3 = newData;
        System.out.println(Arrays.toString(data3));
    }
}
