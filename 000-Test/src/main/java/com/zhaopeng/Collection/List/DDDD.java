package com.zhaopeng.Collection.List;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/6/2
 */
public class DDDD {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("111");
        s.add("222");
        s.add("333");
        s.add("{'1':'孙悟空','0':'猪八戒'}");
        System.out.println(s.get(0));
        System.out.println(s.get(1));
        System.out.println(s.get(2));
        System.out.println(s.get(3));
        JSONObject object = JSONObject.parseObject(s.get(3));
        System.out.println(object.getString("1"));
    }
}
