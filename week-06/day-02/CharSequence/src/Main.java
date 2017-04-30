public class Main {

  public static void main(String[] args) {
    CharOperations chaOps = new CharOperations("testthisshit");
    System.out.println(chaOps.length());
    System.out.println(chaOps.charAt(3));
    System.out.println(chaOps.toString());
    System.out.println(chaOps.subSequence(0, chaOps.length()-1));
  }

}
