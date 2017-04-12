import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  
  private static int TILE_SIZE = 72;
  private Map map;
  private Hero hero;
  private Skeleton skeleton;
  
  public Board() {
    map = new Map();
    hero = new Hero(map);
    map.gameObjects.add(hero);
    skeleton = new Skeleton(1,false, map);
    map.gameObjects.add(skeleton);
    
    // set the size of your draw board
    setPreferredSize(new Dimension(10 * TILE_SIZE, 11 * TILE_SIZE));
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    
    for (GameObject gameObject : map.gameObjects) {
      PositionedImage image = new PositionedImage(gameObject.getCostume(), gameObject.getPosX() * TILE_SIZE, gameObject.getPosY()* TILE_SIZE);
      image.draw(graphics);
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
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.moveRight();
    }
      // and redraw to have a new picture with the new coordinates
      repaint();
  }
}