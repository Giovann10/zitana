public class Skeleton extends Character {
  // HP: 2 * x * d6
  //  DP: x/2 * d6
  //  SP: x * d6
  
  boolean hasKey;
  
  Skeleton(int level, boolean hasKey, int posX, int posY) {
    super(2 * level * ((int) ((Math.random() * 6)) + 1), level / 2 * ((int) ((Math.random() * 6)) + 1), level * ((int) ((Math.random() * 6)) + 1));
    this.setPosX(posX);
    this.setPosY(posY);
    this.hasKey = hasKey;
    setCostume("skeleton.png");
  }

}
