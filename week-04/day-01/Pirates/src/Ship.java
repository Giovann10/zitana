import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> ship = new ArrayList<>();
  
  public void fillShip() {
    Pirate captain = new Captain();
    ship.add(captain);
    int crewNumber = (int) (Math.random() * 20);
    for (int i = 0; i < crewNumber; i++) {
      Pirate pirate = new Pirate();
      ship.add(pirate);
    }
  }
  
  public int piratesAlive() {
    int numberOfPiratesAlive = 0;
    for (Pirate pirate : ship) {
      if (pirate.isAlive()) {
        numberOfPiratesAlive++;
      }
    } return numberOfPiratesAlive;
  }
  
  Ship() {
  
  }
  
  @Override
  public String toString() {
    return "The captain has a drunkenness level of " + ship.get(0).getDrunkennessLevel()
            + "Is he alive: " + ship.get(0).isAlive()
            + " Is he passed out: " + ship.get(0).isPassedOut()
            + "Number of pirates alive: ";
  }
}
