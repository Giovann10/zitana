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
  public Result dountil(@PathVariable(name = "what") String what, @RequestBody DoUntil dountil) {
    return new Result(dountil.getUntil(), what);
  }

  @ExceptionHandler(Exception.class)
  public Error dountilError(Exception e) {
    return new Error("Please provide a number!");
  }

}
