import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  @Test
  public void testSumWithArrayList() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    for (int i = 1; i < 5; i++){
      listOfIntegers.add(i);
    }
    
    assertEquals(10, mySum.sum(listOfIntegers));
    
  }
  
  @Test
  public void testSumWithEmptyList() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    assertEquals(0, mySum.sum(listOfIntegers));
  }
  
  @Test
  public void testSumWithOneElement() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    listOfIntegers.add(2);
    assertEquals(2, mySum.sum(listOfIntegers));
  }
  
  @Test
  public void testSumWithNull() throws Exception {
    Sum mySum = new Sum();
    ArrayList<Integer> listOfIntegers = new ArrayList<>();
    assertTrue(mySum.sum(listOfIntegers) == null);
  }
  
}