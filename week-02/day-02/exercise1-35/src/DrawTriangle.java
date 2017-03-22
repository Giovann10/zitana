import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 22..
 */
public class DrawTriangle {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    
    for (int i = 1 ; i < (a+1) ; i++) {
      for (int j = 1 ; j < (i+1) ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
