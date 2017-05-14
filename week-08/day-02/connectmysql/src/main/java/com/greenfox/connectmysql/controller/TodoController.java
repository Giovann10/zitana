package com.greenfox.connectmysql.controller;

import com.greenfox.connectmysql.model.Todo;
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
  public String list(Model model,
      @RequestParam(value = "isActive", required = false, defaultValue = "false") String isActive) {
    if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepository.findAllByisDoneFalse());
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todo";
  }

  @RequestMapping(value = {"/add"})
  public String add(@RequestParam("todo") String todo) {
    todoRepository.save(new Todo(todo));
    return "redirect:/todo/";
  }

  @RequestMapping(value = {"/delete"})
  public String delete(@RequestParam("id") int id) {
    todoRepository.delete(new Long(id));
    return "redirect:/todo/";
  }

  @RequestMapping(value = {"/complete"})
  public String complete(@RequestParam("id") int id) {
    Todo todo = todoRepository.findOne(new Long(id));
    if (todo.isDone()) {
      todo.setDone(false);
    } else {
      todo.setDone(true);
    }
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}
