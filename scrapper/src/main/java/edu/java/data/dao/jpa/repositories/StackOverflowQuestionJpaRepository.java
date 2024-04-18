package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StackOverflowQuestionJpaRepository extends JpaRepository<StackOverflowQuestionJpaEntity, Long> {

    Optional<StackOverflowQuestionJpaEntity> findByLinkId(long linkId);
}
