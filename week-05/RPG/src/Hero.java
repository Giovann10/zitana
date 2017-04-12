public class Hero extends Character {
//  HP: 20 + 3 * d6
//  DP: 2 * d6
//  SP: 5 + d6
  
  Hero() {
    super(20 + 3 * ((int)((Math.random() * 6)) + 1), 2 * ((int)((Math.random() * 6)) + 1), 5 + ((int)((Math.random() * 6)) + 1));
    this.setPosX(0);
    this.setPosY(0);
    this.setCostume("hero-down.png");
  }
  
  
  
}
