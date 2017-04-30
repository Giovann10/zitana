public class Car {
  CarType carType;
  Color color;
  
  public Car(CarType carType, Color color) {
    this.carType = carType;
    this.color = color;
  }
  
  public CarType getCarType() {
    return carType;
  }
  
  public Color getColor() {
    return color;
  }
  
  public String getTypeAndColor() {
    return color.toString() + " " + carType.toString();
  }
  
  @Override
  public String toString() {
    return color + " " + carType;
  }
}
