public enum Color {
  RED, BLACK,  YELLOW, BLUE, SILVER, GREEN, GRAY, PINK;
  
  public static Color getRandomColor() {
    return values()[(int)(Math.random() * 8)];
  }
  
}
