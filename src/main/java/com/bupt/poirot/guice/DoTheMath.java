package com.bupt.poirot.guice;

import com.google.inject.Inject;

/**
 * Created by hui.chen on 2/26/17.
 */
public class DoTheMath implements DoSomething{
    private final MathMethod mathMethod;

    @Inject
    public DoTheMath(MathMethod mathMethod) {
        this.mathMethod = mathMethod;
    }

    public void calculate() {
        System.out.println(mathMethod.doSome(10, 10));
    }
}
