package edu.java.data.dao.interfaces;

import edu.java.data.dto.StackOverflowQuestion;
import java.util.Optional;

public interface StackOverflowQuestionRepository {

    Optional<StackOverflowQuestion> findById(long id);

    Optional<StackOverflowQuestion> findByLinkId(long linkId);

    void save(StackOverflowQuestion question);

    void update(StackOverflowQuestion question);

}