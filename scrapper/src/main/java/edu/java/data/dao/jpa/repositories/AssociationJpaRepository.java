package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.AssociationJpa;
import edu.java.data.dao.jpa.entities.AssociationJpaKey;
import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationJpaRepository extends JpaRepository<AssociationJpa, AssociationJpaKey> {
    void removeByChatAndLink(ChatJpaEntity chat, LinkJpaEntity link);
}
