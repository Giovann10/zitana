import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    Path filePath = Paths.get("reversed-lines.txt");
  
    try {
      List<String> lines = Files.readAllLines(filePath);
      listPrinter(reverseChar(lines));
      System.out.println("\n");
      System.out.println(reverse(lines));
    } catch (IOException e) {
      System.out.println("couldn't read file");
    }
    
  }
  
  public static List<String> reverseChar(List<String> lines) {
    List<String> rightOrder = new ArrayList<>();
    
    for (String line : lines) {
      String reversedString = "";
      for(int i = line.toCharArray().length - 1; i  >= 0; i--) {
        reversedString += line.toCharArray()[i];
      }
      rightOrder.add(reversedString);
    }
    return rightOrder;
  }
  
  public static StringBuilder reverse(List<String> lines) {
    StringBuilder rightOrder = new StringBuilder();
    
    for (String line : lines) {
      for(int i = line.toCharArray().length - 1; i  >= 0; i--) {
        rightOrder.append(line.toCharArray()[i]);
      }
      rightOrder.append("\n");
    }
    return rightOrder;
  }
  
  public static void listPrinter(List<String> lines) {
    for (String row : lines) {
      System.out.println(row);
    }
  }
  
}
