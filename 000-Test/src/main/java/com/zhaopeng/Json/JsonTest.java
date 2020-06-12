package com.zhaopeng.Json;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @Author zhaopeng
 * @Date 2020/6/1
 */
public class JsonTest {
    public static void main(String[] args) {
        String s = "{'1':'孙悟空','0':'猪八戒'}";
        Map<String,String> map = (Map<String, String>) JSONObject.parse(s);
        System.out.println(map.get("1"));

        JSONObject object = (JSONObject) JSONObject.parse(s);
        System.out.println(object.getString("0"));
    }
}
