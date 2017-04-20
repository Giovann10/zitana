import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Car> parkingLot = fillParkingLot(256);
    System.out.printf("The parking lot has %d cars in it. \n", parkingLot.size());
    System.out.println(carTypeMap(parkingLot));
    System.out.println(colorMap(parkingLot));
    System.out.println(typeAndColorMap(parkingLot));
    System.out.println("The most common car is the " + getMaxKey(typeAndColorMap(parkingLot)));
    System.out.println(sortByValue(typeAndColorMap(parkingLot)));
  }
  
  public static List<Car> fillParkingLot(int numberOfCars) {
    List<Car> cars = new ArrayList<>();
  
    for (int i = 0; i < numberOfCars; i++) {
      cars.add(new Car(CarType.getRandomType(), Color.getRandomColor()));
    }
    return cars;
  }
  
  public static HashMap<CarType, Integer> carTypeMap(List<Car> cars) {
    HashMap<CarType, Integer> types = new HashMap<>();
    for (int i = 0; i < 256; i++) {
      if (types.containsKey(cars.get(i).getCarType())) {
        types.put((cars.get(i).getCarType()), types.get(cars.get(i).getCarType()) + 1);
      } else {
        types.put(cars.get(i).getCarType(), 1);
      }
    }
    return types;
  }
  
  public static HashMap<Color, Integer> colorMap(List<Car> cars) {
    HashMap<Color, Integer> colors = new HashMap<>();
    for (int i = 0; i < 256; i++) {
      if (colors.containsKey(cars.get(i).getColor())) {
        colors.put((cars.get(i).getColor()), colors.get(cars.get(i).getColor()) + 1);
      } else {
        colors.put(cars.get(i).getColor(), 1);
      }
    }
    return colors;
  }

  public static HashMap<String, Integer> typeAndColorMap(List<Car> cars) {
    HashMap<String, Integer> carMap = new HashMap<>();
    for (int i = 0; i < 256; i++) {
      if (carMap.containsKey(cars.get(i).getTypeAndColor())) {
        carMap.put((cars.get(i).getTypeAndColor()), carMap.get(cars.get(i).getTypeAndColor()) + 1);
      } else {
        carMap.put(cars.get(i).getTypeAndColor(), 1);
      }
    }
    return carMap;
  }
  
  public static String getMaxKey(HashMap<String, Integer> map) {
    String maxKey = null;
    Integer maxValue = null;
  
    for (String key : map.keySet()) {
      if (maxKey == null) {
        maxKey = key;
      }
    
      if (maxValue == null) {
        maxValue = map.get(key);
      }
    
      if (maxValue < map.get(key)) {
        maxValue = map.get(key);
        maxKey = key;
      }
    }
    map.remove(maxKey, maxValue);
    return(maxKey);
  }
  
  public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ) {
    List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>( map.entrySet() );
    Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
      public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 ) {
        return (o1.getValue()).compareTo( o2.getValue() );
      }
    } );

    Map<K, V> result = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : list)
    {
      result.put( entry.getKey(), entry.getValue() );
    }
    return result;
  }
}
