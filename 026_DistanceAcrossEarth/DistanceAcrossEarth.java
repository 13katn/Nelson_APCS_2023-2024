import java.util.Scanner;

public class DistanceAcrossEarth{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double latitudeOne = 0.0;
        double longitudeOne = 0.0;
        double latitudeTwo = 0.0;
        double longitudeTwo = 0.0;
        
        System.out.println("What do you want the coordinate of the first latitude to be ?");
        latitudeOne = scan.nextDouble();
        System.out.println("What do you want the coordinate of the first longitude to be ?");
        longitudeOne = scan.nextDouble();
        System.out.println("What do you want the coordinate of the second latitude to be ?");
        latitudeTwo = scan.nextDouble();
        System.out.println("What do you want the coordinate of the second longitude to be ?");
        longitudeTwo = scan.nextDouble();

        double useForMathAbsOne = latitudeOne - latitudeTwo;
        double useForMathAbsTwo = longitudeOne - longitudeTwo;
        double cosLatOnePlusLatTwoDivideByTwo = latitudeOne + latitudeTwo / 2;
        
        // https://blog.mapbox.com/fast-geodesic-approximations-with-cheap-ruler-106f229ad016 this is the formula i used to calculate the distance 
// below i split this formaula ^^ into 5 parts 
        double partOne = 12430 * Math.abs(useForMathAbsOne) / 180;
        double partTwo = 24901 * Math.abs(useForMathAbsTwo) / 360 * Math.sin(cosLatOnePlusLatTwoDivideByTwo);
        double almostLastPartOne = 2* Math.pow(partOne, 2.0);
        double almostLastPartTwo = 2 * Math.pow(partTwo, 2.0);
        double lastPart = Math.sqrt(almostLastPartOne + almostLastPartTwo);
        System.out.println("The distance of your two points is  " + lastPart + " kilometers apart.");
        
        scan.close();
    }
}

