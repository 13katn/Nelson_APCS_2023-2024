import java.util.Scanner;
public class SimpleCounter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println ("chose an integer: ");
        num = scan.nextInt();
// makes it so that i will add on from itself starting from zeo until it it no longer less than the user input 
int i = 0;
while (i< num) {
    System.out.println(i);
    i++;

        scan.close();
    }
    }
}


// example below is a foreloop
       // for( int i = 0; i < 11, i++)
       // {
       //     System.out.println("Counting to: " + i);
       //  }
