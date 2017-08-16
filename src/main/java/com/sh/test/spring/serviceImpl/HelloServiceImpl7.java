package com.sh.test.spring.serviceImpl;

import com.sh.test.spring.service.HelloService;

/**
 * Created by huangwei on 2017/7/31.
 */
public class HelloServiceImpl7 {

    public HelloService getHelloService(String message, int index){

        return new HelloServiceImpl5(message, index);

    }
}
