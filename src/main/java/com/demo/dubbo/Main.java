package com.demo.dubbo;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.dubbo.service.DemoService;

/**
 * Created by liuchao15 on 2018/10/14
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo/provider.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println("===========================================");
        System.out.println(demoService.sayHello(" from provider"));
        System.out.println("provider is running, press any key to exit!");
        System.in.read();
        System.out.println("provider exits");

    }
}
