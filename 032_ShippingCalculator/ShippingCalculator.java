//3.5, if 0 < w <=1
//5.5, if 1 < w <= 3
//8.5, if 3<w<=10
//10.5, if 10< w < = 20

import java.util.Scanner;
public class ShippingCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("how much does your package weigh?");
        num = scan.nextInt();
    

    if (0 < num  && num<= 1)
        {
            System.out.println("The cost to ship that package will be $3.50");
        }
    if(1 < num && num<=3)
    {
        System.out.println("The cost to ship your package is $5.50");
    }
    if(3 < num && num<=10)
    {
        System.out.println("The cost to ship your package is $8.50");
    }
    if(10 < num && num<=20)
    {
        System.out.println("The cost to ship your package is $8.50");
    }
    // this hadnles anything negative or invalid 
    if (num<0)
    {
        System.out.println("The package you want to ship is invalid");
    }
    // this handles anyting overweihgt
    if (num>=20)
    {
        System.out.println("The package you want to ship is too heavy");
    }
        scan.close();

    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/