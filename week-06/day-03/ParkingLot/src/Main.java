import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
  
    for (int i = 0; i < 256; i++) {
      cars.add(new Car(CarType.getRandomType(), Color.getRandomColor()));
    }
    System.out.println(cars);
    System.out.println(cars.size());
  
  
    HashMap<CarType, Integer> types = new HashMap<>();
    for (int i = 0; i < 256; i++) {
      if (types.containsKey(cars.get(i).getCarType())) {
        types.put((cars.get(i).getCarType()), types.get(cars.get(i).getCarType()) + 1);
      } else {
        types.put(cars.get(i).getCarType(), 1);
      }
    }
    System.out.println(types);
  
  HashMap<Color, Integer> colors = new HashMap<>();
    for (int i = 0; i < 256; i++) {
    if (colors.containsKey(cars.get(i).getColor())) {
      colors.put((cars.get(i).getColor()), colors.get(cars.get(i).getColor()) + 1);
    } else {
      colors.put(cars.get(i).getColor(), 1);
    }
  }
    System.out.println(colors);
  }
  
  
}
