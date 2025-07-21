package com.jackson.generic_crud_testing.controller;

import com.jackson.generic_crud_testing.service.CrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<E, D, ID> {

    protected final CrudService<E, D, ID> crudService;

    public CrudController(CrudService<E, D, ID> crudService){
        this.crudService = crudService;
    }

    @GetMapping("/findById")
    public ResponseEntity<D> findById(@RequestParam("id") ID id){
        return ResponseEntity.ok(crudService.findById(id));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<D>> getAll() {
        return ResponseEntity.ok(crudService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<D> create(@RequestBody D dto) {
        return ResponseEntity.ok(crudService.create(dto));
    }

    @PutMapping("/update")
    public ResponseEntity<D> update(@RequestParam("id") ID id, @RequestBody D dto) {
        return ResponseEntity.ok(crudService.update(id, dto));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@RequestParam("id") ID id) {
        crudService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
