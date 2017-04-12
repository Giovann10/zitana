import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  
  private static int TILE_SIZE = 72;
  private Map map;
 
  Character hero = new Character();
  
  
  public Board() {
    map = new Map();
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
    for (Tile tile : map.tiles) {
      PositionedImage image = new PositionedImage(tile.getCostume(), tile.getPosX() * TILE_SIZE, tile.getPosY()* TILE_SIZE);
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
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    
    }
      // and redraw to have a new picture with the new coordinates
      repaint();
  }
}