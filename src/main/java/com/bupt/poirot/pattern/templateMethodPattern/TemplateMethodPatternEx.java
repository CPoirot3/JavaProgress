package com.bupt.poirot.pattern.templateMethodPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class TemplateMethodPatternEx {
    public static void main(String[] args) {
        System.out.println("***Template Method Pattern Demo***\n");
        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Sc Papers:");
        bs.papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics Papers:");
        bs.papers();
    }
}
