import java.util.Arrays;
import java.util.Scanner;

public class CAB {
  private int[] numberToFindOut;
  private String state;
  private int counter;
  
  CAB () {
    numberToFindOut = create4RandomDigits();
    state = "playing";
    counter = 0;
  }
  
  public int[] create4RandomDigits() {
    int[] digits = new int[4];
    for (int i = 0; i < 4; i++)
      digits[i] = (int) (Math.random() * 10);
    return digits;
  }
  
  public int guessNumber() {
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();
    return guess;
  }
  
  public static void main(String[] args) {
    CAB game = new CAB();
    System.out.println(game);
  }
  
  @Override
  public String toString() {
    return "CAB{" +
            "numberToFindOut=" + Arrays.toString(numberToFindOut) +
            ", state='" + state + '\'' +
            ", counter=" + counter +
            '}';
  }
}
