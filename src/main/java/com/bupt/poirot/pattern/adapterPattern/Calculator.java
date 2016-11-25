package com.bupt.poirot.pattern.adapterPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
class Calculator {
    Rect rectangle;

    public double getArea(Rect r) {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}

