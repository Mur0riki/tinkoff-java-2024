package edu.java.linkUpdateScheduler.exceptions;

public class IncorrectHostException extends LinkUpdateSchedulerException {
    public IncorrectHostException(String host) {
        super(STR."Cant check updates, as given host name is \{host}");
    }
}
