package com.sh.test.spring.serviceImpl;

import com.sh.test.spring.service.HelloService;

import java.sql.SQLOutput;

/**
 * Created by huangwei on 2017/8/1.
 */
public class HelloService8 implements HelloService{

    private String message;

    private int index;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
