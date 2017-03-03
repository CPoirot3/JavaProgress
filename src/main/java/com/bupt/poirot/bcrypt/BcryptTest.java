package com.bupt.poirot.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by hui.chen on 2/27/17.
 */
public class BcryptTest {
    public static void main(String[] args) {
        String password = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
        String candidate = "123456789012345678901234567890123456789012345678901234567890123456789012";

        // Hash a password for the first time
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

        // gensalt's log_rounds parameter determines the complexity
        // the work factor is 2**log_rounds, and the default is 10
//        hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));

        // Check that an unencrypted password matches one that has
        // previously been hashed
        if (BCrypt.checkpw(candidate, hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");


    }
}
