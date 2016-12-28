package com.bupt.poirot.rxJava;

import rx.Observable;
import rx.Observer;
import rx.functions.Func2;

/**
 * Created by hui.chen on 2016/12/26.
 */
public final class ReactiveSum implements Observer<Double> { // (1)
    private double sum;

    public ReactiveSum(Observable<Double> a, Observable<Double> b) {
        this.sum = 0;
        Observable.combineLatest(a, b, new Func2<Double, Double,
                        Double>() { // (5)
            public Double call(Double a, Double b) {
                return a + b;
            }
        }).subscribe(this); // (6)
    }

    public void onCompleted() {
        System.out.println("Exiting last sum was : " + this.sum);
    }

    public void onError(Throwable e) {
        System.err.println("Got an error!"); // (3)
        e.printStackTrace();
    }

    public void onNext(Double sum) {
        this.sum = sum;
        System.out.println("update : a + b = " + sum); // (2)
    }
}
