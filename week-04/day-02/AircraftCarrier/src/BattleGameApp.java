import airspace.*;

public class BattleGameApp {
  
  public static void main(String[] args) {
    F16 a = new F16();
    F35 b = new F35();
  
    System.out.println(a.getStatus());
    a.refill(50);
    System.out.println(a.getStatus());
    
    Carrier mySpecialCarrier = new Carrier(500);
  
  }
}
