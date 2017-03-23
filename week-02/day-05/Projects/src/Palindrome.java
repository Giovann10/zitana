import java.util.Scanner;

public class Palindrome {
  public static void main(String... args) {
    System.out.println("This program creates palindromes\nPlease enter a word:");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
  
    System.out.println(createPalindrome(input));
  }
  
  public static String createPalindrome (String input) {
    String reversed = ("");

    for ( int i = input.length() - 1 ; i >= 0 ; i-- ) {
      reversed += (input.charAt(i));
    }
    return(input+reversed);
  }
}