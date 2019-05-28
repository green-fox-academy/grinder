package com.greenfoxacademy.sqlproject.repository;

import com.greenfoxacademy.sqlproject.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
