import java.util.Scanner;

/**
 * Created by Zita on 2017. 03. 21..
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Ez a gyerek olyan \n\"okos\"...");
        System.out.println(1E6);
        System.out.println(true);

        boolean isMarried = true;
        String text = "majom";
        byte b = -122;
        short peaches = 1;
        double pi = 3.14;
        long pears = 1233;
        int apples = 123;
        System.out.println(peaches--);
        System.out.println(peaches);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println();
    }
}
