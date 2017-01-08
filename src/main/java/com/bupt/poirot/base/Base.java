package com.bupt.poirot.base;

@FunctionalInterface
public interface Base<T extends Object> {
    public boolean accept(T t);
}
