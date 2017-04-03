public class FleetOfThings {
  
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing standup = new Thing("Stand up");
    Thing lunch =  new Thing("Eat lunch");
    standup.complete();
    lunch.complete();
  
    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(standup);
    fleet.add(lunch);
    
    System.out.println(fleet);
  }
}