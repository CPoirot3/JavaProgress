package com.bupt.poirot.guice;

/**
 * Created by hui.chen on 2/26/17.
 */
public class RealBillingService implements BillingService {
    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        return null;
    }
}
