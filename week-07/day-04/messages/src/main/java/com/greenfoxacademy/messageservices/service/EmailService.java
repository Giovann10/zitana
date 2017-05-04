package com.greenfoxacademy.messageservices.service;

public class EmailService implements MessageService {

  @Override
  public void send(String message, String address) {
    System.out.println("Email was sent to " + address + " with message: " + message);
  }
}
