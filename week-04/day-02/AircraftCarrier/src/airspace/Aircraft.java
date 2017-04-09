package airspace;

public class Aircraft {
  private String type;
  private int ammo;
  private int MAX_AMMO;
  private int BASE_DAMAGE;
  
  public Aircraft (int MAX_AMMO, int BASE_DAMAGE, String type) {
    if (type.equals("F16")) {
      ammo = 0;
      this.MAX_AMMO = MAX_AMMO;
      this.BASE_DAMAGE = BASE_DAMAGE;
      this.type = type;
    }
  }
  
  public Aircraft(){
  
  }
  
  public int fight() {
    int damage = BASE_DAMAGE * ammo;
    ammo = 0;
    return damage;
  }
  
  public int refill(int givenAmmo) {
    if (givenAmmo + ammo <= MAX_AMMO){
      ammo = givenAmmo + ammo;
      givenAmmo = 0;
    } else {
      givenAmmo -= (MAX_AMMO - ammo);
      ammo = MAX_AMMO;
    }
    return givenAmmo;
  }
  
  public String getType() {
    return type;
  }
  
  public String getStatus() {
    return "Type" + type + " , Ammmo: " + ammo + " Base Damage: " + " , All Damage: " + (ammo * BASE_DAMAGE);
  }
  
}
