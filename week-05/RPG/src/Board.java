import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  
  int heroBoxX;
  int heroBoxY;
  String heroImage;
  int[][] map = {
          {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
          {0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
          {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0},
          {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
          {1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
          {0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0},
          {0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  };
  
  public Board() {
    heroBoxX = 0;
    heroBoxY = 0;
    heroImage = "hero-down.png";
    
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
  
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 0) {
          PositionedImage floor = new PositionedImage("floor.png", i * 72, j * 72);
          floor.draw(graphics);
        } else {
          PositionedImage floor = new PositionedImage("wall.png", i * 72, j * 72);
          floor.draw(graphics);
        }
  
        PositionedImage hero = new PositionedImage(heroImage, heroBoxX, heroBoxY);
        hero.draw(graphics);
      }
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
      if (e.getKeyCode() == KeyEvent.VK_UP && heroBoxY > 0) {
        if(map[heroBoxX / 72][(heroBoxY - 72) / 72] == 0) {
          heroBoxY -= 72;
          heroImage = "hero-up.png";
        }
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroBoxY < 720) {
        if (map[heroBoxX / 72][(heroBoxY + 72) / 72] == 0) {
          heroBoxY += 72;
          heroImage = "hero-down.png";
        }
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroBoxX > 0) {
        if(map[(heroBoxX - 72) / 72][heroBoxY / 72] == 0) {
          heroBoxX -= 72;
          heroImage = "hero-left.png";
        }
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroBoxX < 648) {
        if (map[(heroBoxX + 72) / 72][heroBoxY / 72] == 0) {
          heroBoxX += 72;
          heroImage = "hero-right.png";
        }
      }
      // and redraw to have a new picture with the new coordinates
      repaint();
    }
  }