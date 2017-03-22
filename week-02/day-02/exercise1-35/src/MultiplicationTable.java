import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 22..
 */
public class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    
    for (int i = 1 ; i < 11 ; i++) {
      System.out.println(i + " * " + a + " = " + (a*i));
    }
  }
}
