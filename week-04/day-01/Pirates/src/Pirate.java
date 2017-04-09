public class Pirate {
  private int drunkennessLevel;
  private boolean isAlive;
  
  public void setDrunkennessLevel(int drunkennessLevel) {
    this.drunkennessLevel = drunkennessLevel;
  }
  
  public void setAlive(boolean alive) {
    isAlive = alive;
  }
  
  public int getDrunkennessLevel() {
    return drunkennessLevel;
  }
  
  public boolean isAlive() {
    return isAlive;
  }
  
  public void drinkSomeRum() {
    if (this.isAlive) {
      this.drunkennessLevel += 1;
    } else {
      System.out.println("He's dead");
    }
  }
  
  public void howsItGoingMate() {
    if (this.isAlive) {
      if (this.drunkennessLevel < 5) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.drunkennessLevel = 0;
      }
    } else {
      System.out.println("He's dead");
    }
  }
  
  public void die() {
    this.isAlive = false;
  }
  
  public void brawl(Pirate pirateToFight) {
    int outcome = (int)(Math.random() * 3);
    if (outcome == 1) {
      this.die();
    } else if (outcome == 2) {
      pirateToFight.die();
    } else {
      this.drunkennessLevel = 0;
      pirateToFight.drunkennessLevel = 0;
    }
  }
  
  public boolean isPassedOut() {
    return this.getDrunkennessLevel() == 0;
  }
  
  public Pirate() {
    this.isAlive = true;
    this.drunkennessLevel = 1;
  }
}
