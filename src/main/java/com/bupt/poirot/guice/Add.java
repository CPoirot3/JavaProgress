package com.bupt.poirot.guice;

/**
 * Created by hui.chen on 2/26/17.
 */
public class Add implements MathMethod {
    @Override
    public Object doSome(Object a, Object b) {
        return (Integer) a + (Integer) b;
    }
}
