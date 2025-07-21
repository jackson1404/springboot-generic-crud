package com.jackson.generic_crud_testing.service;

import com.jackson.generic_crud_testing.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class BaseCrudService<E, D, ID> implements CrudService<E, D, ID>{

    protected final JpaRepository<E, ID> repository;
    protected final Mapper<E, D> mapper;

    public BaseCrudService(JpaRepository<E, ID> repository, Mapper<E, D> mapper) {
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




    }







}
