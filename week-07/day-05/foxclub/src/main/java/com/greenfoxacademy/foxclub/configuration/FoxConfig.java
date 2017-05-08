package com.greenfoxacademy.foxclub.configuration;

import com.greenfoxacademy.foxclub.model.Drink;
import com.greenfoxacademy.foxclub.model.Food;
import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.Trick;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {
  @Bean(value = "mrfox")
  public Fox createMrFox() {
    return new Fox("Mr. Fox", Food.PIZZA, Drink.COFFEE);
  }

//  @Bean(value = "mrgreen")
  public Fox createMrGreen() {
    return new Fox("Mr. Green", Food.SALAD, Drink.WATER);
  }

//  @Bean(value = "zombie")
  public Fox createZombie() {
    Fox zombie = new Fox("Zombie Queen", Food.BRAINS, Drink.BLOOD);
    zombie.learnTricks(Trick.KILL_SOMEONE);
    return zombie;
  }

}
