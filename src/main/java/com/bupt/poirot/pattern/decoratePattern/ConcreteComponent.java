package com.bupt.poirot.pattern.decoratePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println(" I am from Concrete Component - I am closed for modification.");
    }
}
