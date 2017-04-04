import java.util.ArrayList;
import java.util.List;

public class GardenApp {
  public static void main(String[] args) {
    ArrayList<Plant> garden = new ArrayList<>();

    Plant yellowFlower = new Flower("yellow");
    garden.add(yellowFlower);
    Plant blueFlower = new Flower("blue");
    garden.add(blueFlower);
    Plant purpleTree = new Tree("purple");
    garden.add(purpleTree);
    Plant orangeTree = new Tree("orange");
    garden.add(orangeTree);
    
    
  
    
  }
}
