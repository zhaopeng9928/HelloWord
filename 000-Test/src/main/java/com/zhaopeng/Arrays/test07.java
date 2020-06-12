package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class test07 {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         *      由小到大
         *      从前向后两两比较,如果前面的数大于后面的数就交换
         *      如果有n个数,需要比较n-1轮
         */

        int [] data = {56,23,89,5,99,32};
        System.out.println( Arrays.toString(data));
        System.out.println("------------------------------");

        for( int x = 0 ; x < data.length - 1; x++){
            //第x轮, 把第x大的交换到最后
            for(int i = 0 ; i < data.length-1 - x ; i++){
                if ( data[i] > data[i+1] ) {
                    int t = data[i];
                    data[i] = data[i+1];
                    data[i+1] = t;
                }
                System.out.println( Arrays.toString(data));
            }
            System.out.println("------------------------------");
        }
    }
}

