package com.bupt.poirot.pattern.facadePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;

    public RobotFacade() {
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        rc.SetColor(color);
        rm.SetMetal(metal);
        rb.CreateBody();
        System.out.println(" \nRobot Creation End");
        System.out.println();
    }
}
