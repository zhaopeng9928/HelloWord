package com.zhaopeng;

import com.zhaopeng.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    @Test
    public void test01(){
        String config="zhaopeng/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        Student student = (Student) ctx.getBean("myStudent5");

        System.out.println("student="+student);
    }
}
