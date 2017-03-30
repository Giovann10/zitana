public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(removeX("xGREENxxFOXx"));
  }
  public static String removeX (String input) {
    if (! input.contains("x")) {
      return input;
    } else {
      return removeX(input.replace("x", ""));
    }
  }
}
