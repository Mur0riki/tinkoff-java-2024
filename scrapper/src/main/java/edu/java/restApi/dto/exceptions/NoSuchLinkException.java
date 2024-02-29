package edu.java.restApi.dto.exceptions;

public class NoSuchLinkException extends RuntimeException {
    public NoSuchLinkException(String message) {
        super(message);
    }
}
