package com.bupt.poirot.pattern.adapterPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class AdapterPattern {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle t = new Triangle(20, 10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + cal.getArea(t));
    }
}
