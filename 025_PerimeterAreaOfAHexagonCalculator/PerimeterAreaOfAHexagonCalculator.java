import java.util.Scanner;

public class PerimeterAreaOfAHexagonCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double side = 0;
        double perim = 6;
        double x = 3;
        
        System.out.println("What do you want the lenght of one side of the hexagon to be? ");
        side = scan.nextDouble();

        System.out.println("The perimeter of your hexagon is " + side * perim);
        // use math.PI for exact value of pi, only use Math.something for  things like exponents pi, etc, nto for simple adding and mult
        System.out.println("The area of your hexagon is " + 3 * (Math.sqrt(x)) / 2 * Math.pow(side, 2.0));
        // i looked it up and this is actually correct so lets goo finallly undersating this 
        scan.close();
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/