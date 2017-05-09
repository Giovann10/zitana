package com.greenfoxacademy.listtodos;

import com.greenfoxacademy.listtodos.model.Todo;
import com.greenfoxacademy.listtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListtodosApplication implements CommandLineRunner {

		@Autowired
		TodoRepository todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(ListtodosApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    todoRepo.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepo.save(new Todo("I have to master Spring Boot"));
  }
}
