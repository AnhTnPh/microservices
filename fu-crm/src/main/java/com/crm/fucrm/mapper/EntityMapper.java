package com.crm.fucrm.mapper;


import java.util.List;

public interface EntityMapper<E, D> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntities(List<D> dtoS);
    List<D> toDtoS(List<E> entities);
}
