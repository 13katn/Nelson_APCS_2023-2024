
import java.util.Scanner;

public class FizzBuzzWhileLoop {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
            int fizzNum = 0;

        System.out.println("insert a number you want to play fizzbuzz until: ");
            fizzNum = scan.nextInt();

        int startPoint = 1;
        int endPoint = fizzNum;
        while(startPoint < endPoint){
            if (startPoint % 3 == 0) {
                if (startpoint % 5 == 0) {
                    System.out.println("fizzbuzz");
                }
                else{
                    System.out.println("fizz");
                }
            } else if (startpoint % 5 == 0 ) {
               System.out.println("Buzz");
            }
          
           // else
           // {
                System.out.println(startPoint);
            }
            scan.close();
        }
    }
}
        