package com.go2it.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger (Application.class);

    public static void main(String[] args) {

        LOGGER.debug ("Hello from debug.");
        LOGGER.info ("Hello from info.");
        LOGGER.error ("Hello from error.");
        System.out.println ("Hello" );
    }

}
