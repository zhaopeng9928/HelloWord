package com.zhaopeng.Arrays;

import java.util.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class test06 {
    /**
     * 二维数组
     *      数组的每个元素是一个一维数组, 即一维数组的数组
     */
    public static void main(String[] args) {
        /**
         * data1/data2/data3是三个数组名, 其实就是一个变量名, 它的数据类型是 int[] 类型
         * []表示data1/data2/data3是数组, []前面的int表示数组元素的类型
         * 数据类型[]  数组名  = new 类型[长度]
         */
        int [] data1 = {1,2,3,4,5};
        int [] data2 = {6,7,8};
        int x = 10;
        int y = 20;
        int [] data3 = {x, y};

        //定义一个数组, 数组中存储data1, data2, data3这三个变量
        int[] [] mydata = {data1, data2, data3};
        //mydata是一个数组名, mydata前面的一个[]表示数组, []前面的int[]表示mydata数组中的元素类型
        System.out.println( mydata.length ); //3

        //遍历mydata数组中存储的整数
        for( int i = 0 ;  i<mydata.length; i++){
            //mydata[0]是 data1, mydata[i]是一个一维数组名
            //System.out.println( mydata[i] );
            for( int j = 0 ;  j < mydata[i].length ; j++){
                System.out.print( mydata[i][j] + "\t" );
            }
            System.out.println();
        }

        //foreach遍历
        for (int[] is : mydata) {
            for (int xx : is) {
                System.out.print( xx + "\t");
            }
            System.out.println();
        }

        //Arrays.deepToString()可以把多维数组中的元素转换为字符串
        System.out.println( Arrays.deepToString(mydata));
    }
}
