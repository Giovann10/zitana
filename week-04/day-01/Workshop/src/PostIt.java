public class PostIt {
  public String backgroundColor;
  public String textColor;
  public String text;
  
  public PostIt (String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;
  }
  
  @Override
  public String toString() {
    return "PostIt{" +
            "backgroundColor='" + backgroundColor + '\'' +
            ", textColor='" + textColor + '\'' +
            ", text='" + text + '\'' +
            '}';
  }
}

class Main {
  public static void main(String[] args) {
    PostIt firstPost = new PostIt("orange", "blue", "Idea1");
    PostIt secondPost = new PostIt("pink", "black", "Awesome");
    PostIt thirdpost = new PostIt("yellow", "green", "Superb!");
  
    System.out.println(firstPost);
    System.out.println(secondPost);
    System.out.println(thirdpost);
  }
}
