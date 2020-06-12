package com.zhaopeng.mapper;

import com.zhaopeng.domain.Dept;

import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/6/11
 */
public interface DeptMapper {

    /**
     * 查询所有的操作
     * @return
     */
    public List<Dept> findAll();

    /**
     * 根据ID查询单条
     * @param deptno
     * @return
     */
    public Dept findById(int deptno);

    /**
     * 新增数据
     * @param dept
     */
    public void insertIntoEmp(Dept dept);

    /**
     * 更新数据
     * @param dept
     */
    public void updateEmp(Dept dept);
}
