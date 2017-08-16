package com.sh.test.spring.entity;

/**
 * Created by huangwei on 2017/8/16.
 */
public class CircleA {

    private CircleB circleB;

    public CircleA(){

    }

    public CircleA(CircleB circleB){
        this.circleB = circleB;
    }

    public CircleB getCircleB() {
        return circleB;
    }

    public void setCircleB(CircleB circleB) {
        this.circleB = circleB;
    }
}
