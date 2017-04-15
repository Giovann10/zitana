public class Boss extends Character {
  
  Boss(int level, int posX, int posY, Map map) {
    super(2 * level * ((int)((Math.random() * 6)) + 1) + ((int)((Math.random() * 6)) + 1), level / 2 * ((int)((Math.random() * 6)) + 1) + ((int)((Math.random() * 6)) + 1) / 2, level * ((int)((Math.random() * 6)) + 1) + level);
    this.setPosX(posX);
    this.setPosY(posY);
    this.setMap(map);
    this.setLevel(level);
    setCostume("boss.png");
  }
}
