package com.greenfox.groot.controller;

import com.greenfox.groot.model.Arrow;
import com.greenfox.groot.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrowController {
  @RequestMapping(value = "/yondu",  method = RequestMethod.GET)
  public Arrow shootArrow(@RequestParam("distance") float distance, @RequestParam("time") float time) {
    Arrow yondu = new Arrow(distance,time);
    return yondu;
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(code= HttpStatus.BAD_REQUEST)
  public Error error() {
    Error error = new Error("Please provide distance and time");
    return error;
  }

}
