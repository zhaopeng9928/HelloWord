package com.zhaopeng.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class set01 {
    /**
     * Set集合特点:
     *      无序,不可重复
     */
    public static void main(String[] args) {
        //1)创建set集合
        Set<String> set = new HashSet<String>();
        //2)添加元素
        set.add("666");
        set.add("孙悟空");
        set.add("hehehe");
        set.add("abc");
        //3)直接打印, 输出的顺序可能与添加的顺序不一致
        System.out.println(set);//[abc, 666, 孙悟空, hehehe]
        //4)添加重复的元素
        set.add("666");
        System.out.println(set);//[abc, 666, 孙悟空, hehehe]  --  Set集合中不能存储重复的元素
        //5)删除
        set.remove("abc");
        System.out.println(set);//[666, 孙悟空, hehehe]
        //6)迭代
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.print( string + "\t");
        }
        System.out.println();



    }
}
