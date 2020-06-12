package com.zhaopeng.mapper;

import com.zhaopeng.domain.Emp;

import java.util.List;

/**
 * @Author zhaopeng
 * @Date 2020/5/18
 */
public interface EmpMapper {

    /**
     * 查询所有的操作
     * @return
     */
   public List<Emp> findAll();

    /**
     * 根据ID查询单条
     * @param empno
     * @return
     */
    public Emp findById(int empno);

    /**
     * 新增数据
     * @param emp
     */
    public void insertIntoEmp(Emp emp);

    /**
     * 更新数据
     * @param emp
     */
    public void updateEmp(Emp emp);
}
