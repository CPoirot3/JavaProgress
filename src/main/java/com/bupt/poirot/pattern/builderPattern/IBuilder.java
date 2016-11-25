package com.bupt.poirot.pattern.builderPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public interface IBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
