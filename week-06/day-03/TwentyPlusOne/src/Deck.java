import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> deck;
  
  Deck(){
    this.deck = initialiseDeck();
    shuffleDeck();
  }
  
  
  public void shuffleDeck() {
    Collections.shuffle(deck);
  }
  
  public Card pullFirst() {
    Card first = deck.get(0);
    deck.remove(0);
    return first;
  }
  
  public Card pullLast() {
    Card last = deck.get(deck.size()-1);
    deck.remove(deck.get(deck.size()-1));
    return last;
  }
  
  public Card pullRandom() {
    int random = (int) (Math.random() * deck.size());
    Card randomCard = deck.get(random);
    deck.remove(deck.get(random));
    return randomCard;
  }
  
  @Override
  public String toString() {
    return  deck.toString();
  }
  
  public List<Card> initialiseDeck() {
    List<Card> deck = new ArrayList<>();
    
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        deck.add(new Card(s, r));
      }
    }
    return deck;
  }
}
