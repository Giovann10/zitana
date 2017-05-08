package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {
  String name;
  ArrayList<Trick> tricks = new ArrayList<>();
  Food food;
  Drink drink;

  public Fox(String name, Food food, Drink drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public void learnTricks(Trick trick) {
    this.tricks.add(trick);
  }
}
