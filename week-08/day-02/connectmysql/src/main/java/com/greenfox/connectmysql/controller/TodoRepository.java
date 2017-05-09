package com.greenfox.connectmysql.controller;

import com.greenfox.connectmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
