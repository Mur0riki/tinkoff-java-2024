package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.Link;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LinkJpaMapper extends OptionalEntitiesMapper<LinkJpaEntity, Link>, TimeMapper {
    Link toDto(LinkJpaEntity jpaLink);
}
