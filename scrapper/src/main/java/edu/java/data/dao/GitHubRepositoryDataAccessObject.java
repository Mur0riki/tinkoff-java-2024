package edu.java.data.dao;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import java.util.Optional;

public interface GitHubRepositoryDataAccessObject {

    void save(GitHubRepositoryEntity repository);

    void update(GitHubRepositoryEntity repository);

    Optional<GitHubRepositoryEntity> findById(long id);

    Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner);
}
