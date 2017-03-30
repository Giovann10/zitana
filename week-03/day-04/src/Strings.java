public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeXY("yyXXxxyxXxx"));
  }
  public static String changeXY (String input) {
    if ( input.length() == 0){
      return "";
    } else if (input.charAt(0) == 'x') {
      return 'y' + (changeXY(input.substring(1)));
    } else {
      return input.charAt(0) + (changeXY(input.substring(1)));
    }
  }
}
