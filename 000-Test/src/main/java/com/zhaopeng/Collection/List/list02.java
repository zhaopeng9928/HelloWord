package com.zhaopeng.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class list02 {

    /**
     * List集合存储自定义类型数据
     * 	注意List集合的remove(Object)/contains(Object)方法会调用对象的equals()方法, 如果是自定义需要重写equals()方法
     */
    public static void main(String[] args) {
        //创建List集合,存储Person对象
        List<Person> list = new ArrayList<Person>();

        //添加元素
        list.add(new Person("lisi", 18,172));
        list.add(new Person("feifei", 28,120));
        list.add(new Person("zhang", 33,153));
        list.add(new Person("yong", 35,159));

        System.out.println( list );

        Person feifei = new Person("feifei", 28,892);
        System.out.println( list.contains(feifei));

        list.remove(feifei);
        System.out.println( list );
    }
}
