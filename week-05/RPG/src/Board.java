import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  
  int testBoxX;
  int testBoxY;
  
  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    for (int j = 0; j < 10; j++) {
      for (int i = 0; i < 10; i++) {
        PositionedImage image = new PositionedImage("floor.png", i * 72, j * 72);
        image.draw(graphics);
      }
    }
  
    int[][] wall = {{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},{0, 0, 0, 1, 0, 1, 0, 1, 1, 0},{0, 1, 1, 1, 0, 1, 0, 1, 1, 0},{0,0,0,0,0,1,0,0,0,0},{1,1,1,1,0,1,1,1,1,0},{0,1,0,1,0,0,0,0,1,0},{0,1,0,1,0,1,1,0,1,0},{0,0,0,0,0,1,1,0,1,0},{0,1,1,1,0,0,0,0,1,0},{0,0,0,1,0,1,1,0,1,0},{0,1,0,1,0,1,0,0,0,0}};
    for (int j = 0; j < wall.length; j++) {
      for (int i = 0; i < wall[j].length; i++) {
        if (wall[j][i] == 1) {
          PositionedImage image = new PositionedImage("wall.png", i * 72, j * 72);
          image.draw(graphics);
        }
      }
  
      graphics.fillRect(testBoxX, testBoxY, 72, 72);
    }
  }
  
  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {
  
  }
  
  @Override
  public void keyPressed(KeyEvent e) {
  
  }
  
  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        testBoxY -= 72;
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        testBoxY += 72;
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        testBoxX -= 72;
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        testBoxX += 72;
      }
      // and redraw to have a new picture with the new coordinates
      repaint();
    }
  }