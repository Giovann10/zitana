import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class AnimalsAndLegs {
  public static void main(String[] args) {
    System.out.println("Number of chickens: ");
    Scanner scanner = new Scanner(System.in);
    int chickens = scanner.nextInt();
    System.out.println("Number of pigs: ");
    int pigs = scanner.nextInt();
    System.out.println("Number of legs: " + (2 * chickens + 4 * pigs));
  }
}
