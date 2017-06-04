package com.greenfox.groot.controller;

import com.greenfox.groot.model.Error;
import com.greenfox.groot.model.Food;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
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
  public Food add(@RequestParam("name") String name,
      @RequestParam("amount") int amount,
      @RequestParam("calories") int calories) {
    Food food = new Food(name, amount, calories);
    foodList.add(food);
    return food;
  }

  @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
  public Food delete(@RequestParam("name") String name) {
    Food food = new Food();
    for (int i = 0; i < foodList.size(); i++) {
      if (foodList.get(i).getName().equals(name)) {
        food = foodList.get(i);
        foodList.remove(foodList.get(i));
      }
    }
    return food;
  }

  @RequestMapping(value = "/change" , method = RequestMethod.PUT)
  public Food changeAmount(@RequestParam("name") String name,
      @RequestParam("change") int changeTo) {
    Food food = new Food();
    for (int i = 0; i < foodList.size(); i++) {
      if (foodList.get(i).getName().equals(name)) {
        food = foodList.get(i);
        food.setAmount(changeTo);
      }
    }
    return food;
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(code= HttpStatus.I_AM_A_TEAPOT)
  public Error error() {
    Error error = new Error("I am Groot");
    return error;
  }

}
