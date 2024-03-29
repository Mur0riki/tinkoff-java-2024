package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Set;
import org.springframework.jdbc.core.RowMapper;

public class StackOverflowQuestionRowMapper implements RowMapper<StackOverflowQuestion> {

    @Override
    public StackOverflowQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        long linkId = rs.getLong("link_id");
         OffsetDateTime lastActiviteDate = rs.getTimestamp("last_activity_date").toLocalDateTime().atOffset(ZoneOffset.UTC);

        Object[] arrayData = (Object[]) rs.getArray("answers_ids").getArray();
        Set<Long> answerApiIds = buildSetLong(arrayData);

        return new StackOverflowQuestion(id, linkId,lastActiviteDate, answerApiIds);
    }

    private Set<Long> buildSetLong(Object[] arrayData) {
        Set<Long> result = new HashSet<>();
        for (var data : arrayData) {
            result.add((long) data);
        }
        return result;
    }
}
