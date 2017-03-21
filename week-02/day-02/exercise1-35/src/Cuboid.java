/**
 * Created by Zita on 2017. 03. 21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double a = 10.;
    double b = 25.;
    double c = 20.;
  
    System.out.println("Surface area: " + 2 * (a * b + b * c + a * c));
    System.out.println("Volume: " + a*b*c);
  }
}
