package br.geisson.exceptions;

public class MessageException extends RuntimeException {

    private String message;

    public MessageException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public String getMessage() {
        return this.message;
    }

}
