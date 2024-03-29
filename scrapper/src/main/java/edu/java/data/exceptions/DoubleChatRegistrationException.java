package edu.java.data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class DoubleChatRegistrationException extends DataServiceException {

    private static final String DESCRIPTION = "Can't register new chat, as it was already registered";
    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.CONFLICT;

    public DoubleChatRegistrationException(String message) {
        super(message);
    }

    public DoubleChatRegistrationException(long apiId) {
        super(STR."Chat with id \{apiId} was already registered");
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public HttpStatusCode getHttpStatusCode() {
        return HTTP_STATUS_CODE;
    }
}
