package com.mota;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Info Task 5");
        logger.warn("Warn Task 5");
        logger.debug("Debug Task 5");
        logger.error("Error Task 5");
        logger.fatal("Fatal Eror");

    }
}
