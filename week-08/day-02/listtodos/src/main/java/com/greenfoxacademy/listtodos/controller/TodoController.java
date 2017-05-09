package com.greenfoxacademy.listtodos.controller;

import com.greenfoxacademy.listtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/list", "/", ""})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }

}
