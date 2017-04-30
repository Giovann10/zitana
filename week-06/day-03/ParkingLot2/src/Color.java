public enum Color {
  RED, BLACK, BLUE, SILVER, PINK;
  
  public static Color getRandomColor() {
    return values()[(int)(Math.random() * 4)];
  }
  
}
