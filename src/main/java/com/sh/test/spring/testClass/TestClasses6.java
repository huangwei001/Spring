package com.sh.test.spring.testClass;

import com.sh.test.spring.service.HelloService;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/7/31.
 */
public class TestClasses6 extends TestCase{

    public void testHelloServiceImpl6(){

        BeanFactory factory = new ClassPathXmlApplicationContext("spring6.xml");

        HelloService helloService1 = factory.getBean("bean1", HelloService.class);

        HelloService helloService2 = factory.getBean("bean2", HelloService.class);

        HelloService helloService3 = factory.getBean("bean3", HelloService.class);

        helloService1.sayHello();

        helloService2.sayHello();

        helloService3.sayHello();


    }


}
