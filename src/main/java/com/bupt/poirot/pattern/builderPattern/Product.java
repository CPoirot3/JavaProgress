package com.bupt.poirot.pattern.builderPattern;

import java.util.LinkedList;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Product {

    // We can use any data structure that you prefer. We have used LinkedList here.
     private LinkedList<String> parts;
    public Product() {
        parts = new LinkedList<>();
    }

    public void adds(String part) {
        //Adding parts
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n Product completed as below :");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
