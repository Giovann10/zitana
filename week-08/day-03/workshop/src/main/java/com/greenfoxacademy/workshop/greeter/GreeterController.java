package com.greenfoxacademy.workshop.greeter;

import com.greenfoxacademy.workshop.error.Error;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeter greeter(@RequestParam("name") String name, @RequestParam("title") String title) {
    Greeter greeter = new Greeter(name, title);
    return greeter;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Error greeterError(MissingServletRequestParameterException ex) {
    Error error = new Error("Please provide a " + ex.getParameterName());
    return error;
  }
}
