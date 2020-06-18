package com.zhaopeng.service.impl;

import com.zhaopeng.service.IUserService;

/**
 * @Author zhaopeng
 * @Date 2020/5/15
 */
public class IUserServiceImpl implements IUserService {

    public IUserServiceImpl(){
        System.out.println("执行无参构造器");
    }

    @Override
    public void doSome() {
        System.out.println("执行doSome方法");
    }

    @Override
    public void doOther() {
        System.out.println("执行doOther方法");
    }
}
