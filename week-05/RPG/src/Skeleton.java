public class Skeleton extends Character {
  private boolean hasKey;
  
  Skeleton(int level, boolean hasKey, int posX, int posY, Map map) {
    super(2 * level * ((int) ((Math.random() * 6)) + 1), level / 2 * ((int) ((Math.random() * 6)) + 1), level * ((int) ((Math.random() * 6)) + 1));
    this.setPosX(posX);
    this.setPosY(posY);
    this.hasKey = hasKey;
    this.setMap(map);
    this.setLevel(level);
    this.setCostume("skeleton.png");
  }

}
