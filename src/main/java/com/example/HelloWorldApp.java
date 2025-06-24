package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

class HelloWorldHelper {
    private static final Logger LOGGER = Logger.getLogger(HelloWorldHelper.class.getName());

    public static void main(final String[] args) {
        greet("India");
    }

    public static void greet(final String name) {
        if ("India".equals(name)) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info("Hello, " + name + "!");
            }
        } else {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info("Hello, stranger!");
            }
        }
    }
}

