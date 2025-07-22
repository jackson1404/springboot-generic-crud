package com.jackson.generic_crud_testing.common.service;

import java.util.List;

public interface CrudService<E, D, ID> {

    D findById(ID id);
    List<D> findAll();
    D create(D dto);
    D update(ID id, D dto);
    void delete(ID id);
}
