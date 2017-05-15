package com.greenfox.groot.model;

import org.springframework.stereotype.Component;

@Component
public class Ship {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipStatus = "empty";
    this.ready = false;
  }

  public void fillShip(Cargo cargo) {
    if (cargo.getReceived().equals(".25")) {
      this.caliber25 += cargo.getAmount();
    } else if (cargo.getReceived().equals(".30")) {
      this.caliber30 += cargo.getAmount();
    } else if (cargo.getReceived().equals(".50")) {
      this.caliber50 += cargo.getAmount();
    }

    this.setShipStatus();
    this.setReady();
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  private double getPercentage() {
    return (caliber25 + caliber30 + caliber50) / 12500. * 100;
  }

  public void setShipStatus() {
    if (this.getPercentage() == 0) {
      this.shipStatus = "empty";
    } else if (this.getPercentage() == 100) {
      this.shipStatus = "full";
    } else if (this.getPercentage() > 100) {
      this.shipStatus = "overloaded";
    } else {
      this.shipStatus = getPercentage() + "%";
    }
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady() {
    if (shipStatus.equals("full")) {
      this.ready = true;
    } else {
      this.ready = false;
    }
  }

  @Override
  public String toString() {
    return "Ship{" +
        "caliber25=" + caliber25 +
        ", caliber30=" + caliber30 +
        ", caliber50=" + caliber50 +
        ", shipStatus='" + shipStatus + '\'' +
        ", ready=" + ready +
        '}';
  }
}
