package com.bupt.poirot.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hui.chen on 2/2/17.
 */
public class User {
    //省略其它
    public String name;
    public int age;
    @SerializedName(value = "emailAddress", alternate = {"email", "email_address"})
    public String emailAddress;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }
}
