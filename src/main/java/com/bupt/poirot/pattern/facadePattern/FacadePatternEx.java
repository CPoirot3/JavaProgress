package com.bupt.poirot.pattern.facadePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class FacadePatternEx {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");
        RobotFacade rf1 = new RobotFacade();
        rf1.ConstructRobot("Green", "Iron");
        RobotFacade rf2 = new RobotFacade();
        rf2.ConstructRobot("Blue", "Steel");
    }
}


