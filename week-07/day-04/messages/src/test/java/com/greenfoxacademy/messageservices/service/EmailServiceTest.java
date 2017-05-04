package com.greenfoxacademy.messageservices.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailServiceTest {

  @Test
  public void send() throws Exception {
    MessageService email = new EmailService();
    assertEquals("Email was sent to Zita with message: Hello", email.send("Hello", "Zita"));
  }

}