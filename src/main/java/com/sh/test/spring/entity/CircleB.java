package com.sh.test.spring.entity;

/**
 * Created by huangwei on 2017/8/16.
 */
public class CircleB {

    private CircleC circleC;

    public CircleB(){

    }

    public CircleB(CircleC circleC){
        this.circleC = circleC;
    }

    public CircleC getCircleC() {
        return circleC;
    }

    public void setCircleC(CircleC circleC) {
        this.circleC = circleC;
    }
}
