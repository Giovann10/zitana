package com.greenfox.connectmysql.repository;

import com.greenfox.connectmysql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByisDoneFalse();


}
