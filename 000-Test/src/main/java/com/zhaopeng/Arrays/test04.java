package com.zhaopeng.Arrays;

/**
 * @Author zhaopeng
 * @Date 2020/5/26
 */
public class test04 {
    /**
     * 可变长参数
     * 	1) 可变长参数用来接收任意个数据
     * 	2) 定义可变长参数
     * 		方法名( 参数类型   参数名,  参数类型  ... 可变长参数名)
     * 		说明:
     * 			1) 可变长参数最多只能有一个
     * 			2) 方法参数列表如果有多个参数, 可变长参数只能放在参数列表的最后
     * 			3) 在方法体中, 可以把可变长参数当作数组使用
     * 			4) 在调用方法时,可以传递任意个数, 也可以传递一个数组
     */

    public static void main(String[] args) {
        sum();//sum==0
        sum(1);//sum==1
        sum(1,2,3,4,5);//sum==15
        int [] data = {6,6,6,};//sum==24
        sum(data);
    }

    //定义方法, 打印任意个整数的和
    public static void sum(int ... num  ) {
        int result =  0;
        // 可以把可变长参数当作数组使用
        for( int i = 0 ;  i<num.length; i++){
            result += num[i];
        }
        System.out.println("sum==" + result);
    }
}

