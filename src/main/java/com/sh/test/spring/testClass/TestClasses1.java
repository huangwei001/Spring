package com.sh.test.spring.testClass;

import com.sh.test.spring.service.HelloService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/7/24.
 */
public class TestClasses1 extends TestCase{

    @Test
    public void TestHello(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

        HelloService service = context.getBean("hello", HelloService.class);

        service.sayHello();


    }

}
