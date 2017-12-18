package com.bupt.poirot.rxJava;

import rx.Observable;
import java.util.concurrent.TimeUnit;


import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by hui.chen on 2016/12/28.
 */
public class Test {
    public static void main(String[] args) {
        Observable.create(s -> {
            s.onNext("Hello World!");
            s.onCompleted();
        }).subscribe(hello -> System.out.println(hello));

        log("Before");
        Observable.range(5, 3).subscribe(i -> {
            log(i);
        });
        log("After");

        Observable<Integer> ints = Observable.create(subscriber -> {
            log("Create");
            subscriber.onNext(42);
            subscriber.onCompleted();
        });

        log("Starting");
        ints.subscribe(i -> log("Element A: " + i));
        ints.subscribe(i -> log("Element B: " + i));
        log("Exit");


    }

    private static void log(Object msg) {
        System.out.println(Thread.currentThread().getName() + " : " + msg);
    }

    static <T> Observable<T> just(T x) {
        return Observable.create(subscriber -> {
            subscriber.onNext(x);
            subscriber.onCompleted();
        });
    }

    static <T> Observable<T> delayed(T x) {
        return Observable.create(
             subscriber -> {
                 Runnable r = () -> {
                    sleep(10, SECONDS);
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onNext(x);
                        subscriber.onCompleted();
                    }
                 };
                 new Thread(r).start();
             }
        );
    }

    static void sleep(int timeout, TimeUnit unit) {
        try {
            unit.sleep(timeout);
        } catch (InterruptedException ignored) {
            ignored.printStackTrace();
        }
    }

}
