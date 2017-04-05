import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  @Test
  public void testDictionary() throws Exception {
    CountLetters countLetters = new CountLetters();
    HashMap<String, Integer> testMap = new HashMap<String, Integer>();
    testMap.put("a", 1);
    testMap.put("b", 2);
    testMap.put("c", 3);
    testMap.put("d", 4);
    assertEquals(testMap,countLetters.makeDictionary("abbcccdddd"));
  }
}