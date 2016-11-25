package com.bupt.poirot.pattern.strategyPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

public class Context {
    IChoice myC;

    // Set a Strategy or algorithm in the Context
    public void SetChoice(IChoice ic) {
        myC = ic;
    }

    public void ShowChoice(String s1, String s2) {
        myC.myChoice(s1, s2);
    }
}
