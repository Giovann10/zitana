public class Skeleton extends Character {
  // HP: 2 * x * d6
  //  DP: x/2 * d6
  //  SP: x * d6
  
  boolean hasKey;
  
  Skeleton(int level, boolean hasKey) {
    super(2 * level * ((int)((Math.random() * 6)) + 1), level/2 * ((int)((Math.random() * 6)) + 1), level * ((int)((Math.random() * 6)) + 1));
    this.hasKey = true;
  }
  
//  int[][] skeletonCoord = new int[3][2];
//
//  public void putRandomSkeleton() {
//    for (int i = 0; i < skeletonCoord.length; i++) {
//      int x = (int) (Math.random() * 10);
//      int y = (int) (Math.random() * 11);
//
//      if (map[x][y] == 0) {
//        skeletonCoord[i][0] = x * 72;
//        skeletonCoord[i][1] = y * 72;
//      }
//    }
//
//  }
}
