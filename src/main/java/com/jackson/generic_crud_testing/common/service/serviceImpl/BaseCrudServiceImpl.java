package com.jackson.generic_crud_testing.common.service.serviceImpl;

import com.jackson.generic_crud_testing.common.mapper.Mapper;
import com.jackson.generic_crud_testing.common.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseCrudServiceImpl<E, D, ID> implements CrudService<E, D, ID> {

    protected final JpaRepository<E, ID> repository;
    protected final Mapper<E, D> mapper;

    public BaseCrudServiceImpl(JpaRepository<E, ID> repository, Mapper<E, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public D findById(ID id){
        E entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
        return mapper.toDto(entity);
    }

    @Override
    public List<D> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public D create(D dto){
        E entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public D update(ID id, D dto){
        E entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        mapper.updateEntityFromDto(entity, dto);
        return mapper.toDto(repository.save(entity));

    }

    @Override
    public void delete(ID id){
        repository.deleteById(id);
    }







}
