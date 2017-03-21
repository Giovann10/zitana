/**
 * Created by Zita on 2017. 03. 21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
  
    System.out.println((int)(24-currentHours)*3600+(60-currentMinutes)*60+(60-currentSeconds));
  }
}
