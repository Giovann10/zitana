import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    int a = 253;
  
    System.out.println("Guess my number:");
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();
    
    while (a != guess) {
      if (guess > a) {
        System.out.println("The stored number is lower");
      } else {
        System.out.println("The stored number is higher");
      }
      guess = scanner.nextInt();
    }
    System.out.println("You found the number: " + a);
  }
}
