
import java.util.Scanner;

public class CommonDigit {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

            int numberOne = 0;
            int numberTwo = 0;

// int cannot be turned into string so i made i used integer wrapper calss to be able to use the int to string function

// i wroked on this with aaresema emmas and mckenna but if i can explai it all as i wrote most of it 

  
           
            
        System.out.println("insert a value between 25 and 75" + numberOne);
            numberOne = scan.nextInt();
        
        System.out.println( "insert second value between 25 and 75" + numberTwo);
            numberTwo = scan.nextInt();


            Integer numberOneObject = Integer.valueOf(numberOne);
            Integer numberTwoObject = Integer.valueOf(numberTwo);

            String numberOneString = numberOneObject.toString();
            String numberTwoString = numberTwoObject.toString();
                        
            

            
             if (numberOneString.substring(2).equals(numberTwoString.substring(2)))
            {
            System.out.println( "they have the same second digit and it is " + numberTwoString.substring(2));
            }
            else
             {
            System.out.println("no");
            }
        

        }
}