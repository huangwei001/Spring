package com.sh.test.spring.testClass;

import com.sh.test.spring.service.HelloService;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/7/31.
 */
public class TestClasses4 extends TestCase{

    public void testHelloFactory(){

        BeanFactory factory = new ClassPathXmlApplicationContext("spring4.xml");

        HelloService helloService = factory.getBean("bean4", HelloService.class);

        helloService.sayHello();

    }


}
