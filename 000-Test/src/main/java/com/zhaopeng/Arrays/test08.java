package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class test08 {
    public static void main(String[] args) {
        /**
         * 选择排序
         *  	由小到大：在所有元素中找到最小的交换到0位置，再在剩下的元素中找到最小的交换到1位置。。。
         */

        int [] data = {56,23,89,5,99,32};
        System.out.println( Arrays.toString(data));
        System.out.println("------------------------------");

        for(int x = 0 ; x < data.length-1 ; x++){
            //1) 选择最小的,交换到x位置
            int min = x ; 		//保存最小元素的下标,假设x元素最小
            //找当前最小元素的下标
            for( int i = x+1 ;  i< data.length; i++){
                if (data[i] < data[min]) {
                    min = i;
                }
            }
            //把当前最小元素交换到x位置
            if ( min != x ) {
                int t = data[x]	;
                data[x] = data[min];
                data[min] = t;
            }
            System.out.println( Arrays.toString(data));
        }
    }
}
