import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int size = 216;
    
    circles(x,y,size,graphics);
    
  }
  
  public static void circles (int x, int y, int size, Graphics graphics){
    graphics.drawOval(x,y,size, size);
    
    if (size < 20) {
      return;
    } else {
      circles(x + size / 4, y, size / 2, graphics);
      circles(x + size / 16, y + size / 12 * 5 , size / 2, graphics);
      circles(x + size * 4 / 9, y + size / 12 * 5, size / 2, graphics);
    }
  }
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(216, 216));
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
