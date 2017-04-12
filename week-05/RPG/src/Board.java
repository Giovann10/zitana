import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  
  private static int TILE_SIZE = 72;
  private int[][] map = {
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
  Character hero = new Character();
  
  
  public Board() {
    
    // set the size of your draw board
    setPreferredSize(new Dimension(10 * TILE_SIZE, 11 * TILE_SIZE));
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Hero hero = new Hero();
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
  
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 0) {
          PositionedImage floor = new PositionedImage("floor.png", i * TILE_SIZE, j * TILE_SIZE);
          floor.draw(graphics);
        } else {
          PositionedImage floor = new PositionedImage("wall.png", i * TILE_SIZE, j * TILE_SIZE);
          floor.draw(graphics);
        }
      }
    }
  
    PositionedImage heroPic = new PositionedImage(hero.getHeroImage(), hero.getHeroBoxX(), hero.getHeroBoxY());
    heroPic.draw(graphics);
    
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
    if (e.getKeyCode() == KeyEvent.VK_UP && hero.getHeroBoxY() > 0) {
      hero.setHeroImage("hero-up.png");
      if (map[hero.getHeroBoxX() / TILE_SIZE][(hero.getHeroBoxY() - TILE_SIZE) / TILE_SIZE] == 0) {
        hero.setHeroBoxY(hero.getHeroBoxY() - TILE_SIZE);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.getHeroBoxY() < 720) {
      hero.setHeroImage("hero-down.png");
      if (map[hero.getHeroBoxX() / TILE_SIZE][(hero.getHeroBoxY() + TILE_SIZE) / TILE_SIZE] == 0) {
        hero.setHeroBoxY(hero.getHeroBoxY() + TILE_SIZE);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.getHeroBoxX() > 0) {
      hero.setHeroImage("hero-left.png");
      if (map[(hero.getHeroBoxX() - TILE_SIZE) / TILE_SIZE][hero.getHeroBoxY() / TILE_SIZE] == 0) {
        hero.setHeroBoxX(hero.getHeroBoxX() - TILE_SIZE);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.getHeroBoxX() < 648) {
      hero.setHeroImage("hero-right.png");
      if (map[(hero.getHeroBoxX() + TILE_SIZE) / TILE_SIZE][hero.getHeroBoxY() / TILE_SIZE] == 0) {
        hero.setHeroBoxX(hero.getHeroBoxX() + TILE_SIZE);
      }
    }
      // and redraw to have a new picture with the new coordinates
      repaint();
  }
}