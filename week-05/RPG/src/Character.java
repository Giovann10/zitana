import java.util.ArrayList;

public class Character extends GameObject{
  private int maxHP;
  private int currentHP;
  private int DP;
  private int SP;
  private int level;
  public Map map;
  
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
    if (getPosY() > 0 && !map.isThereWall(getPosX(),getPosY() - 1)) {
      this.setPosY(this.getPosY() - 1);
    }
  }
  
  public void moveDown() {
    if (getPosY() < 9 && !map.isThereWall(getPosX(), getPosY() + 1)) {
        this.setPosY(this.getPosY() + 1);
    }
  }
  
  public void moveLeft() {
    if (getPosX() > 0 && !map.isThereWall(getPosX() - 1, getPosY())) {
        this.setPosX(this.getPosX() - 1);
    }
  }
  
  public void moveRight() {
    if (getPosX() < 9 && !map.isThereWall(getPosX() + 1, getPosY())) {
        this.setPosX(this.getPosX() + 1);
    }
  }
  
  public void strike(Character opponent) {
    int SV = this.getSP() + (2 * ((int)((Math.random() * 6)) + 1));
    if (SV > opponent.getDP()) {
      opponent.setCurrentHP(opponent.getCurrentHP() - (SV - opponent.getDP()));
    }
 }
 
 public int[] getPosition() {
    int[] position = new int[2];
    position[0] = this.getPosX();
    position[1] = this.getPosY();
    return position;
 }
  
  public int getMaxHP() {
    return maxHP;
  }
  
  public void setMaxHP(int maxHP) {
    this.maxHP = maxHP;
  }
  
  public int getCurrentHP() {
    return currentHP;
  }
  
  public void setCurrentHP(int currentHP) {
    this.currentHP = currentHP;
  }
  
  public int getDP() {
    return DP;
  }
  
  public void setDP(int DP) {
    this.DP = DP;
  }
  
  public int getSP() {
    return SP;
  }
  
  public void setSP(int SP) {
    this.SP = SP;
  }
  
  public int getLevel() {
    return level;
  }
  
  public void setLevel(int level) {
    this.level = level;
  }
  
  public void setMap(Map map) {
    this.map = map;
  }
  
  
  
  @Override
  public String toString() {
    return this.getClass().getSimpleName() +
            "(level " + level + ") " +
            "HP: " + currentHP + "/" + maxHP +
            " | DP: " + DP +
            " | SP: " + SP;
  }
}
