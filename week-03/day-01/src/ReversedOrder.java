import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    Path filePath = Paths.get("reversed-order.txt");
  
    try {
      List<String> lines = Files.readAllLines(filePath);
      printer(reverseOrder(lines));
    } catch (IOException e) {
      System.out.println("couldn't read file");
    }
  }
  
  public static List<String> reverseOrder(List<String> lines) {
    List<String> rightOrder = new ArrayList<>();
    
    for (int i = lines.size() - 1; i >= 0; i--) {
      rightOrder.add(lines.get(i));
    }
    return rightOrder;
  }
  
  public static void printer (List<String> linesToPrint) {
    for (String row : linesToPrint) {
      System.out.println(row);
    }
  }
  
}
