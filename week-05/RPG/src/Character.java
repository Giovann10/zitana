public class Character extends GameObject{
  private int maxHP;
  private int currentHP;
  private int DP;
  private int SP;
  private int level;
  private Map map;
  
  
  Character(int maxHP, int DP, int SP) {
    this.maxHP = maxHP;
    this.currentHP = maxHP;
    this.DP = DP;
    this.SP = SP;
  }
  
  Character(int maxHP, int DP, int SP, Map map) {
    this.maxHP = maxHP;
    this.currentHP = maxHP;
    this.DP = DP;
    this.SP = SP;
    this.map = map;
  }
  
  Character() {
  
  }
  
  public void moveUp() {
    this.setPosY(this.getPosY() - 1);
  }
  
  public void moveDown() {
    this.setPosY(this.getPosY() + 1);
  }
  
  public void moveLeft() {
    this.setPosX(this.getPosX() - 1);
  }
  
  public void moveRight() {
    this.setPosX(this.getPosX() + 1);
  }
  
}
