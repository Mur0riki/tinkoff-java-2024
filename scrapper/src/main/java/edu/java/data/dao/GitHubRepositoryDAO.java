package edu.java.data.dao;

import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.data.postgres.repositories.GitHubRepositoryEntityRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryEntityRepository gitHubRepositoryEntityRepository;

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
