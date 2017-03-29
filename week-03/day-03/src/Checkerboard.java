import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int x = 0;
    int y = 0;
    int size = 30;
  
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0)
        for (int j = 0; j < 10; j++) {
          if (j % 2 == 0) {
            graphics.setColor(Color.BLACK);
          } else {
            graphics.setColor(Color.WHITE);
          }
          graphics.fillRect(x, y, size, size);
          x += size;
        }
      if (i % 2 == 1) {
        for (int j = 0; j < 10; j++) {
          if (j % 2 == 1) {
            graphics.setColor(Color.BLACK);
          } else {
            graphics.setColor(Color.WHITE);
          }
          graphics.fillRect(x, y, size, size);
          x += size;
        }
      }
      y += size;
      x = 0;
    }
  }
  
  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
      
    }
  }
}
