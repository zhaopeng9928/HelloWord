package com.zhaopeng.StringUtil;

import org.apache.commons.lang.StringUtils;
/**
 * @Author zhaopeng
 * @Date 2020/6/5
 */
public class test01 {
    public static void main(String[] args) {

        /**
         * isNotBlank() 判断字符串是不是不是空
         */
        String s = "";
        String s1 = "HH";

        System.out.println(StringUtils.isNotBlank(s));//false
        System.out.println(StringUtils.isBlank(s1));//false
    }
}
