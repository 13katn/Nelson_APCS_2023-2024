
import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args){

Scanner scan= new Scanner(System.in);
        System.out.println("What number do you want fizzbuzz to go up to?");
        int userInteger= 0;
        userInteger= scan.nextInt();
        // set i equal to one so that it still pritns numbers that arent fizz buzz or fizzbuzz.. os the inbetween numbres/ i ++
        for(int i= 1; i<=userInteger; i++)
        {
            if(i % 3== 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5== 0)
            {
                System.out.println("Buzz");
            }
            else if(i % 3==0 && i % 5==0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(i);
            }
            scan.close();
        }
    }
}

/*

1/1 - Compiles
0/1 - Content
1/1 - Formatting
1/1 - Comments

*/