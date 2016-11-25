package com.bupt.poirot.pattern.facadePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class RobotColor {
    private String color;

    public void SetColor(String color) {
        this.color = color;
        System.out.println("Color is set to : " + this.color);
    }
}

