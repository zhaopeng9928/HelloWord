package com.zhaopeng.service.impl;

import com.zhaopeng.service.SomeService;

/**
 * @Author zhaopeng
 * @Date 2020/5/15
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }
}
