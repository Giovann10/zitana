import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    Path filePath = Paths.get("duplicated-chars.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      printer(removeDoubledChar(lines));
    } catch (IOException e) {
      System.out.println("Couldn't read/initialize file");
    }
  }
  
  public static List<String> removeDoubledChar (List<String> doubleLines) {
    List<String> simpleChar = new ArrayList<>();
    for (String row : doubleLines) {
      String toAdd = "";
      char[] charLines = row.toCharArray();
      for (int i = 0; i < charLines.length; i += 2) {
        toAdd += charLines[i];
      }
      simpleChar.add(toAdd);
    }
    return simpleChar;
  }
  
  public static void printer (List<String> linesToPrint) {
    for (String row : linesToPrint) {
      System.out.println(row);
    }
  }
}