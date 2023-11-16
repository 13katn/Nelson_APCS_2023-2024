import java.util.Scanner;

public class CircumferenceAreaOfACircleCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double radius = 0.0;
        
        System.out.println("What do you want the radius of your circle to be? ");
        radius = scan.nextDouble();

        System.out.println(" the area is " + Math.PI * Math.pow(radius, 2));
        //double circleArea = 
        // use math.PI for exact value of pi, only use Math.something for  things like exponents pi, etc, nto for simple adding and mult
        scan.close();
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/