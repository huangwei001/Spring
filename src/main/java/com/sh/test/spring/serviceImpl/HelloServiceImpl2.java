package com.sh.test.spring.serviceImpl;

import com.sh.test.spring.service.HelloService;

/**
 * 验证
 */
public class HelloServiceImpl2 implements HelloService{

    private String message;

    public HelloServiceImpl2(){

    }

    public HelloServiceImpl2(String message){
        this.message = message;
    }

    public void sayHello() {
        System.err.println(message);
    }
}
