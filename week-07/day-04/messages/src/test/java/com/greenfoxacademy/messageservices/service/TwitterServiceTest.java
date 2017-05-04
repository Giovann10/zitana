package com.greenfoxacademy.messageservices.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwitterServiceTest {

  @Test
  public void TestSend() throws Exception {
    MessageService tweet = new TwitterService();
    assertEquals("Tweet was sent to Zita with message: Hello", tweet.send("Hello", "Zita"));
  }

  @Test
  public void TestSendwithNull() throws Exception {
    MessageService tweet = new TwitterService();
    assertEquals("Tweet was sent to Zita with message: null", tweet.send(null , "Zita"));
  }

}