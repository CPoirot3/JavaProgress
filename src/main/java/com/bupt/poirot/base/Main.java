package com.bupt.poirot.base;

import java.util.concurrent.Callable;

/**
 * Created by hui.chen on 2017/1/8.
 */
public class Main {

    public static String test() {
        System.out.println("Test");
        return "test";
    }

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> test();
        Callable callable = () -> test();

        runnable.run();
        System.out.println(callable.call());
    }
}
