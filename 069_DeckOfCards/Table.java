public class Table{
public static void main(String [] args){
  Deck deck = new Deck();
  Card[] deckOfCards = deck.getDeck();

// gets teh value amd suit from array adn pritns it
    for (Card card:deckOfCards){
      System.out.println("the card is " + " " + card.getValue()  +  "" + " of " + " " + card.getSuit() );
// pints ebery single card in deck
  }
}
}
