import java.util.Arrays;
import java.util.List;

public class Trees {
  public static void main(String[] args) {
    List<String> treeA = Arrays.asList("Red Maple", "red", "26", "female");
    List<String> treeB = Arrays.asList("Weeping Willow", "green", "5", "male");
    List<String> treeC = Arrays.asList("Palm", "green","15", "female");
    List<String> treeD = Arrays.asList("Sakura", "pink","25", "female");
    List<String> treeE = Arrays.asList("Cypress", "green","8", "male");
  
    printer(treeA);
    printer(treeB);
    printer(treeC);
    printer(treeD);
    printer(treeE);
  
  }
  public static void printer (List tree) {
      System.out.print("\nType: " + tree.get(0) + ", Leaf Color: " + tree.get(1) + ", Age: " + tree.get(2) + ", Sex: " + tree.get(3));
    }
  }
