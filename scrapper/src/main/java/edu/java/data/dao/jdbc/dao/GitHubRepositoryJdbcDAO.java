package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jdbc.repositories.GitHubRepositoryJdbcRepository;
import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJdbcDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryJdbcRepository gitHubRepositoryJdbcRepository;

    @Override
    public void save(GitHubRepositoryEntity repository) {
        gitHubRepositoryJdbcRepository.save(repository);
    }

    @Override
    public void update(GitHubRepositoryEntity repository) {
        gitHubRepositoryJdbcRepository.update(repository);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findById(long id) {
        return gitHubRepositoryJdbcRepository.findById(id);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        return gitHubRepositoryJdbcRepository.findByNameAndOwner(name, owner);
    }
}
