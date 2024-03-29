package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.StackOverflowQuestionJpaMapper;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dao.jpa.repositories.StackOverflowQuestionJpaRepository;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.exceptions.NoSuchStackOverflowQuestionException;
import java.util.ArrayList;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class StackOverflowQuestionJpaDAO implements StackOverflowQuestionDataAccessObject {

    private final StackOverflowQuestionJpaRepository questionRepository;
    private final LinkJpaRepository linkRepository;

    private final StackOverflowQuestionJpaMapper questionJpaMapper;

    @Override
    public Optional<StackOverflowQuestion> findById(long id) {
        var jpaQuestion = questionRepository.findById(id);
        return questionJpaMapper.toOptionalDto(jpaQuestion);
    }

    @Override
    public Optional<StackOverflowQuestion> findByLinkId(long linkId) {
        var jpaQuestion = questionRepository.findByLinkId(linkId);
        return questionJpaMapper.toOptionalDto(jpaQuestion);
    }

    @Override
    public void update(StackOverflowQuestion question) {
        StackOverflowQuestionJpaEntity oldQuestion = questionRepository
                    .findById(question.getId())
            .orElseThrow(() -> new NoSuchStackOverflowQuestionException(question.getId()));

        if (linkIdWasChanged(oldQuestion, question)) {
            var newLink = findJpaLinkByIdOrThrowException(question.getLinkId());
            oldQuestion.setLink(newLink);
        }

        oldQuestion.setLastActivityDate(question.getLastActivityDate().toInstant());
        oldQuestion.setAnswersIds(new ArrayList<>(question.getAnswerIds()));
    }

    private boolean linkIdWasChanged(StackOverflowQuestionJpaEntity oldQuestion, StackOverflowQuestion newQuestion) {
        return !oldQuestion.getLink().getId().equals(newQuestion.getLinkId());
    }

    @Override
    public void save(StackOverflowQuestion question) {
        var jpaQuestion = buildJpaQuestion(question);
        questionRepository.save(jpaQuestion);
    }

    private StackOverflowQuestionJpaEntity buildJpaQuestion(StackOverflowQuestion question) {
        var link = findJpaLinkByIdOrThrowException(question.getLinkId());
        return questionJpaMapper.toJpaWithLink(question, link);
    }

    private LinkJpaEntity findJpaLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }
}
