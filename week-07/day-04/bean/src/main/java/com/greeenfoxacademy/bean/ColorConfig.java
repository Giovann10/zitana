package com.greeenfoxacademy.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

  @Bean
  public RedColor returnRed() {
    return new RedColor();
  }

}
