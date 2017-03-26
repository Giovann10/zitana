public class DrawChessTable {
  public static void main(String[] args) {
    int a = 8;
    
    for (int i=0; i <a; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < a/2; j++) {
          System.out.print("% ");
        }
      }else {
        for (int k = 0 ; k < a/2; k++) {
          System.out.print(" %");
        }
      }
      System.out.println();
    }
  }
}
