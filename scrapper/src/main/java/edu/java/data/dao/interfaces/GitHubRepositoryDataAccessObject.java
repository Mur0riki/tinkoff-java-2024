package edu.java.data.dao.interfaces;

import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Optional;

public interface GitHubRepositoryDataAccessObject {

    void save(GitHubRepositoryEntity repository);

    void update(GitHubRepositoryEntity repository);

    Optional<GitHubRepositoryEntity> findById(long id);

    Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner);
}
