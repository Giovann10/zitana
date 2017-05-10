package com.greenfoxacademy.workshop.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
  public String loadIndex() {
    return "index";
  }
}
