public class Deck {
  //the array list of eah card adn its value and suit 
  Card[] cd = {new Card("spade", "ace"),new Card("spade", "two"),new Card("spade", "three"),new Card("spade", "four"),new Card("spade", "five"),new Card("spade", "six"),new Card("spade", "seven"),new Card("spade", "eight"),new Card("spade", "nine" ),new Card("spade", "ten"),new Card("spade", "jack"),new Card("spade","queen"),new Card("spade", "king"),new Card("heart", "ace"),new Card("heart", "two"),new Card("heart", "three"),new Card("heart", "four"),new Card("heart", "five"),new Card("heart", "six"),new Card("heart", "seven"),new Card("heart", "eight"),new Card("heart", "nine" ),new Card("heart", "ten"),new Card("heart", "jack"),new Card("heart","queen"),new Card("heart", "king"),new Card("club", "ace"),new Card("club", "two"),new Card("club", "three"),new Card("club", "four"),new Card("club", "five"),new Card("club", "six"),new Card("club", "seven"),new Card("club", "eight"),new Card("club", "nine" ),new Card("club", "ten"),new Card("club", "jack"),new Card("club","queen"),new Card("club", "king"),new Card("diamonds", "ace"),new Card("diamonds", "two"),new Card("diamonds", "three"),new Card("diamonds", "four"),new Card("diamonds", "five"),new Card("diamonds", "six"),new Card("diamonds", "seven"),new Card("diamonds", "eight"),new Card("diamonds", "nine" ),new Card("diamonds", "ten"),new Card("diamonds", "jack"),new Card("diamonds","queen"),new Card("diamonds", "king")};

  public Card[] getDeck(){
    return cd;
  }
  public static void main(String[] args){}
}