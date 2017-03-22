import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 22..
 */
public class DrawDiamond {
  public static void main(String[] args) {
    System.out.println("Enter an odd number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
  
    for (int i = 0; i < n / 2 + 1; i++) {
      for (int j = 0; j < n / 2 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  
  
    for (int i = n/2 ; i > 0; i--) {
      for (int j = n/2 - i + 1; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = (i * 2) - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
