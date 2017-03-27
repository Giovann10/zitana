import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    Path filePath = Paths.get("duplicated-chars.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      
      List<String> simpleChar = new ArrayList<String>();
  
      for (String row : lines) {
        String toAdd = "";
        char [] charLines = row.toCharArray();
          for (int i= 0 ; i < charLines.length; i += 2) {
            toAdd += charLines[i];
          }
        System.out.println(toAdd);
        simpleChar.add(toAdd);
      }
      System.out.println(simpleChar);
  
  
    } catch (IOException e) {
      System.out.println("error");
    }
  }
}
