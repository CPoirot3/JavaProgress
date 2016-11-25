package com.bupt.poirot.pattern.facadePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class RobotMetal {
    private String metal;
    public void SetMetal(String metal) {
        this.metal=metal;
        System.out.println("Metal is set to : "+this.metal);

    }
}
