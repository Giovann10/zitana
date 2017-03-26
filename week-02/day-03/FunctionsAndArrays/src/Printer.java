import java.util.Scanner;

public class Printer {
  public static void main(String[] args) {
    System.out.println("This program prints your introduction.\nWhat is your name?");
    Scanner scanner = new Scanner(System.in);
    String input1 = "Hi! My name is " + scanner.nextLine();
    System.out.println("How old are you?");
    String input2 = ". I am " + scanner.nextLine() + " years old and ";
    System.out.println("Where do you live?");
    String input3 = "I live in " + scanner.nextLine();
    System.out.println("Where did you learn programming?");
    String input4 = ". I learned how to code at " + scanner.nextLine();
    System.out.println("What is your favorite programming language?");
    String input5 = ". My favorite language is "+ scanner.nextLine() + " <3";
  
    printer(input1, input2, input3, input4, input5);
  
  }
  
  public static void printer(String... input) {
    for (String i : input) {
      System.out.print(i);
    }
  }
}
