package edu.java.data.dao.jpa.entities.utils.mappers;

import edu.java.data.dao.jpa.entities.GitHubRepositoryJpaEntity;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dto.GitHubRepositoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GitHubRepositoryJpaMapper extends
    OptionalEntitiesMapper<GitHubRepositoryJpaEntity, GitHubRepositoryEntity>, TimeMapper {

    @Mapping(target = "linkId", source = "link.id")
    GitHubRepositoryEntity toDto(GitHubRepositoryJpaEntity jpaRepository);

    @Mapping(target = "id", source = "repository.id")
    GitHubRepositoryJpaEntity toJpaWithLink(GitHubRepositoryEntity repository, LinkJpaEntity link);
}
