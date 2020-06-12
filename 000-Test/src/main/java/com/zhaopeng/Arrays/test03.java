package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/26
 */
public class test03 {
    public static void main(String[] args) {
        /**
         * 数组的初始化赋值
         *      不需要给定长度,数组的长度由初始化的元素决定
         *      简写为直接赋值，省略new
         */
        int data[] = new int[]{1,3,4};
        System.out.println(data.length);//3

        String data1[] = {"孙悟空","猪八戒"};
        System.out.println(data1.length);//2

        /**
         * 数组名之间的相互赋值
         */
        int data2[] = {1,3,9};
        data2 = data;
        System.out.println(Arrays.toString(data2));//[1, 3, 4]

        /**
         * 给数组重新赋值
         *      data指向了新的数组
         */
        data = new int[] {6,6,6}; //
        System.out.println(Arrays.toString(data));//[6, 6, 6]
    }
}
