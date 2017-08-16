package com.sh.test.spring.testClass;

import com.sh.test.spring.entity.NavigationA;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangwei on 2017/8/16.
 */
public class TestNavigationBeanInject extends TestCase{

    @Test
    public void testNavigationBeanInject(){
        BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/navigationBeanInject.xml");

        NavigationA navigationA = factory.getBean("a", NavigationA.class);

        navigationA.getNavigationB().getArray()[0].sayNavigation();

        navigationA.getNavigationB().getLstNavigate().get(0).sayNavigation();

//        navigationA.getNavigationB().getMap().get("key").sayNavigation();



    }



}
