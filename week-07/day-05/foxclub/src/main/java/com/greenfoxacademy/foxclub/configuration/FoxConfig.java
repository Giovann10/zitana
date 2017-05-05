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
    List<Trick> tricks = new ArrayList<>(Arrays.asList(trick.values(), "code in java"));
    return new Fox("Mr. Fox", tricks, "pizza", "lemonade");
  }

  public Fox createMrGreen() {
    ArrayList<String> tricks = new ArrayList<>();
    return new Fox("Mr. Green", tricks, "salad", "water");
  }

  public Fox createZombie() {
    ArrayList<String> tricks = new ArrayList<>(Arrays.asList("kill someone", "tell a joke"));
    return new Fox("Zombie Queen", tricks, "brains", "blood");
  }

}
