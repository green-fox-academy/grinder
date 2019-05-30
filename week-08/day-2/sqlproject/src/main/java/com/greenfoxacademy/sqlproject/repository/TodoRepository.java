package com.greenfoxacademy.sqlproject.repository;

import com.greenfoxacademy.sqlproject.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query("SELECT s FROM Todo s WHERE s.title = :title")
    public Todo find(@Param("title") String title);
}
