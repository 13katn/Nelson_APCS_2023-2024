import java.util.Scanner;

public class SeventeenMoreOrLess{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double insertValueOne = 0.0;
        double insertValueTwo = 0.0;
        double insertValueThree = 0.0;
        
        System.out.println("What is  your First Value ");
        insertValueOne = scan.nextDouble();

        System.out.println("What is your second value? ");
        insertValueTwo = scan.nextDouble();
    
        System.out.println("What is your third value");
        insertValueThree = scan.nextDouble();
        scan.close();

        if(insertValueOne == insertValueTwo + 17 || insertValueOne == insertValueTwo - 17 )
        {
            System.out.println("The first value you input is either seventeen more or less than value two");
        }
        // now do this for all three values replacing / swawpping each value until one is compared to two and three, two is compared to one and three, and three is compared to one and two
        else if(insertValueOne == insertValueThree + 17 || insertValueOne == insertValueThree - 17 )
        {
            System.out.println("The first value you input is either seventeen more or less than value two");
        }
        if(insertValueTwo == insertValueOne + 17 || insertValueTwo == insertValueOne - 17 )
        {
            System.out.println("The first value you input is either seventeen more or less than value two");
        }
        else if(insertValueTwo == insertValueThree + 17 || insertValueTwo == insertValueThree - 17 )
        {
            System.out.println ("The first value you input is either seventeen more or less than value two");
        }
        if(insertValueThree == insertValueOne + 17 || insertValueThree == insertValueOne - 17 )
        {
            System.out.println("The first value you input is either seventeen more or less than value two");
        }
        else if(insertValueThree == insertValueTwo + 17 || insertValueThree == insertValueTwo - 17 )
        {
            System.out.println("The first value you input is either seventeen more or less than value two");
        }
    }
}