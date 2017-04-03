public class Counter {
  public int value;
  public int originalValue;
  
  public Counter() {
    value = 0;
    originalValue = 0;
  }
  public Counter(int value) {
    this.value = value;
    this.originalValue = value;
  }
  
  public void add(int number) {
    value += number;
  }
  
  public void add() {
    value += 1;
  }
  
  public int get() {
    return value;
  }
  
  public void reset() {
    value = originalValue;
  }
  
  @Override
  public String toString() {
    return "Counter value=" + value;
  }
}
