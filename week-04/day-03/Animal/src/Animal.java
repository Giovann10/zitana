public class Animal {
  public int hunger;
  public int thirst;
  
  public Animal() {
    hunger = 50;
    thirst = 50;
  }
  
  public int getHunger() {
    return hunger;
  }
  
  public int getThirst() {
    return thirst;
  }
  
  public void eat() {
    this.hunger -= 1;
  }
  
  public void drink () {
    this.thirst -= 1;
  }
  
  public void play () {
    this.hunger += 1;
    this.thirst += 1;
  }
}
