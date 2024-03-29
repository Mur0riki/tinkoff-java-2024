package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dto.GitHubRepositoryEntity;
import edu.java.data.dao.interfaces.GitHubRepositoryEntityRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJdbcDAO implements GitHubRepositoryDataAccessObject {

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
