import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
      
  }
}
