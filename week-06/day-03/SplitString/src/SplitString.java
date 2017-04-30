import java.util.ArrayList;

public class SplitString {

  public static void main(String[] args) {
    System.out.println(splitString("lovebarbara", 15));
  }

  public static ArrayList<String> splitString(String whatToSplit, int whereToSplit) {
    ArrayList<String> splitString = new ArrayList<>();
    try {
      splitString.add(whatToSplit.substring(0, whereToSplit));
      splitString.add(whatToSplit.substring(whereToSplit, whatToSplit.length()));
      System.out.println(whatToSplit.length());
    } catch (IndexOutOfBoundsException e) {
      System.out.println("index is out of bounds");
    }
    return splitString;
  }

}
