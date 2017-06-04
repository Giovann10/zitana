package com.greenfoxacademy.workshop.arrayhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

  @Autowired
  ArrayHandler arrayHandler;

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public Object arrayHandler(@RequestBody ArrayRequest arrayRequest) {
    return arrayHandler.sendResult(arrayRequest);
  }

}
