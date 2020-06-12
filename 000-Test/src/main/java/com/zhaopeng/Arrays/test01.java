package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/26
 */
public class test01 {
    public static void main(String[] args) {
        /**
         * int data [] = new int[5];
         *      1)data是一个数组名, 其实就是一个变量名, 数组是Java的一种引用数据类型, data数组名中存储的是数组的引用(起始地址)
         *      2)int是指数组中存储元素的数据类型,  int[]是一种数组类型, 即data变量的数据类型是 int[]
         *      3)new运算符在堆区分配一块连续的存储空间, 这块连续的存储空间可以容纳5个int类型的数据, 把这块存储空间的引用保存到data数组名中
         */
        int data [] = new int[5];

        /**
         * 给数组元素赋值, 通过索引值访问每个元素
         * 数组中为每个数组元素指定一个索引值, 这个索引值是从0开始的, 通过数组的索引值访问每个元素.
         */
        data[0] = 123;
        data[1] = 123;
        data[2] = 123;
        data[3] = 123;
        data[4] = 123;
        /**
         * 在输出数组的每个元素时,可以调用Arrays工具类的toString()方法, 可以把数组的元素转换为字符串
         */
        System.out.println( Arrays.toString(data));

        /**
         * 打印data数组每个元素的值  for
         */
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }

        /**
         * 打印data数组每个元素的值  foreach
         */
        for (int xx:data) {
            System.out.println("fore"+xx);
        }

    }
}
