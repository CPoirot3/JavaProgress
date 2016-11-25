package com.bupt.poirot.pattern.factoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class FactoryPatternEx {

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.getAnimalType("Duck");
        DuckType.speak();
        IAnimal TigerType = animalFactory.getAnimalType("Tiger");
        TigerType.speak();
        //There is no Lion type. So, an exception will be thrown
        IAnimal LionType = animalFactory.getAnimalType("Lion");
        LionType.speak();
    }
}
