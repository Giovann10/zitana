public class Plant {
  private String color;
  private double waterLevel;
  private double absorbRate;
  private double threshold;
  
  public void absorb(double water){
    setWaterLevel(getWaterLevel() + water * getAbsorbRate());
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public double getWaterLevel() {
    return waterLevel;
  }
  
  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
  
  public double getAbsorbRate() {
    return absorbRate;
  }
  
  public void setAbsorbRate(double absorbRate) {
    this.absorbRate = absorbRate;
  }
  
  public double getThreshold() {
    return threshold;
  }
  
  public void setThreshold(double threshold) {
    this.threshold = threshold;
  }
  
  Plant () {
    this.color = "white";
    this.absorbRate = 0.5;
    this.threshold = 10;
    this.waterLevel = 0;
  }
  
  @Override
  public String toString() {
    return "Plant{" +
            "color='" + color + '\'' +
            ", waterLevel=" + waterLevel +
            ", absorbRate=" + absorbRate +
            ", threshold=" + threshold +
            '}';
  }
}
