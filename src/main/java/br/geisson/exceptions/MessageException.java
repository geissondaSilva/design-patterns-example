package br.geisson.exceptions;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MessageException extends RuntimeException {

    private static final Logger LOG = LogManager.getLogManager().getLogger(MessageException.class.getName());

    private final String message;

    public MessageException(String message) {
        this.message = message;
    }

    public void printMessage() {
        LOG.log(Level.WARNING, this.message);
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
