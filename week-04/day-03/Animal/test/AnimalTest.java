import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  @Test
  public void eat() throws Exception {
    Animal dog = new Animal();
    for (int i = 0; i < 5; i++) {
      dog.eat();
    }
    assertEquals(45, dog.getHunger());
  }
  
  @Test
  public void drink() throws Exception {
    Animal dog = new Animal();
    for (int i = 0; i < 10; i++) {
      dog.drink();
    }
    assertEquals(40, dog.getThirst());
  }
  
  @Test
  public void play() throws Exception {
    Animal dog = new Animal();
    for (int i = 0; i < 15; i++) {
      dog.play();
    }
    assertEquals(65, dog.getThirst());
    assertEquals(65, dog.getHunger());
  }
}