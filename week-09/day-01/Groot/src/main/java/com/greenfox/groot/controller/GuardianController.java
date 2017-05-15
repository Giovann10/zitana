package com.greenfox.groot.controller;

import com.greenfox.groot.model.Error;
import com.greenfox.groot.model.Guardian;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot",  method = RequestMethod.GET)
  public Guardian groot(@RequestParam("message") String somemessage) {
    Guardian groot = new Guardian(somemessage);
    return groot;
  }

  @ExceptionHandler(Exception.class)
  public Error error() {
    Error error = new Error("I am Groot");
    return error;
  }
}
