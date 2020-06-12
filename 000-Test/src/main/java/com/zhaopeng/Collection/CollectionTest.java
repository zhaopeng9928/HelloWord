package com.zhaopeng.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author zhaopeng
 * @Date 2020/5/12
 */
public class CollectionTest {

    /**
     * 集合分为两大类:
     * 		Collection集合: 存储数据时是单个存储的
     * 		Map集合: 存储数据时是按<键,值>对的形式一对一对存储的
     *
     * 	    Collection集合分为：
     * 	            List
     * 	            Set
     */

    /**Collection集合的基本操作*/
    @Test
    public void Test1(){
        //创建Collection集合，Collection是一个接口，需要赋值实现类对象
        Collection collection = new ArrayList<String>();//未指定泛型，插入的数据可以是字符串，基本数据类型。。。
        collection.add("孙悟空");
        collection.add("孙悟空");//可重复
        collection.add("沙悟净");
        collection.add(28);//添加基本类型，系统会自动装箱，把包装类对象添加到集合当中
        System.out.println(collection.isEmpty());//false
        System.out.println(collection.contains(28));//true
        System.out.println(collection.size());
        System.out.println(collection);
    }

    /**集合的迭代器*/
    @Test
    public void Test2(){
        Collection<String> collection = new ArrayList<String>();
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");
        collection.add("DD");
        collection.add("MM");
        collection.add("AA");
        for (String str: collection) {
            System.out.println(str);
        }

        //foreach循环仅用于遍历，不可以做便利删除，只能通过迭代器删除
	/*for (String string : collection) {
			if ("dd".equals(string)) {
				collection.remove("dd");
			}
		}*/

    }

    /**迭代器遍历*/
    @Test
    public void Test3(){
        Collection<String> collection = new ArrayList<String>();
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");
        collection.add("DD");
        collection.add("MM");
        collection.add("AA");
        Iterator<String> iterator = collection.iterator();
        /**
         * iterator.hasNext()用于判断是否还有下个元素没访问
         * iterator.next()返回下个元素, 游标下移
         * 刚刚获得迭代器时, 迭代器的游标指向第一个元素的前面
         * 循环完成后, iterator游标已经指向最后一个元素的后面, 如果还想要使用iterator迭代器,需要重写获得
         */
        while (iterator.hasNext()){
            String s =  iterator.next();
            System.out.println(s);
        }
    }
    /**迭代器删除*/
    @Test
    public void Test4(){
        Collection<String> collection = new ArrayList<String>();
        collection.add("AA");
        collection.add("BB");
        collection.add("CC");
        collection.add("DD");
        collection.add("MM");
        collection.add("AA");
        Iterator<String> iterator = collection.iterator();
        /**
         * 获得了迭代器后, 如果再通过集合的add()/remove()/clear()等方法修改了集合的结构, 再迭代时,可能会产生异常
         * 获得了迭代器后, 不能再通过集合的add()/remove()/clear()等方法修改集合的结构
         * 可以在通过集合的add()/remove()/clear()等方法修改集合的结构后, 重新获得迭代器对象
         */
        while (iterator.hasNext()){
            String s =  iterator.next();
            if("AA".equals(s)){
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}
