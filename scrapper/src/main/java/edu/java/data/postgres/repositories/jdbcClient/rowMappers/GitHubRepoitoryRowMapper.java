package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.dto.GitHubRepositoryEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Set;
import org.springframework.jdbc.core.RowMapper;

public class GitHubRepoitoryRowMapper implements RowMapper<GitHubRepositoryEntity> {
    @Override
    public GitHubRepositoryEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long linkId = rs.getLong("link_id");
        String name = rs.getString("name");
        String owner = rs.getString("owner");
        OffsetDateTime updatedAt = rs.getTimestamp("updated_at").toLocalDateTime().atOffset(ZoneOffset.UTC);

        Object[] arrayData = (Object[]) rs.getArray("activities_ids").getArray();
        Set<Long> activitiesIds = buildSetLong(arrayData);

        return new GitHubRepositoryEntity(id, linkId, name, owner, updatedAt, activitiesIds);
    }

    private Set<Long> buildSetLong(Object[] arrayData) {
        Set<Long> result = new HashSet<>();
        for (var data : arrayData) {
            result.add((long) data);
        }
        return result;
    }
}
