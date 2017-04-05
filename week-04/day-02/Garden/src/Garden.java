import java.util.ArrayList;
import java.util.List;

public class Garden {
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
  
    printer(garden);
    needWater(garden);
    watering(40, needWater(garden));
    printer(garden);
    needWater(garden);
    watering(70, needWater(garden));
    printer(garden);
  
  }
  
  public static ArrayList<Plant> needWater(ArrayList<Plant> plants) {
    ArrayList<Plant> plantsToWater = new ArrayList<>();
    
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getThreshold() > plants.get(i).getWaterLevel()) {
        plantsToWater.add(plants.get(i));
      }
    }
    return plantsToWater;
  }
  
  public static void watering(double amountOfWater, ArrayList<Plant> plantsToWater) {
    for (int i = 0; i < plantsToWater.size(); i++) {
      plantsToWater.get(i).absorb(amountOfWater / plantsToWater.size());
    }
    System.out.println("\nWatering with" + amountOfWater);
  }
  
  public static void printer (ArrayList<Plant> garden) {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).getThreshold() > garden.get(i).getWaterLevel()) {
        System.out.println(garden.get(i) + " needs water.");
      } else {
        System.out.println(garden.get(i) + " doesn't need water.");
      }
    }
  }
  
}
