public class Main {
  public static void main(String[] args) {
    PostIt firstPost = new PostIt("orange", "blue", "Idea1");
    PostIt secondPost = new PostIt("pink", "black", "Awesome");
    PostIt thirdPost = new PostIt("yellow", "green", "Superb!");
    
    System.out.println(firstPost);
    System.out.println(secondPost);
    System.out.println(thirdPost);
  }
}
