import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  
  public static void main(String[] args) {
    writeMultipleLines("my-file.txt", "alma", 5);
  }
  
  public static void writeMultipleLines(String filePath, String word, int number) {
    List<String> content = new ArrayList<>();
    try {
      Path file = Paths.get(filePath);
      for (int i = 0; i < number; i++) {
        content.add(word);
      }
      Files.write(file, content);
    } catch (IOException e) {
      System.out.println("");
    }
  }
}

