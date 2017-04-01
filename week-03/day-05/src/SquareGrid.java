import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    Graphics2D g2d = (Graphics2D) graphics;
    int x = 256;
    int y = 256;
    int size = 512;
    int stroke = 16;
    
    square(x,y,size,stroke,g2d);
    
  }
  
  public static void square (int x, int y, int size, int stroke, Graphics2D graphics) {
    graphics.setColor(Color.BLACK);
    graphics.setStroke(new BasicStroke(stroke));
    graphics.drawRect(x - size/4,y - size/4, size/2, size/2 );
    
    if (size < 100) {
      return;
    } else {
      
      square(x - size/4,y - size/4, size/2, stroke - 5, graphics);
      square(x + size/4,y + size/4, size/2, stroke - 5, graphics);
      square(x - size/4,y + size/4, size/2, stroke - 5, graphics);
      square(x + size/4,y - size/4, size/2, stroke - 5, graphics);
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

