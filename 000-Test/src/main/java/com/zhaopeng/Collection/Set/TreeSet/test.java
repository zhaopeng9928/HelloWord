package com.zhaopeng.Collection.Set.TreeSet;

import com.zhaopeng.Collection.List.Person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author zhaopeng
 * @Date 2020/5/28
 */
public class test {
    /**
     * TreeSet集合
     *  	1)TreeSet集合实现了SortedSet接口,可以对元素进行自然排序, 要求元素必须是可比较的
     *   	2)创建TreeSet集合时,通过构造方法指定Comparator比较器
     *   	3)如果没有指定Comparator比较器, 要求元素的类必须实现Comparable接口
     */
    public static void main(String[] args) {
        //1) 创建TreeSet集合,存储Person对象, 在构造方法中指定Comparator比较器,按姓名升序排序
        TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
            //在匿名内部类中重写接口的抽象方法
            @Override
            public int compare(Person o1, Person o2) {
                //指定一个比较规则
                return o1.name.compareTo(o2.name);   //姓名升序
            }
        });

        //2)添加元素
        treeSet.add(new Person("lisi", 18,172));
        treeSet.add(new Person("feifei", 28,120));
        treeSet.add(new Person("zhang", 33,153));
        treeSet.add(new Person("yong", 35,159));

        //3)直接打印
        System.out.println( treeSet );

        //4) 根据已有TreeSet创建新的TreeSet集合
        TreeSet<Person> treeSet22 = new TreeSet<Person>(treeSet);
        System.out.println( treeSet22 );

        //5) 使用TreeSet的无参构造, 没有指定Comparator比较器, 要求Person类实现Comparable接口
        TreeSet<Person> treeSet33 = new TreeSet<Person>();
        treeSet33.addAll(treeSet);
        System.out.println( treeSet33);

    }
}
