import java.util.ArrayList;
import java.util.Scanner;

public class CAB {
  private ArrayList<Integer> numberToFindOut;
  private int level;
  
  CAB (int level) {
    this.level = level;
    numberToFindOut = create4RandomDigits();
  }

  CAB(){
    this.numberToFindOut = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int userinput = scanner.nextInt();
  }
  
  public ArrayList<Integer> getNumberToFindOut() {
    return numberToFindOut;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
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
    CAB game = new CAB(4);

  }
  
}
