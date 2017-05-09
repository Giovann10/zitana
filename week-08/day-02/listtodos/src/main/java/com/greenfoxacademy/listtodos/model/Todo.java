package com.greenfoxacademy.listtodos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }

}
