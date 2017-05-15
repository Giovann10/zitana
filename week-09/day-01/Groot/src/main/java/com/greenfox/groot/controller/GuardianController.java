package com.greenfox.groot.controller;

import com.greenfox.groot.model.Error;
import com.greenfox.groot.model.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot",  method = RequestMethod.GET)
  public Groot groot(@RequestParam("message") String somemessage) {
    Groot groot = new Groot(somemessage);
    return groot;
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(code= HttpStatus.BAD_REQUEST)
  public Error error() {
    Error error = new Error("I am Groot");
    return error;
  }
}
