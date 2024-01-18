import java.util.Scanner;

public class BlackJackOne {

public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    Random card = new Random();

    int cardValue = (int)(Math.Random() * 13 );
    int cardValueTwo = (int)(Math.Random () * 13 );
    int cardValueThree = (int)(Math.Random() *13 );
   

    System.out.print("your firts card is " + cardValue ) ;
    System.out.println( "your second card value is " + cardValueTwo );

     int cardTotal = cardValue + cardValueTwo ; 
     int cardtotalTwo = cardValue + cardValueTwo + cardValueThree ; 
        
       System.out.println("First Cards: " + cardValue + ", " + cardValueTwo);
       System.out.println("Total: "+ cardTotal);

       System.out.println("would you like to hit or stay ");

       int hit = cardValueThree;


if ( hit);
{
    System.out.print( cardtotalTwo);
} 

 if (Math.Random = 1)
    {
        System.out.println("your card is ace and the value is 1 ");
    }
    else if(Math.Random = 2)
    {
        System.out.println("your card value is two  ");
    }
    else if (Math.Random = 3)
    {
        System.out.println("your card value is three ");
    }
    else if (Math.Random = 4)
    {
     System.out.println("your card value is four ");
    }
    else if (Math.Random = 5 )
    {
        System.out.println( " your card value is five  ");
    }
    else if(Math.Random = 6)
    {
        System.out.println("your card value is six ");
    }
    else if (Math.Random = 7)
    {
        System.out.println("ypur card value is seven ");
    }
    else if(Math.Random = 8)
    {
     System.out.println("your card value is eight ");
    }
    else if( Math.Random = 9)
    {
        System.out.println( " your card value is nine ");
    }
    else if( Math.Random = 10 )
    {
        System.out.println( "your card value is 10" );
     }
<<<<<<< HEAD
    else if( Math.Random = 11 )
    {
        System.out.println( "your card value is a queen" );
    }
    else if( Math.Random = 12 )
    {
        System.out.println( "your card value is a king" );
    }


        }
    }
=======


 
    }
}
>>>>>>> 321e7a632ca092d9ec7f21245b7f38b5f972ce7b
