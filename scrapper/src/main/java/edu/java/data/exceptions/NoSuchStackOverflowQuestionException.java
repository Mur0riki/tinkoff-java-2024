package edu.java.data.exceptions;

public class NoSuchStackOverflowQuestionException extends DataServiceException {

    public NoSuchStackOverflowQuestionException(String message) {
        super(message);
    }

    public NoSuchStackOverflowQuestionException(long questionId) {
        this(STR."No such stack overflow question with id \{questionId}");
    }
}
