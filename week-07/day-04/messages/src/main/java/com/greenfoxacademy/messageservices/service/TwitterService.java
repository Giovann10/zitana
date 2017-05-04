package com.greenfoxacademy.messageservices.service;

public class TwitterService implements MessageService {

  @Override
  public void send(String message, String address) {
    System.out.println("Tweet was sent to " + address + " with message: " + message);
  }

}
