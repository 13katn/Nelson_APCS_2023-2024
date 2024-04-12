public class Table{

public static void main(String [] args){

  Deck deck = new Deck();
  Card[] deckOfCards = deck.getDeck();

// for each loop getting value and suit from array and printing

    for (Card card:deckOfCards){

      System.out.println("the card is " + " " + card.getValue()  +  "" + " of " + " " + card.getSuit() );

  }
}
}
