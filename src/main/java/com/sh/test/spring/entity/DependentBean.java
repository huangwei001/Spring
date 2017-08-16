package com.sh.test.spring.entity;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by huangwei on 2017/8/16.
 */
public class DependentBean {

    ResourceBean resourceBean;

    public void write(String ss) throws IOException {
        System.out.println("DependentBean:=====写资源");
        resourceBean.getFileOutputStream().write(ss.getBytes());
    }

    public void init() throws IOException {
        System.out.println("DependentBean:======初始化");
        resourceBean.getFileOutputStream().write("DependentBean:=====初始化=====".getBytes());
    }

    public void destroy() throws IOException {
        System.out.println("DependentBean:======销毁");
        resourceBean.getFileOutputStream().write("DependentBean:=====销毁=====".getBytes());
    }

    public void setResourceBean(ResourceBean resourceBean) {
        this.resourceBean = resourceBean;
    }
}

