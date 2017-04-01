import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    int x = 256;
    int y = 256;
    int size = 512;
    
    square(x,y,size,graphics);
    
  }
  
  public static void square (int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x - size/4,y - size/4, size/2, size/2 );
    
    if (size < 100) {
      return;
    } else {
      square(x - size/4,y - size/4, size/2, graphics);
      square(x + size/4,y + size/4, size/2, graphics);
      square(x - size/4,y + size/4, size/2, graphics);
      square(x + size/4,y - size/4, size/2, graphics);
    }
  }
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(512, 512));
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

