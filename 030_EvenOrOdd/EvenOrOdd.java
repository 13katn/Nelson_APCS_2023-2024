import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("what number do you choose?");
        num = scan.nextInt();
    
    // even bc if u divide it by two the ramineder should be zero
    if (num % 2==0)
        {
            System.out.println("The number you chose is even");
        }
    else
    {
        System.out.println("The number you chose is odd");
    }
// saying that if the remainder isnt t0, than it must be one which means its odd so else
    scan.close();
    }
}