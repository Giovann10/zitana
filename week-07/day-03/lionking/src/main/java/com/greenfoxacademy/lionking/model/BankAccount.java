package com.greenfoxacademy.lionking.model;

public class BankAccount {
  String name;
  long balance;
  String animalType;

  public BankAccount(String name, long balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
