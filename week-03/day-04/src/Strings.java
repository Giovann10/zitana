public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeXY("yyXXxxyxXxx"));
  }
  public static String changeXY (String input) {
    if (! input.contains("x")) {
      return input;
    } else {
      return changeXY(input.replace("x" , "y"));
    }
  }
}
