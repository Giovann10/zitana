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
    
    int myNumber = randInt(1 , range);
    
    System.out.println("\nGot it!");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("You can quess 5 times.\nEnter your first guess:");
  }
  
  public static int randInt(int min, int max) {
    Random rand;
    int randomNum = rand.nextInt((max - min) + 1) + min;
  
    return randomNum;
  }
}
