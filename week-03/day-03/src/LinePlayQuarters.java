import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
  
    graphics.setColor(Color.GREEN);
    for (int i = 0; i < 150; i += 20) {
      graphics.drawLine(0, i, i, 150);
      graphics.drawLine(0, i+150, i, 300);
      graphics.drawLine(150, i, i+150, 150);
      graphics.drawLine(150, i+150, i+150, 300);
    }
  
    graphics.setColor(new Color(142, 0, 237));
    for (int i = 0; i < 150; i += 20) {
      graphics.drawLine(i, 0, 150, i);
      graphics.drawLine(150, i + 150, i, 150);
      graphics.drawLine(i+150, 0, 300, i);
      graphics.drawLine(i + 150,150, 300, i+150);
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
