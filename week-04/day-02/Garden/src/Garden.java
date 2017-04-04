import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants = new ArrayList<>();
  
  public List<Plant> getPlants() {
    return plants;
  }
  
  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }
  
  public void addPlant(Plant p) {
    plants.add(p);
  }
  
  public ArrayList<Plant> needWater(ArrayList<Plant> plants) {
    ArrayList<Plant> plantsToWater = new ArrayList<>();
    
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getThreshold() > plants.get(i).getWaterLevel()) {
        plantsToWater.add(plants.get(i));
      }
    }
    return plantsToWater;
  }
  
  public void watering(double amountOfWater, List<Plant> plantsToWater) {
    for (int i = 0; i < plantsToWater.size(); i++) {
      plantsToWater.get(i).absorb(amountOfWater / plantsToWater.size());
    }
    System.out.println("Watering with" + amountOfWater);
  }
  
  
  
}
