import java.util.Scanner;

public class CarBuilderOne {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String carMake = "";
        String carModel = "";
        int carYear = 0;
        int carMileage = 0;


        System.out.println("What is your ideal make for your car?");
        carMake = scan.nextLine();

        System.out.println("What is your ideal model for your car?");
        carModel = scan.nextLine();
    
        System.out.println("What is your ideal year for your new car?");
        scan.nextLine();
        carYear = scan.nextInt();

        System.out.println("What is your ideal mileage for your new car?");
        carMileage = scan.nextInt();

        Car foo = new Car(carYear, carMileage, carMake, carModel);
        // this is the object ^^^^

        System.out.println("congrats, we found your car! Here is your brand new " + foo.modelName + " " + foo.modelName + " " + foo.year + " with " + foo.milesDriven + " miles on it.");

        scan.close();
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/