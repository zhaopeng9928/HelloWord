package com.zhaopeng.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author zhaopeng
 * @Date 2020/5/12
 */
public class list01 {
    /**
     * List集合的特点:
     *      存储的元素是有序/可重复的
     * List集合为每个元素指定了一个索引值, 主要增加了针对索引值的操作
     */
    public static void main(String[] args) {
        //1)创建List集合, List接口引用需要赋值实现类对象
        List<String> list = new ArrayList<String>();

        //2)添加元素
        list.add("gg");
        list.add("jj");
        list.add("dd");
        list.add("mm");
        list.add("jj");

        //3)直接打印, List存储元素的顺序就是添加的顺序, 可以存储重复的数据
        System.out.println( list );//[gg, jj, dd, mm, jj]

        //4) 判断
        System.out.println( list.size() );
        System.out.println( list.isEmpty());
        System.out.println( list.contains("jj"));

        //5) 删除
        list.remove("gg");//删除第一个匹配的元素
        System.out.println( list );//[jj, dd, mm, jj]

        //6) 遍历
        for (String string : list) {
            System.out.print( string + "\t");
        }
        System.out.println( );

        //7)迭代遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.print(string + "\t");
        }
        System.out.println( );

        //8)迭代删除
        iterator = list.iterator();//重新获得迭代器对象
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            if ("jj".equals(string)) {
                iterator.remove();
            }
        }

        //9)在指定索引值的位置添加
        list.add(0,"yyy");
        list.add(list.size(),"哇哈哈");
        System.out.println(list);

        //10)删除指定位置的元素
        list.remove(0);
        System.out.println( list );
        list.remove(list.size()-1);
        System.out.println( list );

        //11)返回指定位置的元素
        System.out.println( list.get(0));
        System.out.println( list.get(list.size()-1));

        //12)修改指定位置的元素
        list.set(0, "00000000");
        System.out.println( list );

        //13)返回指定范围的子列表, 注意subList并没有生成新的List列表 ,而是返回原有List列表的一个视图
        List<String> sublist = list.subList(0, 3);
        System.out.println( sublist );
        //修改sublist子列表
        sublist.add("DD");
        sublist.set(0, "jj");
        System.out.println( sublist );
        //对subList进行的修改实际上就是对list进行修改
        System.out.println( list );

        //14) 返回指定元素在列表中第一次出现的位置
        System.out.println( list.indexOf("jj"));
        System.out.println( list.lastIndexOf("jj"));

        //15) ListIterator迭代---ListIterator继承了Iterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String string = (String) listIterator.next();
            System.out.print( string + "\t");
        }
        System.out.println();
        //经过上个while循环后,listIterator游标指向最后,ListIterator还可以向前迭代
        while( listIterator.hasPrevious() ){
            String str = listIterator.previous();
            System.out.print( str + "\t");
        }
        System.out.println();
        //ListIterator不仅可以删除元素,还可以修改/添加元素
        while (listIterator.hasNext()) {
            String string = (String) listIterator.next();
            if (string.equals("mm")) {
                listIterator.remove();  	//删除
            }else if ( "jj".equals(string)) {
                listIterator.add("Dd");
            }else if ("dd".equals(string)) {
                listIterator.set("DD");
            }
        }













        System.out.println( list );
    }
}
