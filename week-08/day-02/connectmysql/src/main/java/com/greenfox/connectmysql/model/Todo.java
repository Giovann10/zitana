package com.greenfox.connectmysql.model;

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

  @Column(name = "title")
  private String title;

  @Column(columnDefinition = "tinyint(1) default 0")
  private boolean isUrgent = false;

  @Column(columnDefinition = "tinyint(1) default 0")
  private boolean isDone = false;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  public Todo(String title, boolean isDone, boolean isUrgent) {
    this.title = title;
    this.isDone = isDone;
    this.isUrgent = isUrgent;
  }

  @Override
  public String toString() {
    return title;
  }

}
