package com.greenfoxacademy.workshop.dountil;

public class Factorial {
  private int result;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public Factorial(int until) {
    this.result = factorial(until);
  }

  public int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

}
