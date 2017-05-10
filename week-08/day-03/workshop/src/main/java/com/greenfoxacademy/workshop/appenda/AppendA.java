package com.greenfoxacademy.workshop.appenda;

public class AppendA {
  private String appended;

  public AppendA(String appended) {
    this.appended = appended.concat("a");
  }

  public String getAppended() {
    return appended;
  }
}
