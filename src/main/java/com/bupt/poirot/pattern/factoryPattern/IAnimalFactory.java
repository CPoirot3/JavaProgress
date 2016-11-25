package com.bupt.poirot.pattern.factoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public abstract class IAnimalFactory {
    public abstract IAnimal
    /*if we cannot instantiate in later stage, we'll throw exception*/
    getAnimalType(String type) throws Exception;
}
