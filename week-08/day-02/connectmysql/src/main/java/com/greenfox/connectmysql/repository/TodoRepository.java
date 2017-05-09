package com.greenfox.connectmysql.repository;

import com.greenfox.connectmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
  
}
