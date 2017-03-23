import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    System.out.println("This program checks if two words are anagrams.\nPlease enter the first word:");
    Scanner scanner = new Scanner(System.in);
    String firstWord = scanner.nextLine();
    System.out.println("Please enter the second word:");
    String secondWord = scanner.nextLine();
  
    System.out.println("The two words are anagrams: " + isAnagram(firstWord , secondWord));
    
  }
  
  public static boolean isAnagram (String s1 , String s2){
    char[] s1Array = s1.toLowerCase().toCharArray();
    char[] s2Array = s2.toLowerCase().toCharArray();
    
    Arrays.sort(s1Array);
    Arrays.sort(s2Array);
  
    return Arrays.equals(s1Array , s2Array);
  }
}
