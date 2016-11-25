package com.bupt.poirot.pattern.statePattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On .Going to be Off now");
        context.setState(new Off());
    }
}
