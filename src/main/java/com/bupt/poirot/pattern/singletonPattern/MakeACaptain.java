package com.bupt.poirot.pattern.singletonPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class MakeACaptain {
    private MakeACaptain() { } // can't use new directly

    // Bill Pugh's Solution
    private static class SingletonHelper {
        // Nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain getSingleton() {
        return SingletonHelper._captain;
    }
}
