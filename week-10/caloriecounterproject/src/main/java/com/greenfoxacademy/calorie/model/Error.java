package com.greenfoxacademy.calorie.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
  private String status;
  private String message;

  public Error(String message) {
    this.status = "error";
    this.message = message;
  }

  public Error() {
  }
}
