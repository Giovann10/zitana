package com.greenfoxacademy.workshop.dountil;

public class Sum {
  private int result;

  public Sum(int until) {
    this.result = sum(until);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sum(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + sum(n - 1);
    }
  }

}
