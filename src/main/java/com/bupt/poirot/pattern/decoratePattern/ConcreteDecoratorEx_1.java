package com.bupt.poirot.pattern.decoratePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        //Add additional thing if necessary
         System.out.println("I am explicitly from Ex_1");
    }
}
