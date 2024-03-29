package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.GitHubRepositoryJpaMapper;
import edu.java.data.dao.jpa.repositories.GitHubRepositoryJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dto.GitHubRepositoryEntity;
import edu.java.data.exceptions.NoSuchGitHubRepositoryException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.util.ArrayList;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class GitHubRepositoryJpaDAO implements GitHubRepositoryDataAccessObject {

    private final GitHubRepositoryJpaRepository gitHubRepoRepository;
    private final LinkJpaRepository linkRepository;

    private final GitHubRepositoryJpaMapper repositoryJpaMapper;

    @Override
    public void save(GitHubRepositoryEntity repository) {
        var jpaRepository = buildJpaRepository(repository);
        gitHubRepoRepository.save(jpaRepository);
    }

    @Override
    public void update(GitHubRepositoryEntity repository) {
        var oldRepository =
                gitHubRepoRepository
                    .findById(repository.getId())
            .orElseThrow(() -> new NoSuchGitHubRepositoryException(repository.getName(), repository.getOwner()));

        if (linkIdWasChanged(oldRepository, repository)) {
            var newLink = findJpaLinkByIdOrThrowException(repository.getLinkId());
            oldRepository.setLink(newLink);
        }

        oldRepository.setName(repository.getName());
        oldRepository.setOwner(repository.getOwner());
        oldRepository.setUpdated_at(repository.getUpdatedAt().toInstant());
        oldRepository.setActivitiesIds(new ArrayList<>(repository.getActivitiesIds()));
    }

    private boolean linkIdWasChanged(GitHubRepositoryJpaEntity oldRepository, GitHubRepositoryEntity newRepository) {
        return !oldRepository.getLink().getId().equals(newRepository.getLinkId());
    }

    @Override
    public Optional<GitHubRepositoryEntity> findById(long id) {
        var jpaRepository = gitHubRepoRepository.findById(id);
        return repositoryJpaMapper.toOptionalDto(jpaRepository);
    }

    @Override
    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        var jpaRepository = gitHubRepoRepository.findByNameAndOwner(name, owner);
        return repositoryJpaMapper.toOptionalDto(jpaRepository);
    }

    private GitHubRepositoryJpaEntity buildJpaRepository(GitHubRepositoryEntity repository) {
        var link = findJpaLinkByIdOrThrowException(repository.getLinkId());
        return repositoryJpaMapper.toJpaWithLink(repository, link);
    }

    private LinkJpaEntity findJpaLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }
}
