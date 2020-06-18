/*
package com.zhaopeng.test;

import com.zhaopeng.beans.Student;
import com.zhaopeng.service.IUserService;
import com.zhaopeng.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

*/
/**
 * @Author zhaopeng
 * @Date 2020/5/14
 *//*

public class MyTest {

    @Test
    public void Test1(){
        //1.指定spring配置文件的名称和位置
        String resource = "spring-config.xml";
        //2.创建spring容器对象方法一：使用ClassPathXmlApplicationContext ---> 配置文件要放到项目的类路径下(src目录下面)
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        //3.从spring容器获取对象，使用id
        SomeService service  = (SomeService) ac.getBean("someService");
        //4.执行业务方法
        service.doSome();
    }

    @Test
    public void Test2(){
        //1.指定spring配置文件的名称和位置
        String resource = "spring-config1.xml";
        //2.创建spring容器对象方法二：使用 FileSystemXmlApplicationContext ---> 配置文件要放到项目的根路径下(src同级目录)
        ApplicationContext ac = new FileSystemXmlApplicationContext(resource);
        //3.从spring容器获取对象，使用id
        SomeService service  = (SomeService) ac.getBean("someService");
        //4.执行业务方法
        service.doSome();
    }

    @Test
    public void Test3(){
        //1.指定spring配置文件的名称和位置
        String resource = "spring-config1.xml";
        //2.创建spring容器对象方法二：使用 FileSystemXmlApplicationContext ---> 配置文件要放到项目的根路径下(src同级目录)
        ApplicationContext ac = new FileSystemXmlApplicationContext(resource);
        //3.从spring容器获取对象，使用id
        IUserService service  = (IUserService) ac.getBean("IService");
        //4.执行业务方法
        service.doSome();
        service.doOther();
    }

    @Test
    public void Test4(){
        //1.指定spring配置文件的名称和位置
        String resource = "spring-config1.xml";
        //2.创建spring容器对象方法二：使用 FileSystemXmlApplicationContext ---> 配置文件要放到项目的根路径下(src同级目录)
        ApplicationContext ac = new FileSystemXmlApplicationContext(resource);
        //3.从spring容器获取对象，使用id
        SomeService someService1 = (SomeService) ac.getBean("someService1");
        SomeService someService2 = (SomeService) ac.getBean("someService1");
        SomeService someService3 = (SomeService) ac.getBean("someService2");
        SomeService someService4 = (SomeService) ac.getBean("someService2");
        //4.验证单态模式和原型模式的每次取值
        System.out.println("单态模式：" + (someService1 == someService2));//true
        System.out.println("原型模式：" + (someService3 == someService4));//false
    }

    @Test
    public void Test5(){
        //1.指定spring配置文件的名称和位置
        String resource = "spring-config.xml";
        //2.创建spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        //3.从spring容器获取对象，使用id
        Student student = (Student)ac.getBean("student");
        //4.执行业务方法
        System.out.println(student);
    }
}
*/
