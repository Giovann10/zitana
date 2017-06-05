package com.greenfoxacademy.calorie.controller;

import com.greenfoxacademy.calorie.model.Meal;
import com.greenfoxacademy.calorie.model.Response;
import com.greenfoxacademy.calorie.model.Statistics;
import com.greenfoxacademy.calorie.repository.MealRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  MealRepository mealRepository;

  @RequestMapping(value = "/getmeal", method = RequestMethod.GET)
  public List<Meal> getmMeals() {
    return mealRepository.findAllByOrderById();
  }

  @RequestMapping(value = "/getstats", method = RequestMethod.GET)
  public Statistics getStats() {
    return new Statistics(mealRepository.findAllByOrderById());
  }

  @RequestMapping(value = "/meal", method = RequestMethod.POST)
    public Meal postMeal(@Valid @RequestBody Meal meal) {
    mealRepository.save(meal);
    return meal;
  }

  @RequestMapping(value = "/meal", method = RequestMethod.PUT)
  public Response updateMeal(@RequestBody Meal meal) {
    try {
      Meal myMeal = mealRepository.findOne(meal.getId());
      myMeal.updateMeal(meal);
      mealRepository.save(myMeal);
      return new Response("ok");
    } catch (Exception ex) {
      ex.printStackTrace();
      return new Response("bad");
    }
  }

  @RequestMapping(value = "/meal", method = RequestMethod.DELETE)
  public Response deleteMeal(@RequestBody Meal meal) {
    String status = "bad";
    try {
      mealRepository.delete(meal.getId());
      status = "ok";
    } catch (Exception ex) {
      System.out.println("No meal with this ID");
    }
    return new Response(status);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  public Error MissingBodyParamter(MethodArgumentNotValidException e) {
    String temp = "Missing field(s): ";
    List<FieldError> errors = e.getBindingResult().getFieldErrors();
    for (FieldError error : errors) {
      temp = temp.concat(error.getField() + ", ");
    }
    return new Error(temp);
  }

}
