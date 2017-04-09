package airspace;

import java.util.ArrayList;

public class Carrier {
  
  ArrayList<Aircraft> aircrafts = new ArrayList<>();
  int carrierAmmo;
  int healthPoint;
  
  public Carrier(int carrierAmmo) {
    this.carrierAmmo = carrierAmmo;
    aircrafts = new ArrayList<Aircraft>();
  }
  
  public void addAircraft(String type) {
    try {
      if (type.equals("F16")) {
        Aircraft tempAircraft = new F16();
        aircrafts.add(tempAircraft);
      } else if (type.equals("F35")) {
        Aircraft tempAircraft = new F35();
        aircrafts.add(tempAircraft);
      } else {
        throw new IllegalArgumentException();
      }
    } catch (Exception ex) {
      System.err.println("Invalid aircraft type");
    }
  }
  
  public void fill() {
    try {

      if(carrierAmmo <= 0) {
        throw new Exception();
      } else {
          for (Aircraft a : aircrafts) {
            if (a.getType().equals("F35") && carrierAmmo > 0) {
              carrierAmmo = a.refill(carrierAmmo);
            } else if (a.getType().equals("F16") && carrierAmmo > 0) {
              carrierAmmo = a.refill(carrierAmmo);
            } else {
                throw new Exception();
            }
          }
      }
    } catch (Exception e) {
      System.out.println("No ammo");
    }
  }
  
}
