import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotto {
  public static void main(String[] args) {
    Path filePath = Paths.get("otos.csv");
    try {
      List<String> lines = Files.readAllLines(filePath);
      Map<String, Integer> lotto =new HashMap<>();
      
      for (String row : lines ) {
        List<String> rows = Arrays.asList(row.split(";"));
        for (int i = 11; i < rows.size(); i++) {
          if (lotto.containsKey(rows.get(i))) {
            rows.get(i);
            lotto.put(rows.get(i), lotto.get(rows.get(i))+1);
          } else {
            lotto.put(rows.get(i), 1);
          }
        }
      }
      System.out.println(lotto);
  
      int high5 = 0;
      
      while (high5 <5) {
        System.out.println(findHighest(lotto));
        high5++;
      }
      
      
    } catch (IOException e) {
      System.out.println("An error happened");
    }
  }
  
  public static String findHighest (Map<String, Integer> lotto){
  
    String maxKey = null;
    Integer maxValue = null;
  
    for (String key : lotto.keySet()) {
      if (maxKey == null) {
        maxKey = key;
      }
    
      if (maxValue == null) {
        maxValue = lotto.get(key);
      }
    
      if (maxValue < lotto.get(key)) {
        maxValue = lotto.get(key);
        maxKey = key;
      }
    }
    lotto.remove(maxKey, maxValue);
    return(maxKey);
  }
}
