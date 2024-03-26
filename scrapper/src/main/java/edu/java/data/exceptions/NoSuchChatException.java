package edu.java.data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class NoSuchChatException extends DataServiceException {

    private static final String DESCRIPTION = "There is no record about such chat";
    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.NOT_FOUND;

    public NoSuchChatException(String message) {
        super(message);
    }

    public NoSuchChatException(long chatApiId) {
        super(STR."There is no such chat with id \{chatApiId}");
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
