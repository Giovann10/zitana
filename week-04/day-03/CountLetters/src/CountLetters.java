import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  CountLetters() {
  
  }
  
  public Map<String, Integer> makeDictionary(String words) {
    Map<String, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < words.length(); i++) {
      if (dictionary.containsKey(words.substring(i, i + 1))) {
        words.substring(i, i + 1);
        dictionary.put(words.substring(i, i + 1), dictionary.get(words.substring(i, i + 1)) + 1);
      } else {
        dictionary.put(words.substring(i, i + 1), 1);
      }
    }
    return dictionary;
  }
  
  public static void main(String[] args) {
    CountLetters countLetters = new CountLetters();
    System.out.println(countLetters.makeDictionary("abbcccdddd"));
    
  }
}
