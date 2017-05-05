package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String displayInfo(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String displayStore(Model model) {
    return "store";
  }

  @RequestMapping("/trickCenter")
  public String displayTrickCenter(Model model) {
    return "tricks";
  }

}
