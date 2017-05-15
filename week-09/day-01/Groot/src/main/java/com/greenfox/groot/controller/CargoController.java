package com.greenfox.groot.controller;

import com.greenfox.groot.model.Cargo;
import com.greenfox.groot.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {

  @Autowired
  Ship rocket;

  @RequestMapping(value = "/rocket",  method = RequestMethod.GET)
  public Ship rocket() {
    return rocket;
  }

  @RequestMapping(value = "/rocket/fill",  method = RequestMethod.GET)
  public Cargo cargo(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {
    Cargo cargo = new Cargo(caliber, amount);
    rocket.fillShip(cargo);
    cargo.setShipstatus(rocket.getShipStatus());
    cargo.setReady(rocket.isReady());
    return cargo;
  }

}
