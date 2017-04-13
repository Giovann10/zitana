public class Boss extends Character {
  // HP: 2 * x * d6 (+d6)
  //  DP: x/2 * d6 (+d6/2)
  //  SP: x * d6 (+x)
  
  Boss(int level, int posX, int posY) {
    super(2 * level * ((int)((Math.random() * 6)) + 1) + ((int)((Math.random() * 6)) + 1), level /2 * ((int)((Math.random() * 6)) + 1) + ((int)((Math.random() * 6)) + 1) / 2, level * ((int)((Math.random() * 6)) + 1) + level);
    this.setPosX(posX);
    this.setPosY(posY);
    setCostume("boss.png");
  }
}
