import java.util.ArrayList;

public class Sum {
  
  Sum() {
  
  }

  public int sum (ArrayList<Integer> list) {
    int sumOfElements = 0;
    if (list != null) {
      for (int i = 0; i < list.size(); i++) {
        sumOfElements += list.get(i);
      }
      return sumOfElements;
    } else {
      return 0;
    }
  }

}
