public class Hero extends Character {
//  HP: 20 + 3 * d6
//  DP: 2 * d6
//  SP: 5 + d6
  
  Hero(Map map) {
    super(20 + 3 * ((int)((Math.random() * 6)) + 1), 2 * ((int)((Math.random() * 6)) + 1), 5 + ((int)((Math.random() * 6)) + 1));
    this.setPosX(0);
    this.setPosY(0);
    this.setCostume("hero-down.png");
    this.setMap(map);
  }
  
  @Override
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
  
  public void levelUp() {
    this.setMaxHP(this.getMaxHP() + ((int)((Math.random() * 6)) + 1));
    this.setDP(this.getDP() + ((int)((Math.random() * 6)) + 1));
    this.setSP(this.getSP() + ((int)((Math.random() * 6)) + 1));
    this.setLevel(this.getLevel() + 1);
  }
  
  
}
