package edu.java.data.dao.interfaces;

import edu.java.data.dto.StackOverflowQuestion;
import java.util.Optional;

public interface StackOverflowQuestionDataAccessObject {

    Optional<StackOverflowQuestion> findById(long id);

    Optional<StackOverflowQuestion> findByLinkId(long linkId);

    void update(StackOverflowQuestion question);

    void save(StackOverflowQuestion question);

}
