import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int x = 0;
    int y = 0;
    
    graphics.setColor(Color.BLUE);
    
    for (int i = 0; i < 4; i++) {
      if(i%2==0)
      for (int j = 0; j <= 300; j += 20){
        drawToCenter(x,j,graphics);
      }
      x=300;
      if (i%2==1) {
        for (int j = 0; j < 300; j += 20){
          drawToCenter(j,y,graphics);
        }
        y=300;
      }
    }
  }
  
  public static void drawToCenter (int x, int y, Graphics graphics) {
    graphics.drawLine(x,y,150,150);
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
