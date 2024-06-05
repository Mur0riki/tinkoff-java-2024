package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dto.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ChatJpaMapper extends OptionalEntitiesMapper<ChatJpaEntity, Chat>, TimeMapper {

    Chat toDto(ChatJpaEntity jpaChat);

}
