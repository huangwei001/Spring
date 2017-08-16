package com.sh.test.spring.entity;

import javax.print.attribute.standard.MediaSize;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by huangwei on 2017/8/16.
 */
public class NavigationB {

    private NavigationC navigationC;

    private List<NavigationC> lstNavigate;

    private Properties properties;

    private Map<String, NavigationC> map;

    private NavigationC[] array = new NavigationC[1];

    public NavigationC getNavigationC() {
        return navigationC;
    }

    public void setNavigationC(NavigationC navigationC) {
        this.navigationC = navigationC;
    }

    public List<NavigationC> getLstNavigate() {
        return lstNavigate;
    }

    public void setLstNavigate(List<NavigationC> lstNavigate) {
        this.lstNavigate = lstNavigate;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, NavigationC> getMap() {
        return map;
    }

    public void setMap(Map<String, NavigationC> map) {
        this.map = map;
    }

    public NavigationC[] getArray() {
        return array;
    }

    public void setArray(NavigationC[] array) {
        this.array = array;
    }
}
