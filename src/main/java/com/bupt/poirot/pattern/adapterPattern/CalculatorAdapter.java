package com.bupt.poirot.pattern.adapterPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t) {
        calculator = new Calculator();
        triangle = t;
        Rect r = new Rect();
        //Area of Triangle=0.5*base*height
        r.l = triangle.b;
        r.w = 0.5 * triangle.h;
        return calculator.getArea(r);
    }
}