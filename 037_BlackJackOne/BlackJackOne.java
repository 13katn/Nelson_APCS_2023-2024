import java.util.Scanner;
public class BlackJackOne {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int firstCard= (int)(Math.random()*10)+1;
    int secondCard= (int)(Math.random()*10)+1;
    int dealerSecondCard= (int)(Math.random()*10)+1; // deals three random cards 
    int dealerFirstCard= (int)(Math.random()*10)+1;
    int dealerThirdCard= (int)(Math.random()*10)+1;
    int dealerTotal= dealerFirstCard+dealerSecondCard+dealerThirdCard; // adds up the total

    int total= firstCard+secondCard;
    String userChoice="";
    System.out.println("Welcome to Blackjack, you will be playing against the dealer. You will be given two cards and the dealer will be given two cards. You can choose to hit or stay. If you go over 21 you lose.");
    scan.close();
    // below sets ranom number valeus (so one thru ten) to card values ex: ace = one 
    if(firstCard==1)
    {
      System.out.println("You were dealt an ace, it is worth one point.");
    }
    else if(firstCard==2)
    {
      System.out.println("You were dealt a two which is worth two points.");
    }
    else if(firstCard==3)
    {
      System.out.println("You were dealt a three which is worth three points.");
    }
    else if(firstCard==4)
    {
      System.out.println("You were dealt a four which is worth four points.");
    }
    else if(firstCard==5)
    {
      System.out.println("You were dealt a five which is worth five points.");
    }
    else if(firstCard==6)
    {
      System.out.println("You were dealt a six which is worth six points.");
    }
    else if(firstCard==7)
    {
      System.out.println("You were dealt a seven which is worth seven points.");
    }
    else if(firstCard==8)
    {
      System.out.println("You were dealt an eight which is worth eight points.");
    }
    else if(firstCard==9)
    {
      System.out.println("You were dealt a nine which is worth nine points.");
    }
    else
    {
      System.out.println("You were dealt a king, queen, or a jack which are all worth ten points.");
    }
    if(secondCard==1)
    {
      System.out.println("You were dealt an ace, it is worth one point.");
    }
    else if(secondCard==2)
    {
      System.out.println("You were dealt a two which is worth two points.");
    }
    else if(secondCard==3)
    {
      System.out.println("You were dealt a three which is worth three points.");
    }
    else if(secondCard==4)
    {
      System.out.println("You were dealt a four which is worth four points.");
    }
    else if(secondCard==5)
    {
      System.out.println("You were dealt a five which is worth five points.");
    }
    else if(secondCard==6)
    {
      System.out.println("You were dealt a six which is worth six points.");
    }
    else if(secondCard==7)
    {
      System.out.println("You were dealt a seven which is worth seven points.");
    }
    else if(secondCard==8)
    {
      System.out.println("You were dealt an eight which is worth eight points.");
    }
    else if(secondCard==9)
    {
      System.out.println("You were dealt a nine which is worth nine points.");
    }
    else
    {
      System.out.println("You were dealt a king, queen, or a jack which are all worth ten points.");
    }

    System.out.println("Your total is "+total);
    System.out.println("do you want to hit or stay?");
    userChoice=scan.nextLine();
    if(userChoice.equals("hit"))
    {
      int thirdCard=(int)(Math.random()*10)+1;
      int newPoints= total+thirdCard;
      System.out.println("Your new total is "+newPoints);
      if(thirdCard==1)
      {
        System.out.println("You were dealt an ace, it is worth one point.");
      }
      else if(thirdCard==2)
      {
        System.out.println("You were dealt a two which is worth two points.");
      }
      else if(thirdCard==3)
      {
        System.out.println("You were dealt a three which is worth three points.");
      }
      else if(thirdCard==4)
      {
        System.out.println("You were dealt a four which is worth four points.");
      }
      else if(thirdCard==5)
      {
        System.out.println("You were dealt a five which is worth five points.");
      }
      else if(thirdCard==6)
      {
        System.out.println("You were dealt a six which is worth six points.");
      }
      else if(thirdCard==7)
      {
        System.out.println("You were dealt a seven which is worth seven points.");
      }
      else if(thirdCard==8)
      {
        System.out.println("You were dealt an eight which is worth eight points.");
      }
      else if(thirdCard==9)
      {
        System.out.println("You were dealt a nine which is worth nine points.");
      }
      else
      {
        System.out.println("You were dealt a king, queen, or a jack which are all worth ten points.");
      }
      if(newPoints>21)
      {
        System.out.println("You went over 21, you lose.");
      }
      else if(newPoints==21)
      {
        System.out.println("You got 21, you win!");
      }
      else if(newPoints<= dealerTotal || dealerTotal<=21)
      {
        System.out.println("You did not get 21, you lose.");
      }
    }
 }
}

/*

1/1 - Compiles
0/1 - Content
-Closing too quick.
1/1 - Formatting
1/1 - Comments

*/