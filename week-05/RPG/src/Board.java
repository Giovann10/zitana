import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {
  
  private static int TILE_SIZE = 72;
  private Map map;
  private Hero hero;
  private Skeleton skeleton;
  private Boss boss;
  
  public Board() {
    map = new Map();
    hero = new Hero(map);
    map.gameObjects.add(hero);
    initMonsters(1,map);
    
    // set the size of your draw board
    setPreferredSize(new Dimension(1000, 10 * TILE_SIZE));
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    
    for (GameObject gameObject : map.gameObjects) {
      PositionedImage image = new PositionedImage(gameObject.getCostume(), gameObject.getPosX() * TILE_SIZE, gameObject.getPosY()* TILE_SIZE);
      image.draw(graphics);
    }
    for (Character monster : map.monsters) {
      PositionedImage image = new PositionedImage(monster.getCostume(), monster.getPosX() * TILE_SIZE, monster.getPosY()* TILE_SIZE);
      image.draw(graphics);
    }
    
    
    graphics.drawString(hero.toString(), 730,50);
    for (int i = 0; i < map.monsters.size(); i++ ) {
      graphics.drawString(map.monsters.get(i).toString(), 730, 80 + i * 15);
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
  
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.moveUp();
      moveMonsters(map.monsters);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
      moveMonsters(map.monsters);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.moveLeft();
      moveMonsters(map.monsters);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.moveRight();
      moveMonsters(map.monsters);
    } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      if (map.monsters.size() != 0) {
        for (Character monster : map.monsters) {
          if (hero.getPosX() == monster.getPosX() && hero.getPosY() == monster.getPosY()) {
            hero.strike(monster);
          }
          if (!monster.isAlive()) {
            hero.levelUp();
          }
          map.monsters = removeDead(map.monsters);
          enterNewLevel(hero);
        }
      } else {
        initMonsters(boss.getLevel() + 1, map);
        
      }
    }
      // and redraw to have a new picture with the new coordinates
      repaint();
  }
  
  public void initMonsters(int level, Map map) {

    int[] temp = map.getRandomFreeCoordinate();
    skeleton = new Skeleton(level, false, temp[0], temp[1], map);
    map.monsters.add(skeleton);
    temp = map.getRandomFreeCoordinate();
    skeleton = new Skeleton(level, false, temp[0], temp[1], map);
    map.monsters.add(skeleton);
    temp = map.getRandomFreeCoordinate();
    skeleton = new Skeleton(level, true, temp[0], temp[1], map);
    map.monsters.add(skeleton);
    temp = map.getRandomFreeCoordinate();
    boss = new Boss(level, temp[0], temp[1], map);
    map.monsters.add(boss);
  }
  
  public void moveMonsters(ArrayList<Character> monsters) {
    for (Character monster : monsters) {
      int randomDirection = (int) (Math.random() * 4);
      
      if (randomDirection == 0) {
        monster.moveUp();
      } else if (randomDirection == 1) {
        monster.moveDown();
      } else if (randomDirection == 2) {
        monster.moveLeft();
      } else if (randomDirection == 3) {
        monster.moveRight();
      }
    }
  }
  
  public ArrayList<Character> removeDead(ArrayList<Character> monsters) {
    ArrayList<Character> monstersAlive = new ArrayList<>();
    for (Character monster : monsters) {
      if (monster.isAlive()) {
        monstersAlive.add(monster);
      }
    }
    return monstersAlive;
  }
  
  public void enterNewLevel(Character hero) {
    int restoreHealth = (int) (Math.random() * 10);
    if (restoreHealth % 2 == 0) {
      if (hero.getMaxHP() <= hero.getCurrentHP() + (int) (hero.getMaxHP() * 0.1)) {
        hero.setCurrentHP(hero.getMaxHP());
      } else {
        hero.setCurrentHP(hero.getCurrentHP() + (int) (hero.getMaxHP() * 0.1));
      }
    } else if (restoreHealth == 9) {
      hero.setCurrentHP(hero.getMaxHP());
    } else {
      if (hero.getMaxHP() <= hero.getCurrentHP() + (int) (hero.getMaxHP() * 0.4)) {
        hero.setCurrentHP(hero.getMaxHP());
      } else {
        hero.setCurrentHP(hero.getCurrentHP() + (int) (hero.getMaxHP() * 0.4));
      }
    }
  }
}