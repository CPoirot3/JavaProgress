package com.bupt.poirot.pattern.flyweightPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class FlyweightPatternEx {
    public static void main(String[] args) throws Exception {
        RobotFactory myfactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");
        IRobot shape = myfactory.getRobotFromFactory("small");
        shape.print();
        /* Here we are trying to get the objects additional 2 times. Note that from now
            onward we do not need to create additional small robots as we have already created this category*/
        for (int i = 0; i < 2; i++) {
            shape = myfactory.getRobotFromFactory("small");
            shape.print();
        }
        int NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= " + NumOfDistinctRobots);

        /* Here we are trying to get the objects 5 times. Note that the second time onward we do not need
            to create additional large robots as we have already created this category in the first attempt(at i=0)*/
        for (int i = 0; i < 5; i++) {
            shape = myfactory.getRobotFromFactory("large");
            shape.print();
        }
        NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);
    }
}
