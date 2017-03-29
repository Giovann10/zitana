import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    
    
    for (int i = 300; i > 0; i -= 10) {
      rainbow((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), i, graphics);
    }
  }
    public static void rainbow ( int r, int g, int b, int x, Graphics graphics){
      graphics.setColor(new Color(r, g, b));
      graphics.fillRect(150 - x / 2, 150 - x / 2, x, x);
    }
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
      
    }
  }
}

