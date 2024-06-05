package edu.java.linkUpdateScheduler.exceptions;

import java.net.URI;

public class UnsuccessfulGitHubUrlParseException extends UnsuccessfulUrlParseException {
    public UnsuccessfulGitHubUrlParseException(URI url) {
        super(STR."Can't parse repository's name and owner's name from github url: \{url}");
    }
}
