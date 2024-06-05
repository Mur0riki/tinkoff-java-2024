package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.StackOverflowQuestionJpaEntity;
import edu.java.data.dto.StackOverflowQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StackOverflowQuestionJpaMapper extends
    OptionalEntitiesMapper<StackOverflowQuestionJpaEntity, StackOverflowQuestion> {

    @Mapping(target = "linkId", source = "link.id")
    StackOverflowQuestion toDto(StackOverflowQuestionJpaEntity jpaQuestion);

    @Mapping(target = "id", source = "question.id")
    StackOverflowQuestionJpaEntity toJpaWithLink(StackOverflowQuestion question, LinkJpaEntity link);

}
