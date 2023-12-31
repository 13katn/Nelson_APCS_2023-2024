import java.util.Scanner;
public class FizzBuzzWhileLoop
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Pick a number for fizzbuzz to end at: ");
        int i= 0;
        i= scan.nextInt();
        int startingCount= 0;
         
        while(startingCount<=i)
        {
            startingCount++;
            if(startingCount % 3==0 && startingCount % 5==0)
            // HAVE TO PUT FIZZBUZZ FIRST BC WHILE LOOP RUNS FIRST TRUE NOT ALL TRUE.. 
            {
                System.out.println("Fizz");
            }
            else if(startingCount % 5== 0)
            {
                System.out.println("Buzz");
            }
            else if(startingCount % 3== 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(startingCount);
            }
        }
    }
}