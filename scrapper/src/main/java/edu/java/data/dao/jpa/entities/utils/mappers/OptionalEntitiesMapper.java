package edu.java.data.dao.jpa.entities.utils.mappers;

import java.util.Optional;

public interface OptionalEntitiesMapper<J, D> {

    D toDto(J jpaEntity);

    default Optional<D> toOptionalDto(Optional<J> optionalJpaEntity) {
        if (optionalJpaEntity.isEmpty()) {
            return Optional.empty();
        }

        var jpaEntity = optionalJpaEntity.get();
        var dto = toDto(jpaEntity);
        return Optional.of(dto);
    }
}
