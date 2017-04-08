import java.util.ArrayList;

public class CAB {
  private ArrayList<Integer> numberToFindOut;
  private String state;
  private int counter;
  
  CAB () {
    numberToFindOut = create4RandomDigits();
    state = "playing";
    counter = 0;
  }
  
  public ArrayList<Integer> getNumberToFindOut() {
    return numberToFindOut;
  }
  
  public void setNumberToFindOut(ArrayList<Integer> numberToFindOut) {
    this.numberToFindOut = numberToFindOut;
  }
  
  public String getState() {
    return state;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
  public int getCounter() {
    return counter;
  }
  
  public void setCounter(int counter) {
    this.counter = counter;
  }
  
  public ArrayList<Integer> create4RandomDigits() {
    ArrayList<Integer> digits = new ArrayList<>();
    for (int i = 0; i < 4; i++)
      digits.add((int) (Math.random() * 10));
    return digits;
  }
  
  public ArrayList<Integer> guessNumber(int guess) {
    ArrayList<Integer> guessedNumbers = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      guessedNumbers.add(0,guess % 10);
      guess = guess / 10;
    }
    setCounter(counter++);
    return guessedNumbers;
  }
  
  public void cowOrBull (ArrayList<Integer> guessedNumbers, ArrayList<Integer> numberToFindOut) {
    for (int i = 0; i < 4; i++) {
      if (guessedNumbers.get(i).equals(numberToFindOut.get(i))) {
        System.out.println("cow");
      } else if (numberToFindOut.contains(guessedNumbers.get(i))) {
        System.out.println("bull");
      } else {
        System.out.println("nothing");
      }
    }
  }
  
  public static void main(String[] args) {
    CAB game = new CAB();

  }
  
}
