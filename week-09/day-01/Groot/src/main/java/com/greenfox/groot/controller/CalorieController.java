package com.greenfox.groot.controller;

import com.greenfox.groot.model.Food;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drax")
public class CalorieController {

  private List<Food> foodList = new ArrayList<>();

  @RequestMapping(value = "/" , method = RequestMethod.GET)
  public List<Food> listFood() {
    return foodList;
  }

  @RequestMapping(value = "/add" , method = RequestMethod.POST)
  public List<Food> add(@RequestParam("name") String name,
      @RequestParam("amount") int amount,
      @RequestParam("calories") int calories) {
    foodList.add(new Food(name, amount, calories));
    return foodList;
  }

  @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
  public List<Food> delete(@RequestParam("name") String name,
      @RequestParam("amount") int amount,
      @RequestParam("calories") int calories) {
    for (int i = 0; i < foodList.size(); i++) {
      if (foodList.get(i).getName().equals(name)) {
        foodList.remove(foodList.get(i));
      }
    }
    return foodList;
  }

  @RequestMapping(value = "/change" , method = RequestMethod.PUT)
  public List<Food> changeAmount(@RequestParam("name") String name,
      @RequestParam("change") int changeTo) {
    for (int i = 0; i < foodList.size(); i++) {
      if (foodList.get(i).getName().equals(name)) {
        foodList.get(i).setAmount(changeTo);
      }
    }
    return foodList;
  }

}
