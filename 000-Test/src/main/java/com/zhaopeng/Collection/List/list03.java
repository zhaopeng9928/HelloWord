package com.zhaopeng.Collection.List;

import java.util.LinkedList;

/**
 * @Author zhaopeng
 * @Date 2020/5/27
 */
public class list03 {
    public static void main(String[] args) {
        //1)创建LinkedList列表
        LinkedList<String> list = new LinkedList<String>();

        //2)添加元素
        list.add("jj");
        list.add("dd");
        list.add("gg");
        list.add("mm");
        System.out.println(list); 	//[jj, dd, gg, mm]

        //3)在头部添加/在尾部添加
        list.addFirst("XX");
        list.addLast("YY");
        System.out.println( list);  	//[XX, jj, dd, gg, mm, YY]

        //4)返回第一个元素, 返回最后一个元素, 注意,并没有删除
        System.out.println( list.getFirst());
        System.out.println( list.getLast() );

        //5)删除第一个元素,删除最后一个元素, 把元素删除后,会把删除的元素返回
        System.out.println( list.removeFirst());
        System.out.println( list.removeLast());
        System.out.println( list ); 		//[jj, dd, gg, mm]

        //6)经常使用push(o)/pop()模拟栈, 栈的特点是后进先出,即最后添加的最先删除
        list.push("HH"); 		//模拟入栈(压栈), 会把元素添加到列表的头部
        System.out.println( list );//[HH, jj, dd, gg, mm]
        System.out.println( list.pop() );  //pop()模拟出栈, 把列表的第一个元素删除并返回  HH
        System.out.println(list);//HH

        //7)经常使用offer(o)/poll()模拟队列, 队列特点是先进先出, 先来先服务
        list.offer("TT"); 	//offer()模拟入队, 把元素添加到列表的尾部
        System.out.println(list);//[jj, dd, gg, mm, TT]
        System.out.println( list.poll()); 	//poll()模拟出队, 把列表的第一个元素删除并返回  JJ
        System.out.println( list );
    }
}
