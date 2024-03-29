package edu.java.data.dao.jdbc.repositories.rowMapper;

import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Optional;

public interface GitHubRepositoryEntityRepository {

    void save(GitHubRepositoryEntity repository);

    void update(GitHubRepositoryEntity repository);

    Optional<GitHubRepositoryEntity> findById(long id);

    Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner);
}
