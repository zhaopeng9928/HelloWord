package com.zhaopeng;

import com.zhaopeng.mapper.EmpMapper;
import com.zhaopeng.domain.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/5/18
 */
public class MybatisTest {

    /**
     * 1.查询所有
     */
    @Test
    public void Test1() throws Exception{
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生产 SqlSession 对象
        SqlSession session = factory.openSession();
        // 4.使用 SqlSession 创建 dao 的代理对象
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        // 5.使用代理对象执行方法
        List<Emp> emps = empMapper.findAll();
        for(Emp emp: emps){
            System.out.println(emp);
        }
        // 6.关闭资源
        inputStream.close();
        session.close();
    }

    /**
     * 2.根据ID查询单条
     * @throws Exception
     */
    @Test
    public void Test2() throws Exception{
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生产 SqlSession 对象
        SqlSession session = factory.openSession();
        // 4.使用 SqlSession 创建 dao 的代理对象
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        // 5.使用代理对象执行方法
        Emp emps = empMapper.findById(9928);
        System.out.println(emps);
        // 6.关闭资源
        inputStream.close();
        session.close();
    }

    @Test
    public void Test3() throws Exception{
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生产 SqlSession 对象
        SqlSession session = factory.openSession();
        // 4.使用 SqlSession 创建 dao 的代理对象
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        // 5.使用代理对象执行方法
        Emp emp = new Emp();
        emp.setEname("哈哈哈");
        emp.setComm("9999");
        emp.setDeptno("88888");
        emp.setHiredate("1998-08-14");
        emp.setJob("eeee");
        emp.setSal("0.01");
        emp.setMgr("879");
        emp.setEmpno("66666");
        empMapper.insertIntoEmp(emp);
        session.commit();
        System.out.println(emp);
        // 6.关闭资源
        inputStream.close();
        session.close();
    }

    @Test
    public void Test4() throws Exception{
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生产 SqlSession 对象
        SqlSession session = factory.openSession();
        // 4.使用 SqlSession 创建 dao 的代理对象
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        // 5.使用代理对象执行方法
        Emp emp = new Emp();
        emp.setEname("猪八戒");
        emp.setEmpno("66666");
        empMapper.updateEmp(emp);
        session.commit();
        System.out.println(emp);
        // 6.关闭资源
        inputStream.close();
        session.close();
    }
}
