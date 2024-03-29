package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatJpaRepository extends CrudRepository<ChatJpaEntity, Long> {

    boolean existsById(long id);

    long removeById(long id);

}

