package com.greenfoxacademy.lionking.controller;

import com.greenfoxacademy.lionking.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
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

  @RequestMapping("/exercise5")
  public String displayAccounts(Model model) {
    List<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    bankAccounts.add(new BankAccount("Timon", 200, "meerkat"));
    bankAccounts.add(new BankAccount("Pumbaa", 0, "warthhog"));
    bankAccounts.add(new BankAccount("Scar", 5000, "lion"));
    bankAccounts.add(new BankAccount("Rafiki", 1000, "mandrill"));
    model.addAttribute("accounts", bankAccounts);
    return "bankaccounts";
  }
}
