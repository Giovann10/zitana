public enum CarType {
  FORD(0), SAAB(1), VOLVO(2), MERCEDES(3), AUDI(4), HONDA(5), FERRARI(6), TESLA(7);
  
  private int value;
  
  CarType(int value) {
    this.value = value;
  }
  
  public int getValue() {
    return value;
  }
  
  public static CarType getRandomType() {
    return values()[(int)(Math.random() * 7)];
  }
}
