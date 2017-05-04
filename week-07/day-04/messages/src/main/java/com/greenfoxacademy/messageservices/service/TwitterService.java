package com.greenfoxacademy.messageservices.service;

public class TwitterService implements MessageService {

  @Override
  public String send(String message, String address) {
    return "Tweet was sent to " + address + " with message: " + message;
  }

}
