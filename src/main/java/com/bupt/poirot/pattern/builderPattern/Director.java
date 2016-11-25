package com.bupt.poirot.pattern.builderPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Director {
    IBuilder myBuilder;

    // A series of steps—for the production
    public void construct(IBuilder builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
