import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Deck deck = new Deck();
    int bank = (int)(Math.random() * 7) + 15;
    System.out.println("The bank has " + bank + " Do you want to draw a card?(y/n)");
    Scanner scanner = new Scanner(System.in);
    game(scanner.nextLine(), 0, deck, bank);
  
  
  }
  public static void game(String input, int yourScore, Deck deck, int bank) {
    Scanner scanner = new Scanner(System.in);
    if (input.toLowerCase().equals("y") && yourScore < 21) {
      Card yourCard = deck.pullRandom();
      yourScore += yourCard.getRank().getValue();
      System.out.println("Your card is: " + yourCard + ". Your score is: " + yourScore);
      input = scanner.nextLine();
      game(input, yourScore, deck, bank);
    } else if (yourScore > 21) {
      System.out.println("You have more than 21. You lost!");
    } else {
      System.out.println("You have: " + yourScore + ". Bank has " + bank);
      if (yourScore > 21 || yourScore < bank) {
        System.out.println("You lost!");
      } else {
        System.out.println("You won");
      }
    }
  }
  
}
