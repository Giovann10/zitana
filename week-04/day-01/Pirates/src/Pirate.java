public class Pirate {
  int drunkennessLevel;
  boolean isAlive;
  
  private void drinkSomeRum() {
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
  
  private void die() {
    this.isAlive = false;
  }
  
  private void brawl(Pirate pirateToFight) {
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
  
  private Pirate() {
    this.isAlive = true;
    this.drunkennessLevel = 0;
  }
  
}
