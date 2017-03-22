import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 22..
 */
public class PartyIndicator {
  public static void main(String[] args) {
    System.out.println("How many girls came to your party: ");
    Scanner scanner = new Scanner(System.in);
    int girls = scanner.nextInt();
    System.out.println("How many boys came to your party: ");
    int boys = scanner.nextInt();
    
    if (boys == girls && boys+girls >= 20) {
      System.out.println("The party is exellent!");
    } else if (boys+girls > 20 && girls/boys != 1) {
      System.out.println("Quite cool party!");
    } else if (boys+girls < 20){
      System.out.println("Average party...");
    } else if (girls < 1) {
      System.out.println("Sausage party");
    }
  }
}
