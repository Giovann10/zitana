import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
    
    // You can use the Scanner class
    // It should work like this:
    
    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    String[] expression = new String[3];
    ArrayList<String> operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
    System.out.println("Please type in the expression:");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    expression = input.split(" ");
    
    if (calculate(expression) == 0000) {
      System.out.println("Please enter a valid expression(operations operand1 operand2)");
    } else {
      System.out.println(calculate(expression));
    }
  
  }
  
  public static int calculate(String[] expression) {
    int a = Integer.parseInt(expression[1]);
    int b = Integer.parseInt(expression[2]);
  
    if (expression[0].equals("+")) {
      return a + b;
    } else if (expression[0].equals("-")) {
      return a - b;
    } else if (expression[0].equals("*")) {
      return a * b;
    } else if (expression[0].equals("/")) {
      return a / b;
    } else if (expression[0].equals("%")) {
      return a % b;
    } else {
      return 0000;
    }
  }
}
