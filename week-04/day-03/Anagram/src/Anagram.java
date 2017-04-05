import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  Anagram() {
  
  }
  
  public static boolean isAnagram (String s1 , String s2){
    char[] s1Array = s1.toLowerCase().toCharArray();
    char[] s2Array = s2.toLowerCase().toCharArray();
    
    Arrays.sort(s1Array);
    Arrays.sort(s2Array);
    
    return Arrays.equals(s1Array , s2Array);
  }
}

