package com.jackson.generic_crud_testing.mapper;

public interface Mapper<E, D> {
    E toEntity(D dto);
    D toDto(E entity);

    void updateEntityFromDto(E entity, D dto);
}
