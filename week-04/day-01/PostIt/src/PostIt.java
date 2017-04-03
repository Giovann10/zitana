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
