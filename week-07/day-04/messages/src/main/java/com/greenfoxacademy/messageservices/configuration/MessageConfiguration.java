package com.greenfoxacademy.messageservices.configuration;

import com.greenfoxacademy.messageservices.service.EmailService;
import com.greenfoxacademy.messageservices.service.MessageProceeder;
import com.greenfoxacademy.messageservices.service.MessageService;
import com.greenfoxacademy.messageservices.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
  @Bean
  public MessageService createEmail() {
    return new EmailService();
  }

  @Bean
  public MessageService createTweet() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder createProceeder() {
    return new MessageProceeder();
  }

}
