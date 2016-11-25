package com.bupt.poirot.pattern.mementoPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
