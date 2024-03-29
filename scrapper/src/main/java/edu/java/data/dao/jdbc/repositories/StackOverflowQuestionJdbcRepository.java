package edu.java.data.dao.jdbc.repositories;

import edu.java.data.dao.interfaces.StackOverflowQuestionRepository;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.data.dao.jdbc.repositories.rowMapper.StackOverflowQuestionRowMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StackOverflowQuestionJdbcRepository implements StackOverflowQuestionRepository {

    private static final RowMapper<StackOverflowQuestion> ROW_MAPPER = new StackOverflowQuestionRowMapper();

    private static final String TABLE_NAME = "stack_overflow_questions";

    private static final String FIND_BY_LINK_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE link_id = :link_id";

    private static final String UPDATE_QUERY =
        STR."UPDATE \{TABLE_NAME} SET "
            + "link_id = :link_id, "
            + "description_md5_hash = :description_md5_hash, "
            + "answers_ids = :answers_ids "
            + "WHERE id  = :id";

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} VALUES (:id, :link_id, :description_md5_hash, :answers_ids)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private final JdbcClient jdbcClient;

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public Optional<StackOverflowQuestion> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        return jdbcClient.sql(FIND_BY_LINK_ID_QUERY)
            .param("link_id", linkId)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void save(StackOverflowQuestion question) {
        Long[] answers = question.getAnswerIds().toArray(new Long[0]);
        jdbcClient.sql(SAVE_QUERY)
            .param("id", question.getId())
            .param("link_id", question.getLinkId())
            .param("last_activity_date", question.getLastActivityDate())
            .param("answers_ids", answers)
            .update();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void update(StackOverflowQuestion question) {
        Long[] answers = question.getAnswerIds().toArray(new Long[0]);
        jdbcClient.sql(UPDATE_QUERY)
            .param("id", question.getId())
            .param("link_id", question.getLinkId())
            .param("answers_ids", answers)
            .update();
    }
}
