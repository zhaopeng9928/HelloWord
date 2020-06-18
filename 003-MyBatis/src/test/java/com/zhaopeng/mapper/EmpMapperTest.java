package com.zhaopeng.mapper;

import com.zhaopeng.domain.Emp;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/6/11
 */
public class EmpMapperTest extends TestCase {

    /**
     * @Before – 表示在任意使用@Test注解标注的public void方法执行之前执行
     * @After – 表示在任意使用@Test注解标注的public void方法执行之后执行
     * @Test – 使用该注解标注的public void方法会表示为一个测试方法
     */

    public EmpMapper empMapper;
    public SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生产 SqlSession 对象
        this.sqlSession = factory.openSession();
        // 4.使用 SqlSession 创建 dao 的动态代理对象
        this.empMapper = this.sqlSession.getMapper(EmpMapper.class);
    }

    @Test
    public void testFindAll() {
        List<Emp> empList = this.empMapper.findAll();
        for (Emp e:empList) {
            System.out.println(e);
        }
    }

    @Test
    public void testFindById() {
        System.out.println(this.empMapper.findById(66666));
    }

    @Test
    public void testInsertIntoEmp() {
        Emp emp = new Emp();
        emp.setEmpno("0001");
        emp.setMgr("582");
        emp.setSal("998");
        emp.setSal("555");
        emp.setJob("厂长");
        emp.setHiredate("1111-11-11");
        this.empMapper.insertIntoEmp(emp);
        this.sqlSession.commit();
    }

    @Test
    public void testselectEmpByLike() {
        List<Emp> empList = this.empMapper.selectEmpByLike();
        for (Emp e:empList) {
            System.out.println(e);
        }
    }

    public void testUpdateEmp() {
        Emp emp = new Emp();
        emp.setEmpno("0001");
        emp.setEname("沙悟净");
        this.empMapper.updateEmp(emp);
        this.sqlSession.commit();
    }
}