public class Card {
  Suit suit;
  Rank rank;
  Color color;
  
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    if (suit.equals(suit.DIAMONDS) || suit.equals(suit.SPADES)) {
      this.color = Color.BLACK ;
    } else {
      this.color = Color.RED;
    }
  }
  
  @Override
  public String toString() {
    return rank + " " + suit;
  }
  
  public Rank getRank() {
    return rank;
  }
}
