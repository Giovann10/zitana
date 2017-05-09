package com.greenfoxacademy.listtodos.repository;

import com.greenfoxacademy.listtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  
}
