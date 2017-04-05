import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CABTest {
  @Test
  public void getNumberToFindOut() throws Exception {
  }
  
  @Test
  public void setNumberToFindOut() throws Exception {
  }
  
  @Test
  public void getState() throws Exception {
  }
  
  @Test
  public void setState() throws Exception {
  }
  
  @Test
  public void getCounter() throws Exception {
  }
  
  @Test
  public void setCounter() throws Exception {
  }
  
  @Test
  public void create4RandomDigits() throws Exception {
    CAB game = new CAB();
    System.out.println(game.create4RandomDigits());
    System.out.println(game.guessNumber(5432));
  }
  
  @Test
  public void guessNumber() throws Exception {
  }
  
  @Test
  public void cowOrBull() throws Exception {
    CAB game = new CAB();
    ArrayList<Integer> set1 = new ArrayList<>();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    ArrayList<Integer> set2 = new ArrayList<>();
    set1.add(2);
    set1.add(1);
    set1.add(5);
    set1.add(4);
    game.cowOrBull(set1,set2);
  }
  
  @Test
  public void main() throws Exception {
  }
  
}