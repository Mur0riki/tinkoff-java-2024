package edu.java.linkUpdateScheduler.exceptions;

import java.net.URI;

public class UnsuccessfulStackOverflowQuestionUrlParseException extends UnsuccessfulUrlParseException {
    public UnsuccessfulStackOverflowQuestionUrlParseException(URI url) {
        super(STR."Can't parse question id from \{url}");
    }
}
