package edu.java.restApi.dto.exceptions;

public class DoubleChatRegistrationException extends RuntimeException {
    public DoubleChatRegistrationException(String message) {
        super(message);
    }
}
