package com.sh.test.spring.serviceImpl;

import com.sh.test.spring.service.HelloService;

/**
 * Created by huangwei on 2017/7/31.
 */
public class HelloFactory1 {

    public static HelloService getHelloService(String message){

        return new HelloServiceImpl2(message);

    }


}
