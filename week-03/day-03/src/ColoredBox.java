import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  
  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
    
    graphics.setColor(new Color(50,200,155));
    graphics.drawLine(100,100, 200, 100);
  
    graphics.setColor(new Color(150, 20,75));
    graphics.drawLine(200,100, 200, 200);
  
    graphics.setColor(new Color(50,20,200));
    graphics.drawLine(200,200, 100, 200);
  
    graphics.setColor(new Color(200,150,20));
    graphics.drawLine(100,200, 100, 100);
  }
  
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
