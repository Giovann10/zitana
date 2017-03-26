import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 26..
 */
public class Sum {
  public static void main(String[] args) {
    System.out.println("This program adds all the numbers until a given parameter.\nEnter a number:");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
  
    System.out.println(sum(input));
  }
  
  public static int sum (int parameter) {
    int sum = 0;
    for (int i = 0; i < parameter + 1 ; i++) {
      sum += i;
    }
    return sum;
  }
}
