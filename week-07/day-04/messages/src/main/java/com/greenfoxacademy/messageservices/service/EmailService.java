package com.greenfoxacademy.messageservices.service;

public class EmailService implements MessageService {

  @Override
  public String send(String message, String address) {
    return "Email was sent to " + address + " with message: " + message;
  }
}
