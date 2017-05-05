package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {
  String name;
  ArrayList<Trick> tricks;
  String food;
  String drink;


  public Fox(String name, ArrayList<Trick> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public void learnTricks(Trick trick) {
    this.tricks.add(trick);
  }
}
