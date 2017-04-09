import org.junit.Test;

import static org.junit.Assert.*;

public class PirateTest {
  
  @Test
  public void isAlive_dead() throws Exception {
    Pirate jackThePirate = new Pirate();
    jackThePirate.die();
    assertFalse(jackThePirate.isAlive());
  }
  
  @Test
  public void isAlive_alive() throws Exception {
    Pirate jackThePirate = new Pirate();
    assertTrue(jackThePirate.isAlive());
  }
  
  @Test
  public void drinkSomeRum() throws Exception {
    Pirate jackThePirate = new Pirate();
    jackThePirate.drinkSomeRum();
    assertEquals(1, jackThePirate.getDrunkennessLevel());
  }
  
  @Test
  public void howsItGoingMate_rumLevel_5() throws Exception {
    Pirate jackThePirate = new Pirate();
    jackThePirate.setDrunkennessLevel(5);
    jackThePirate.howsItGoingMate();
    assertEquals(0, jackThePirate.getDrunkennessLevel());
  }
  
  @Test
  public void howsItGoingMate_rumLevel_4() throws Exception {
    Pirate jackThePirate = new Pirate();
    jackThePirate.setDrunkennessLevel(4);
    jackThePirate.howsItGoingMate();
    assertEquals(4, jackThePirate.getDrunkennessLevel());
  }
  
  @Test
  public void die() throws Exception {
    Pirate jackThePirate = new Pirate();
    jackThePirate.die();
    assertFalse(jackThePirate.isAlive());
  }
  
  @Test
  public void brawl() throws Exception {
    Pirate jackThePirate = new Pirate();
    Pirate joeThePirate = new Pirate();
    joeThePirate.brawl(jackThePirate);
    assertFalse(jackThePirate.isAlive());
  }
  
}