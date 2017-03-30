import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
  public static void mainDraw(Graphics graphics) {
    int startX = 0;
    int startY = 0;
    int size = 486;
    
    squares(startX, startY, size, graphics);
  }
  
  public static void squares (int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
    
    if (size <= 1) {
      return;
      
    } else {
      squares(x, y + size / 3, size / 3, graphics);
      squares(x + size / 3, y, size / 3, graphics);
      squares(x + size / 3, y + 2 * size / 3, size / 3, graphics);
      squares(x + 2 * size / 3, y + size / 3, size / 3, graphics);
    }
  }
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(486, 486));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      super.setBackground(Color.YELLOW);
      mainDraw(graphics);
      
    }
  }
}

