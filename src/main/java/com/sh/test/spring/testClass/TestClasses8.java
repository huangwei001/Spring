package com.sh.test.spring.testClass;

import com.sh.test.spring.service.HelloService;
import com.sh.test.spring.serviceImpl.HelloService8;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/8/1.
 */
public class TestClasses8 extends TestCase{

    public void testHelloService8(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring8.xml");

        HelloService service = factory.getBean("bean1", HelloService.class);

        HelloService8 service8 = factory.getBean("bean1", HelloService8.class);
        service8.setIndex(2);
        service8.setMessage("测试初始化注入2");
        service.sayHello();
        service8.sayHello();

    }



}
