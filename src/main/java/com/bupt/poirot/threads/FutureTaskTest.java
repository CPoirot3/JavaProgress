package com.bupt.poirot.threads;

import java.util.concurrent.FutureTask;

/**
 * Created by hui.chen on 2/28/17.
 */
public class FutureTaskTest {
    public static void main(String[] args) {
        ThreadLocal<Long> threadLocal = new ThreadLocal<>();
        threadLocal.set(100L);
        System.out.println(threadLocal.get());


    }
}
