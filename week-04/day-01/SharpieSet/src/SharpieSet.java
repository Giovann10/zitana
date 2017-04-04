import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;
  
  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }
  
  public int countUsable(List<Sharpie> sharpies) {
    int usable = 0;
    
    for (int i = 0; i < this.sharpies.size(); i++) {
      if (this.sharpies.get(i).inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }
  
  public void removeTrash(List<Sharpie> sharpies) {
    for (int i = 0; i < this.sharpies.size(); i++) {
      if (this.sharpies.get(i).inkAmount == 0) {
        this.sharpies.remove(i);
      }
    }
  }
  
}
