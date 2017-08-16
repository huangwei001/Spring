package com.sh.test.spring.testClass;

import com.sh.test.spring.entity.DependentBean;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.io.IOException;

/**
 * Created by huangwei on 2017/8/16.
 */
public class MoreDependencyInjectTest extends TestCase{

    @Test
    public void testDependOn() throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/depends-on.xml");

//        context.registerShutdownHook();

        DependentBean dependentBean = context.getBean("dependentBean", DependentBean.class);

        dependentBean.write("aa");
    }

}
