package com.sh.test.spring.testClass;

import com.sh.test.spring.service.HelloService;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/7/31.
 */
public class TestClasses3 extends TestCase{

    public void testHelloFactory(){

        BeanFactory factory = new ClassPathXmlApplicationContext("spring3.xml");

        HelloService helloService = factory.getBean("HelloFactory", HelloService.class);

        helloService.sayHello();

    }


}
