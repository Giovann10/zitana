public class StringsAgainAndAgain {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    System.out.println(separate("greenfox"));
  }
  public static String separate (String input) {
    if (input.contains("*")) {
      return input;
    } else {
      return separate(input.replace("", "*"));
    }
  }
}
