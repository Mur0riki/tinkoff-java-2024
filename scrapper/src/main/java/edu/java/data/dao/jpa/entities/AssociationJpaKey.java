package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;

@Embeddable
@Data
public class AssociationJpaKey implements Serializable {

    @Column(name = "chat_id")
    Long chatId;

    @Column(name = "link_id")
    Long linkId;

}
