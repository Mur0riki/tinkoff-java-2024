package edu.java.restApi.dto.exceptions;

public class NoSuchChatException extends RuntimeException {
    public NoSuchChatException(String message) {
        super(message);
    }
}
