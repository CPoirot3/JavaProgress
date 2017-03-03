package com.bupt.poirot.guice;

import com.google.inject.AbstractModule;

/**
 * Created by hui.chen on 2/26/17.
 */
public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MathMethod.class).to(Sub.class);
        bind(DoSomething.class).to(DoTheMath.class);
    }
}
