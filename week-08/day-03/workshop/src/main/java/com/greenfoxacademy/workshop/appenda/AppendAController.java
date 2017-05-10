package com.greenfoxacademy.workshop.appenda;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {
  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public Object appendA(@PathVariable(name = "appendable") String appendable) {
    return new AppendA(appendable);
  }

}
