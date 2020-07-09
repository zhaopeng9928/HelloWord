package com.zhaopeng.Result;

import java.util.HashMap;

/**
 * @Author zhaopeng
 * @Date 2020/7/7
 */
public class eee {

    /*public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("1.关机 2.重启 3.检查网络是否通畅 4.断开WIFI 5.记事本");
            Scanner sccan = new Scanner(System.in);
            int num = sccan.nextInt();
            if (num == 5){
                Runtime.getRuntime().exec("notepad");
            }else if(num == 3){
                Runtime.getRuntime().exec("ping 192.168.196.1 -n 10 -w 4");
            }
        }
    }*/

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("aa", "aa");
        map.put("bbb", "bbb");
        map.put("cc", "cc");
        map.put("dd", "dd");
        map.forEach((key, value) -> {
            System.out.println(key + "：" + value);
        });
    }
}
