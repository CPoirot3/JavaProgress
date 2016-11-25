package com.bupt.poirot.pattern.proxyPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class ConcreteSubject extends Subject{
    @Override
    public void doSomeWork() {
        System.out.println("I am form concrete subject");
    }
}
