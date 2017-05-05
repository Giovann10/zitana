package com.greenfoxacademy.foxclub.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Food {
  PIZZA(0, "pizza"), SALAD(1, "salad"), COCAINE(2, "cocaine"), TRASH(3, "trash"), BRAINS(4, "brains"), NUTS(5, "nuts"), PROGRAMMERS(6, "programmers");

  private String description;
  private int id;

  public static List<Food> foodList = Arrays.asList(Food.values());

  Food(int id, String description) {
    this.id = id;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public static Food getById(int index) {
    return foodList.get(index);
  }

  public int getId() {
    return id;
  }

}
