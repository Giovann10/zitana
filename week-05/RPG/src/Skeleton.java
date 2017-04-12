public class Skeleton extends Character {
  // HP: 2 * x * d6
  //  DP: x/2 * d6
  //  SP: x * d6
  
  boolean hasKey;
  
  Skeleton(int level, boolean hasKey, Map map) {
    super(2 * level * ((int) ((Math.random() * 6)) + 1), level / 2 * ((int) ((Math.random() * 6)) + 1), level * ((int) ((Math.random() * 6)) + 1));
    this.hasKey = true;
    this.placeRandomSkeleton(map);
    setCostume("skeleton.png");
  }
  
  public void placeRandomSkeleton(Map map) {
    int x = (int) (Math.random() * 10);
    int y = (int) (Math.random() * 11);
    
    while (this.getPosX() == 0 && this.getPosY() == 0) {
      if (!map.isThereWall(x, y)) {
        setPosX(x);
        setPosY(y);
      } else {
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 11);
      }
    }
  }
}
