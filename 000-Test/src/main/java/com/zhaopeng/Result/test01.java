package com.zhaopeng.Result;

import org.junit.Test;

/**
 * @Author zhaopeng
 * @Date 2020/7/6
 */
public class test01 {

    @Test
    public void Test1(){
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator1(a,b);
        System.out.println("输出结果：\na = " + a + "\nb = " + b);
    }

    private static void operator1(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    @Test
    public void Test2(){
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator2(a,b);
        System.out.println("输出结果：\na = " + a + "\nb = " + b);
    }

    private static void operator2(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
    }
}

