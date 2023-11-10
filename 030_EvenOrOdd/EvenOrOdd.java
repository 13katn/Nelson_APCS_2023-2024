import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("what number do you choose?");
        num = scan.nextInt();
    
    
    if (num % 2==0)
        {
            System.out.println("The number you chose is even");
        }
    else
    {
        System.out.println("The number you chose is odd");
    }

    scan.close();
    }
}