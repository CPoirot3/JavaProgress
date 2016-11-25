package com.bupt.poirot.pattern.builderPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class MotorCycle implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.adds("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.adds("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.adds("1 Headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
