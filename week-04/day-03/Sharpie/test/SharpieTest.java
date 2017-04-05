import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  @Test
  void use() {
    Sharpie sharpie = new Sharpie("red", 0.5f);
    sharpie.use();
    assertEquals(95, sharpie.getInkAmount(), 0.0005);
  }
  
}