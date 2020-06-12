package com.zhaopeng.Sort;

import java.util.Scanner;

/**
 * @Author zhaopeng
 * @Date 2020/4/30
 */
public class Test01 {

    /**
     * 输入一个字符串，打印出所有的排列组合
     * 例如：
     *      ab:    ab,ba
     *      abb:   abb,bab,bba
     *      abc:   abc,acb,bac,bca,cab,cba
     */


    public static void permutation_fun(String inputStr) {
        if (inputStr == null) {
            return;
        }
        permutation_fun(inputStr.toCharArray(), 0);
    }

    private static void permutation_fun(char[] inputStr, int begin) {
        if (begin == inputStr.length) {
            System.out.println(inputStr);
        }

        for (int i = begin; i < inputStr.length; i++) {
            /*将第一个字符和后面的字符依次交换*/
            swop(inputStr, i, begin);
            /*对于第一个字符后面的字符，依次和后面的字符进行交换*/
            permutation_fun(inputStr, begin + 1);
            /*由于还要交换其他位到该位，因此要将字符串恢复到未交换的时候的样子*/
            swop(inputStr, i, begin);
        }
    }

    private static void swop(char[] inputStr, int i, int j) {
        char temp = inputStr[i];
        inputStr[i] = inputStr[j];
        inputStr[j] = temp;
    }

    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        permutation_fun(inputStr);
    }
}
