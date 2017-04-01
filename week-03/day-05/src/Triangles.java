import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int size = 512;
    
    triangle(x,y,size,graphics);
    
  }

  public static void triangle (int x, int y, int size, Graphics graphics) {
    int[] xPoints = {x, x+size, x+size/2};
    int[] yPoints = {y, y, y+size};
    graphics.drawPolygon(xPoints, yPoints, 3);

    if (size < 10) {
      return;

    } else {
      triangle(x, y, size / 2, graphics);
      triangle(x + size/2, y, size/2, graphics);
      triangle(x + (size / 2) / 2, y+size / 2, size / 2, graphics);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }
}

