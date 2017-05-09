package com.greenfoxacademy.listtodos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {
  @ResponseBody
  @RequestMapping(value = {"/list", "/", ""})
  public String list(Model model) {
    return "This is my first todo";
  }

}
