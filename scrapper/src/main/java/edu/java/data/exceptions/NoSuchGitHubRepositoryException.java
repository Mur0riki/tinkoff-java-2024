package edu.java.data.exceptions;

public class NoSuchGitHubRepositoryException extends DataServiceException {
    public NoSuchGitHubRepositoryException(String repositoryName, String owner) {
        super(STR."There is no repository with name \{repositoryName} by \{owner}");
    }
}
