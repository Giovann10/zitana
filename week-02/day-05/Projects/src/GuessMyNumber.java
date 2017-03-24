import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class GuessMyNumber {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("I will think of a number within a given range and you should try to find it out.\nPlease select your range.\nI want to play from 1 to:");
    Scanner scanner = new Scanner(System.in);
    int range = scanner.nextInt();
    System.out.println("Okay! I am thinking of a number between 1 and " + range + ".");
  
    for (int i = 0; i < 3; i++) {
      System.out.print(".");
      TimeUnit.SECONDS.sleep(1);
    }
  
    int myNumber = randInt(1, range);
  
    System.out.println("\nGot it!\nYou can guess 5 times.\nEnter your first guess:");
  
    int guess = scanner.nextInt();
  
    for (int i = 5; i > 0; i--) {
      if (guess == myNumber) {
        System.out.println("That is correct! My number is " + myNumber + " indeed.");
        break;
      } else if (guess < myNumber) {
        System.out.println("Too low! Lives left: " + i + " Try again:");
        guess = scanner.nextInt();
      } else if (guess > myNumber) {
        System.out.println("Too high! Lives left: " + i + " Try again:");
        guess = scanner.nextInt();
      }
    }
      if (guess != myNumber) {
        System.out.println("You have run out of lives.\n :(\nMy number was: " + myNumber);
      }
  }
  
  public static int randInt(int min, int max) {
    Random rand = new Random();
    int randNum = rand.nextInt(max - min + 1) + min;
    return randNum;
  }
  
}
