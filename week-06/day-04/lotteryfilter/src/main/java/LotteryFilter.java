import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class LotteryFilter {

  private static String source = "otos.csv";
  private static String destination = "output.csv";

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();

    OptionSet options = parser.parse(args);

    if (options.has("y")) {
      if (options.has("f")) {
        source = options.valueOf("f").toString();
      }
      if (options.has("o")) {
        destination = options.valueOf("o").toString();
      }
      try {
        writeFile(destination, filterByYear(options.valueOf("y").toString(), readFile(source)));
        System.out.println("copy data from year " + options.has("y") + " from " + source + " to " + destination);
      } catch (IOException e) {
        System.out.println("File could not be read");
      }
    } else {
      System.out.println("Please include the year to filter");
    }

  }

  public static List<String[]> readFile(String fileName) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(fileName), ';');
    return reader.readAll();
  }

  public static void writeFile(String fileName, List<String[]> lines) throws IOException {
    CSVWriter writer = new CSVWriter(new FileWriter(fileName), ';', CSVWriter.NO_QUOTE_CHARACTER);
    writer.writeAll(lines);
    writer.close();
  }

  public static List<String[]> filterByYear(String year, List<String[]> lines) {
    List<String[]> filteredLines = new ArrayList<>();
    for (String[] line : lines) {
      if (line[0].equals(year)) {
        filteredLines.add(line);
      }
    }
    return filteredLines;
  }
}
