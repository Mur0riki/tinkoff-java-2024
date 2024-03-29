package edu.java.data.dao.jdbc.repositories;

import edu.java.data.dto.GitHubRepositoryEntity;
import edu.java.data.dao.jdbc.repositories.rowMapper.GitHubRepositoryEntityRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.GitHubRepoitoryRowMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class GitHubRepositoryJdbcRepository implements GitHubRepositoryEntityRepository {

    private static final String TABLE_NAME = "git_hub_repositories";
    private static final RowMapper<GitHubRepositoryEntity> ROW_MAPPER = new GitHubRepoitoryRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} VALUES "
            + "(:id, :link_id, :name, :owner, :updated_at, :activities_ids)";

    private static final String UPDATE_QUERY =
        STR."UPDATE \{TABLE_NAME} SET "
            + "link_id = :link_id, "
            + "name = :name, "
            + "owner = :owner, "
            + "updated_at = :updated_at, "
            + "activities_ids = :activities_ids "
            + "WHERE id = :id";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String FIND_BY_NAME_AND_OWNER_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE name = :name AND owner = :owner";

    private final JdbcClient jdbcClient;

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void save(GitHubRepositoryEntity repository) {
        Long[] activities = repository.getActivitiesIds().toArray(new Long[0]);
        jdbcClient.sql(SAVE_QUERY)
            .param("id", repository.getId())
            .param("link_id", repository.getLinkId())
            .param("name", repository.getName())
            .param("owner", repository.getOwner())
            .param("updated_at", repository.getUpdatedAt())
            .param("activities_ids", activities)
            .update();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void update(GitHubRepositoryEntity repository) {
        Long[] activities = repository.getActivitiesIds().toArray(new Long[0]);
        jdbcClient.sql(UPDATE_QUERY)
            .param("link_id", repository.getLinkId())
            .param("id", repository.getId())
            .param("name", repository.getName())
            .param("owner", repository.getOwner())
            .param("updated_at", repository.getUpdatedAt())
            .param("activities_ids", activities)
            .update();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public Optional<GitHubRepositoryEntity> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public Optional<GitHubRepositoryEntity> findByNameAndOwner(String name, String owner) {
        return jdbcClient.sql(FIND_BY_NAME_AND_OWNER_QUERY)
            .param("name", name)
            .param("owner", owner)
            .query(ROW_MAPPER)
            .optional();
    }
}
