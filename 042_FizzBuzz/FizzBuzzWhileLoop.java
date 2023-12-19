
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
<<<<<<< HEAD
            // if(startPoint % 3== 0)
            // {
            //     System.out.println("Fizz");
            // }
            // else if(startPoint % 5== 0)
            // {
            //     System.out.println("Buzz");
            // }
            // else if(startPoint% 3==0 && startPoint % 5==0)
            // {
            //     System.out.println("FizzBuzz");
            // }
            // else
            // {
            //     System.out.println(startPoint);
            
            // }


             if (startPoint% 3==0 && startPoint % 5==0)
            {
                System.out.println("FizzBuzz");
            }
            
            else(startPoint % 3== 0)
            {
                System.out.println("Fizz");
            }
            else (startPoint % 5== 0)
            {
                System.out.println("Buzz");
            }

            }
            else if
            {
=======
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
>>>>>>> fe465270990c926bb02b7d9b326404c39cd49ecf
                System.out.println(startPoint);
            }
            scan.close();
        }
    }
}
        