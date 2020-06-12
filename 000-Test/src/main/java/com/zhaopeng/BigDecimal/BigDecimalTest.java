package com.zhaopeng.BigDecimal;

import java.math.BigDecimal;

/**
 * @Author zhaopeng
 * @Date 2020/4/23
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        /**
         * BigDecimal的加减乘除
         */
        BigDecimal bigDecimal1 = BigDecimal.ZERO;

        BigDecimal bigDecimal = BigDecimal.valueOf(0.99);
        BigDecimal bigDecima2 = new BigDecimal(0.99);
        System.out.println(bigDecimal);
        System.out.println(bigDecima2);

        /**加法*/
        bigDecimal1.add(bigDecima2);
        System.out.println("bigDecimal + bigDecima2 = " + bigDecimal1.add(bigDecima2));

    }
}
