package com.zhaopeng.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/26
 */
public class test02 {
    public static void main(String[] args) {
        /**
         *创建了数组后, 系统会给数组进行默认的初始化
         * 	整数数组,把所有元素默认初始化为0
         * 	小数数组,把所有元素默认初始化为0.0
         * 	字符数组,把所有元素默认初始化为码值为0的字符, '\u0000'
         * 	布尔数组,把所有元素默认初始化为false
         * 	引用数组,把所有元素默认初始化为null
         */

        int [] data = new int[8];
        //给int类型数组元素赋值
        data[2]	 = 666;
        //遍历数组的元素
        for(int i = 0 ;  i<data.length; i++){
            System.out.print(data[i] + "\t");//0	0	666	0	0	0	0	0
        }

        String [] data1 = new String[8];
        //给引用类型数组元素赋值
        data1[2] = "孙悟空";
        //遍历数组的元素
        for(int i = 0 ;  i<data1.length; i++){
            System.out.print(data1[i] + "\t");//null	null	孙悟空	null	null	null	null	null
        }

        float [] data2 = new float[8];
        //给小数类型数组元素赋值
        data2[2] = 2.59f;
        //遍历数组的元素
        for(int i = 0 ;  i<data2.length; i++){
            System.out.print(data2[i] + "\t");//0.0	0.0	2.59	0.0	0.0	0.0	0.0	0.0
        }

        char [] data3 = new char[8];
        //给字符类型数组元素赋值
        data3[2] = '男';
        //遍历数组的元素
        for(int i = 0 ;  i<data3.length; i++){
            System.out.print(data3[i] + "\t");//	 	 	男
        }

        boolean [] data4 = new boolean[8];
        //给布尔类型数组元素赋值
        data4[2] = true;
        //遍历数组的元素
        for(int i = 0 ;  i<data4.length; i++){
            System.out.print(data4[i] + "\t");//false	false	true	false	false	false	false	false
        }
    }
}
