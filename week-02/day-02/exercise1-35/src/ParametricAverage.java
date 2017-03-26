import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    System.out.println("This program calculates the sum and average of some numbers.\nHow many numbers do you want to enter?");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int sum = 0;
    
    for (int i = 0 ; i <n ; i++) {
      System.out.println("Enter a number:");
      sum += scanner.nextInt();
    }
    
    System.out.println("Sum: " + sum + ", Average: " + (double)sum/n);
  }
}
