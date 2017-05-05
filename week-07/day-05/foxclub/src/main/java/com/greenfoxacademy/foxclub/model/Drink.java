package com.greenfoxacademy.foxclub.model;

import java.util.Arrays;
import java.util.List;

public enum Drink {
  LEMONADE(0, "lemonade"), WATER(1, "water"), BEER(2, "beer"), SMOOTHIE(3, "smoothie"), BLOOD(4, "blood"), TEA(5, "tea"), COFFEE(6, "coffee");

  private String description;
  private int id;

  public static List<Drink> drinkList = Arrays.asList(Drink.values());

  Drink(int id, String description) {
    this.id = id;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public static Drink getById(int index) {
    return drinkList.get(index);
  }

  public int getId() {
    return id;
  }

}
