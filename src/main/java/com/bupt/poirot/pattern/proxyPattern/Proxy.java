package com.bupt.poirot.pattern.proxyPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Proxy extends Subject {
    ConcreteSubject cs;
    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        // Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
