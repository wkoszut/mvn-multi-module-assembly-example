package com.synapsis.mvn;

import org.apache.log4j.Logger;

/** Hello world! */
public class App {

    private final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        new App().logSomething();
    }

    public boolean logSomething() {
        logger.info("Start....");

        logger.info("End....");
        return true;
    }
}
