package com.demo.dubbo.service.impl;

import com.demo.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
