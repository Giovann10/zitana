public enum CarType {
  FORD(0), VOLVO(1), AUDI(2), HONDA(3), TESLA(4);
  
  private int value;
  
  CarType(int value) {
    this.value = value;
  }
  
  public int getValue() {
    return value;
  }
  
  public static CarType getRandomType() {
    return values()[(int)(Math.random() * 4)];
  }
}
