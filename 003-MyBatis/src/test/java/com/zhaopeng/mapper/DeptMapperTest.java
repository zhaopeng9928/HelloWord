package com.zhaopeng.mapper;

import com.zhaopeng.domain.Dept;
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
public class DeptMapperTest extends TestCase {

    public DeptMapper deptMapper;
    public SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        this.deptMapper = sqlSession.getMapper(DeptMapper.class);
    }

    @Test
    public void testFindAll() {
        List<Dept> deptList = this.deptMapper.findAll();
        for (Dept d:deptList) {
            System.out.println(d);
        }
    }

    public void testFindById() {
    }

    public void testInsertIntoEmp() {
    }

    public void testUpdateEmp() {
    }
}