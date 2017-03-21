import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class AverageOfInput {
  public static void main(String[] args) {
    System.out.println("This program will calculate the average and the sum of 5 integers \n Please enter the first integer:");
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();
    System.out.println("Enter the second integer:");
    int second = scanner.nextInt();
    System.out.println("Enter the third integer:");
    int third = scanner.nextInt();
    System.out.println("Enter the fourth integer:");
    int fourth = scanner.nextInt();
    System.out.println("Enter the fifth integer:");
    int fifth = scanner.nextInt();
  
    int sum = (first + second + third + fourth + fifth);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (double) + (sum/5));
  }
}
