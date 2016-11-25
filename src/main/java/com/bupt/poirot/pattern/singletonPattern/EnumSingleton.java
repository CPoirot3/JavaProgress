package com.bupt.poirot.pattern.singletonPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public enum EnumSingleton {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.INSTANCE.getName());
    }
}
