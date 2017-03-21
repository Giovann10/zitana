import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class PrintBigger {
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("Enter another number:");
    int b = scanner.nextInt();
    
    if (a > b) {
      System.out.println(a + " is bigger.");
    }
    else if (a < b) {
      System.out.println(b + "is bigger.");
    }
    else {
      System.out.println("These numbers are even.");
    }
  }
}
