import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class MileToKmConverter {
  public static void main(String[] args) {
    System.out.println("Please enter the number of kilometers:");
    Scanner scanner = new Scanner(System.in);
    int kilometers = scanner.nextInt();
    System.out.println(kilometers + "Kms is " + (kilometers * 0.621) + " miles.");
  }
}
