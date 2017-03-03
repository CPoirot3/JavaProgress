package com.bupt.poirot.guice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Created by hui.chen on 2/26/17.
 */
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MyModule());
        DoSomething doSomething = injector.getInstance(DoSomething.class);
        doSomething.calculate();
    }
}
