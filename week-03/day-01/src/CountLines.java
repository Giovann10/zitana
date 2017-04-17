import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    
    System.out.println(countLines("reversed-order.txt"));
  
  }
  
  public static int countLines(String filename) {
    Path filePath = Paths.get(filename);
    
    try {
      List<String> lines = Files.readAllLines(filePath);
      return lines.size();
    } catch (IOException e) {
      return 0;
    }
  }
}
