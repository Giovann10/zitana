package com.greenfoxacademy.workshop.dountil;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public Object dountil(@PathVariable(name = "what") String what, @RequestBody() DoUntil dountil) {
    if (what.equals("sum")) {
      return new Sum(dountil.getUntil());
    } else if(what.equals("factor")) {
      return new Factorial(dountil.getUntil());
    } else {
      return null;
    }
  }

  @ExceptionHandler(Exception.class)
  public Error dountilError(Exception e) {
    return new Error("Please provide a number!");
  }

}
