package com.bupt.poirot.rxJava;

import rx.Observable;

/**
 * Created by hui.chen on 2016/12/28.
 */
public class Test {
    public static void main(String[] args) {
        Observable.create(s -> {
            s.onNext("Hello World!");
            s.onCompleted();
        }).subscribe(hello -> System.out.println(hello));
    }
}
