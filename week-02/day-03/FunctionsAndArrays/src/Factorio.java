import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 26..
 */
public class Factorio {
  public static void main(String[] args) {
    System.out.println("This program calculates the factorial of a given number.\nEnter a number:");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
  
    System.out.println(factorio(input));
  }
  
  public static int factorio (int number) {
    int factorial = 1;
    for (int i = number; i > 0; i--) {
      factorial *= i;
    }
    return factorial;
  }
}
