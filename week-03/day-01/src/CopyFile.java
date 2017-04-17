import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("duplicated-chars.txt", "my-file.txt"));
  }
  
  public static boolean copyFile(String copyFrom, String copyTo) {
    String success = "Copy was successful";
    try {
      Path oldFile = Paths.get(copyFrom);
      List<String> content = Files.readAllLines(oldFile);
      Path newFile = Paths.get(copyTo);
      Files.write(newFile, content);
    } catch (IOException e) {
      success = "Copy failed";
    }
    return success.equals("Copy was successful");
  }
}
