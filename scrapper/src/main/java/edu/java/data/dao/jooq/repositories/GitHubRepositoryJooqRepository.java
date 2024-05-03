package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.scrapper.domain.jooq.tables.GitHubRepositories.GIT_HUB_REPOSITORIES;

@RequiredArgsConstructor
public class GitHubRepositoryJooqRepository {

    private final DefaultDSLContext dsl;

    public void save(GitHubRepositoryEntity repository) {
        dsl.insertInto(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.ID, repository.getId())
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.UPDATED_AT, repository.getUpdatedAt().toLocalDateTime())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .execute();
    }

    public void update(GitHubRepositoryEntity repository) {
        dsl.update(GIT_HUB_REPOSITORIES)
            .set(GIT_HUB_REPOSITORIES.LINK_ID, repository.getLinkId())
            .set(GIT_HUB_REPOSITORIES.NAME, repository.getName())
            .set(GIT_HUB_REPOSITORIES.OWNER, repository.getOwner())
            .set(GIT_HUB_REPOSITORIES.UPDATED_AT, repository.getUpdatedAt().toLocalDateTime())
            .set(GIT_HUB_REPOSITORIES.ACTIVITIES_IDS, repository.getActivitiesIds().toArray(new Long[0]))
            .where(GIT_HUB_REPOSITORIES.ID.eq(repository.getId()))
            .execute();
    }

    public Optional<GitHubRepositoryEntity> findById(long id) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.ID.eq(id))
            .fetchOneInto(GitHubRepositoryEntity.class);
        return Optional.ofNullable(repository);
    }

    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        var repository = dsl.select()
            .from(GIT_HUB_REPOSITORIES)
            .where(GIT_HUB_REPOSITORIES.NAME.eq(name))
            .and(GIT_HUB_REPOSITORIES.OWNER.eq(owner))
            .fetchOneInto(GitHubRepositoryEntity.class);
        return Optional.ofNullable(repository);
    }
}

