import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
  
    for (int i = 0; i < n; i++) {
      System.out.println();
      if (i == 0 || i == n-1) {
        for (int j = 0; j < n; j++) {
          System.out.print("%");
        }
      } else {
        for (int k = 0; k < n; k++) {
          if (k == 0 || k == n-1 || i ==k) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
          }
        }
      }
    }
  }