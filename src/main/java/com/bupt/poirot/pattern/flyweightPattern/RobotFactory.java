package com.bupt.poirot.pattern.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hui.chen on 11/25/16.
 */
public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotCategory) throws Exception {
        IRobot robot;
        if (shapes.containsKey(robotCategory)) {
            robot = shapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have small robot. So we are creating a small robot now");
                    robot = new SmallRobot();
                    shapes.put("small", robot);
                    break;
                case "large":
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot now .");
                    robot = new LargeRobot();
                    shapes.put("large", robot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only small and large shapes");
            }
        }
        return robot;
    }
}
