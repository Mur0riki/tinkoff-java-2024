package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "link_chat")
@Data
@NoArgsConstructor
public class AssociationJpa {

    @EmbeddedId
    private AssociationJpaKey id = new AssociationJpaKey();

    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(name = "chat_id")
    private ChatJpaEntity chat;

    @ManyToOne
    @MapsId("linkId")
    @JoinColumn(name = "link_id")
    private LinkJpaEntity link;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    public AssociationJpa(ChatJpaEntity chat, LinkJpaEntity link) {
        this.chat = chat;
        this.link = link;
    }

    public AssociationJpa(AssociationJpaKey id, ChatJpaEntity chat, LinkJpaEntity link) {
        this.id = id;
        this.chat = chat;
        this.link = link;
    }
}
