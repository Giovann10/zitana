package com.greenfoxacademy.listtodos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;


}
