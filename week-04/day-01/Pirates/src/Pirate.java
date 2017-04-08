public class Pirate {
  int drunkennessLevel;
  boolean isPassedOut;
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
  
  private void brawl() {
    
  }
  
  private Pirate() {
  
  }
  
}
