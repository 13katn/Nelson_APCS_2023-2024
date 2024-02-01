import java.util.Scanner;
public class FizzBuzzForLoop
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int userInteger= 0;
        System.out.println("Pick a number for fizzbuzz to end at: ");
        userInteger= scan.nextInt();
        scan.close();
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
        }
    }
}
   