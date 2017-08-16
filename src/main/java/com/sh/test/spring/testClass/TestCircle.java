package com.sh.test.spring.testClass;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/8/16.
 */
public class TestCircle extends TestCase{

    @Test
    public void testCircle() throws Throwable{

        try {
            new ClassPathXmlApplicationContext("chapter3/circleInjectByConstructor.xml");
        }catch (Exception e){
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }





    }

}
