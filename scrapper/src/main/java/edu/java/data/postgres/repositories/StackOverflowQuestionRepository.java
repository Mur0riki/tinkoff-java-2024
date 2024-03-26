package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.StackOverflowQuestion;
import java.util.Optional;

public interface StackOverflowQuestionRepository {

    Optional<StackOverflowQuestion> findById(long id);

    Optional<StackOverflowQuestion> findByLinkId(long linkId);

    void save(StackOverflowQuestion question);

    void update(StackOverflowQuestion question);

}
