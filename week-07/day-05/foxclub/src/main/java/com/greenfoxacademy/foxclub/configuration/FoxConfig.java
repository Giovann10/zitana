package com.greenfoxacademy.foxclub.configuration;

import com.greenfoxacademy.foxclub.model.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {
  @Bean
  public Fox createMrFox() {
    ArrayList<String> tricks = new ArrayList<>(Arrays.asList("write HTML", "code in java"));
    return new Fox("Mr. Fox", tricks, "pizza", "lemonade");
  }

  public Fox createMrGreen() {
    ArrayList<String> tricks = new ArrayList<>();
    return new Fox("Mr. Green", tricks, "salad", "water");
  }


}
