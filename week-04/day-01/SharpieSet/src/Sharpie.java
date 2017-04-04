public class Sharpie {
  public String color;
  public float width;
  public float inkAmount;
  
  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100.f;
  }
  
  public void use () {
    inkAmount -= 5.f;
  }
  
  @Override
  public String toString() {
    return "Sharpie{" +
            "color='" + color + '\'' +
            ", width=" + width +
            ", inkAmount=" + inkAmount +
            '}';
  }
}