package com.sh.test.spring.entity;

/**
 * Created by huangwei on 2017/8/16.
 */
public class CircleC {

    private CircleA circleA;

    public CircleC(){

    }

    public CircleC(CircleA circleA){
        this.circleA = circleA;
    }

    public CircleA getCircleA() {
        return circleA;
    }

    public void setCircleA(CircleA circleA) {
        this.circleA = circleA;
    }
}
