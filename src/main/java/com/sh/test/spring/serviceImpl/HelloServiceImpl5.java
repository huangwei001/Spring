package com.sh.test.spring.serviceImpl;

import com.sh.test.spring.service.HelloService;

/**
 * Created by huangwei on 2017/7/31.
 */
public class HelloServiceImpl5 implements HelloService{

    private String message;

    private int index;

    public HelloServiceImpl5(String message, int index){
        this.message = message;
        this.index = index;
    }


    public void sayHello() {

        System.out.println(index + ":" + message);
    }
}
