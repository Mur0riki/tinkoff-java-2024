package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import java.util.Optional;

public interface GitHubRepositoryEntityRepository {

    void save(GitHubRepositoryEntity repository);

    void update(GitHubRepositoryEntity repository);

    Optional<GitHubRepositoryEntity> findById(long id);

    Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner);
}
