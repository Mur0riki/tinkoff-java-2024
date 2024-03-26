package edu.java.data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class DataServiceException extends RuntimeException {

    private static final String DESCRIPTION = "Some error happened in data services...";

    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.NOT_FOUND;

    DataServiceException(String message) {
        super(message);
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    public HttpStatusCode getHttpStatusCode() {
        return HTTP_STATUS_CODE;
    }

}
