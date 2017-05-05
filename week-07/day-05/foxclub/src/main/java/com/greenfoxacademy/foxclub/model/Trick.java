package com.greenfoxacademy.foxclub.model;

import java.util.Arrays;
import java.util.List;

public enum Trick {
  CODE_IN_JAVA(0, "code fast in java"), WRITE_HTML(1, "write beautiful HTML"), MAKE_COFFEE(2, "make amazing coffee"), KILL_SOMEONE(3, "kill someone brutally"), BRING_BREAKFAST_IN_BED(4, "bring breakfast in bed"), TELL_A_JOKE(5, "tell a funny joke"), PLAY_DEAD(6,"play dead"), FUCK_A_LEG(7, "fuck someone's leg"), VOMIT (8, "vomit blood"), DANCE(9, "dance like nobody is watching");

  private String description;
  private int id;

  public static List<Trick> trickList = Arrays.asList(Trick.values());

  Trick(int id, String description) {
    this.id = id;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public static Trick getById(int index) {
    return trickList.get(index);
  }

  public int getId() {
    return id;
  }

}
