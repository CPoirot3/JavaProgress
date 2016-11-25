package com.bupt.poirot.pattern.mementoPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Originator {
    private String state;
    Memento memento;

    public void setState(String state) {
        this.state = state;

        System.out.println("State at present : " + state);
    }

    // Creates memento
    public Memento originatorMemento() {
        memento = new Memento(state);
        return memento;
    }
    // Back to old state
    public void revert(Memento memento) {
        System.out.println("Restoring to previous state...");
        state = memento.getState();
        System.out.println("State at present :" +state);
    }
}
