package com.bupt.poirot.pattern.proxyPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class ProxyPatternEx {
    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
