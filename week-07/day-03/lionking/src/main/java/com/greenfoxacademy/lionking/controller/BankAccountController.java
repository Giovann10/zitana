package com.greenfoxacademy.lionking.controller;

import com.greenfoxacademy.lionking.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping("/exercise1")
  public String displayAccount(Model model) {
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "account";
  }

}
