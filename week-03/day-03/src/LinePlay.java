import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay {
  
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    for(int i = 0; i < 300; i += 20) {
      graphics.drawLine(0, i, i, 300);
    }
    graphics.setColor(new Color(142,0,237));
    for (int i = 0; i < 300; i += 20) {
      graphics.drawLine(i, 0, 300, i);
    }
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
