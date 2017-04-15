import java.util.ArrayList;
import java.util.List;

public class Map {
  List<GameObject> gameObjects;
  ArrayList<Character> monsters;
  
  private int[][] mapArray = {
          {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
          {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
          {0, 0, 1, 0, 1, 0, 0, 0, 1, 0},
          {1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
          {0, 0, 0, 0, 1, 0, 1, 1, 0, 1},
          {0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
          {0, 1, 1, 0, 1, 1, 1, 1, 1, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  };
  
  Map() {
    gameObjects = new ArrayList<>();
    monsters = new ArrayList<>();
    
    for (int i = 0; i < mapArray.length; i++) {
      for (int j = 0; j < mapArray[i].length; j++) {
        if (mapArray[i][j] == 0) {
          gameObjects.add(new Tile(i, j, "floor.png"));
        } else {
          gameObjects.add(new Tile(i, j, "wall.png"));
        }
      }
    }
  }
  
  public boolean isThereWall(int x, int y) {
    return mapArray[x][y] == 1;
  }
  
  public int[] getRandomFreeCoordinate() {
    int[] coordinates = new int[2];
    
    int x = (int) (Math.random() * 10);
    int y = (int) (Math.random() * 10);
  
    while (x == 0 && y == 0 || isThereWall(x, y)) {
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
      }
    coordinates[0] = x;
    coordinates[1] = y;
    return coordinates;
  }
  
  
  
}
