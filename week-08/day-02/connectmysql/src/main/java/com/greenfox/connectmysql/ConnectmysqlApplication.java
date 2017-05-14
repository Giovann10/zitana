package com.greenfox.connectmysql;

import com.greenfox.connectmysql.model.Todo;
import com.greenfox.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectmysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepo;

  public static void main(String[] args) {
    SpringApplication.run(ConnectmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepo.save(new Todo("Torture students (just a little bit)", false, false));
    todoRepo.save(new Todo("Explain some stuff", false, true));
    todoRepo.save(new Todo("Be kind and sympathetic", false, false));
    todoRepo.save(new Todo("Do more code reviews", false, true));
    todoRepo.save(new Todo("Stay awesome", false, false));
  }
}
