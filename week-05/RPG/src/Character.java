public class Character extends GameObject{
  private int maxHP;
  private int currentHP;
  private int DP;
  private int SP;
  private int level;
  private Map map;
  
  public Character(int maxHP, int DP, int SP) {
    this.maxHP = maxHP;
    this.currentHP = maxHP;
    this.DP = DP;
    this.SP = SP;
    this.level = 1;
  }
  
  Character() {
  
  }
  
  public void moveUp() {
    setCostume("hero-up.png");
    if (getPosY() > 0 && !map.isThereWall(getPosX(),getPosY() - 1)) {
      this.setPosY(this.getPosY() - 1);
    }
  }
  
  public void moveDown() {
    setCostume("hero-down.png");
    if (getPosY() < 9) {
      if (!map.isThereWall(getPosX(), getPosY() + 1)) {
        this.setPosY(this.getPosY() + 1);
      }
    }
  }
  
  public void moveLeft() {
    setCostume("hero-left.png");
    if (getPosX() > 0) {
      if (!map.isThereWall(getPosX() - 1, getPosY())) {
        this.setPosX(this.getPosX() - 1);
      }
    }
  }
  
  public void moveRight() {
    setCostume("hero-right.png");
    if (getPosX() < 9) {
      if (!map.isThereWall(getPosX() + 1, getPosY())) {
        this.setPosX(this.getPosX() + 1);
      }
    }
  }
  
  public void setMap(Map map) {
    this.map = map;
  }
  
  @Override
  public String toString() {
    return this.getClass().getSimpleName() +
            "(level " + level +") " +
            "HP: " + currentHP + "/" + maxHP +
            " | DP: " + DP +
            " | SP: " + SP;
  }
}
