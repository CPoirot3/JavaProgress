package com.bupt.poirot.pattern.iteratorPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public interface IIterator {
    void first(); // Reset to first element
    String next();
    Boolean isDone();
    String currentItem();
}
