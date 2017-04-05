import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  @Test
  public void fibonacci() throws Exception {
    Fibonacci fibo = new Fibonacci();
    int [] testTill8 = { 0, 1, 1, 2, 3, 5, 8, 13, 21};
    for (int i = 0; i > testTill8.length; i++)
    assertEquals(testTill8[i], fibo.fibonacci(i));
  }
  
}