import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int size = 729;
    
    square(x,y,size,graphics);
    
  }
  
  public static void square (int x, int y, int size, Graphics graphics) {
    graphics.fillRect(x + size/3,y + size/3, size/3, size/3 );
    
    if (size < 10) {
      return;
    } else {
      square(x, y, size/3, graphics);
      square(x + size/3, y, size/3,graphics);
      square(x + 2*(size/3), y, size/3, graphics);
      square(x, y + size/3, size/3,graphics);
      square(x + 2*(size/3), y+size/3, size/3, graphics);
      square(x, y + 2* size/3, size/3,graphics);
      square(x + size/3, y+2* size/3, size/3, graphics);
      square(x + 2*(size/3), y + 2* size/3, size/3,graphics);
    }
  }
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(729, 729));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }
}
