package com.bupt.poirot.pattern.abstractFactoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class BollywoodActionMovie implements IBollywoodMovie {
    @Override
    public String movieName() {
        return "Bang Bang is a Bollywood Action Movie";
    }
}
