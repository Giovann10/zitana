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
public class FoxController {
  @Autowired
  Fox fox;

  @RequestMapping("/changeNutrition")
  public String changeDiet(Model model, @RequestParam(value ="food") int foodId, @RequestParam(value = "drink") int drinkId) {
    fox.setFood(Food.getById(foodId));
    fox.setDrink(Drink.getById(drinkId));
    model.addAttribute("fox", fox);
    return "redirect:/";
  }

  @RequestMapping("/learnTrick")
  public String addTrick(Model model, @RequestParam("trick") int trickId) {
    fox.learnTricks(Trick.getById(trickId));
    model.addAttribute("fox", fox);
    return "redirect:/";
  }

}
