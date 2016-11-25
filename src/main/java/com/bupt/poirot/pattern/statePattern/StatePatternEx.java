package com.bupt.poirot.pattern.statePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class StatePatternEx {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***\n");
        //Initially TV is Off
        Off initialState = new Off();
        TV tv = new TV(initialState);
        //First time press
        tv.pressButton();
        //Second time press
        tv.pressButton();
    }
}
