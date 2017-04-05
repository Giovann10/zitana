import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  
  @Test
  public void isAnagram() throws Exception {
    Anagram ana = new Anagram();
    assertTrue(ana.isAnagram("abcde", "edcba"));
    assertFalse(ana.isAnagram("kbjzb", "bukbjzv"));
  }
  
}