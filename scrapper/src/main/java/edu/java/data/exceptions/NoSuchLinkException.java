package edu.java.data.exceptions;

import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class NoSuchLinkException extends DataServiceException {

    private static final String DESCRIPTION = "There is no record about such url";
    private static final HttpStatusCode HTTP_STATUS_CODE = HttpStatus.CONFLICT;

    public NoSuchLinkException(String message) {
        super(message);
    }

    public NoSuchLinkException(URI linkUrl) {
        super(STR."There is no link with such link: \{linkUrl}");
    }

    public NoSuchLinkException(long linkId) {
        super(STR."There is no such link with id \{linkId}");
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
