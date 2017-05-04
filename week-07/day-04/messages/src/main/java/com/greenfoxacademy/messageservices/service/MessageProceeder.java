package com.greenfoxacademy.messageservices.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService messageService;

  public String processMessage(String message, String address) {
    return messageService.send(message,address);
  }

}
