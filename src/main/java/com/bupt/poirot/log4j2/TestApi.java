package com.bupt.poirot.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestApi {
//    static {
//        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
//    }

    // This is the standard Log4J logger which is used as a reference.
    public static final Logger LOGGER = LogManager.getLogger();

    // This is the JUL Adapter implemented for this class.
//    public static final java.util.logging.Logger JULI =
//            org.apache.logging.log4j.jul.LogManager.getLogManager().getLogger(Main.class.getName());

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
