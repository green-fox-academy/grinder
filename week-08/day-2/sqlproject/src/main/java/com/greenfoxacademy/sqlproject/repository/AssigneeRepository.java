package com.greenfoxacademy.sqlproject.repository;

import com.greenfoxacademy.sqlproject.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
