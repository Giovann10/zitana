import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }
  
  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if  (b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }
  
  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      return ((double) pool.get(pool.size() / 2) + (double) pool.get(pool.size() / 2 - 1)) / 2;
    } else {
      return (double) pool.get((pool.size() - 1) / 2);
    }
  }
  
  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'á', 'é', 'í', 'ö', 'ő', 'ü', 'ű').contains(c);
  }
  
  String translate(String hungarian) {
    if (hungarian.length() == 0) {
      return "";
    } else if (isVowel(hungarian.charAt(0))) {
      return hungarian.charAt(0) + "v" + hungarian.charAt(0)+ translate(hungarian.substring(1));
    } else {
      return hungarian.charAt(0) + translate(hungarian.substring(1));
    }
  }
  
}
