package com.greenfox.connectmysql.controller;

import com.greenfox.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/list", "/", ""})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive){
    model.addAttribute("todos", todoRepository.findAll());
    if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());
    }
    return "todo";
  }

}
