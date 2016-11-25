package com.bupt.poirot.pattern.mementoPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Caretaker {
    private Memento _memento;
    public void saveMemento(Memento m)
    {
        _memento = m;
    }
    public Memento retrieveMemento() {
        return _memento;
    }
}
