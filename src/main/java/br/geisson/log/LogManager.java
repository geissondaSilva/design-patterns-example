package br.geisson.log;

import java.util.logging.Logger;

public class LogManager {

    private static final LogManager instance =  new LogManager();

    private final Logger logger = Logger.getLogger(LogManager.class.getName());

    public static LogManager getInstance() {
        return instance;
    }

    public void info(String message) {
        logger.info(message);
    }
}
