public class Tile extends GameObject {
  boolean isWall;
  
  Tile(int posX, int posY, String costume) {
    super(posX, posY, costume);
    isWall = costume.equals("wall.png");
  }
  
}
