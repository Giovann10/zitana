public class StringsAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(removeX("xGREENxxFOXx"));
  }
  public static String removeX (String input) {
    if (input.length() == 0) {
      return "";
    } else if (input.charAt(0) == 'x') {
      return "" + removeX(input.substring(1));
    } else {
      return input.charAt(0) + removeX(input.substring(1));
    }
  }
}
