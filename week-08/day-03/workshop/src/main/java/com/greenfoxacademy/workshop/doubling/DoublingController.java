package com.greenfoxacademy.workshop.doubling;

import com.greenfoxacademy.workshop.error.Error;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam("input") int input) {
      Doubling doubling = new Doubling(input);
      return doubling;
  }

  @ExceptionHandler(Exception.class)
  public Error error() {
    Error error = new Error("Please provide an input!");
    return error;
  }
}
