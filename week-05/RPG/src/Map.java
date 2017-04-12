import java.util.ArrayList;
import java.util.List;

public class Map {
  List<GameObject> gameObjects;

  private int[][] mapArray = {
          {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
          {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
          {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0},
          {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
          {0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0},
          {0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  };
  
  Map() {
    gameObjects = new ArrayList<>();
   // hero = new Hero();
    
    for (int i = 0; i < mapArray.length; i++) {
      for (int j = 0; j < mapArray[i].length; j++) {
        if (mapArray[i][j] == 0) {
          gameObjects.add(new Tile(i,j, "floor.png"));
        } else {
          gameObjects.add(new Tile(i,j, "wall.png"));
        }
      }
    }
 //   gameObjects.add(hero);
//    gameObjects.add(new Skeleton(1, false));
//    gameObjects.add(new Skeleton(1, false));
//    gameObjects.add(new Skeleton(1, true));
  }
  
  public boolean isThereWall(int x,int y){
    return mapArray[x][y] == 1;
  }
  
}
