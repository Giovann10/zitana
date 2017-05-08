package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    model.addAttribute("fox", fox);
    model.addAttribute("food", Food.foodList);
      model.addAttribute("drink", Drink.drinkList);
    return "store";
  }

  @RequestMapping("/trickCenter")
  public String displayTrickCenter(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", Trick.trickList);
    return "tricks";
  }

}
