import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 22..
 */
public class DrawPyramid {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0 ; i < n ; i++) {
      for (int j = 0 ; j < n-i-1;  j++) {
        System.out.print(" ");
      }
      for (int k =0; k < i*2+1; k++ ) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
