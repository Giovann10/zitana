public class Character extends GameObject{
  private int maxHP;
  private int currentHP;
  private int DP;
  private int SP;
//  private boolean isAlive; metodus legyen
  private int level;
  
  
  Character(int maxHP, int DP, int SP) {
    this.maxHP = maxHP;
    this.currentHP = maxHP;
    this.DP = DP;
    this.SP = SP;
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
