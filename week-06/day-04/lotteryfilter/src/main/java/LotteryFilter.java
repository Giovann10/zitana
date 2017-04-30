import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LotteryFilter {

  public static void main(String[] args) {

    try {
      readFile("otos.csv");
    } catch (IOException e) {
      System.out.println("File could not be read");
    }

  }

  public static void initialise(String[] args) {

  }

  public static List<String[]> readFile(String fileName) throws IOException{
    CSVReader reader = new CSVReader(new FileReader(fileName), ';');
    return reader.readAll();
  }

  public void writeFile(String fileName, List<String> lines) throws IOException {
    CSVWriter writer = new CSVWriter(new FileWriter(fileName), ';',
        CSVWriter.NO_QUOTE_CHARACTER);
    writer.writeAll(lines);
    writer.close();
  }
}
