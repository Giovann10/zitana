import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class CountFromTo {
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Enter another number:");
    int b = scanner.nextInt();
  
    if (a >= b) {
      System.out.println("The second number should be bigger.");
    } else {
      for (int i = a; i < b; i++) {
        System.out.println(i);
      }
    }
  }
}