package com.zhaopeng.Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author zhaopeng
 * @Date 2020/5/28
 */
public class test01 {
    /**
     * 创建treeSet集合，存储String类型的数据，指定comparator比较器，按照字符串降序
     */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        treeSet.add("aa");
        treeSet.add("kk");
        treeSet.add("mm");
        treeSet.add("yy");
        treeSet.add("zz");
        System.out.println(treeSet);
    }
}
