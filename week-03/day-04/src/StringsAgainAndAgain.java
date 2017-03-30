public class StringsAgainAndAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    System.out.println(separate("greenfox"));
  }
  public static String separate (String input) {
    
    if (input.length() == 0) {
      return "";
    } else if ( input.length() == 1) {
      return input.charAt(0) + separate(input.substring(1));
    } else {
      return input.charAt(0) + "*" + separate(input.substring(1));
    }
  }
}
