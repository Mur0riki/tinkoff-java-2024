package edu.java.data.dao.jooq.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jooq.repositories.GitHubRepositoryJooqRepository;
import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJooqDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryJooqRepository gitHubRepositoryEntityRepository;

    @Override
    public void save(GitHubRepositoryEntity repository) {
        gitHubRepositoryEntityRepository.save(repository);
    }

    @Override
    public void update(GitHubRepositoryEntity repository) {
        gitHubRepositoryEntityRepository.update(repository);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findById(long id) {
        return gitHubRepositoryEntityRepository.findById(id);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        return gitHubRepositoryEntityRepository.findByNameAndOwner(name, owner);
    }
}
